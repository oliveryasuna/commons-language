/*
 * Copyright 2021 Oliver Yasuna
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

import com.google.common.collect.Iterators;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;

public abstract class AbstractMultiRegistry<T, D> implements MultiRegistry<T, D> {

  private final Map<T, Collection<D>> registrations;

  private final Supplier<Collection<D>> entryCollectionSupplier;

  protected AbstractMultiRegistry(final Map<T, Collection<D>> registrations, final Supplier<Collection<D>> entryCollectionSupplier) {
    super();

    if(registrations == null) throw new IllegalArgumentException("Argument [registrations] is null.");
    if(!registrations.isEmpty()) throw new IllegalArgumentException("Expected an empty map.");
    if(entryCollectionSupplier == null) throw new IllegalArgumentException("Argument [entryCollectionSupplier] is null.");

    this.registrations = registrations;

    this.entryCollectionSupplier = entryCollectionSupplier;
  }

  @Override
  public Registration register(final T type, final D data) {
    if(!contains(type)) {
      final Collection<D> entries = entryCollectionSupplier.get();

      if(!entries.isEmpty()) {
        throw new IllegalStateException("Expected the supplier to supply an empty collection.");
      }

      registrations.put(type, entryCollectionSupplier.get());
    }

    registrations.get(type).add(data);

    return null;
  }

  @Override
  public Iterator<D> forType(final T type) {
    if(!contains(type)) throw new IllegalArgumentException("Type not registered.");

    return Iterators.unmodifiableIterator(registrations.get(type).iterator());
  }

  @Override
  public int entryCount(final T type) {
    if(!contains(type)) throw new IllegalArgumentException("Type not registered.");

    return Iterators.size(registrations.get(type).iterator());
  }

  @Override
  public boolean contains(final T type) {
    return registrations.containsKey(type);
  }

  protected final Map<T, Collection<D>> getRegistrations() {
    return registrations;
  }

}
