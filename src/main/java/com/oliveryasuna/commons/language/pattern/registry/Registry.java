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

import java.util.Optional;

/**
 * Represents a registry.
 *
 * @param <K> The type of key.
 *
 * @author Oliver Yasuna
 */
public interface Registry<K> {

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
   * @implSpec The {@link Registration} must call {@link #unregister(Object)}.
   */
  Registration register(K key, Object value);

  /**
   * Unregisters an entry.
   *
   * @param key The entry key.
   *
   * @return The previous value associated with the now unregistered entry.
   */
  Object unregister(K key);

  /**
   * Unregisters an entry.
   *
   * @param key  The entry key.
   * @param type The class type of entry value.
   * @param <V>  The type of entry value.
   *
   * @return The previous value associated with the now unregistered entry.
   *
   * @throws ClassCastException If the value cannot be cast to the type specified by argument {@code type}.
   */
  <V> V unregister(K key, Class<V> type);

  /**
   * Gets the value associated with an entry by its key.
   *
   * @param key The entry key.
   *
   * @return The value associated with the entry retrieved by its key.
   */
  Optional<Object> forKey(K key);

  /**
   * Gets the value associated with an entry by its key.
   *
   * @param key  The entry key.
   * @param type The class type of entry value.
   * @param <V>  The type of entry value.
   *
   * @return The value associated with the entry retrieved by its key.
   *
   * @throws ClassCastException If the value cannot be cast to the type specified by argument {@code type}.
   */
  <V> Optional<V> forKey(K key, Class<V> type);

  /**
   * Gets whether an entry exists associated with a specified key.
   *
   * @param key The key.
   *
   * @return {@code true}, if an entry with the argument {@code key} exists; otherwise, {@code false}.
   */
  boolean contains(K key);

}
