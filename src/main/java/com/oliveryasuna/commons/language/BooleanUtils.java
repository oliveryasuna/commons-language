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
import com.oliveryasuna.commons.language.marker.Utility;

/**
 * Various utilities for operating on {@code boolean}s.
 *
 * @author Oliver Yasuna
 */
@Utility
public final class BooleanUtils {

  // Static methods
  //--------------------------------------------------

  /**
   * Gets whether a {@code boolean} is {@code true}.
   *
   * @param bool The {@code boolean}.
   *
   * @return {@code true}, if the {@code boolean} is {@code true}; otherwise, {@code false}.
   */
  public static boolean isTrue(final boolean bool) {
    return bool;
  }

  /**
   * Gets whether a {@code boolean} is {@code false}.
   *
   * @param bool The {@code boolean}.
   *
   * @return {@code true}, if the {@code boolean} is {@code false}; otherwise, {@code true}.
   */
  public static boolean isFalse(final boolean bool) {
    return !bool;
  }

  // Constructors
  //--------------------------------------------------

  private BooleanUtils() {
    super();

    throw new UnsupportedInstantiationException();
  }

}
