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

import com.oliveryasuna.commons.language.Objects;

public class ObjectDecorator<T> implements Decorator {

  // Constructors
  //--------------------------------------------------

  /**
   * Creates an instance.
   *
   * @param underlyingObject The underlying object.
   */
  public ObjectDecorator(final T underlyingObject) {
    super();

    this.underlyingObject = underlyingObject;
  }

  // Fields
  //--------------------------------------------------

  /**
   * The underlying object.
   */
  protected T underlyingObject;

  // Getters/setters
  //--------------------------------------------------

  /**
   * Gets the underlying object.
   *
   * @return The underlying object.
   */
  protected T getUnderlyingObject() {
    return underlyingObject;
  }

  /**
   * Sets the underlying object.
   *
   * @param underlyingObject The new underlying object.
   */
  protected void setUnderlyingObject(final T underlyingObject) {
    this.underlyingObject = underlyingObject;
  }


  // Object methods
  //--------------------------------------------------

  /**
   * Checks if the argument {@code other} is equal to the same object or the underlying object.
   * <p>
   * Breaks the contract of {@link Object#equals(Object)}.
   *
   * @param other The object to check equality with.
   *
   * @return {@code true}, if the argument {@code other} is the same object or the underlying object; otherwise, {@code false}.
   */
  @Override
  public boolean equals(final Object other) {
    return Objects.equals(other, this, underlyingObject);
  }

  /**
   * Calls {@link Object#hashCode()} on the underlying object.
   * <p>
   * Breaks the contract of {@link Object#hashCode()}.
   *
   * @return The result of {@link Object#hashCode()} on {{@link #underlyingObject}.
   */
  @Override
  public int hashCode() {
    return underlyingObject.hashCode();
  }

  /**
   * Returns {@link Object#toString()} on the underlying object.
   * <p>
   * Breaks the contract of {@link Object#toString()} ()}.
   *
   * @return The result of {@link Object#toString()} on {@link #underlyingObject}.
   */
  @Override
  public String toString() {
    return underlyingObject.toString();
  }

}
