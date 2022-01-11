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

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * Basic implementation of {@link Registry} using a {@link Map} to store registrations.
 *
 * @param <K> The type of key.
 *
 * @author Oliver Yasuna
 */
public class MapRegistry<K> implements Registry<K> {

  /**
   * Creates a new instance with a specific {@link Map} type.
   *
   * @param mapSupplier The type of {@link Map}.
   */
  public MapRegistry(final Supplier<? extends Map<K, Object>> mapSupplier) {
    super();

    this.registrations = Arguments.requireNotNull(Arguments.requireNotNull(mapSupplier, "mapSupplier").get(), "mapSupplier.get()");
  }

  /**
   * Creates a new instance with a {@link HashMap}.
   *
   * @see #MapRegistry(Supplier)
   */
  public MapRegistry() {
    this(HashMap::new);
  }

  /**
   * The underlying structure that stores the registrations.
   */
  protected final Map<K, Object> registrations;

  /**
   * @inheritDocs
   */
  @Override
  public Registration register(final K key, final Object value) {
    if(registrations.containsKey(key)) throw new IllegalArgumentException("Already registered.");

    registrations.put(key, value);

    return (() -> unregister(key));
  }

  /**
   * @inheritDocs
   */
  @Override
  public <V> V unregister(final K key, final Class<V> type) {
    return type.cast(unregister(key));
  }

  /**
   * @inheritDocs
   */
  @Override
  public Object unregister(final K key) {
    if(!registrations.containsKey(key)) throw new IllegalArgumentException("Not registered.");

    return registrations.remove(key);
  }

  /**
   * @inheritDocs
   */
  @Override
  public <V> Optional<V> forKey(final K key, final Class<V> type) {
    return forKey(key)
        .map(type::cast);
  }

  /**
   * @inheritDocs
   */
  @Override
  public Optional<Object> forKey(final K key) {
    if(registrations.containsKey(key)) {
      return Optional.of(registrations.get(key));
    } else {
      return Optional.empty();
    }
  }

  /**
   * @inheritDocs
   */
  @Override
  public boolean contains(final K key) {
    return registrations.containsKey(key);
  }

}
