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

import java.util.Objects;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/**
 * Various {@code static} utility methods for dealing with exceptions.
 * <p>
 * This is similar to JUnit 5 {@code Assertions}.
 *
 * @author Oliver Yasuna
 */
public final class Conditions {

  // TODO: requireAll
  //--------------------------------------------------

  // requireArrayContainsEquals
  //--------------------------------------------------

  // Generic

  public static <T> T[] requireArrayContainsEquals(final T[] array, final Object search, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(int i = 0; i < array.length; i++) {
      if(Objects.equals(array[i], search)) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return array;
  }

  public static <T> T[] requireArrayContainsEquals(final T[] array, final Object search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsEquals(array, search, ignored -> message, exceptionSupplier);
  }

  public static <T> T[] requireArrayContainsEquals(final T[] array, final Object search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsEquals(array, search, (String)null, exceptionSupplier);
  }

  // requireArrayContainsSame
  //--------------------------------------------------

  // boolean

  public static boolean[] requireArrayContainsSame(final boolean[] array, final boolean search, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(final boolean element : array) {
      if(element == search) {
        return array;
      }
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    // Unreachable.
    return null;
  }

  public static boolean[] requireArrayContainsSame(final boolean[] array, final boolean search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, () -> message, exceptionSupplier);
  }

  public static boolean[] requireArrayContainsSame(final boolean[] array, final boolean search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // byte

  public static byte[] requireArrayContainsSame(final byte[] array, final byte search, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(final byte element : array) {
      if(element == search) {
        return array;
      }
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    // Unreachable.
    return null;
  }

  public static byte[] requireArrayContainsSame(final byte[] array, final byte search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, () -> message, exceptionSupplier);
  }

  public static byte[] requireArrayContainsSame(final byte[] array, final byte search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // char

  public static char[] requireArrayContainsSame(final char[] array, final char search, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(final char element : array) {
      if(element == search) {
        return array;
      }
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    // Unreachable.
    return null;
  }

  public static char[] requireArrayContainsSame(final char[] array, final char search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, () -> message, exceptionSupplier);
  }

  public static char[] requireArrayContainsSame(final char[] array, final char search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // short

  public static short[] requireArrayContainsSame(final short[] array, final short search, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(final short element : array) {
      if(element == search) {
        return array;
      }
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    // Unreachable.
    return null;
  }

  public static short[] requireArrayContainsSame(final short[] array, final short search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, () -> message, exceptionSupplier);
  }

  public static short[] requireArrayContainsSame(final short[] array, final short search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // int

  public static int[] requireArrayContainsSame(final int[] array, final int search, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(final int element : array) {
      if(element == search) {
        return array;
      }
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    // Unreachable.
    return null;
  }

  public static int[] requireArrayContainsSame(final int[] array, final int search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, () -> message, exceptionSupplier);
  }

  public static int[] requireArrayContainsSame(final int[] array, final int search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // long

  public static long[] requireArrayContainsSame(final long[] array, final long search, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(final long element : array) {
      if(element == search) {
        return array;
      }
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    // Unreachable.
    return null;
  }

  public static long[] requireArrayContainsSame(final long[] array, final long search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, () -> message, exceptionSupplier);
  }

  public static long[] requireArrayContainsSame(final long[] array, final long search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // float

  public static float[] requireArrayContainsSame(final float[] array, final float search, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(final float element : array) {
      if(element == search) {
        return array;
      }
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    // Unreachable.
    return null;
  }

  public static float[] requireArrayContainsSame(final float[] array, final float search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, () -> message, exceptionSupplier);
  }

  public static float[] requireArrayContainsSame(final float[] array, final float search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // double

  public static double[] requireArrayContainsSame(final double[] array, final double search, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(final double element : array) {
      if(element == search) {
        return array;
      }
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    // Unreachable.
    return null;
  }

  public static double[] requireArrayContainsSame(final double[] array, final double search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, () -> message, exceptionSupplier);
  }

  public static double[] requireArrayContainsSame(final double[] array, final double search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // Generic

  public static <T> T[] requireArrayContainsSame(final T[] array, final Object search, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(final Object element : array) {
      if(element == search) {
        return array;
      }
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    // Unreachable.
    return null;
  }

  public static <T> T[] requireArrayContainsSame(final T[] array, final Object search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, () -> message, exceptionSupplier);
  }

  public static <T> T[] requireArrayContainsSame(final T[] array, final Object search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // TODO: requireArrayEquals
  //--------------------------------------------------

  // TODO: requireArrayNotContainsEquals
  //--------------------------------------------------

  // TODO: requireArrayNotEquals
  //--------------------------------------------------

  // requireArraySame
  //--------------------------------------------------

  // boolean

  public static boolean[] requireArraySame(final boolean[] actual, final boolean[] expected, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(actual, "actual") == Arguments.requireNotNull(expected, "expected")) return actual;

    final int length = Arguments.requireSame(actual.length, expected.length);

    if(length == 1 && actual[0] == expected[0]) {
      return actual;
    }

    for(int i = 0; i < length; i++) {
      if(actual[i] != expected[i]) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return actual;
  }

  public static boolean[] requireArraySame(final boolean[] actual, final boolean[] expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArraySame(actual, actual, index -> message, exceptionSupplier);
  }

  public static boolean[] requireArraySame(final boolean[] actual, final boolean[] expected,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArraySame(actual, actual, (String)null, exceptionSupplier);
  }

  // char

  public static char[] requireArraySame(final char[] actual, final char[] expected, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(actual, "actual") == Arguments.requireNotNull(expected, "expected")) return actual;

    final int length = Arguments.requireSame(actual.length, expected.length);

    if(length == 1 && actual[0] == expected[0]) {
      return actual;
    }

    for(int i = 0; i < length; i++) {
      if(actual[i] != expected[i]) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return actual;
  }

  public static char[] requireArraySame(final char[] actual, final char[] expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArraySame(actual, actual, index -> message, exceptionSupplier);
  }

  public static char[] requireArraySame(final char[] actual, final char[] expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArraySame(actual, actual, (String)null, exceptionSupplier);
  }

  // short

  public static short[] requireArraySame(final short[] actual, final short[] expected, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(actual, "actual") == Arguments.requireNotNull(expected, "expected")) return actual;

    final int length = Arguments.requireSame(actual.length, expected.length);

    if(length == 1 && actual[0] == expected[0]) {
      return actual;
    }

    for(int i = 0; i < length; i++) {
      if(actual[i] != expected[i]) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return actual;
  }

  public static short[] requireArraySame(final short[] actual, final short[] expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArraySame(actual, actual, index -> message, exceptionSupplier);
  }

  public static short[] requireArraySame(final short[] actual, final short[] expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArraySame(actual, actual, (String)null, exceptionSupplier);
  }

  // int

  public static int[] requireArraySame(final int[] actual, final int[] expected, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(actual, "actual") == Arguments.requireNotNull(expected, "expected")) return actual;

    final int length = Arguments.requireSame(actual.length, expected.length);

    if(length == 1 && actual[0] == expected[0]) {
      return actual;
    }

    for(int i = 0; i < length; i++) {
      if(actual[i] != expected[i]) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return actual;
  }

  public static int[] requireArraySame(final int[] actual, final int[] expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArraySame(actual, actual, index -> message, exceptionSupplier);
  }

  public static int[] requireArraySame(final int[] actual, final int[] expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArraySame(actual, actual, (String)null, exceptionSupplier);
  }

  // float

  public static float[] requireArraySame(final float[] actual, final float[] expected, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(actual, "actual") == Arguments.requireNotNull(expected, "expected")) return actual;

    final int length = Arguments.requireSame(actual.length, expected.length);

    if(length == 1 && actual[0] == expected[0]) {
      return actual;
    }

    for(int i = 0; i < length; i++) {
      if(actual[i] != expected[i]) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return actual;
  }

  public static float[] requireArraySame(final float[] actual, final float[] expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArraySame(actual, actual, index -> message, exceptionSupplier);
  }

  public static float[] requireArraySame(final float[] actual, final float[] expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArraySame(actual, actual, (String)null, exceptionSupplier);
  }

  // double

  public static double[] requireArraySame(final double[] actual, final double[] expected, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(actual, "actual") == Arguments.requireNotNull(expected, "expected")) return actual;

    final int length = Arguments.requireSame(actual.length, expected.length);

    if(length == 1 && actual[0] == expected[0]) {
      return actual;
    }

    for(int i = 0; i < length; i++) {
      if(actual[i] != expected[i]) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return actual;
  }

  public static double[] requireArraySame(final double[] actual, final double[] expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArraySame(actual, actual, index -> message, exceptionSupplier);
  }

  public static double[] requireArraySame(final double[] actual, final double[] expected,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArraySame(actual, actual, (String)null, exceptionSupplier);
  }

  // Generic

  public static <T> T[] requireArraySame(final T[] actual, final Object[] expected, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(actual, "actual") == Arguments.requireNotNull(expected, "expected")) return actual;

    final int length = Arguments.requireSame(actual.length, expected.length);

    if(length == 1 && actual[0] == expected[0]) {
      return actual;
    }

    for(int i = 0; i < length; i++) {
      if(actual[i] != expected[i]) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return actual;
  }

  public static <T> T[] requireArraySame(final T[] actual, final Object[] expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArraySame(actual, actual, index -> message, exceptionSupplier);
  }

  public static <T> T[] requireArraySame(final T[] actual, final Object[] expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArraySame(actual, actual, (String)null, exceptionSupplier);
  }

  // requireArrayNotContainsSame
  //--------------------------------------------------

  // boolean

  public static boolean[] requireArrayNotContainsSame(final boolean[] array, final boolean search, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(int i = 0; i < array.length; i++) {
      if(array[i] == search) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return array;
  }

  public static boolean[] requireArrayNotContainsSame(final boolean[] array, final boolean search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, ignored -> message, exceptionSupplier);
  }

  public static boolean[] requireArrayNotContainsSame(final boolean[] array, final boolean search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // byte

  public static byte[] requireArrayNotContainsSame(final byte[] array, final byte search, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(int i = 0; i < array.length; i++) {
      if(array[i] == search) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return array;
  }

  public static byte[] requireArrayNotContainsSame(final byte[] array, final byte search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, ignored -> message, exceptionSupplier);
  }

  public static byte[] requireArrayNotContainsSame(final byte[] array, final byte search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // char

  public static char[] requireArrayNotContainsSame(final char[] array, final char search, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(int i = 0; i < array.length; i++) {
      if(array[i] == search) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return array;
  }

  public static char[] requireArrayNotContainsSame(final char[] array, final char search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, ignored -> message, exceptionSupplier);
  }

  public static char[] requireArrayNotContainsSame(final char[] array, final char search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // short

  public static short[] requireArrayNotContainsSame(final short[] array, final short search, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(int i = 0; i < array.length; i++) {
      if(array[i] == search) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return array;
  }

  public static short[] requireArrayNotContainsSame(final short[] array, final short search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, ignored -> message, exceptionSupplier);
  }

  public static short[] requireArrayNotContainsSame(final short[] array, final short search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // int

  public static int[] requireArrayNotContainsSame(final int[] array, final int search, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(int i = 0; i < array.length; i++) {
      if(array[i] == search) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return array;
  }

  public static int[] requireArrayNotContainsSame(final int[] array, final int search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, ignored -> message, exceptionSupplier);
  }

  public static int[] requireArrayNotContainsSame(final int[] array, final int search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // long

  public static long[] requireArrayNotContainsSame(final long[] array, final long search, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(int i = 0; i < array.length; i++) {
      if(array[i] == search) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return array;
  }

  public static long[] requireArrayNotContainsSame(final long[] array, final long search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, ignored -> message, exceptionSupplier);
  }

  public static long[] requireArrayNotContainsSame(final long[] array, final long search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // float

  public static float[] requireArrayNotContainsSame(final float[] array, final float search, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(int i = 0; i < array.length; i++) {
      if(array[i] == search) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return array;
  }

  public static float[] requireArrayNotContainsSame(final float[] array, final float search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, ignored -> message, exceptionSupplier);
  }

  public static float[] requireArrayNotContainsSame(final float[] array, final float search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // double

  public static double[] requireArrayNotContainsSame(final double[] array, final double search, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(int i = 0; i < array.length; i++) {
      if(array[i] == search) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return array;
  }

  public static double[] requireArrayNotContainsSame(final double[] array, final double search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, ignored -> message, exceptionSupplier);
  }

  public static double[] requireArrayNotContainsSame(final double[] array, final double search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // Generic

  public static <T> T[] requireArrayNotContainsSame(final T[] array, final Object search, final IntFunction<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    for(int i = 0; i < array.length; i++) {
      if(array[i] == search) {
        final int index = i;

        throwWithMessageSupplier(() -> messageSupplier.apply(index), exceptionSupplier);
      }
    }

    return array;
  }

  public static <T> T[] requireArrayNotContainsSame(final T[] array, final T search, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, ignored -> message, exceptionSupplier);
  }

  public static <T> T[] requireArrayNotContainsSame(final T[] array, final T search,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireArrayNotContainsSame(array, search, (String)null, exceptionSupplier);
  }

  // TODO: requireArrayNotSame
  //--------------------------------------------------

  // requireEquals
  //--------------------------------------------------

  // Generic

  public static <T> T requireEquals(final T actual, final Object expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(!Arguments.requireNotNull(actual).equals(expected)) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static <T> T requireEquals(final T actual, final Object expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireEquals(actual, expected, () -> message, exceptionSupplier);
  }

  public static <T> T requireEquals(final T actual, final Object expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireEquals(actual, expected, (String)null, exceptionSupplier);
  }

  // requireFalse
  //--------------------------------------------------

  public static boolean requireFalse(final boolean condition, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(condition) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return condition;
  }

  public static boolean requireFalse(final boolean condition, final String message, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireFalse(condition, () -> message, exceptionSupplier);
  }

  public static boolean requireFalse(final boolean condition, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireFalse(condition, (String)null, exceptionSupplier);
  }

  // TODO: requireIterableEquals
  //--------------------------------------------------

  // TODO: requireLinesMatch
  //--------------------------------------------------

  // requireNotEquals
  //--------------------------------------------------

  // Generic

  public static <T> T requireNotEquals(final T actual, final Object expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(actual).equals(expected)) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static <T> T requireNotEquals(final T actual, final Object expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotEquals(actual, expected, () -> message, exceptionSupplier);
  }

  public static <T> T requireNotEquals(final T actual, final Object expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotEquals(actual, expected, (String)null, exceptionSupplier);
  }

  // requireNotNull
  //--------------------------------------------------

  public static <T> T requireNotNull(final T object, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(object == null) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return object;
  }

  public static <T> T requireNotNull(final T object, final String message, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotNull(object, () -> message, exceptionSupplier);
  }

  public static <T> T requireNotNull(final T object, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotNull(object, (String)null, exceptionSupplier);
  }

  // requireNotSame
  //--------------------------------------------------

  // boolean

  public static boolean requireNotSame(final boolean actual, final boolean expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual == expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static boolean requireNotSame(final boolean actual, final boolean expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static boolean requireNotSame(final boolean actual, final boolean expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, (String)null, exceptionSupplier);
  }

  // byte

  public static byte requireNotSame(final byte actual, final byte expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual == expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static byte requireNotSame(final byte actual, final byte expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static byte requireNotSame(final byte actual, final byte expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, (String)null, exceptionSupplier);
  }

  // char

  public static char requireNotSame(final char actual, final char expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual == expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static char requireNotSame(final char actual, final char expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static char requireNotSame(final char actual, final char expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, (String)null, exceptionSupplier);
  }

  // short

  public static short requireNotSame(final short actual, final short expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual == expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static short requireNotSame(final short actual, final short expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static short requireNotSame(final short actual, final short expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, (String)null, exceptionSupplier);
  }

  // int

  public static int requireNotSame(final int actual, final int expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual == expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static int requireNotSame(final int actual, final int expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static int requireNotSame(final int actual, final int expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, (String)null, exceptionSupplier);
  }

  // long

  public static long requireNotSame(final long actual, final long expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual == expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static long requireNotSame(final long actual, final long expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static long requireNotSame(final long actual, final long expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, (String)null, exceptionSupplier);
  }

  // float

  public static float requireNotSame(final float actual, final float expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual == expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static float requireNotSame(final float actual, final float expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static float requireNotSame(final float actual, final float expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, (String)null, exceptionSupplier);
  }

  // double

  public static double requireNotSame(final double actual, final double expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual == expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static double requireNotSame(final double actual, final double expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static double requireNotSame(final double actual, final double expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, (String)null, exceptionSupplier);
  }

  // Generic

  public static <T> T requireNotSame(final T actual, final Object expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual == expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static <T> T requireNotSame(final T actual, final Object expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static <T> T requireNotSame(final T actual, final Object expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, (String)null, exceptionSupplier);
  }

  // requireNull
  //--------------------------------------------------

  public static <T> T requireNull(final T object, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(object != null) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return object;
  }

  public static <T> T requireNull(final T object, final String message, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNull(object, () -> message, exceptionSupplier);
  }

  public static <T> T requireNull(final T object, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireNull(object, (String)null, exceptionSupplier);
  }

  // requireSame
  //--------------------------------------------------

  // boolean

  public static boolean requireSame(final boolean actual, final boolean expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual != expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static boolean requireSame(final boolean actual, final boolean expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static boolean requireSame(final boolean actual, final boolean expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, (String)null, exceptionSupplier);
  }

  // byte

  public static byte requireSame(final byte actual, final byte expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual != expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static byte requireSame(final byte actual, final byte expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static byte requireSame(final byte actual, final byte expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, (String)null, exceptionSupplier);
  }

  // char

  public static char requireSame(final char actual, final char expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual != expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static char requireSame(final char actual, final char expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static char requireSame(final char actual, final char expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, (String)null, exceptionSupplier);
  }

  // short

  public static short requireSame(final short actual, final short expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual != expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static short requireSame(final short actual, final short expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static short requireSame(final short actual, final short expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, (String)null, exceptionSupplier);
  }

  // int

  public static int requireSame(final int actual, final int expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual != expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static int requireSame(final int actual, final int expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static int requireSame(final int actual, final int expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, (String)null, exceptionSupplier);
  }

  // long

  public static long requireSame(final long actual, final long expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual != expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static long requireSame(final long actual, final long expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static long requireSame(final long actual, final long expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, (String)null, exceptionSupplier);
  }

  // float

  public static float requireSame(final float actual, final float expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual != expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static float requireSame(final float actual, final float expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static float requireSame(final float actual, final float expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, (String)null, exceptionSupplier);
  }

  // double

  public static double requireSame(final double actual, final double expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual != expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static double requireSame(final double actual, final double expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static double requireSame(final double actual, final double expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, (String)null, exceptionSupplier);
  }

  // Generic

  public static <T> T requireSame(final T actual, final Object expected, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(actual != expected) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return actual;
  }

  public static <T> T requireSame(final T actual, final Object expected, final String message,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static <T> T requireSame(final T actual, final Object expected, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, (String)null, exceptionSupplier);
  }

  // TODO: requireThrows
  //--------------------------------------------------

  // TODO: requireTimeout
  //--------------------------------------------------

  // TODO: requireTimeoutPreemptively
  //--------------------------------------------------

  // requireTrue
  //--------------------------------------------------

  public static boolean requireTrue(final boolean condition, final Supplier<String> messageSupplier,
      final Function<String, ? extends RuntimeException> exceptionSupplier) {
    if(!condition) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return condition;
  }

  public static boolean requireTrue(final boolean condition, final String message, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireTrue(condition, () -> message, exceptionSupplier);
  }

  public static boolean requireTrue(final boolean condition, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    return requireTrue(condition, (String)null, exceptionSupplier);
  }

  // Helper methods
  //--------------------------------------------------

  private static void throwWithMessageSupplier(final Supplier<String> messageSupplier, final Function<String, ? extends RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(exceptionSupplier, "exceptionSupplier");

    if(messageSupplier != null) {
      throw exceptionSupplier.apply(messageSupplier.get());
    } else {
      throw exceptionSupplier.apply(null);
    }
  }

  // Constructors
  //--------------------------------------------------

  /**
   * Default {@code private} constructor that throws a {@link UnsupportedInstantiationException} in case of reflection.
   */
  private Conditions() {
    super();

    throw new UnsupportedInstantiationException();
  }

}
