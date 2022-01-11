/*
 * Copyright 2022 Oliver Yasuna
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
 * 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this software without
 *      specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.oliveryasuna.commons.language.pattern.registry;

import com.oliveryasuna.commons.language.Arguments;
import com.oliveryasuna.commons.language.pattern.Registration;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Basic implementation of {@link MultiRegistry} using a {@link Map} to store registrations.
 *
 * @param <K> The type of key.
 * @param <V> The type to store values in.
 */
public class MapMultiRegistry<K, V extends Collection<Object>> implements MultiRegistry<K> {

  /**
   * Creates a new instance with a specific {@link Map} type and base {@link Collection} for values.
   *
   * @param mapSupplier    The type of map.
   * @param valuesSupplier Supply an empty {@link Collection}.
   */
  public MapMultiRegistry(final Supplier<? extends Map<K, V>> mapSupplier, final Supplier<V> valuesSupplier) {
    super();

    this.registrations = Arguments.requireNotNull(Arguments.requireNotNull(mapSupplier, "mapSupplier").get(), "mapSupplier.get()");

    this.valuesSupplier = Arguments.requireNotNull(valuesSupplier, "valuesSupplier");
  }

  /**
   * The underlying structure that stores the registrations.
   */
  protected final Map<K, V> registrations;

  /**
   * Supplies an empty {@link Collection}.
   */
  protected final Supplier<V> valuesSupplier;

  /**
   * @inheritDocs
   */
  @Override
  public Registration register(final K key, final Object value) {
    registrations.putIfAbsent(key, valuesSupplier.get());

    registrations.get(key).add(value);

    return (() -> unregister(key, value));
  }

  /**
   * @inheritDocs
   */
  @Override
  public Iterator<Object> unregister(final K key) {
    final Iterator<Object> values = forKey(key);

    values.forEachRemaining(value -> unregister(key, value));

    return values;
  }

  /**
   * @inheritDocs
   */
  @Override
  public void unregister(final K key, final Object value) {
    if(!registrations.containsKey(key)) return;

    for(final Iterator<Object> iter = registrations.get(key).iterator(); iter.hasNext(); ) {
      if(value.equals(iter.next())) {
        iter.remove();

        return;
      }
    }
  }

  /**
   * @inheritDocs
   */
  @Override
  public int unregisterAll(final K key, final Object value) {
    if(!registrations.containsKey(key)) return 0;

    int count = 0;

    for(final Iterator<Object> iter = registrations.get(key).iterator(); iter.hasNext(); ) {
      if(value.equals(iter.next())) {
        iter.remove();

        count++;
      }
    }

    return count;
  }

  /**
   * @inheritDocs
   */
  @Override
  public Iterator<Object> forKey(final K key) {
    return registrations.getOrDefault(key, valuesSupplier.get()).iterator();
  }

  /**
   * @inheritDocs
   */
  @Override
  public boolean contains(final K key) {
    return registrations.containsKey(key);
  }

  /**
   * @inheritDocs
   */
  @Override
  public int count(final K key) {
    if(registrations.containsKey(key)) {
      return registrations.get(key).size();
    } else {
      return 0;
    }
  }

}
