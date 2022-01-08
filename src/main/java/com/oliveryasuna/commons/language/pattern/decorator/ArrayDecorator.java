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

package com.oliveryasuna.commons.language.pattern.decorator;

import com.oliveryasuna.commons.language.Arguments;
import com.oliveryasuna.commons.language.pattern.Cloneable;

/**
 * Wraps an array.
 * <p>
 * Definitely an anti-pattern.
 *
 * @param <T> The type of array elements
 *
 * @author Oliver Yasuna
 */
public class ArrayDecorator<T> extends ObjectDecorator<T[]> implements Cloneable<T[]>, java.lang.Cloneable {

  // Constructors
  //--------------------------------------------------

  /**
   * Creates an instance.
   *
   * @param array The underlying array.
   */
  public ArrayDecorator(final T[] array) {
    super(Arguments.requireNonNull(array), "array)");
  }

  // Array methods
  //--------------------------------------------------

  public T[] get() {
    return getUnderlyingObject();
  }

  public T get(final int index) {
    return get()[index];
  }

  public void set(final int index, final T element) {
    get()[index] = element;
  }

  public int length() {
    return get().length;
  }

  // Object methods
  //--------------------------------------------------

  /**
   * Returns {@link Object#clone()} on the underlying array.
   * <p>
   * Breaks the contract of {@link Object#clone()}.
   *
   * @return The result of {@link Object#clone()} of {@link #underlyingObject}.
   */
  @Override
  public T[] clone() {
    return underlyingObject.clone();
  }

}
