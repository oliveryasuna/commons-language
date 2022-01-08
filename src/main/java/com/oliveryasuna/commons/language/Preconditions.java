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

package com.oliveryasuna.commons.language;

import com.oliveryasuna.commons.language.exception.UnsupportedInstantiationException;

import java.util.function.Supplier;

/**
 * Various {@code static} utility methods for dealing with object states.
 *
 * @author Oliver Yasuna
 */
public final class Preconditions {

  /**
   * TODO: Documentation.
   */
  public static <T> T requireNonNull(final T object, final String message) {
    if(object == null) {
      throw new IllegalStateException(message);
    }

    return object;
  }

  /**
   * TODO: Documentation.
   */
  public static <T> T requireNonNull(final T object, final Supplier<String> messageSupplier) {
    if(object == null) {
      if(messageSupplier != null) {
        throw new IllegalStateException(messageSupplier.get());
      } else {
        throw new IllegalStateException();
      }
    }

    return object;
  }

  /**
   * TODO: Documentation.
   */
  public static <T> T requireNonNull(final T object) {
    if(object == null) {
      throw new IllegalStateException();
    }

    return object;
  }

  /**
   * TODO: Documentation.
   */
  public static <T> T requireNonNullElse(final T object, final T defaultValue) {
    return (object != null ? object : requireNonNull(defaultValue, "defaultValue"));
  }

  /**
   * TODO: Documentation.
   */
  public static <T> T requireNonNullElse(final T object, final Supplier<? extends T> defaultArgumentSupplier) {
    return (object != null ? object
        : requireNonNull(requireNonNull(defaultArgumentSupplier.get(), "defaultArgumentSupplier"), "defaultArgumentSupplier.get()"));
  }

  /**
   * Default {@code private} constructor that throws a {@link UnsupportedInstantiationException} in case of reflection.
   */
  private Preconditions() {
    super();

    throw new UnsupportedInstantiationException();
  }

}
