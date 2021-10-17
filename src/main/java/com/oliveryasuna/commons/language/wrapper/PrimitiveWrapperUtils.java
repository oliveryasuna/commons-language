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

package com.oliveryasuna.commons.language.wrapper;

import com.oliveryasuna.commons.language.exception.UtilityClassException;
import org.apache.commons.lang3.ArrayUtils;

/**
 * Various primitive wrapper utilities.
 *
 * @author Oliver Yasuna
 */
public final class PrimitiveWrapperUtils {

  /**
   * Wraps an array of {@code boolean}s.
   *
   * @param array The array.
   * @return An array of {@link Boolean}s.
   */
  public static Boolean[] wrap(final boolean[] array) {
    if(array == null) return null;
    if(array.length == 0) return new Boolean[0];
    if(array.length == 1) return new Boolean[] {array[0]};

    final Boolean[] result = new Boolean[array.length];

    for(int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

  /**
   * Wraps an array of {@code char}s.
   *
   * @param array The array.
   * @return An array of {@link Character}s.
   */
  public static Character[] wrap(final char[] array) {
    if(array == null) return null;
    if(array.length == 0) return new Character[0];
    if(array.length == 1) return new Character[] {array[0]};

    final Character[] result = new Character[array.length];

    for(int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

  /**
   * Wraps an array of {@code byte}s.
   *
   * @param array The array.
   * @return An array of {@link Byte}s.
   */
  public static Byte[] wrap(final byte[] array) {
    if(array == null) return null;
    if(array.length == 0) return new Byte[0];
    if(array.length == 1) return new Byte[] {array[0]};

    final Byte[] result = new Byte[array.length];

    for(int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

  /**
   * Wraps an array of {@code short}s.
   *
   * @param array The array.
   * @return An array of {@link Short}s.
   */
  public static Short[] wrap(final short[] array) {
    if(array == null) return null;
    if(array.length == 0) return new Short[0];
    if(array.length == 1) return new Short[] {array[0]};

    final Short[] result = new Short[array.length];

    for(int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

  /**
   * Wraps an array of {@code int}s.
   *
   * @param array The array.
   * @return An array of {@link Integer}s.
   */
  public static Integer[] wrap(final int[] array) {
    if(array == null) return null;
    if(array.length == 0) return new Integer[0];
    if(array.length == 1) return new Integer[] {array[0]};

    final Integer[] result = new Integer[array.length];

    for(int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

  /**
   * Wraps an array of {@code long}s.
   *
   * @param array The array.
   * @return An array of {@link Long}s.
   */
  public static Long[] wrap(final long[] array) {
    if(array == null) return null;
    if(array.length == 0) return new Long[0];
    if(array.length == 1) return new Long[] {array[0]};

    final Long[] result = new Long[array.length];

    for(int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

  /**
   * Wraps an array of {@code float}s.
   *
   * @param array The array.
   * @return An array of {@link Float}s.
   */
  public static Float[] wrap(final float[] array) {
    if(array == null) return null;
    if(array.length == 0) return new Float[0];
    if(array.length == 1) return new Float[] {array[0]};

    final Float[] result = new Float[array.length];

    for(int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

  /**
   * Wraps an array of {@code double}s.
   *
   * @param array The array.
   * @return An array of {@link Double}s.
   */
  public static Double[] wrap(final double[] array) {
    if(array == null) return null;
    if(array.length == 0) return new Double[0];
    if(array.length == 1) return new Double[] {array[0]};

    final Double[] result = new Double[array.length];

    for(int i = 0; i < array.length; i++) {
      result[i] = array[i];
    }

    return result;
  }

  /**
   * Unwraps an array of {@link Boolean}s.
   *
   * @param array        The array.
   * @param valueForNull The value for {@code null} elements.
   * @return An array of {@code boolean}s.
   */
  public static boolean[] unwrap(final Boolean[] array, final Boolean valueForNull) {
    if(array == null) return null;
    if(array.length == 0) return new boolean[0];
    if(ArrayUtils.contains(array, null) && valueForNull == null) throw new IllegalArgumentException("No default value for null element(s).");
    if(array.length == 1) return new boolean[] {array[0] != null ? array[0] : valueForNull};

    final boolean[] result = new boolean[array.length];

    for(int i = 0; i < array.length; i++) {
      final Boolean element = array[i];

      if(element != null) {
        result[i] = element;
      } else {
        result[i] = valueForNull;
      }
    }

    return result;
  }

  /**
   * Calls {@link #unwrap(Boolean[], Boolean)} without a value for {@code null}.
   *
   * @param array The array.
   * @return An array of {@code boolean}s.
   */
  public static boolean[] unwrap(final Boolean[] array) {
    return unwrap(array, null);
  }

  /**
   * Unwraps an array of {@link Character}s.
   *
   * @param array        The array.
   * @param valueForNull The value for {@code null} elements.
   * @return An array of {@code char}s.
   */
  public static char[] unwrap(final Character[] array, final Character valueForNull) {
    if(array == null) return null;
    if(array.length == 0) return new char[0];
    if(ArrayUtils.contains(array, null) && valueForNull == null) throw new IllegalArgumentException("No default value for null element(s).");
    if(array.length == 1) return new char[] {array[0] != null ? array[0] : valueForNull};

    final char[] result = new char[array.length];

    for(int i = 0; i < array.length; i++) {
      final Character element = array[i];

      if(element != null) {
        result[i] = element;
      } else {
        result[i] = valueForNull;
      }
    }

    return result;
  }

  /**
   * Calls {@link #unwrap(Character[], Character)} without a value for {@code null}.
   *
   * @param array The array.
   * @return An array of {@code char}s.
   */
  public static char[] unwrap(final Character[] array) {
    return unwrap(array, null);
  }

  /**
   * Unwraps an array of {@link Byte}s.
   *
   * @param array        The array.
   * @param valueForNull The value for {@code null} elements.
   * @return An array of {@code byte}s.
   */
  public static byte[] unwrap(final Byte[] array, final Byte valueForNull) {
    if(array == null) return null;
    if(array.length == 0) return new byte[0];
    if(ArrayUtils.contains(array, null) && valueForNull == null) throw new IllegalArgumentException("No default value for null element(s).");
    if(array.length == 1) return new byte[] {array[0] != null ? array[0] : valueForNull};

    final byte[] result = new byte[array.length];

    for(int i = 0; i < array.length; i++) {
      final Byte element = array[i];

      if(element != null) {
        result[i] = element;
      } else {
        result[i] = valueForNull;
      }
    }

    return result;
  }

  /**
   * Calls {@link #unwrap(Byte[], Byte)} without a value for {@code null}.
   *
   * @param array The array.
   * @return An array of {@code byte}s.
   */
  public static byte[] unwrap(final Byte[] array) {
    return unwrap(array, null);
  }

  /**
   * Unwraps an array of {@link Short}s.
   *
   * @param array        The array.
   * @param valueForNull The value for {@code null} elements.
   * @return An array of {@code short}s.
   */
  public static short[] unwrap(final Short[] array, final Short valueForNull) {
    if(array == null) return null;
    if(array.length == 0) return new short[0];
    if(ArrayUtils.contains(array, null) && valueForNull == null) throw new IllegalArgumentException("No default value for null element(s).");
    if(array.length == 1) return new short[] {array[0] != null ? array[0] : valueForNull};

    final short[] result = new short[array.length];

    for(int i = 0; i < array.length; i++) {
      final Short element = array[i];

      if(element != null) {
        result[i] = element;
      } else {
        result[i] = valueForNull;
      }
    }

    return result;
  }

  /**
   * Calls {@link #unwrap(Short[], Short)} without a value for {@code null}.
   *
   * @param array The array.
   * @return An array of {@code short}s.
   */
  public static short[] unwrap(final Short[] array) {
    return unwrap(array, null);
  }

  /**
   * Unwraps an array of {@link Integer}s.
   *
   * @param array        The array.
   * @param valueForNull The value for {@code null} elements.
   * @return An array of {@code int}s.
   */
  public static int[] unwrap(final Integer[] array, final Integer valueForNull) {
    if(array == null) return null;
    if(array.length == 0) return new int[0];
    if(ArrayUtils.contains(array, null) && valueForNull == null) throw new IllegalArgumentException("No default value for null element(s).");
    if(array.length == 1) return new int[] {array[0] != null ? array[0] : valueForNull};

    final int[] result = new int[array.length];

    for(int i = 0; i < array.length; i++) {
      final Integer element = array[i];

      if(element != null) {
        result[i] = element;
      } else {
        result[i] = valueForNull;
      }
    }

    return result;
  }

  /**
   * Calls {@link #unwrap(Integer[], Integer)} without a value for {@code null}.
   *
   * @param array The array.
   * @return An array of {@code int}s.
   */
  public static int[] unwrap(final Integer[] array) {
    return unwrap(array, null);
  }

  /**
   * Unwraps an array of {@link Long}s.
   *
   * @param array        The array.
   * @param valueForNull The value for {@code null} elements.
   * @return An array of {@code long}s.
   */
  public static long[] unwrap(final Long[] array, final Long valueForNull) {
    if(array == null) return null;
    if(array.length == 0) return new long[0];
    if(ArrayUtils.contains(array, null) && valueForNull == null) throw new IllegalArgumentException("No default value for null element(s).");
    if(array.length == 1) return new long[] {array[0] != null ? array[0] : valueForNull};

    final long[] result = new long[array.length];

    for(int i = 0; i < array.length; i++) {
      final Long element = array[i];

      if(element != null) {
        result[i] = element;
      } else {
        result[i] = valueForNull;
      }
    }

    return result;
  }

  /**
   * Calls {@link #unwrap(Long[], Long)} without a value for {@code null}.
   *
   * @param array The array.
   * @return An array of {@code long}s.
   */
  public static long[] unwrap(final Long[] array) {
    return unwrap(array, null);
  }

  /**
   * Unwraps an array of {@link Float}s.
   *
   * @param array        The array.
   * @param valueForNull The value for {@code null} elements.
   * @return An array of {@code float}s.
   */
  public static float[] unwrap(final Float[] array, final Float valueForNull) {
    if(array == null) return null;
    if(array.length == 0) return new float[0];
    if(ArrayUtils.contains(array, null) && valueForNull == null) throw new IllegalArgumentException("No default value for null element(s).");
    if(array.length == 1) return new float[] {array[0] != null ? array[0] : valueForNull};

    final float[] result = new float[array.length];

    for(int i = 0; i < array.length; i++) {
      final Float element = array[i];

      if(element != null) {
        result[i] = element;
      } else {
        result[i] = valueForNull;
      }
    }

    return result;
  }

  /**
   * Calls {@link #unwrap(Float[], Float)} without a value for {@code null}.
   *
   * @param array The array.
   * @return An array of {@code float}s.
   */
  public static float[] unwrap(final Float[] array) {
    return unwrap(array, null);
  }

  /**
   * Unwraps an array of {@link Double}s.
   *
   * @param array        The array.
   * @param valueForNull The value for {@code null} elements.
   * @return An array of {@code double}s.
   */
  public static double[] unwrap(final Double[] array, final Double valueForNull) {
    if(array == null) return null;
    if(array.length == 0) return new double[0];
    if(ArrayUtils.contains(array, null) && valueForNull == null) throw new IllegalArgumentException("No default value for null element(s).");
    if(array.length == 1) return new double[] {array[0] != null ? array[0] : valueForNull};

    final double[] result = new double[array.length];

    for(int i = 0; i < array.length; i++) {
      final Double element = array[i];

      if(element != null) {
        result[i] = element;
      } else {
        result[i] = valueForNull;
      }
    }

    return result;
  }

  /**
   * Calls {@link #unwrap(Double[], Double)} without a value for {@code null}.
   *
   * @param array The array.
   * @return An array of {@code double}s.
   */
  public static double[] unwrap(final Double[] array) {
    return unwrap(array, null);
  }

  private PrimitiveWrapperUtils() {
    throw new UtilityClassException();
  }

}
