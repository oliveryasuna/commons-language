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

import com.oliveryasuna.commons.language.pattern.Registration;

import java.util.Iterator;

/**
 * Represents a registry that can store one-or-more values per key.
 *
 * @param <K> The type of key.
 *
 * @author Oliver Yasuna
 */
public interface MultiRegistry<K> {

  // Methods
  //--------------------------------------------------

  /**
   * Registers a new entry.
   *
   * @param key   The entry key.
   * @param value The entry value.
   *
   * @return A {@link Registration} object, which a call to {@link Registration#remove()} would unregister the entry.
   *
   * @implSpec The {@link Registration} must call {@link #unregister(Object, Object)}.
   */
  Registration register(K key, Object value);

  /**
   * Unregisters all entries with the specified key.
   *
   * @param key The key.
   *
   * @return An {@link Iterator} over all values unregistered.
   */
  Iterator<Object> unregister(K key);

  /**
   * Unregisters the entry with the specified key and value.
   *
   * @param key The key.
   */
  void unregister(K key, Object value);

  /**
   * Unregisters all entry with the specified key and value.
   *
   * @param key The key.
   *
   * @return The number of entries unregistered.
   */
  int unregisterAll(K key, Object value);

  /**
   * Gets an {@link Iterable} over all values associated with entries by their key.
   *
   * @param key The key.
   *
   * @return The {@link Iterator} over all values associated with entries by their key.
   */
  Iterator<Object> forKey(K key);

  /**
   * Gets whether an entry exists associated with a specified key.
   *
   * @param key The key.
   *
   * @return {@code true}, if an entry with the argument {@code key} exists; otherwise, {@code false}.
   */
  boolean contains(K key);

  /**
   * Gets the number of values associated with a given key.
   *
   * @param key The key.
   *
   * @return The number of values associated with the key {@code key}.
   */
  int count(K key);

}
