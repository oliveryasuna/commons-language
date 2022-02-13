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

import com.oliveryasuna.commons.language.condition.Arguments;
import com.oliveryasuna.commons.language.exception.UnsupportedInstantiationException;
import com.oliveryasuna.commons.language.marker.Utility;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Various array utilities.
 *
 * @author Oliver Yasuna
 */
@Utility
public final class ArrayUtils {

  /**
   * Checks if all elements of an array are equal.
   * <p>
   * Best case time complexity is \(\mathop{O}\left(n\right)\).
   * Worst case is theoretically \(\mathop{O}\left(n^{\frac{1}{0}}\right)\) (or undefined), dependent upon {@link Object#equals(Object)}.
   *
   * @param array The array.
   *
   * @return {@code true}, if all elements are equal;
   *     {@code false}, if not all elements are equal or the array is empty.
   */
  public static boolean allEquals(final Object... array) {
    Arguments.requireNotNull(array, "array");

    if(array.length == 0) return false;
    if(array.length == 1) return true;
    if(array.length == 2) return Objects.equals(array[0], array[1]);

    final Object element0 = array[0];

    // O(n).
    for(int i = 1; i < array.length; i++) {
      final Object elementI = array[i];

      if(!Objects.equals(element0, elementI)) {
        return false;
      }
    }

    return true;
  }

  /**
   * Checks if any elements of an array are equal.
   * <p>
   * Best case time complexity is \(\mathop{O}\left(n^2\right)\).
   * Worst case is theoretically \(\mathop{O}\left(n^{\frac{1}{0}}\right)\) (or undefined), dependent upon {@link Object#equals(Object)}.
   *
   * @param array The array.
   *
   * @return {@code true}, if any elements are equal;
   *     {@code false}, if no elements are equal or the array is empty.
   */
  public static boolean anyEquals(final Object... array) {
    Arguments.requireNotNull(array, "array");

    if(array.length == 0 || array.length == 1) return false;
    if(array.length == 2) return Objects.equals(array[0], array[1]);

    // O(n).
    for(int i = 0; i < array.length - 1; i++) {
      final Object elementI = array[i];

      // O(n).
      for(int j = i + 1; j < array.length; j++) {
        final Object elementJ = array[j];

        if(Objects.equals(elementI, elementJ)) {
          return true;
        }
      }
    }

    return false;
  }

  /**
   * Counts element occurrences.
   * <p>
   * Best case time complexity is \(\mathop{O}\left(n^2\right)\).
   * Worst case is theoretically \(\mathop{O}\left(n^{\frac{1}{0}}\right)\) (or undefined), dependent upon {@link Object#equals(Object)}.
   *
   * @param array The array.
   * @param <T>   The type of element.
   *
   * @return Element occurrences.
   */
  @SafeVarargs
  public static <T> Map<T, Integer> countOccurrences(final T... array) {
    Arguments.requireNotNull(array, "array");

    if(array.length == 0) return Collections.emptyMap();
    if(array.length == 1) return Collections.singletonMap(array[0], 1);

    final Map<T, Integer> occurrences = new HashMap<>();

    // O(n).
    for(int i = 0; i < array.length - 1; i++) {
      final T elementI = array[i];

      // O(1).
      if(occurrences.containsKey(elementI)) continue;

      // O(n).
      for(int j = i + 1; j < array.length; j++) {
        final T elementJ = array[j];

        if(Objects.equals(elementI, elementJ)) {
          occurrences.put(elementI, occurrences.getOrDefault(elementI, 0) + 1);
        }
      }
    }

    return Collections.unmodifiableMap(occurrences);
  }

  private ArrayUtils() {
    super();

    throw new UnsupportedInstantiationException();
  }

}
