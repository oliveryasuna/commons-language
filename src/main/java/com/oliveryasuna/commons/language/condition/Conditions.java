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

package com.oliveryasuna.commons.language.condition;

import com.oliveryasuna.commons.language.exception.UnsupportedInstantiationException;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

public final class Conditions {

  // Static methods
  //--------------------------------------------------

  // requireTrue
  //

  public static boolean requireTrue(final boolean condition, final Supplier<String> messageSupplier,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    if(!condition) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return condition;
  }

  public static boolean requireTrue(final boolean condition, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireTrue(condition, () -> message, exceptionSupplier);
  }

  public static boolean requireTrue(final boolean condition, final Function<String, RuntimeException> exceptionSupplier) {
    return requireTrue(condition, () -> null, exceptionSupplier);
  }

  // requireFalse
  //

  public static boolean requireFalse(final boolean condition, final Supplier<String> messageSupplier,
                                     final Function<String, RuntimeException> exceptionSupplier) {
    if(condition) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return condition;
  }

  public static boolean requireFalse(final boolean condition, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireFalse(condition, () -> message, exceptionSupplier);
  }

  public static boolean requireFalse(final boolean condition, final Function<String, RuntimeException> exceptionSupplier) {
    return requireFalse(condition, () -> null, exceptionSupplier);
  }

  // requireSame
  //

  // boolean

  public static boolean requireSame(final boolean actual, final boolean expected, final Supplier<String> messageSupplier,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    if(actual != expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static boolean requireSame(final boolean actual, final boolean expected, final String message,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static boolean requireSame(final boolean actual, final boolean expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> null, exceptionSupplier);
  }

  // byte

  public static byte requireSame(final byte actual, final byte expected, final Supplier<String> messageSupplier,
                                 final Function<String, RuntimeException> exceptionSupplier) {
    if(actual != expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static byte requireSame(final byte actual, final byte expected, final String message,
                                 final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static byte requireSame(final byte actual, final byte expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> null, exceptionSupplier);
  }

  // char

  public static char requireSame(final char actual, final char expected, final Supplier<String> messageSupplier,
                                 final Function<String, RuntimeException> exceptionSupplier) {
    if(actual != expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static char requireSame(final char actual, final char expected, final String message,
                                 final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static char requireSame(final char actual, final char expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> null, exceptionSupplier);
  }

  // short

  public static short requireSame(final short actual, final short expected, final Supplier<String> messageSupplier,
                                  final Function<String, RuntimeException> exceptionSupplier) {
    if(actual != expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static short requireSame(final short actual, final short expected, final String message,
                                  final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static short requireSame(final short actual, final short expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> null, exceptionSupplier);
  }

  // int

  public static int requireSame(final int actual, final int expected, final Supplier<String> messageSupplier,
                                final Function<String, RuntimeException> exceptionSupplier) {
    if(actual != expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static int requireSame(final int actual, final int expected, final String message,
                                final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static int requireSame(final int actual, final int expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> null, exceptionSupplier);
  }

  // long

  public static long requireSame(final long actual, final long expected, final Supplier<String> messageSupplier,
                                 final Function<String, RuntimeException> exceptionSupplier) {
    if(actual != expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static long requireSame(final long actual, final long expected, final String message,
                                 final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static long requireSame(final long actual, final long expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> null, exceptionSupplier);
  }

  // float

  public static float requireSame(final float actual, final float expected, final Supplier<String> messageSupplier,
                                  final Function<String, RuntimeException> exceptionSupplier) {
    if(actual != expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static float requireSame(final float actual, final float expected, final String message,
                                  final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static float requireSame(final float actual, final float expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> null, exceptionSupplier);
  }

  // double

  public static double requireSame(final double actual, final double expected, final Supplier<String> messageSupplier,
                                   final Function<String, RuntimeException> exceptionSupplier) {
    if(actual != expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static double requireSame(final double actual, final double expected, final String message,
                                   final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static double requireSame(final double actual, final double expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> null, exceptionSupplier);
  }

  // Generic

  public static <T> T requireSame(final T actual, final Object expected, final Supplier<String> messageSupplier,
                                  final Function<String, RuntimeException> exceptionSupplier) {
    if(actual != expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static <T> T requireSame(final T actual, final Object expected, final String message,
                                  final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static <T> T requireSame(final T actual, final Object expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireSame(actual, expected, () -> null, exceptionSupplier);
  }

  // requireNotSame
  //

  // boolean

  public static boolean requireNotSame(final boolean actual, final boolean expected, final Supplier<String> messageSupplier,
                                       final Function<String, RuntimeException> exceptionSupplier) {
    if(actual == expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static boolean requireNotSame(final boolean actual, final boolean expected, final String message,
                                       final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static boolean requireNotSame(final boolean actual, final boolean expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> null, exceptionSupplier);
  }

  // byte

  public static byte requireNotSame(final byte actual, final byte expected, final Supplier<String> messageSupplier,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    if(actual == expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static byte requireNotSame(final byte actual, final byte expected, final String message,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static byte requireNotSame(final byte actual, final byte expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> null, exceptionSupplier);
  }

  // char

  public static char requireNotSame(final char actual, final char expected, final Supplier<String> messageSupplier,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    if(actual == expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static char requireNotSame(final char actual, final char expected, final String message,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static char requireNotSame(final char actual, final char expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> null, exceptionSupplier);
  }

  // short

  public static short requireNotSame(final short actual, final short expected, final Supplier<String> messageSupplier,
                                     final Function<String, RuntimeException> exceptionSupplier) {
    if(actual == expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static short requireNotSame(final short actual, final short expected, final String message,
                                     final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static short requireNotSame(final short actual, final short expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> null, exceptionSupplier);
  }

  // int

  public static int requireNotSame(final int actual, final int expected, final Supplier<String> messageSupplier,
                                   final Function<String, RuntimeException> exceptionSupplier) {
    if(actual == expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static int requireNotSame(final int actual, final int expected, final String message,
                                   final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static int requireNotSame(final int actual, final int expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> null, exceptionSupplier);
  }

  // long

  public static long requireNotSame(final long actual, final long expected, final Supplier<String> messageSupplier,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    if(actual == expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static long requireNotSame(final long actual, final long expected, final String message,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static long requireNotSame(final long actual, final long expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> null, exceptionSupplier);
  }

  // float

  public static float requireNotSame(final float actual, final float expected, final Supplier<String> messageSupplier,
                                     final Function<String, RuntimeException> exceptionSupplier) {
    if(actual == expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static float requireNotSame(final float actual, final float expected, final String message,
                                     final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static float requireNotSame(final float actual, final float expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> null, exceptionSupplier);
  }

  // double

  public static double requireNotSame(final double actual, final double expected, final Supplier<String> messageSupplier,
                                      final Function<String, RuntimeException> exceptionSupplier) {
    if(actual == expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static double requireNotSame(final double actual, final double expected, final String message,
                                      final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static double requireNotSame(final double actual, final double expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> null, exceptionSupplier);
  }

  // Generic

  public static <T> T requireNotSame(final T actual, final Object expected, final Supplier<String> messageSupplier,
                                     final Function<String, RuntimeException> exceptionSupplier) {
    if(actual == expected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static <T> T requireNotSame(final T actual, final Object expected, final String message,
                                     final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> message, exceptionSupplier);
  }

  public static <T> T requireNotSame(final T actual, final Object expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotSame(actual, expected, () -> null, exceptionSupplier);
  }

  // requireEquals
  //

  public static <T> T requireEquals(final T actual, final Object expected, final Supplier<String> messageSupplier,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    if(!Objects.equals(actual, expected)) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static <T> T requireEquals(final T actual, final Object expected, final String message,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    return requireEquals(actual, expected, () -> message, exceptionSupplier);
  }

  public static <T> T requireEquals(final T actual, final Object expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEquals(actual, expected, () -> null, exceptionSupplier);
  }

  // requireNotEquals
  //

  public static <T> T requireNotEquals(final T actual, final Object expected, final Supplier<String> messageSupplier,
                                       final Function<String, RuntimeException> exceptionSupplier) {
    if(Objects.equals(actual, expected)) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static <T> T requireNotEquals(final T actual, final Object expected, final String message,
                                       final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEquals(actual, expected, () -> message, exceptionSupplier);
  }

  public static <T> T requireNotEquals(final T actual, final Object expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEquals(actual, expected, () -> null, exceptionSupplier);
  }

  // requireNull
  //

  public static <T> T requireNull(final T object, final Supplier<String> messageSupplier, final Function<String, RuntimeException> exceptionSupplier) {
    if(object != null) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return object;
  }

  public static <T> T requireNull(final T object, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNull(object, () -> message, exceptionSupplier);
  }

  public static <T> T requireNull(final T object, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNull(object, () -> null, exceptionSupplier);
  }

  // requireNotNull
  //

  public static <T> T requireNotNull(final T object, final Supplier<String> messageSupplier, final Function<String, RuntimeException> exceptionSupplier) {
    if(object == null) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return object;
  }

  public static <T> T requireNotNull(final T object, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotNull(object, () -> message, exceptionSupplier);
  }

  public static <T> T requireNotNull(final T object, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotNull(object, () -> null, exceptionSupplier);
  }

  // requireGreater
  //

  // byte

  public static byte requireGreater(final byte actual, final byte less, final Supplier<String> messageSupplier,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    if(actual <= less) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static byte requireGreater(final byte actual, final byte less, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, () -> message, exceptionSupplier);
  }

  public static byte requireGreater(final byte actual, final byte less, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, () -> null, exceptionSupplier);
  }

  // char

  public static char requireGreater(final char actual, final char less, final Supplier<String> messageSupplier,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    if(actual <= less) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static char requireGreater(final char actual, final char less, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, () -> message, exceptionSupplier);
  }

  public static char requireGreater(final char actual, final char less, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, () -> null, exceptionSupplier);
  }

  // short

  public static short requireGreater(final short actual, final short less, final Supplier<String> messageSupplier,
                                     final Function<String, RuntimeException> exceptionSupplier) {
    if(actual <= less) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static short requireGreater(final short actual, final short less, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, () -> message, exceptionSupplier);
  }

  public static short requireGreater(final short actual, final short less, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, () -> null, exceptionSupplier);
  }

  // int

  public static int requireGreater(final int actual, final int less, final Supplier<String> messageSupplier,
                                   final Function<String, RuntimeException> exceptionSupplier) {
    if(actual <= less) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static int requireGreater(final int actual, final int less, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, () -> message, exceptionSupplier);
  }

  public static int requireGreater(final int actual, final int less, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, () -> null, exceptionSupplier);
  }

  // long

  public static long requireGreater(final long actual, final long less, final Supplier<String> messageSupplier,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    if(actual <= less) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static long requireGreater(final long actual, final long less, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, () -> message, exceptionSupplier);
  }

  public static long requireGreater(final long actual, final long less, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, () -> null, exceptionSupplier);
  }

  // float

  public static float requireGreater(final float actual, final float less, final Supplier<String> messageSupplier,
                                     final Function<String, RuntimeException> exceptionSupplier) {
    if(actual <= less) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static float requireGreater(final float actual, final float less, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, () -> message, exceptionSupplier);
  }

  public static float requireGreater(final float actual, final float less, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, () -> null, exceptionSupplier);
  }

  // double

  public static double requireGreater(final double actual, final double less, final Supplier<String> messageSupplier,
                                      final Function<String, RuntimeException> exceptionSupplier) {
    if(actual <= less) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static double requireGreater(final double actual, final double less, final String message,
                                      final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, () -> message, exceptionSupplier);
  }

  public static double requireGreater(final double actual, final double less, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, () -> null, exceptionSupplier);
  }

  // Comparable

  public static <T extends Comparable<T>, U extends T> T requireGreater(final T actual, final U less, final Supplier<String> messageSupplier,
                                                                        final Function<String, RuntimeException> exceptionSupplier) {
    if(Objects.compare(actual, less, (o1, o2) -> Arguments.requireNotNull(o1, "actual").compareTo(o2)) <= 0)
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static <T extends Comparable<T>, U extends T> T requireGreater(final T actual, final U less, final String message,
                                                                        final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, () -> message, exceptionSupplier);
  }

  public static <T extends Comparable<T>, U extends T> T requireGreater(final T actual, final U less,
                                                                        final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, () -> null, exceptionSupplier);
  }

  // Comparator

  public static <T, U extends T> T requireGreater(final T actual, final U less, final Comparator<T> comparator, final Supplier<String> messageSupplier,
                                                  final Function<String, RuntimeException> exceptionSupplier) {
    if(comparator.compare(actual, less) <= 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static <T, U extends T> T requireGreater(final T actual, final U less, final Comparator<T> comparator, final String message,
                                                  final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, comparator, () -> message, exceptionSupplier);
  }

  public static <T, U extends T> T requireGreater(final T actual, final U less, final Comparator<T> comparator,
                                                  final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(actual, less, comparator, () -> null, exceptionSupplier);
  }

  // Comparison result

  public static int requireGreater(final int result, final Supplier<String> messageSupplier, final Function<String, RuntimeException> exceptionSupplier) {
    if(result <= 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return result;
  }

  public static int requireGreater(final int result, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(result, () -> message, exceptionSupplier);
  }

  public static int requireGreater(final int result, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreater(result, () -> null, exceptionSupplier);
  }

  // requireLess
  //

  // byte

  public static byte requireLess(final byte actual, final byte greater, final Supplier<String> messageSupplier,
                                 final Function<String, RuntimeException> exceptionSupplier) {
    if(actual >= greater) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static byte requireLess(final byte actual, final byte greater, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, () -> message, exceptionSupplier);
  }

  public static byte requireLess(final byte actual, final byte greater, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, () -> null, exceptionSupplier);
  }

  // char

  public static char requireLess(final char actual, final char greater, final Supplier<String> messageSupplier,
                                 final Function<String, RuntimeException> exceptionSupplier) {
    if(actual >= greater) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static char requireLess(final char actual, final char greater, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, () -> message, exceptionSupplier);
  }

  public static char requireLess(final char actual, final char greater, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, () -> null, exceptionSupplier);
  }

  // short

  public static short requireLess(final short actual, final short greater, final Supplier<String> messageSupplier,
                                  final Function<String, RuntimeException> exceptionSupplier) {
    if(actual >= greater) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static short requireLess(final short actual, final short greater, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, () -> message, exceptionSupplier);
  }

  public static short requireLess(final short actual, final short greater, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, () -> null, exceptionSupplier);
  }

  // int

  public static int requireLess(final int actual, final int greater, final Supplier<String> messageSupplier,
                                final Function<String, RuntimeException> exceptionSupplier) {
    if(actual >= greater) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static int requireLess(final int actual, final int greater, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, () -> message, exceptionSupplier);
  }

  public static int requireLess(final int actual, final int greater, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, () -> null, exceptionSupplier);
  }

  // long

  public static long requireLess(final long actual, final long greater, final Supplier<String> messageSupplier,
                                 final Function<String, RuntimeException> exceptionSupplier) {
    if(actual >= greater) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static long requireLess(final long actual, final long greater, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, () -> message, exceptionSupplier);
  }

  public static long requireLess(final long actual, final long greater, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, () -> null, exceptionSupplier);
  }

  // float

  public static float requireLess(final float actual, final float greater, final Supplier<String> messageSupplier,
                                  final Function<String, RuntimeException> exceptionSupplier) {
    if(actual >= greater) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static float requireLess(final float actual, final float greater, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, () -> message, exceptionSupplier);
  }

  public static float requireLess(final float actual, final float greater, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, () -> null, exceptionSupplier);
  }

  // double

  public static double requireLess(final double actual, final double greater, final Supplier<String> messageSupplier,
                                   final Function<String, RuntimeException> exceptionSupplier) {
    if(actual >= greater) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static double requireLess(final double actual, final double greater, final String message,
                                   final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, () -> message, exceptionSupplier);
  }

  public static double requireLess(final double actual, final double greater, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, () -> null, exceptionSupplier);
  }

  // Comparable

  public static <T extends Comparable<T>, U extends T> T requireLess(final T actual, final U greater, final Supplier<String> messageSupplier,
                                                                     final Function<String, RuntimeException> exceptionSupplier) {
    if(Objects.compare(actual, greater, (o1, o2) -> Arguments.requireNotNull(o1, "actual").compareTo(o2)) >= 0)
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static <T extends Comparable<T>, U extends T> T requireLess(final T actual, final U greater, final String message,
                                                                     final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, () -> message, exceptionSupplier);
  }

  public static <T extends Comparable<T>, U extends T> T requireLess(final T actual, final U greater,
                                                                     final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, () -> null, exceptionSupplier);
  }

  // Comparator

  public static <T, U extends T> T requireLess(final T actual, final U greater, final Comparator<T> comparator, final Supplier<String> messageSupplier,
                                               final Function<String, RuntimeException> exceptionSupplier) {
    if(comparator.compare(actual, greater) >= 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static <T, U extends T> T requireLess(final T actual, final U greater, final Comparator<T> comparator, final String message,
                                               final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, comparator, () -> message, exceptionSupplier);
  }

  public static <T, U extends T> T requireLess(final T actual, final U greater, final Comparator<T> comparator,
                                               final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(actual, greater, comparator, () -> null, exceptionSupplier);
  }

  // Comparison result

  public static int requireLess(final int result, final Supplier<String> messageSupplier, final Function<String, RuntimeException> exceptionSupplier) {
    if(result >= 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return result;
  }

  public static int requireLess(final int result, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(result, () -> message, exceptionSupplier);
  }

  public static int requireLess(final int result, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLess(result, () -> null, exceptionSupplier);
  }

  // requireGreaterOrSame
  //

  // byte

  public static byte requireGreaterOrSame(final byte actual, final byte lessOrSame, final Supplier<String> messageSupplier,
                                          final Function<String, RuntimeException> exceptionSupplier) {
    if(actual < lessOrSame) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static byte requireGreaterOrSame(final byte actual, final byte lessOrSame, final String message,
                                          final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> message, exceptionSupplier);
  }

  public static byte requireGreaterOrSame(final byte actual, final byte lessOrSame, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> null, exceptionSupplier);
  }

  // char

  public static char requireGreaterOrSame(final char actual, final char lessOrSame, final Supplier<String> messageSupplier,
                                          final Function<String, RuntimeException> exceptionSupplier) {
    if(actual < lessOrSame) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static char requireGreaterOrSame(final char actual, final char lessOrSame, final String message,
                                          final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> message, exceptionSupplier);
  }

  public static char requireGreaterOrSame(final char actual, final char lessOrSame, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> null, exceptionSupplier);
  }

  // short

  public static short requireGreaterOrSame(final short actual, final short lessOrSame, final Supplier<String> messageSupplier,
                                           final Function<String, RuntimeException> exceptionSupplier) {
    if(actual < lessOrSame) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static short requireGreaterOrSame(final short actual, final short lessOrSame, final String message,
                                           final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> message, exceptionSupplier);
  }

  public static short requireGreaterOrSame(final short actual, final short lessOrSame, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> null, exceptionSupplier);
  }

  // int

  public static int requireGreaterOrSame(final int actual, final int lessOrSame, final Supplier<String> messageSupplier,
                                         final Function<String, RuntimeException> exceptionSupplier) {
    if(actual < lessOrSame) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static int requireGreaterOrSame(final int actual, final int lessOrSame, final String message,
                                         final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> message, exceptionSupplier);
  }

  public static int requireGreaterOrSame(final int actual, final int lessOrSame, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> null, exceptionSupplier);
  }

  // long

  public static long requireGreaterOrSame(final long actual, final long lessOrSame, final Supplier<String> messageSupplier,
                                          final Function<String, RuntimeException> exceptionSupplier) {
    if(actual < lessOrSame) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static long requireGreaterOrSame(final long actual, final long lessOrSame, final String message,
                                          final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> message, exceptionSupplier);
  }

  public static long requireGreaterOrSame(final long actual, final long lessOrSame, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> null, exceptionSupplier);
  }

  // float

  public static float requireGreaterOrSame(final float actual, final float lessOrSame, final Supplier<String> messageSupplier,
                                           final Function<String, RuntimeException> exceptionSupplier) {
    if(actual < lessOrSame) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static float requireGreaterOrSame(final float actual, final float lessOrSame, final String message,
                                           final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> message, exceptionSupplier);
  }

  public static float requireGreaterOrSame(final float actual, final float lessOrSame, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> null, exceptionSupplier);
  }

  // double

  public static double requireGreaterOrSame(final double actual, final double lessOrSame, final Supplier<String> messageSupplier,
                                            final Function<String, RuntimeException> exceptionSupplier) {
    if(actual < lessOrSame) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static double requireGreaterOrSame(final double actual, final double lessOrSame, final String message,
                                            final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> message, exceptionSupplier);
  }

  public static double requireGreaterOrSame(final double actual, final double lessOrSame, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> null, exceptionSupplier);
  }

  // Comparable

  public static <T extends Comparable<T>, U extends T> T requireGreaterOrSame(final T actual, final U lessOrSame, final Supplier<String> messageSupplier,
                                                                              final Function<String, RuntimeException> exceptionSupplier) {
    if(Objects.compare(actual, lessOrSame, (o1, o2) -> Arguments.requireNotNull(o1, "actual").compareTo(o2)) < 0)
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static <T extends Comparable<T>, U extends T> T requireGreaterOrSame(final T actual, final U lessOrSame, final String message,
                                                                              final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> message, exceptionSupplier);
  }

  public static <T extends Comparable<T>, U extends T> T requireGreaterOrSame(final T actual, final U lessOrSame,
                                                                              final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> null, exceptionSupplier);
  }

  // Comparator

  public static <T, U extends T> T requireGreaterOrSame(final T actual, final U lessOrSame, final Comparator<T> comparator,
                                                        final Supplier<String> messageSupplier,
                                                        final Function<String, RuntimeException> exceptionSupplier) {
    if(comparator.compare(actual, lessOrSame) < 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static <T, U extends T> T requireGreaterOrSame(final T actual, final U lessOrSame, final Comparator<T> comparator, final String message,
                                                        final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, comparator, () -> message, exceptionSupplier);
  }

  public static <T, U extends T> T requireGreaterOrSame(final T actual, final U lessOrSame, final Comparator<T> comparator,
                                                        final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, comparator, () -> null, exceptionSupplier);
  }

  // Comparison result

  public static int requireGreaterOrSame(final int result, final Supplier<String> messageSupplier, final Function<String, RuntimeException> exceptionSupplier) {
    if(result < 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return result;
  }

  public static int requireGreaterOrSame(final int result, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(result, () -> message, exceptionSupplier);
  }

  public static int requireGreaterOrSame(final int result, final Function<String, RuntimeException> exceptionSupplier) {
    return requireGreaterOrSame(result, () -> null, exceptionSupplier);
  }

  // requireLessOrSame
  //

  // byte

  public static byte requireLessOrSame(final byte actual, final byte greaterOrSame, final Supplier<String> messageSupplier,
                                       final Function<String, RuntimeException> exceptionSupplier) {
    if(actual > greaterOrSame) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static byte requireLessOrSame(final byte actual, final byte greaterOrSame, final String message,
                                       final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> message, exceptionSupplier);
  }

  public static byte requireLessOrSame(final byte actual, final byte greaterOrSame, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> null, exceptionSupplier);
  }

  // char

  public static char requireLessOrSame(final char actual, final char greaterOrSame, final Supplier<String> messageSupplier,
                                       final Function<String, RuntimeException> exceptionSupplier) {
    if(actual > greaterOrSame) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static char requireLessOrSame(final char actual, final char greaterOrSame, final String message,
                                       final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> message, exceptionSupplier);
  }

  public static char requireLessOrSame(final char actual, final char greaterOrSame, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> null, exceptionSupplier);
  }

  // short

  public static short requireLessOrSame(final short actual, final short greaterOrSame, final Supplier<String> messageSupplier,
                                        final Function<String, RuntimeException> exceptionSupplier) {
    if(actual > greaterOrSame) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static short requireLessOrSame(final short actual, final short greaterOrSame, final String message,
                                        final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> message, exceptionSupplier);
  }

  public static short requireLessOrSame(final short actual, final short greaterOrSame, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> null, exceptionSupplier);
  }

  // int

  public static int requireLessOrSame(final int actual, final int greaterOrSame, final Supplier<String> messageSupplier,
                                      final Function<String, RuntimeException> exceptionSupplier) {
    if(actual > greaterOrSame) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static int requireLessOrSame(final int actual, final int greaterOrSame, final String message,
                                      final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> message, exceptionSupplier);
  }

  public static int requireLessOrSame(final int actual, final int greaterOrSame, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> null, exceptionSupplier);
  }

  // long

  public static long requireLessOrSame(final long actual, final long greaterOrSame, final Supplier<String> messageSupplier,
                                       final Function<String, RuntimeException> exceptionSupplier) {
    if(actual > greaterOrSame) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static long requireLessOrSame(final long actual, final long greaterOrSame, final String message,
                                       final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> message, exceptionSupplier);
  }

  public static long requireLessOrSame(final long actual, final long greaterOrSame, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> null, exceptionSupplier);
  }

  // float

  public static float requireLessOrSame(final float actual, final float greaterOrSame, final Supplier<String> messageSupplier,
                                        final Function<String, RuntimeException> exceptionSupplier) {
    if(actual > greaterOrSame) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static float requireLessOrSame(final float actual, final float greaterOrSame, final String message,
                                        final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> message, exceptionSupplier);
  }

  public static float requireLessOrSame(final float actual, final float greaterOrSame, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> null, exceptionSupplier);
  }

  // double

  public static double requireLessOrSame(final double actual, final double greaterOrSame, final Supplier<String> messageSupplier,
                                         final Function<String, RuntimeException> exceptionSupplier) {
    if(actual > greaterOrSame) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static double requireLessOrSame(final double actual, final double greaterOrSame, final String message,
                                         final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> message, exceptionSupplier);
  }

  public static double requireLessOrSame(final double actual, final double greaterOrSame, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> null, exceptionSupplier);
  }

  // Comparable

  public static <T extends Comparable<T>, U extends T> T requireLessOrSame(final T actual, final U greaterOrSame, final Supplier<String> messageSupplier,
                                                                           final Function<String, RuntimeException> exceptionSupplier) {
    if(Objects.compare(actual, greaterOrSame, (o1, o2) -> Arguments.requireNotNull(o1, "actual").compareTo(o2)) > 0)
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static <T extends Comparable<T>, U extends T> T requireLessOrSame(final T actual, final U greaterOrSame, final String message,
                                                                           final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> message, exceptionSupplier);
  }

  public static <T extends Comparable<T>, U extends T> T requireLessOrSame(final T actual, final U greaterOrSame,
                                                                           final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> null, exceptionSupplier);
  }

  // Comparator

  public static <T, U extends T> T requireLessOrSame(final T actual, final U greaterOrSame, final Comparator<T> comparator,
                                                     final Supplier<String> messageSupplier, final Function<String, RuntimeException> exceptionSupplier) {
    if(comparator.compare(actual, greaterOrSame) > 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return actual;
  }

  public static <T, U extends T> T requireLessOrSame(final T actual, final U greaterOrSame, final Comparator<T> comparator, final String message,
                                                     final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, comparator, () -> message, exceptionSupplier);
  }

  public static <T, U extends T> T requireLessOrSame(final T actual, final U greaterOrSame, final Comparator<T> comparator,
                                                     final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(actual, greaterOrSame, comparator, () -> null, exceptionSupplier);
  }

  // Comparison result

  public static int requireLessOrSame(final int result, final Supplier<String> messageSupplier, final Function<String, RuntimeException> exceptionSupplier) {
    if(result > 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return result;
  }

  public static int requireLessOrSame(final int result, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(result, () -> message, exceptionSupplier);
  }

  public static int requireLessOrSame(final int result, final Function<String, RuntimeException> exceptionSupplier) {
    return requireLessOrSame(result, () -> null, exceptionSupplier);
  }

  // requireEmpty
  //

  // boolean

  public static boolean[] requireEmpty(final boolean[] array, final Supplier<String> messageSupplier,
                                       final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length > 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static boolean[] requireEmpty(final boolean[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> message, exceptionSupplier);
  }

  public static boolean[] requireEmpty(final boolean[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> null, exceptionSupplier);
  }

  // byte

  public static byte[] requireEmpty(final byte[] array, final Supplier<String> messageSupplier,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length > 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static byte[] requireEmpty(final byte[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> message, exceptionSupplier);
  }

  public static byte[] requireEmpty(final byte[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> null, exceptionSupplier);
  }

  // char

  public static char[] requireEmpty(final char[] array, final Supplier<String> messageSupplier,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length > 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static char[] requireEmpty(final char[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> message, exceptionSupplier);
  }

  public static char[] requireEmpty(final char[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> null, exceptionSupplier);
  }

  // short

  public static short[] requireEmpty(final short[] array, final Supplier<String> messageSupplier,
                                     final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length > 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static short[] requireEmpty(final short[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> message, exceptionSupplier);
  }

  public static short[] requireEmpty(final short[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> null, exceptionSupplier);
  }

  // int

  public static int[] requireEmpty(final int[] array, final Supplier<String> messageSupplier,
                                   final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length > 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static int[] requireEmpty(final int[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> message, exceptionSupplier);
  }

  public static int[] requireEmpty(final int[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> null, exceptionSupplier);
  }

  // long

  public static long[] requireEmpty(final long[] array, final Supplier<String> messageSupplier,
                                    final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length > 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static long[] requireEmpty(final long[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> message, exceptionSupplier);
  }

  public static long[] requireEmpty(final long[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> null, exceptionSupplier);
  }

  // float

  public static float[] requireEmpty(final float[] array, final Supplier<String> messageSupplier,
                                     final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length > 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static float[] requireEmpty(final float[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> message, exceptionSupplier);
  }

  public static float[] requireEmpty(final float[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> null, exceptionSupplier);
  }

  // double

  public static double[] requireEmpty(final double[] array, final Supplier<String> messageSupplier,
                                      final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length > 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static double[] requireEmpty(final double[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> message, exceptionSupplier);
  }

  public static double[] requireEmpty(final double[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> null, exceptionSupplier);
  }

  // Generic

  public static <T> T[] requireEmpty(final T[] array, final Supplier<String> messageSupplier, final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length > 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static <T> T[] requireEmpty(final T[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> message, exceptionSupplier);
  }

  public static <T> T[] requireEmpty(final T[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(array, () -> null, exceptionSupplier);
  }

  // Iterable

  public static <T extends Iterable<U>, U> T requireEmpty(final T iterable, final Supplier<String> messageSupplier,
                                                          final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(iterable, "iterable").iterator().hasNext()) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return iterable;
  }

  public static <T extends Iterable<U>, U> T requireEmpty(final T iterable, final String message,
                                                          final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(iterable, () -> message, exceptionSupplier);
  }

  public static <T extends Iterable<U>, U> T requireEmpty(final T iterable, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(iterable, () -> null, exceptionSupplier);
  }

  // Collection

  public static <T extends Collection<U>, U> T requireEmpty(final T collection, final Supplier<String> messageSupplier,
                                                            final Function<String, RuntimeException> exceptionSupplier) {
    if(!Arguments.requireNotNull(collection, "collection").isEmpty()) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return collection;
  }

  public static <T extends Collection<U>, U> T requireEmpty(final T collection, final String message,
                                                            final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(collection, () -> message, exceptionSupplier);
  }

  public static <T extends Collection<U>, U> T requireEmpty(final T collection, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(collection, () -> null, exceptionSupplier);
  }

  // String

  public static String requireEmpty(final String string, final Supplier<String> messageSupplier, final Function<String, RuntimeException> exceptionSupplier) {
    if(!Arguments.requireNotNull(string, "string").isEmpty()) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return string;
  }

  public static String requireEmpty(final String string, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(string, () -> message, exceptionSupplier);
  }

  public static String requireEmpty(final String string, final Function<String, RuntimeException> exceptionSupplier) {
    return requireEmpty(string, () -> null, exceptionSupplier);
  }

  // requireNotEmpty
  //

  // boolean

  public static boolean[] requireNotEmpty(final boolean[] array, final Supplier<String> messageSupplier,
                                          final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length == 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static boolean[] requireNotEmpty(final boolean[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> message, exceptionSupplier);
  }

  public static boolean[] requireNotEmpty(final boolean[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> null, exceptionSupplier);
  }

  // byte

  public static byte[] requireNotEmpty(final byte[] array, final Supplier<String> messageSupplier,
                                       final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length == 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static byte[] requireNotEmpty(final byte[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> message, exceptionSupplier);
  }

  public static byte[] requireNotEmpty(final byte[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> null, exceptionSupplier);
  }

  // char

  public static char[] requireNotEmpty(final char[] array, final Supplier<String> messageSupplier,
                                       final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length == 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static char[] requireNotEmpty(final char[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> message, exceptionSupplier);
  }

  public static char[] requireNotEmpty(final char[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> null, exceptionSupplier);
  }

  // short

  public static short[] requireNotEmpty(final short[] array, final Supplier<String> messageSupplier,
                                        final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length == 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static short[] requireNotEmpty(final short[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> message, exceptionSupplier);
  }

  public static short[] requireNotEmpty(final short[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> null, exceptionSupplier);
  }

  // int

  public static int[] requireNotEmpty(final int[] array, final Supplier<String> messageSupplier,
                                      final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length == 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static int[] requireNotEmpty(final int[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> message, exceptionSupplier);
  }

  public static int[] requireNotEmpty(final int[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> null, exceptionSupplier);
  }

  // long

  public static long[] requireNotEmpty(final long[] array, final Supplier<String> messageSupplier,
                                       final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length == 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static long[] requireNotEmpty(final long[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> message, exceptionSupplier);
  }

  public static long[] requireNotEmpty(final long[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> null, exceptionSupplier);
  }

  // float

  public static float[] requireNotEmpty(final float[] array, final Supplier<String> messageSupplier,
                                        final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length == 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static float[] requireNotEmpty(final float[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> message, exceptionSupplier);
  }

  public static float[] requireNotEmpty(final float[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> null, exceptionSupplier);
  }

  // double

  public static double[] requireNotEmpty(final double[] array, final Supplier<String> messageSupplier,
                                         final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length == 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static double[] requireNotEmpty(final double[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> message, exceptionSupplier);
  }

  public static double[] requireNotEmpty(final double[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> null, exceptionSupplier);
  }

  // Generic

  public static <T> T[] requireNotEmpty(final T[] array, final Supplier<String> messageSupplier, final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(array, "array").length == 0) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return array;
  }

  public static <T> T[] requireNotEmpty(final T[] array, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> message, exceptionSupplier);
  }

  public static <T> T[] requireNotEmpty(final T[] array, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(array, () -> null, exceptionSupplier);
  }

  // Iterable

  public static <T extends Iterable<U>, U> T requireNotEmpty(final T iterable, final Supplier<String> messageSupplier,
                                                             final Function<String, RuntimeException> exceptionSupplier) {
    if(!Arguments.requireNotNull(iterable, "iterable").iterator().hasNext()) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return iterable;
  }

  public static <T extends Iterable<U>, U> T requireNotEmpty(final T iterable, final String message,
                                                             final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(iterable, () -> message, exceptionSupplier);
  }

  public static <T extends Iterable<U>, U> T requireNotEmpty(final T iterable, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(iterable, () -> null, exceptionSupplier);
  }

  // Collection

  public static <T extends Collection<U>, U> T requireNotEmpty(final T collection, final Supplier<String> messageSupplier,
                                                               final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(collection, "collection").isEmpty()) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return collection;
  }

  public static <T extends Collection<U>, U> T requireNotEmpty(final T collection, final String message,
                                                               final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(collection, () -> message, exceptionSupplier);
  }

  public static <T extends Collection<U>, U> T requireNotEmpty(final T collection, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(collection, () -> null, exceptionSupplier);
  }

  // String

  public static String requireNotEmpty(final String string, final Supplier<String> messageSupplier, final Function<String, RuntimeException> exceptionSupplier) {
    if(Arguments.requireNotNull(string, "string").isEmpty()) throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    return string;
  }

  public static String requireNotEmpty(final String string, final String message, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(string, () -> message, exceptionSupplier);
  }

  public static String requireNotEmpty(final String string, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotEmpty(string, () -> null, exceptionSupplier);
  }

  // requireContainsEquals
  //

  // Array

  public static <T> T[] requireContainsEquals(final T[] array, final T expected, final Supplier<String> messageSupplier,
                                              final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final T element : array) {
      if(Objects.equals(element, expected)) return array;
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    throw new IllegalStateException();
  }

  public static <T> T[] requireContainsEquals(final T[] array, final T expected, final String message,
                                              final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsEquals(array, expected, () -> message, exceptionSupplier);
  }

  public static <T> T[] requireContainsEquals(final T[] array, final T expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsEquals(array, expected, () -> null, exceptionSupplier);
  }

  // Iterable

  public static <T extends Iterable<U>, U> T requireContainsEquals(final T iterable, final U expected, final Supplier<String> messageSupplier,
                                                                   final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(iterable, "iterable");

    for(final U element : iterable) {
      if(Objects.equals(element, expected)) return iterable;
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    throw new IllegalStateException();
  }

  public static <T extends Iterable<U>, U> T requireContainsEquals(final T iterable, final U expected, final String message,
                                                                   final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsEquals(iterable, expected, () -> message, exceptionSupplier);
  }

  public static <T extends Iterable<U>, U> T requireContainsEquals(final T iterable, final U expected,
                                                                   final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsEquals(iterable, expected, () -> null, exceptionSupplier);
  }

  // Collection

  public static <T extends Collection<U>, U> T requireContainsEquals(final T collection, final U expected, final Supplier<String> messageSupplier,
                                                                     final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(collection, "collected");

    for(final U element : collection) {
      if(Objects.equals(element, expected)) return collection;
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    throw new IllegalStateException();
  }

  public static <T extends Collection<U>, U> T requireContainsEquals(final T collection, final U expected, final String message,
                                                                     final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsEquals(collection, expected, () -> message, exceptionSupplier);
  }

  public static <T extends Collection<U>, U> T requireContainsEquals(final T collection, final U expected,
                                                                     final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsEquals(collection, expected, () -> null, exceptionSupplier);
  }

  // requireNotContainsEquals
  //

  // Array

  public static <T> T[] requireNotContainsEquals(final T[] array, final T unexpected, final Supplier<String> messageSupplier,
                                                 final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final T element : array) {
      if(Objects.equals(element, unexpected)) throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return array;
  }

  public static <T> T[] requireNotContainsEquals(final T[] array, final T unexpected, final String message,
                                                 final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsEquals(array, unexpected, () -> message, exceptionSupplier);
  }

  public static <T> T[] requireNotContainsEquals(final T[] array, final T unexpected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsEquals(array, unexpected, () -> null, exceptionSupplier);
  }

  // Iterable

  public static <T extends Iterable<U>, U> T requireNotContainsEquals(final T iterable, final U unexpected, final Supplier<String> messageSupplier,
                                                                      final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(iterable, "iterable");

    for(final U element : iterable) {
      if(Objects.equals(element, unexpected)) throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return iterable;
  }

  public static <T extends Iterable<U>, U> T requireNotContainsEquals(final T iterable, final U unexpected, final String message,
                                                                      final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsEquals(iterable, unexpected, () -> message, exceptionSupplier);
  }

  public static <T extends Iterable<U>, U> T requireNotContainsEquals(final T iterable, final U unexpected,
                                                                      final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsEquals(iterable, unexpected, () -> null, exceptionSupplier);
  }

  // Collection

  public static <T extends Collection<U>, U> T requireNotContainsEquals(final T collection, final U unexpected, final Supplier<String> messageSupplier,
                                                                        final Function<String, RuntimeException> exceptionSupplier) {
    if(collection.contains(unexpected)) {
      throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return collection;
  }

  public static <T extends Collection<U>, U> T requireNotContainsEquals(final T collection, final U unexpected, final String message,
                                                                        final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsEquals(collection, unexpected, () -> message, exceptionSupplier);
  }

  public static <T extends Collection<U>, U> T requireNotContainsEquals(final T collection, final U unexpected,
                                                                        final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsEquals(collection, unexpected, () -> null, exceptionSupplier);
  }

  // requireContainsSame
  //

  // boolean

  public static boolean[] requireContainsSame(final boolean[] array, final boolean expected, final Supplier<String> messageSupplier,
                                              final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final boolean element : array) {
      if(element == expected) return array;
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    throw new IllegalStateException();
  }

  public static boolean[] requireContainsSame(final boolean[] array, final boolean expected, final String message,
                                              final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> message, exceptionSupplier);
  }

  public static boolean[] requireContainsSame(final boolean[] array, final boolean expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> null, exceptionSupplier);
  }

  // byte

  public static byte[] requireContainsSame(final byte[] array, final byte expected, final Supplier<String> messageSupplier,
                                           final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final byte element : array) {
      if(element == expected) return array;
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    throw new IllegalStateException();
  }

  public static byte[] requireContainsSame(final byte[] array, final byte expected, final String message,
                                           final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> message, exceptionSupplier);
  }

  public static byte[] requireContainsSame(final byte[] array, final byte expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> null, exceptionSupplier);
  }

  // char

  public static char[] requireContainsSame(final char[] array, final char expected, final Supplier<String> messageSupplier,
                                           final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final char element : array) {
      if(element == expected) return array;
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    throw new IllegalStateException();
  }

  public static char[] requireContainsSame(final char[] array, final char expected, final String message,
                                           final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> message, exceptionSupplier);
  }

  public static char[] requireContainsSame(final char[] array, final char expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> null, exceptionSupplier);
  }

  // short

  public static short[] requireContainsSame(final short[] array, final short expected, final Supplier<String> messageSupplier,
                                            final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final short element : array) {
      if(element == expected) return array;
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    throw new IllegalStateException();
  }

  public static short[] requireContainsSame(final short[] array, final short expected, final String message,
                                            final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> message, exceptionSupplier);
  }

  public static short[] requireContainsSame(final short[] array, final short expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> null, exceptionSupplier);
  }

  // int

  public static int[] requireContainsSame(final int[] array, final int expected, final Supplier<String> messageSupplier,
                                          final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final int element : array) {
      if(element == expected) return array;
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    throw new IllegalStateException();
  }

  public static int[] requireContainsSame(final int[] array, final int expected, final String message,
                                          final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> message, exceptionSupplier);
  }

  public static int[] requireContainsSame(final int[] array, final int expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> null, exceptionSupplier);
  }

  // long

  public static long[] requireContainsSame(final long[] array, final long expected, final Supplier<String> messageSupplier,
                                           final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final long element : array) {
      if(element == expected) return array;
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    throw new IllegalStateException();
  }

  public static long[] requireContainsSame(final long[] array, final long expected, final String message,
                                           final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> message, exceptionSupplier);
  }

  public static long[] requireContainsSame(final long[] array, final long expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> null, exceptionSupplier);
  }

  // float

  public static float[] requireContainsSame(final float[] array, final float expected, final Supplier<String> messageSupplier,
                                            final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final float element : array) {
      if(element == expected) return array;
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    throw new IllegalStateException();
  }

  public static float[] requireContainsSame(final float[] array, final float expected, final String message,
                                            final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> message, exceptionSupplier);
  }

  public static float[] requireContainsSame(final float[] array, final float expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> null, exceptionSupplier);
  }

  // double

  public static double[] requireContainsSame(final double[] array, final double expected, final Supplier<String> messageSupplier,
                                             final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final double element : array) {
      if(element == expected) return array;
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    throw new IllegalStateException();
  }

  public static double[] requireContainsSame(final double[] array, final double expected, final String message,
                                             final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> message, exceptionSupplier);
  }

  public static double[] requireContainsSame(final double[] array, final double expected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> null, exceptionSupplier);
  }

  // Generic

  public static <T> T[] requireContainsSame(final T[] array, final T expected, final Supplier<String> messageSupplier,
                                            final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final T element : array) {
      if(element == expected) return array;
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    throw new IllegalStateException();
  }

  public static <T> T[] requireContainsSame(final T[] array, final T expected, final String message,
                                            final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> message, exceptionSupplier);
  }

  public static <T> T[] requireContainsSame(final T[] array, final T expected,
                                            final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, expected, () -> null, exceptionSupplier);
  }

  // Iterable

  public static <T extends Iterable<U>, U> T requireContainsSame(final T iterable, final U expected, final Supplier<String> messageSupplier,
                                                                 final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(iterable, "iterable");

    for(final U element : iterable) {
      if(element == expected) return iterable;
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    throw new IllegalStateException();
  }

  public static <T extends Iterable<U>, U> T requireContainsSame(final T iterable, final U expected, final String message,
                                                                 final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(iterable, expected, () -> message, exceptionSupplier);
  }

  public static <T extends Iterable<U>, U> T requireContainsSame(final T iterable, final U expected,
                                                                 final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(iterable, expected, () -> null, exceptionSupplier);
  }

  // Collection

  public static <T extends Collection<U>, U> T requireContainsSame(final T collection, final U expected, final Supplier<String> messageSupplier,
                                                                   final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(collection, "collected");

    for(final U element : collection) {
      if(element == expected) return collection;
    }

    throwWithMessageSupplier(messageSupplier, exceptionSupplier);

    throw new IllegalStateException();
  }

  public static <T extends Collection<U>, U> T requireContainsSame(final T collection, final U expected, final String message,
                                                                   final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(collection, expected, () -> message, exceptionSupplier);
  }

  public static <T extends Collection<U>, U> T requireContainsSame(final T collection, final U expected,
                                                                   final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(collection, expected, () -> null, exceptionSupplier);
  }

  // requireNotContainsSame
  //

  // boolean

  public static boolean[] requireNotContainsSame(final boolean[] array, final boolean unexpected, final Supplier<String> messageSupplier,
                                                 final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final boolean element : array) {
      if(element == unexpected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return array;
  }

  public static boolean[] requireNotContainsSame(final boolean[] array, final boolean unexpected, final String message,
                                                 final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(array, unexpected, () -> message, exceptionSupplier);
  }

  public static boolean[] requireNotContainsSame(final boolean[] array, final boolean unexpected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(array, unexpected, () -> null, exceptionSupplier);
  }

  // byte

  public static byte[] requireNotContainsSame(final byte[] array, final byte unexpected, final Supplier<String> messageSupplier,
                                              final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final byte element : array) {
      if(element == unexpected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return array;
  }

  public static byte[] requireNotContainsSame(final byte[] array, final byte unexpected, final String message,
                                              final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(array, unexpected, () -> message, exceptionSupplier);
  }

  public static byte[] requireNotContainsSame(final byte[] array, final byte unexpected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(array, unexpected, () -> null, exceptionSupplier);
  }

  // char

  public static char[] requireNotContainsSame(final char[] array, final char unexpected, final Supplier<String> messageSupplier,
                                              final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final char element : array) {
      if(element == unexpected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return array;
  }

  public static char[] requireNotContainsSame(final char[] array, final char unexpected, final String message,
                                              final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(array, unexpected, () -> message, exceptionSupplier);
  }

  public static char[] requireNotContainsSame(final char[] array, final char unexpected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(array, unexpected, () -> null, exceptionSupplier);
  }

  // short

  public static short[] requireNotContainsSame(final short[] array, final short unexpected, final Supplier<String> messageSupplier,
                                               final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final short element : array) {
      if(element == unexpected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return array;
  }

  public static short[] requireNotContainsSame(final short[] array, final short unexpected, final String message,
                                               final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(array, unexpected, () -> message, exceptionSupplier);
  }

  public static short[] requireNotContainsSame(final short[] array, final short unexpected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(array, unexpected, () -> null, exceptionSupplier);
  }

  // int

  public static int[] requireNotContainsSame(final int[] array, final int unexpected, final Supplier<String> messageSupplier,
                                             final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final int element : array) {
      if(element == unexpected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return array;
  }

  public static int[] requireNotContainsSame(final int[] array, final int unexpected, final String message,
                                             final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(array, unexpected, () -> message, exceptionSupplier);
  }

  public static int[] requireNotContainsSame(final int[] array, final int unexpected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(array, unexpected, () -> null, exceptionSupplier);
  }

  // long

  public static long[] requireNotContainsSame(final long[] array, final long unexpected, final Supplier<String> messageSupplier,
                                              final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final long element : array) {
      if(element == unexpected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return array;
  }

  public static long[] requireNotContainsSame(final long[] array, final long unexpected, final String message,
                                              final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(array, unexpected, () -> message, exceptionSupplier);
  }

  public static long[] requireNotContainsSame(final long[] array, final long unexpected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(array, unexpected, () -> null, exceptionSupplier);
  }

  // float

  public static float[] requireNotContainsSame(final float[] array, final float unexpected, final Supplier<String> messageSupplier,
                                               final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final float element : array) {
      if(element == unexpected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return array;
  }

  public static float[] requireNotContainsSame(final float[] array, final float unexpected, final String message,
                                               final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(array, unexpected, () -> message, exceptionSupplier);
  }

  public static float[] requireNotContainsSame(final float[] array, final float unexpected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(array, unexpected, () -> null, exceptionSupplier);
  }

  // double

  public static double[] requireNotContainsSame(final double[] array, final double unexpected, final Supplier<String> messageSupplier,
                                                final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final double element : array) {
      if(element == unexpected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return array;
  }

  public static double[] requireNotContainsSame(final double[] array, final double unexpected, final String message,
                                                final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(array, unexpected, () -> message, exceptionSupplier);
  }

  public static double[] requireNotContainsSame(final double[] array, final double unexpected, final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(array, unexpected, () -> null, exceptionSupplier);
  }

  // Generic

  public static <T> T[] requireNotContainsSame(final T[] array, final T unexpected, final Supplier<String> messageSupplier,
                                               final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(array, "array");

    for(final T element : array) {
      if(element == unexpected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return array;
  }

  public static <T> T[] requireNotContainsSame(final T[] array, final T unexpected, final String message,
                                               final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, unexpected, () -> message, exceptionSupplier);
  }

  public static <T> T[] requireNotContainsSame(final T[] array, final T unexpected,
                                               final Function<String, RuntimeException> exceptionSupplier) {
    return requireContainsSame(array, unexpected, () -> null, exceptionSupplier);
  }

  // Iterable

  public static <T extends Iterable<U>, U> T requireNotContainsSame(final T iterable, final U unexpected, final Supplier<String> messageSupplier,
                                                                    final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(iterable, "iterable");

    for(final U element : iterable) {
      if(element == unexpected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return iterable;
  }

  public static <T extends Iterable<U>, U> T requireNotContainsSame(final T iterable, final U unexpected, final String message,
                                                                    final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(iterable, unexpected, () -> message, exceptionSupplier);
  }

  public static <T extends Iterable<U>, U> T requireNotContainsSame(final T iterable, final U unexpected,
                                                                    final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(iterable, unexpected, () -> null, exceptionSupplier);
  }

  // Collection

  public static <T extends Collection<U>, U> T requireNotContainsSame(final T collection, final U unexpected, final Supplier<String> messageSupplier,
                                                                      final Function<String, RuntimeException> exceptionSupplier) {
    Arguments.requireNotNull(collection, "collected");

    for(final U element : collection) {
      if(element == unexpected) throwWithMessageSupplier(messageSupplier, exceptionSupplier);
    }

    return collection;
  }

  public static <T extends Collection<U>, U> T requireNotContainsSame(final T collection, final U unexpected, final String message,
                                                                      final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(collection, unexpected, () -> message, exceptionSupplier);
  }

  public static <T extends Collection<U>, U> T requireNotContainsSame(final T collection, final U unexpected,
                                                                      final Function<String, RuntimeException> exceptionSupplier) {
    return requireNotContainsSame(collection, unexpected, () -> null, exceptionSupplier);
  }

  // TODO: requireSize
  //

  // TODO: requireNotSize
  //

  // Helper methods
  //

  private static void throwWithMessageSupplier(Supplier<String> messageSupplier, Function<String, RuntimeException> exceptionSupplier) {
    if(messageSupplier == null) messageSupplier = () -> null;
    if(exceptionSupplier == null) exceptionSupplier = RuntimeException::new;

    throw exceptionSupplier.apply(messageSupplier.get());
  }

  // Constructors
  //--------------------------------------------------

  private Conditions() {
    super();

    throw new UnsupportedInstantiationException();
  }

}
