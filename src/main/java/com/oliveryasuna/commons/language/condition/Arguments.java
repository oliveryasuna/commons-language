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
import com.oliveryasuna.commons.language.function.*;

import java.util.Collection;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public final class Arguments {

  // requireTrue
  //--------------------------------------------------

  public static boolean requireTrue(final boolean condition, final BooleanFunction<String> messageSupplier) {
    return requireTrue(condition, () -> messageSupplier.apply(condition));
  }

  public static boolean requireTrue(final boolean condition, final Supplier<String> messageSupplier) {
    return Conditions.requireTrue(condition, messageSupplier, IllegalArgumentException::new);
  }

  public static boolean requireTrue(final boolean condition, final String message) {
    return Conditions.requireTrue(condition, message, IllegalArgumentException::new);
  }

  public static boolean requireTrue(final boolean condition) {
    return Conditions.requireTrue(condition, IllegalArgumentException::new);
  }

  // requireFalse
  //--------------------------------------------------

  public static boolean requireFalse(final boolean condition, final BooleanFunction<String> messageSupplier) {
    return requireFalse(condition, () -> messageSupplier.apply(condition));
  }

  public static boolean requireFalse(final boolean condition, final Supplier<String> messageSupplier) {
    return Conditions.requireFalse(condition, messageSupplier, IllegalArgumentException::new);
  }

  public static boolean requireFalse(final boolean condition, final String message) {
    return Conditions.requireFalse(condition, message, IllegalArgumentException::new);
  }

  public static boolean requireFalse(final boolean condition) {
    return Conditions.requireFalse(condition, IllegalArgumentException::new);
  }

  // requireSame
  //--------------------------------------------------

  // boolean

  public static boolean requireSame(final boolean argument, final boolean expected, final BooleanBiFunction<String> messageSupplier) {
    return requireSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static boolean requireSame(final boolean argument, final boolean expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static boolean requireSame(final boolean argument, final boolean expected, final String message) {
    return Conditions.requireSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static boolean requireSame(final boolean argument, final boolean expected) {
    return Conditions.requireSame(argument, expected, IllegalArgumentException::new);
  }

  // byte

  public static byte requireSame(final byte argument, final byte expected, final ByteBiFunction<String> messageSupplier) {
    return requireSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static byte requireSame(final byte argument, final byte expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static byte requireSame(final byte argument, final byte expected, final String message) {
    return Conditions.requireSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static byte requireSame(final byte argument, final byte expected) {
    return Conditions.requireSame(argument, expected, IllegalArgumentException::new);
  }

  // char

  public static char requireSame(final char argument, final char expected, final CharBiFunction<String> messageSupplier) {
    return requireSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static char requireSame(final char argument, final char expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static char requireSame(final char argument, final char expected, final String message) {
    return Conditions.requireSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static char requireSame(final char argument, final char expected) {
    return Conditions.requireSame(argument, expected, IllegalArgumentException::new);
  }

  // short

  public static short requireSame(final short argument, final short expected, final ShortBiFunction<String> messageSupplier) {
    return requireSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static short requireSame(final short argument, final short expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static short requireSame(final short argument, final short expected, final String message) {
    return Conditions.requireSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static short requireSame(final short argument, final short expected) {
    return Conditions.requireSame(argument, expected, IllegalArgumentException::new);
  }

  // int

  public static int requireSame(final int argument, final int expected, final IntBiFunction<String> messageSupplier) {
    return requireSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static int requireSame(final int argument, final int expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static int requireSame(final int argument, final int expected, final String message) {
    return Conditions.requireSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static int requireSame(final int argument, final int expected) {
    return Conditions.requireSame(argument, expected, IllegalArgumentException::new);
  }

  // long

  public static long requireSame(final long argument, final long expected, final LongBiFunction<String> messageSupplier) {
    return requireSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static long requireSame(final long argument, final long expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static long requireSame(final long argument, final long expected, final String message) {
    return Conditions.requireSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static long requireSame(final long argument, final long expected) {
    return Conditions.requireSame(argument, expected, IllegalArgumentException::new);
  }

  // float

  public static float requireSame(final float argument, final float expected, final FloatBiFunction<String> messageSupplier) {
    return requireSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static float requireSame(final float argument, final float expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static float requireSame(final float argument, final float expected, final String message) {
    return Conditions.requireSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static float requireSame(final float argument, final float expected) {
    return Conditions.requireSame(argument, expected, IllegalArgumentException::new);
  }

  // double

  public static double requireSame(final double argument, final double expected, final DoubleBiFunction<String> messageSupplier) {
    return requireSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static double requireSame(final double argument, final double expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static double requireSame(final double argument, final double expected, final String message) {
    return Conditions.requireSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static double requireSame(final double argument, final double expected) {
    return Conditions.requireSame(argument, expected, IllegalArgumentException::new);
  }

  // Generic

  public static <T> T requireSame(final T argument, final Object expected, final BiFunction<T, Object, String> messageSupplier) {
    return requireSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static <T> T requireSame(final T argument, final Object expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static <T> T requireSame(final T argument, final Object expected, final String message) {
    return Conditions.requireSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static <T> T requireSame(final T argument, final Object expected) {
    return Conditions.requireSame(argument, expected, IllegalArgumentException::new);
  }

  // requireNotSame
  //--------------------------------------------------

  // boolean

  public static boolean requireNotSame(final boolean argument, final boolean expected, final BooleanBiFunction<String> messageSupplier) {
    return requireNotSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static boolean requireNotSame(final boolean argument, final boolean expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static boolean requireNotSame(final boolean argument, final boolean expected, final String message) {
    return Conditions.requireNotSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static boolean requireNotSame(final boolean argument, final boolean expected) {
    return Conditions.requireNotSame(argument, expected, IllegalArgumentException::new);
  }

  // byte

  public static byte requireNotSame(final byte argument, final byte expected, final ByteBiFunction<String> messageSupplier) {
    return requireNotSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static byte requireNotSame(final byte argument, final byte expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static byte requireNotSame(final byte argument, final byte expected, final String message) {
    return Conditions.requireNotSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static byte requireNotSame(final byte argument, final byte expected) {
    return Conditions.requireNotSame(argument, expected, IllegalArgumentException::new);
  }

  // char

  public static char requireNotSame(final char argument, final char expected, final CharBiFunction<String> messageSupplier) {
    return requireNotSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static char requireNotSame(final char argument, final char expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static char requireNotSame(final char argument, final char expected, final String message) {
    return Conditions.requireNotSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static char requireNotSame(final char argument, final char expected) {
    return Conditions.requireNotSame(argument, expected, IllegalArgumentException::new);
  }

  // short

  public static short requireNotSame(final short argument, final short expected, final ShortBiFunction<String> messageSupplier) {
    return requireNotSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static short requireNotSame(final short argument, final short expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static short requireNotSame(final short argument, final short expected, final String message) {
    return Conditions.requireNotSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static short requireNotSame(final short argument, final short expected) {
    return Conditions.requireNotSame(argument, expected, IllegalArgumentException::new);
  }

  // int

  public static int requireNotSame(final int argument, final int expected, final IntBiFunction<String> messageSupplier) {
    return requireNotSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static int requireNotSame(final int argument, final int expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static int requireNotSame(final int argument, final int expected, final String message) {
    return Conditions.requireNotSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static int requireNotSame(final int argument, final int expected) {
    return Conditions.requireNotSame(argument, expected, IllegalArgumentException::new);
  }

  // long

  public static long requireNotSame(final long argument, final long expected, final LongBiFunction<String> messageSupplier) {
    return requireNotSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static long requireNotSame(final long argument, final long expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static long requireNotSame(final long argument, final long expected, final String message) {
    return Conditions.requireNotSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static long requireNotSame(final long argument, final long expected) {
    return Conditions.requireNotSame(argument, expected, IllegalArgumentException::new);
  }

  // float

  public static float requireNotSame(final float argument, final float expected, final FloatBiFunction<String> messageSupplier) {
    return requireNotSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static float requireNotSame(final float argument, final float expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static float requireNotSame(final float argument, final float expected, final String message) {
    return Conditions.requireNotSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static float requireNotSame(final float argument, final float expected) {
    return Conditions.requireNotSame(argument, expected, IllegalArgumentException::new);
  }

  // double

  public static double requireNotSame(final double argument, final double expected, final DoubleBiFunction<String> messageSupplier) {
    return requireNotSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static double requireNotSame(final double argument, final double expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static double requireNotSame(final double argument, final double expected, final String message) {
    return Conditions.requireNotSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static double requireNotSame(final double argument, final double expected) {
    return Conditions.requireNotSame(argument, expected, IllegalArgumentException::new);
  }

  // Generic

  public static <T> T requireNotSame(final T argument, final Object expected, final BiFunction<T, Object, String> messageSupplier) {
    return requireNotSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static <T> T requireNotSame(final T argument, final Object expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static <T> T requireNotSame(final T argument, final Object expected, final String message) {
    return Conditions.requireNotSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static <T> T requireNotSame(final T argument, final Object expected) {
    return Conditions.requireNotSame(argument, expected, IllegalArgumentException::new);
  }

  // requireEquals
  //--------------------------------------------------

  public static <T> T requireEquals(final T argument, final Object expected, final BiFunction<T, Object, String> messageSupplier) {
    return requireEquals(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static <T> T requireEquals(final T argument, final Object expected, final Supplier<String> messageSupplier) {
    return Conditions.requireEquals(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static <T> T requireEquals(final T argument, final Object expected, final String message) {
    return Conditions.requireEquals(argument, expected, message, IllegalArgumentException::new);
  }

  public static <T> T requireEquals(final T argument, final Object expected) {
    return Conditions.requireEquals(argument, expected, IllegalArgumentException::new);
  }

  // requireNotEquals
  //--------------------------------------------------

  public static <T> T requireNotEquals(final T argument, final Object expected, final BiFunction<T, Object, String> messageSupplier) {
    return requireNotEquals(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static <T> T requireNotEquals(final T argument, final Object expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotEquals(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static <T> T requireNotEquals(final T argument, final Object expected, final String message) {
    return Conditions.requireNotEquals(argument, expected, message, IllegalArgumentException::new);
  }

  public static <T> T requireNotEquals(final T argument, final Object expected) {
    return Conditions.requireNotEquals(argument, expected, IllegalArgumentException::new);
  }

  // requireNull
  //--------------------------------------------------

  public static <T> T requireNull(final T argument, final Function<T, String> messageSupplier) {
    return requireNull(argument, () -> messageSupplier.apply(argument));
  }

  public static <T> T requireNull(final T argument, final Supplier<String> messageSupplier) {
    return Conditions.requireNull(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static <T> T requireNull(final T argument, final String message) {
    return Conditions.requireNull(argument, message, IllegalArgumentException::new);
  }

  public static <T> T requireNull(final T argument) {
    return Conditions.requireNull(argument, IllegalArgumentException::new);
  }

  // requireNotNull
  //--------------------------------------------------

  public static <T> T requireNotNull(final T argument, final Function<T, String> messageSupplier) {
    return requireNotNull(argument, () -> messageSupplier.apply(argument));
  }

  public static <T> T requireNotNull(final T argument, final Supplier<String> messageSupplier) {
    return Conditions.requireNotNull(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static <T> T requireNotNull(final T argument, final String message) {
    return Conditions.requireNotNull(argument, message, IllegalArgumentException::new);
  }

  public static <T> T requireNotNull(final T argument) {
    return Conditions.requireNotNull(argument, IllegalArgumentException::new);
  }

  // requireGreater
  //--------------------------------------------------

  // byte

  public static byte requireGreater(final byte actual, final byte less, final ByteBiFunction<String> messageSupplier) {
    return requireGreater(actual, less, () -> messageSupplier.apply(actual, less));
  }

  public static byte requireGreater(final byte actual, final byte less, final Supplier<String> messageSupplier) {
    return Conditions.requireGreater(actual, less, messageSupplier, IllegalArgumentException::new);
  }

  public static byte requireGreater(final byte actual, final byte less, final String message) {
    return Conditions.requireGreater(actual, less, message, IllegalArgumentException::new);
  }

  public static byte requireGreater(final byte actual, final byte less) {
    return Conditions.requireGreater(actual, less, IllegalArgumentException::new);
  }

  // char

  public static char requireGreater(final char actual, final char less, final CharBiFunction<String> messageSupplier) {
    return requireGreater(actual, less, () -> messageSupplier.apply(actual, less));
  }

  public static char requireGreater(final char actual, final char less, final Supplier<String> messageSupplier) {
    return Conditions.requireGreater(actual, less, messageSupplier, IllegalArgumentException::new);
  }

  public static char requireGreater(final char actual, final char less, final String message) {
    return Conditions.requireGreater(actual, less, message, IllegalArgumentException::new);
  }

  public static char requireGreater(final char actual, final char less) {
    return Conditions.requireGreater(actual, less, IllegalArgumentException::new);
  }

  // short

  public static short requireGreater(final short actual, final short less, final ShortBiFunction<String> messageSupplier) {
    return requireGreater(actual, less, () -> messageSupplier.apply(actual, less));
  }

  public static short requireGreater(final short actual, final short less, final Supplier<String> messageSupplier) {
    return Conditions.requireGreater(actual, less, messageSupplier, IllegalArgumentException::new);
  }

  public static short requireGreater(final short actual, final short less, final String message) {
    return Conditions.requireGreater(actual, less, message, IllegalArgumentException::new);
  }

  public static short requireGreater(final short actual, final short less) {
    return Conditions.requireGreater(actual, less, IllegalArgumentException::new);
  }

  // int

  public static int requireGreater(final int actual, final int less, final IntBiFunction<String> messageSupplier) {
    return requireGreater(actual, less, () -> messageSupplier.apply(actual, less));
  }

  public static int requireGreater(final int actual, final int less, final Supplier<String> messageSupplier) {
    return Conditions.requireGreater(actual, less, messageSupplier, IllegalArgumentException::new);
  }

  public static int requireGreater(final int actual, final int less, final String message) {
    return Conditions.requireGreater(actual, less, message, IllegalArgumentException::new);
  }

  public static int requireGreater(final int actual, final int less) {
    return Conditions.requireGreater(actual, less, IllegalArgumentException::new);
  }

  // long

  public static long requireGreater(final long actual, final long less, final LongBiFunction<String> messageSupplier) {
    return requireGreater(actual, less, () -> messageSupplier.apply(actual, less));
  }

  public static long requireGreater(final long actual, final long less, final Supplier<String> messageSupplier) {
    return Conditions.requireGreater(actual, less, messageSupplier, IllegalArgumentException::new);
  }

  public static long requireGreater(final long actual, final long less, final String message) {
    return Conditions.requireGreater(actual, less, message, IllegalArgumentException::new);
  }

  public static long requireGreater(final long actual, final long less) {
    return Conditions.requireGreater(actual, less, IllegalArgumentException::new);
  }

  // float

  public static float requireGreater(final float actual, final float less, final FloatBiFunction<String> messageSupplier) {
    return requireGreater(actual, less, () -> messageSupplier.apply(actual, less));
  }

  public static float requireGreater(final float actual, final float less, final Supplier<String> messageSupplier) {
    return Conditions.requireGreater(actual, less, messageSupplier, IllegalArgumentException::new);
  }

  public static float requireGreater(final float actual, final float less, final String message) {
    return Conditions.requireGreater(actual, less, message, IllegalArgumentException::new);
  }

  public static float requireGreater(final float actual, final float less) {
    return Conditions.requireGreater(actual, less, IllegalArgumentException::new);
  }

  // double

  public static double requireGreater(final double actual, final double less, final DoubleBiFunction<String> messageSupplier) {
    return requireGreater(actual, less, () -> messageSupplier.apply(actual, less));
  }

  public static double requireGreater(final double actual, final double less, final Supplier<String> messageSupplier) {
    return Conditions.requireGreater(actual, less, messageSupplier, IllegalArgumentException::new);
  }

  public static double requireGreater(final double actual, final double less, final String message) {
    return Conditions.requireGreater(actual, less, message, IllegalArgumentException::new);
  }

  public static double requireGreater(final double actual, final double less) {
    return Conditions.requireGreater(actual, less, IllegalArgumentException::new);
  }

  // Comparable

  public static <T extends Comparable<T>, U extends T> T requireGreater(final T actual, final U less, final BiFunction<T, U, String> messageSupplier) {
    return requireGreater(actual, less, () -> messageSupplier.apply(actual, less));
  }

  public static <T extends Comparable<T>, U extends T> T requireGreater(final T actual, final U less, final Supplier<String> messageSupplier) {
    return Conditions.requireGreater(actual, less, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Comparable<T>, U extends T> T requireGreater(final T actual, final U less, final String message) {
    return Conditions.requireGreater(actual, less, message, IllegalArgumentException::new);
  }

  public static <T extends Comparable<T>, U extends T> T requireGreater(final T actual, final U less) {
    return Conditions.requireGreater(actual, less, IllegalArgumentException::new);
  }

  // Comparator

  public static <T extends Comparable<T>, U extends T> T requireGreater(final T actual, final U less, final Comparator<T> comparator,
      final BiFunction<T, U, String> messageSupplier) {
    return requireGreater(actual, less, comparator, () -> messageSupplier.apply(actual, less));
  }

  public static <T extends Comparable<T>, U extends T> T requireGreater(final T actual, final U less, final Comparator<T> comparator,
      final Supplier<String> messageSupplier) {
    return Conditions.requireGreater(actual, less, comparator, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Comparable<T>, U extends T> T requireGreater(final T actual, final U less, final Comparator<T> comparator, final String message) {
    return Conditions.requireGreater(actual, less, comparator, message, IllegalArgumentException::new);
  }

  public static <T extends Comparable<T>, U extends T> T requireGreater(final T actual, final U less, final Comparator<T> comparator) {
    return Conditions.requireGreater(actual, less, comparator, IllegalArgumentException::new);
  }

  // Comparison result

  public static int requireGreater(final int result, final IntFunction<String> messageSupplier) {
    return requireGreater(result, () -> messageSupplier.apply(result));
  }

  public static int requireGreater(final int result, final Supplier<String> messageSupplier) {
    return Conditions.requireGreater(result, messageSupplier, IllegalArgumentException::new);
  }

  public static int requireGreater(final int result, final String message) {
    return Conditions.requireGreater(result, message, IllegalArgumentException::new);
  }

  public static int requireGreater(final int result) {
    return Conditions.requireGreater(result, IllegalArgumentException::new);
  }

  // requireLess
  //--------------------------------------------------

  // byte

  public static byte requireLess(final byte actual, final byte greater, final ByteBiFunction<String> messageSupplier) {
    return requireLess(actual, greater, () -> messageSupplier.apply(actual, greater));
  }

  public static byte requireLess(final byte actual, final byte greater, final Supplier<String> messageSupplier) {
    return Conditions.requireLess(actual, greater, messageSupplier, IllegalArgumentException::new);
  }

  public static byte requireLess(final byte actual, final byte greater, final String message) {
    return Conditions.requireLess(actual, greater, message, IllegalArgumentException::new);
  }

  public static byte requireLess(final byte actual, final byte greater) {
    return Conditions.requireLess(actual, greater, IllegalArgumentException::new);
  }

  // char

  public static char requireLess(final char actual, final char greater, final CharBiFunction<String> messageSupplier) {
    return requireLess(actual, greater, () -> messageSupplier.apply(actual, greater));
  }

  public static char requireLess(final char actual, final char greater, final Supplier<String> messageSupplier) {
    return Conditions.requireLess(actual, greater, messageSupplier, IllegalArgumentException::new);
  }

  public static char requireLess(final char actual, final char greater, final String message) {
    return Conditions.requireLess(actual, greater, message, IllegalArgumentException::new);
  }

  public static char requireLess(final char actual, final char greater) {
    return Conditions.requireLess(actual, greater, IllegalArgumentException::new);
  }

  // short

  public static short requireLess(final short actual, final short greater, final ShortBiFunction<String> messageSupplier) {
    return requireLess(actual, greater, () -> messageSupplier.apply(actual, greater));
  }

  public static short requireLess(final short actual, final short greater, final Supplier<String> messageSupplier) {
    return Conditions.requireLess(actual, greater, messageSupplier, IllegalArgumentException::new);
  }

  public static short requireLess(final short actual, final short greater, final String message) {
    return Conditions.requireLess(actual, greater, message, IllegalArgumentException::new);
  }

  public static short requireLess(final short actual, final short greater) {
    return Conditions.requireLess(actual, greater, IllegalArgumentException::new);
  }

  // int

  public static int requireLess(final int actual, final int greater, final IntBiFunction<String> messageSupplier) {
    return requireLess(actual, greater, () -> messageSupplier.apply(actual, greater));
  }

  public static int requireLess(final int actual, final int greater, final Supplier<String> messageSupplier) {
    return Conditions.requireLess(actual, greater, messageSupplier, IllegalArgumentException::new);
  }

  public static int requireLess(final int actual, final int greater, final String message) {
    return Conditions.requireLess(actual, greater, message, IllegalArgumentException::new);
  }

  public static int requireLess(final int actual, final int greater) {
    return Conditions.requireLess(actual, greater, IllegalArgumentException::new);
  }

  // long

  public static long requireLess(final long actual, final long greater, final LongBiFunction<String> messageSupplier) {
    return requireLess(actual, greater, () -> messageSupplier.apply(actual, greater));
  }

  public static long requireLess(final long actual, final long greater, final Supplier<String> messageSupplier) {
    return Conditions.requireLess(actual, greater, messageSupplier, IllegalArgumentException::new);
  }

  public static long requireLess(final long actual, final long greater, final String message) {
    return Conditions.requireLess(actual, greater, message, IllegalArgumentException::new);
  }

  public static long requireLess(final long actual, final long greater) {
    return Conditions.requireLess(actual, greater, IllegalArgumentException::new);
  }

  // float

  public static float requireLess(final float actual, final float greater, final FloatBiFunction<String> messageSupplier) {
    return requireLess(actual, greater, () -> messageSupplier.apply(actual, greater));
  }

  public static float requireLess(final float actual, final float greater, final Supplier<String> messageSupplier) {
    return Conditions.requireLess(actual, greater, messageSupplier, IllegalArgumentException::new);
  }

  public static float requireLess(final float actual, final float greater, final String message) {
    return Conditions.requireLess(actual, greater, message, IllegalArgumentException::new);
  }

  public static float requireLess(final float actual, final float greater) {
    return Conditions.requireLess(actual, greater, IllegalArgumentException::new);
  }

  // double

  public static double requireLess(final double actual, final double greater, final DoubleBiFunction<String> messageSupplier) {
    return requireLess(actual, greater, () -> messageSupplier.apply(actual, greater));
  }

  public static double requireLess(final double actual, final double greater, final Supplier<String> messageSupplier) {
    return Conditions.requireLess(actual, greater, messageSupplier, IllegalArgumentException::new);
  }

  public static double requireLess(final double actual, final double greater, final String message) {
    return Conditions.requireLess(actual, greater, message, IllegalArgumentException::new);
  }

  public static double requireLess(final double actual, final double greater) {
    return Conditions.requireLess(actual, greater, IllegalArgumentException::new);
  }

  // Comparable

  public static <T extends Comparable<T>, U extends T> T requireLess(final T actual, final U greater, final BiFunction<T, U, String> messageSupplier) {
    return requireLess(actual, greater, () -> messageSupplier.apply(actual, greater));
  }

  public static <T extends Comparable<T>, U extends T> T requireLess(final T actual, final U greater, final Supplier<String> messageSupplier) {
    return Conditions.requireLess(actual, greater, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Comparable<T>, U extends T> T requireLess(final T actual, final U greater, final String message) {
    return Conditions.requireLess(actual, greater, message, IllegalArgumentException::new);
  }

  public static <T extends Comparable<T>, U extends T> T requireLess(final T actual, final U greater) {
    return Conditions.requireLess(actual, greater, IllegalArgumentException::new);
  }

  // Comparator

  public static <T extends Comparable<T>, U extends T> T requireLess(final T actual, final U greater, final Comparator<T> comparator,
      final BiFunction<T, U, String> messageSupplier) {
    return requireLess(actual, greater, comparator, () -> messageSupplier.apply(actual, greater));
  }

  public static <T extends Comparable<T>, U extends T> T requireLess(final T actual, final U greater, final Comparator<T> comparator,
      final Supplier<String> messageSupplier) {
    return Conditions.requireLess(actual, greater, comparator, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Comparable<T>, U extends T> T requireLess(final T actual, final U greater, final Comparator<T> comparator, final String message) {
    return Conditions.requireLess(actual, greater, comparator, message, IllegalArgumentException::new);
  }

  public static <T extends Comparable<T>, U extends T> T requireLess(final T actual, final U greater, final Comparator<T> comparator) {
    return Conditions.requireLess(actual, greater, comparator, IllegalArgumentException::new);
  }

  // Comparison result

  public static int requireLess(final int result, final IntFunction<String> messageSupplier) {
    return requireLess(result, () -> messageSupplier.apply(result));
  }

  public static int requireLess(final int result, final Supplier<String> messageSupplier) {
    return Conditions.requireLess(result, messageSupplier, IllegalArgumentException::new);
  }

  public static int requireLess(final int result, final String message) {
    return Conditions.requireLess(result, message, IllegalArgumentException::new);
  }

  public static int requireLess(final int result) {
    return Conditions.requireLess(result, IllegalArgumentException::new);
  }

  // requireGreaterOrSame
  //--------------------------------------------------

  // byte

  public static byte requireGreaterOrSame(final byte actual, final byte lessOrSame, final ByteBiFunction<String> messageSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> messageSupplier.apply(actual, lessOrSame));
  }

  public static byte requireGreaterOrSame(final byte actual, final byte lessOrSame, final Supplier<String> messageSupplier) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, messageSupplier, IllegalArgumentException::new);
  }

  public static byte requireGreaterOrSame(final byte actual, final byte lessOrSame, final String message) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, message, IllegalArgumentException::new);
  }

  public static byte requireGreaterOrSame(final byte actual, final byte lessOrSame) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, IllegalArgumentException::new);
  }

  // char

  public static char requireGreaterOrSame(final char actual, final char lessOrSame, final CharBiFunction<String> messageSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> messageSupplier.apply(actual, lessOrSame));
  }

  public static char requireGreaterOrSame(final char actual, final char lessOrSame, final Supplier<String> messageSupplier) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, messageSupplier, IllegalArgumentException::new);
  }

  public static char requireGreaterOrSame(final char actual, final char lessOrSame, final String message) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, message, IllegalArgumentException::new);
  }

  public static char requireGreaterOrSame(final char actual, final char lessOrSame) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, IllegalArgumentException::new);
  }

  // short

  public static short requireGreaterOrSame(final short actual, final short lessOrSame, final ShortBiFunction<String> messageSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> messageSupplier.apply(actual, lessOrSame));
  }

  public static short requireGreaterOrSame(final short actual, final short lessOrSame, final Supplier<String> messageSupplier) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, messageSupplier, IllegalArgumentException::new);
  }

  public static short requireGreaterOrSame(final short actual, final short lessOrSame, final String message) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, message, IllegalArgumentException::new);
  }

  public static short requireGreaterOrSame(final short actual, final short lessOrSame) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, IllegalArgumentException::new);
  }

  // int

  public static int requireGreaterOrSame(final int actual, final int lessOrSame, final IntBiFunction<String> messageSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> messageSupplier.apply(actual, lessOrSame));
  }

  public static int requireGreaterOrSame(final int actual, final int lessOrSame, final Supplier<String> messageSupplier) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, messageSupplier, IllegalArgumentException::new);
  }

  public static int requireGreaterOrSame(final int actual, final int lessOrSame, final String message) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, message, IllegalArgumentException::new);
  }

  public static int requireGreaterOrSame(final int actual, final int lessOrSame) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, IllegalArgumentException::new);
  }

  // long

  public static long requireGreaterOrSame(final long actual, final long lessOrSame, final LongBiFunction<String> messageSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> messageSupplier.apply(actual, lessOrSame));
  }

  public static long requireGreaterOrSame(final long actual, final long lessOrSame, final Supplier<String> messageSupplier) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, messageSupplier, IllegalArgumentException::new);
  }

  public static long requireGreaterOrSame(final long actual, final long lessOrSame, final String message) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, message, IllegalArgumentException::new);
  }

  public static long requireGreaterOrSame(final long actual, final long lessOrSame) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, IllegalArgumentException::new);
  }

  // float

  public static float requireGreaterOrSame(final float actual, final float lessOrSame, final FloatBiFunction<String> messageSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> messageSupplier.apply(actual, lessOrSame));
  }

  public static float requireGreaterOrSame(final float actual, final float lessOrSame, final Supplier<String> messageSupplier) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, messageSupplier, IllegalArgumentException::new);
  }

  public static float requireGreaterOrSame(final float actual, final float lessOrSame, final String message) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, message, IllegalArgumentException::new);
  }

  public static float requireGreaterOrSame(final float actual, final float lessOrSame) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, IllegalArgumentException::new);
  }

  // double

  public static double requireGreaterOrSame(final double actual, final double lessOrSame, final DoubleBiFunction<String> messageSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> messageSupplier.apply(actual, lessOrSame));
  }

  public static double requireGreaterOrSame(final double actual, final double lessOrSame, final Supplier<String> messageSupplier) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, messageSupplier, IllegalArgumentException::new);
  }

  public static double requireGreaterOrSame(final double actual, final double lessOrSame, final String message) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, message, IllegalArgumentException::new);
  }

  public static double requireGreaterOrSame(final double actual, final double lessOrSame) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, IllegalArgumentException::new);
  }

  // Comparable

  public static <T extends Comparable<T>, U extends T> T requireGreaterOrSame(final T actual, final U lessOrSame,
      final BiFunction<T, U, String> messageSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, () -> messageSupplier.apply(actual, lessOrSame));
  }

  public static <T extends Comparable<T>, U extends T> T requireGreaterOrSame(final T actual, final U lessOrSame, final Supplier<String> messageSupplier) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Comparable<T>, U extends T> T requireGreaterOrSame(final T actual, final U lessOrSame, final String message) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, message, IllegalArgumentException::new);
  }

  public static <T extends Comparable<T>, U extends T> T requireGreaterOrSame(final T actual, final U lessOrSame) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, IllegalArgumentException::new);
  }

  // Comparator

  public static <T extends Comparable<T>, U extends T> T requireGreaterOrSame(final T actual, final U lessOrSame, final Comparator<T> comparator,
      final BiFunction<T, U, String> messageSupplier) {
    return requireGreaterOrSame(actual, lessOrSame, comparator, () -> messageSupplier.apply(actual, lessOrSame));
  }

  public static <T extends Comparable<T>, U extends T> T requireGreaterOrSame(final T actual, final U lessOrSame, final Comparator<T> comparator,
      final Supplier<String> messageSupplier) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, comparator, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Comparable<T>, U extends T> T requireGreaterOrSame(final T actual, final U lessOrSame,
      final Comparator<T> comparator, final String message) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, comparator, message, IllegalArgumentException::new);
  }

  public static <T extends Comparable<T>, U extends T> T requireGreaterOrSame(final T actual, final U lessOrSame, final Comparator<T> comparator) {
    return Conditions.requireGreaterOrSame(actual, lessOrSame, comparator, IllegalArgumentException::new);
  }

  // Comparison result

  public static int requireGreaterOrSame(final int result, final IntFunction<String> messageSupplier) {
    return requireGreaterOrSame(result, () -> messageSupplier.apply(result));
  }

  public static int requireGreaterOrSame(final int result, final Supplier<String> messageSupplier) {
    return Conditions.requireGreaterOrSame(result, messageSupplier, IllegalArgumentException::new);
  }

  public static int requireGreaterOrSame(final int result, final String message) {
    return Conditions.requireGreaterOrSame(result, message, IllegalArgumentException::new);
  }

  public static int requireGreaterOrSame(final int result) {
    return Conditions.requireGreaterOrSame(result, IllegalArgumentException::new);
  }

  // requireLessOrSame
  //--------------------------------------------------

  // byte

  public static byte requireLessOrSame(final byte actual, final byte greaterOrSame, final ByteBiFunction<String> messageSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> messageSupplier.apply(actual, greaterOrSame));
  }

  public static byte requireLessOrSame(final byte actual, final byte greaterOrSame, final Supplier<String> messageSupplier) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, messageSupplier, IllegalArgumentException::new);
  }

  public static byte requireLessOrSame(final byte actual, final byte greaterOrSame, final String message) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, message, IllegalArgumentException::new);
  }

  public static byte requireLessOrSame(final byte actual, final byte greaterOrSame) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, IllegalArgumentException::new);
  }

  // char

  public static char requireLessOrSame(final char actual, final char greaterOrSame, final CharBiFunction<String> messageSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> messageSupplier.apply(actual, greaterOrSame));
  }

  public static char requireLessOrSame(final char actual, final char greaterOrSame, final Supplier<String> messageSupplier) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, messageSupplier, IllegalArgumentException::new);
  }

  public static char requireLessOrSame(final char actual, final char greaterOrSame, final String message) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, message, IllegalArgumentException::new);
  }

  public static char requireLessOrSame(final char actual, final char greaterOrSame) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, IllegalArgumentException::new);
  }

  // short

  public static short requireLessOrSame(final short actual, final short greaterOrSame, final ShortBiFunction<String> messageSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> messageSupplier.apply(actual, greaterOrSame));
  }

  public static short requireLessOrSame(final short actual, final short greaterOrSame, final Supplier<String> messageSupplier) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, messageSupplier, IllegalArgumentException::new);
  }

  public static short requireLessOrSame(final short actual, final short greaterOrSame, final String message) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, message, IllegalArgumentException::new);
  }

  public static short requireLessOrSame(final short actual, final short greaterOrSame) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, IllegalArgumentException::new);
  }

  // int

  public static int requireLessOrSame(final int actual, final int greaterOrSame, final IntBiFunction<String> messageSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> messageSupplier.apply(actual, greaterOrSame));
  }

  public static int requireLessOrSame(final int actual, final int greaterOrSame, final Supplier<String> messageSupplier) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, messageSupplier, IllegalArgumentException::new);
  }

  public static int requireLessOrSame(final int actual, final int greaterOrSame, final String message) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, message, IllegalArgumentException::new);
  }

  public static int requireLessOrSame(final int actual, final int greaterOrSame) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, IllegalArgumentException::new);
  }

  // long

  public static long requireLessOrSame(final long actual, final long greaterOrSame, final LongBiFunction<String> messageSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> messageSupplier.apply(actual, greaterOrSame));
  }

  public static long requireLessOrSame(final long actual, final long greaterOrSame, final Supplier<String> messageSupplier) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, messageSupplier, IllegalArgumentException::new);
  }

  public static long requireLessOrSame(final long actual, final long greaterOrSame, final String message) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, message, IllegalArgumentException::new);
  }

  public static long requireLessOrSame(final long actual, final long greaterOrSame) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, IllegalArgumentException::new);
  }

  // float

  public static float requireLessOrSame(final float actual, final float greaterOrSame, final FloatBiFunction<String> messageSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> messageSupplier.apply(actual, greaterOrSame));
  }

  public static float requireLessOrSame(final float actual, final float greaterOrSame, final Supplier<String> messageSupplier) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, messageSupplier, IllegalArgumentException::new);
  }

  public static float requireLessOrSame(final float actual, final float greaterOrSame, final String message) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, message, IllegalArgumentException::new);
  }

  public static float requireLessOrSame(final float actual, final float greaterOrSame) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, IllegalArgumentException::new);
  }

  // double

  public static double requireLessOrSame(final double actual, final double greaterOrSame, final DoubleBiFunction<String> messageSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> messageSupplier.apply(actual, greaterOrSame));
  }

  public static double requireLessOrSame(final double actual, final double greaterOrSame, final Supplier<String> messageSupplier) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, messageSupplier, IllegalArgumentException::new);
  }

  public static double requireLessOrSame(final double actual, final double greaterOrSame, final String message) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, message, IllegalArgumentException::new);
  }

  public static double requireLessOrSame(final double actual, final double greaterOrSame) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, IllegalArgumentException::new);
  }

  // Comparable

  public static <T extends Comparable<T>, U extends T> T requireLessOrSame(final T actual, final U greaterOrSame,
      final BiFunction<T, U, String> messageSupplier) {
    return requireLessOrSame(actual, greaterOrSame, () -> messageSupplier.apply(actual, greaterOrSame));
  }

  public static <T extends Comparable<T>, U extends T> T requireLessOrSame(final T actual, final U greaterOrSame, final Supplier<String> messageSupplier) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Comparable<T>, U extends T> T requireLessOrSame(final T actual, final U greaterOrSame, final String message) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, message, IllegalArgumentException::new);
  }

  public static <T extends Comparable<T>, U extends T> T requireLessOrSame(final T actual, final U greaterOrSame) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, IllegalArgumentException::new);
  }

  // Comparator

  public static <T extends Comparable<T>, U extends T> T requireLessOrSame(final T actual, final U greaterOrSame, final Comparator<T> comparator,
      final BiFunction<T, U, String> messageSupplier) {
    return requireLessOrSame(actual, greaterOrSame, comparator, () -> messageSupplier.apply(actual, greaterOrSame));
  }

  public static <T extends Comparable<T>, U extends T> T requireLessOrSame(final T actual, final U greaterOrSame, final Comparator<T> comparator,
      final Supplier<String> messageSupplier) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, comparator, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Comparable<T>, U extends T> T requireLessOrSame(final T actual, final U greaterOrSame,
      final Comparator<T> comparator, final String message) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, comparator, message, IllegalArgumentException::new);
  }

  public static <T extends Comparable<T>, U extends T> T requireLessOrSame(final T actual, final U greaterOrSame, final Comparator<T> comparator) {
    return Conditions.requireLessOrSame(actual, greaterOrSame, comparator, IllegalArgumentException::new);
  }

  // Comparison result

  public static int requireLessOrSame(final int result, final IntFunction<String> messageSupplier) {
    return requireLessOrSame(result, () -> messageSupplier.apply(result));
  }

  public static int requireLessOrSame(final int result, final Supplier<String> messageSupplier) {
    return Conditions.requireLessOrSame(result, messageSupplier, IllegalArgumentException::new);
  }

  public static int requireLessOrSame(final int result, final String message) {
    return Conditions.requireLessOrSame(result, message, IllegalArgumentException::new);
  }

  public static int requireLessOrSame(final int result) {
    return Conditions.requireLessOrSame(result, IllegalArgumentException::new);
  }

  // requireEmpty
  //--------------------------------------------------

  // boolean

  public static boolean[] requireEmpty(final boolean[] argument, final BooleanArrayFunction<String> messageSupplier) {
    return requireEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static boolean[] requireEmpty(final boolean[] argument, final Supplier<String> messageSupplier) {
    return Conditions.requireEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static boolean[] requireEmpty(final boolean[] argument, final String message) {
    return Conditions.requireEmpty(argument, message, IllegalArgumentException::new);
  }

  public static boolean[] requireEmpty(final boolean[] argument) {
    return Conditions.requireEmpty(argument, IllegalArgumentException::new);
  }

  // byte

  public static byte[] requireEmpty(final byte[] argument, final ByteArrayFunction<String> messageSupplier) {
    return requireEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static byte[] requireEmpty(final byte[] argument, final Supplier<String> messageSupplier) {
    return Conditions.requireEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static byte[] requireEmpty(final byte[] argument, final String message) {
    return Conditions.requireEmpty(argument, message, IllegalArgumentException::new);
  }

  public static byte[] requireEmpty(final byte[] argument) {
    return Conditions.requireEmpty(argument, IllegalArgumentException::new);
  }

  // char

  public static char[] requireEmpty(final char[] argument, final CharArrayFunction<String> messageSupplier) {
    return requireEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static char[] requireEmpty(final char[] argument, final Supplier<String> messageSupplier) {
    return Conditions.requireEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static char[] requireEmpty(final char[] argument, final String message) {
    return Conditions.requireEmpty(argument, message, IllegalArgumentException::new);
  }

  public static char[] requireEmpty(final char[] argument) {
    return Conditions.requireEmpty(argument, IllegalArgumentException::new);
  }

  // short

  public static short[] requireEmpty(final short[] argument, final ShortArrayFunction<String> messageSupplier) {
    return requireEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static short[] requireEmpty(final short[] argument, final Supplier<String> messageSupplier) {
    return Conditions.requireEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static short[] requireEmpty(final short[] argument, final String message) {
    return Conditions.requireEmpty(argument, message, IllegalArgumentException::new);
  }

  public static short[] requireEmpty(final short[] argument) {
    return Conditions.requireEmpty(argument, IllegalArgumentException::new);
  }

  // int

  public static int[] requireEmpty(final int[] argument, final IntArrayFunction<String> messageSupplier) {
    return requireEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static int[] requireEmpty(final int[] argument, final Supplier<String> messageSupplier) {
    return Conditions.requireEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static int[] requireEmpty(final int[] argument, final String message) {
    return Conditions.requireEmpty(argument, message, IllegalArgumentException::new);
  }

  public static int[] requireEmpty(final int[] argument) {
    return Conditions.requireEmpty(argument, IllegalArgumentException::new);
  }

  // long

  public static long[] requireEmpty(final long[] argument, final LongArrayFunction<String> messageSupplier) {
    return requireEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static long[] requireEmpty(final long[] argument, final Supplier<String> messageSupplier) {
    return Conditions.requireEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static long[] requireEmpty(final long[] argument, final String message) {
    return Conditions.requireEmpty(argument, message, IllegalArgumentException::new);
  }

  public static long[] requireEmpty(final long[] argument) {
    return Conditions.requireEmpty(argument, IllegalArgumentException::new);
  }

  // float

  public static float[] requireEmpty(final float[] argument, final FloatArrayFunction<String> messageSupplier) {
    return requireEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static float[] requireEmpty(final float[] argument, final Supplier<String> messageSupplier) {
    return Conditions.requireEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static float[] requireEmpty(final float[] argument, final String message) {
    return Conditions.requireEmpty(argument, message, IllegalArgumentException::new);
  }

  public static float[] requireEmpty(final float[] argument) {
    return Conditions.requireEmpty(argument, IllegalArgumentException::new);
  }

  // double

  public static double[] requireEmpty(final double[] argument, final DoubleArrayFunction<String> messageSupplier) {
    return requireEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static double[] requireEmpty(final double[] argument, final Supplier<String> messageSupplier) {
    return Conditions.requireEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static double[] requireEmpty(final double[] argument, final String message) {
    return Conditions.requireEmpty(argument, message, IllegalArgumentException::new);
  }

  public static double[] requireEmpty(final double[] argument) {
    return Conditions.requireEmpty(argument, IllegalArgumentException::new);
  }

  // Iterable

  public static <T extends Iterable<U>, U> T requireEmpty(final T argument, final Function<T, String> messageSupplier) {
    return requireEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static <T extends Iterable<U>, U> T requireEmpty(final T argument, final Supplier<String> messageSupplier) {
    return Conditions.requireEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Iterable<U>, U> T requireEmpty(final T argument, final String message) {
    return Conditions.requireEmpty(argument, message, IllegalArgumentException::new);
  }

  public static <T extends Iterable<U>, U> T requireEmpty(final T argument) {
    return Conditions.requireEmpty(argument, IllegalArgumentException::new);
  }

  // Collection

  public static <T extends Collection<U>, U> T requireEmpty(final T argument, final Function<T, String> messageSupplier) {
    return requireEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static <T extends Collection<U>, U> T requireEmpty(final T argument, final Supplier<String> messageSupplier) {
    return Conditions.requireEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Collection<U>, U> T requireEmpty(final T argument, final String message) {
    return Conditions.requireEmpty(argument, message, IllegalArgumentException::new);
  }

  public static <T extends Collection<U>, U> T requireEmpty(final T argument) {
    return Conditions.requireEmpty(argument, IllegalArgumentException::new);
  }

  // String

  public static String requireEmpty(final String argument, final Function<String, String> messageSupplier) {
    return requireEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static String requireEmpty(final String argument, final Supplier<String> messageSupplier) {
    return Conditions.requireEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static String requireEmpty(final String argument, final String message) {
    return Conditions.requireEmpty(argument, message, IllegalArgumentException::new);
  }

  public static String requireEmpty(final String argument) {
    return Conditions.requireEmpty(argument, IllegalArgumentException::new);
  }

  // requireNotEmpty
  //--------------------------------------------------

  // boolean

  public static boolean[] requireNotEmpty(final boolean[] argument, final BooleanArrayFunction<String> messageSupplier) {
    return requireNotEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static boolean[] requireNotEmpty(final boolean[] argument, final Supplier<String> messageSupplier) {
    return Conditions.requireNotEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static boolean[] requireNotEmpty(final boolean[] argument, final String message) {
    return Conditions.requireNotEmpty(argument, message, IllegalArgumentException::new);
  }

  public static boolean[] requireNotEmpty(final boolean[] argument) {
    return Conditions.requireNotEmpty(argument, IllegalArgumentException::new);
  }

  // byte

  public static byte[] requireNotEmpty(final byte[] argument, final ByteArrayFunction<String> messageSupplier) {
    return requireNotEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static byte[] requireNotEmpty(final byte[] argument, final Supplier<String> messageSupplier) {
    return Conditions.requireNotEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static byte[] requireNotEmpty(final byte[] argument, final String message) {
    return Conditions.requireNotEmpty(argument, message, IllegalArgumentException::new);
  }

  public static byte[] requireNotEmpty(final byte[] argument) {
    return Conditions.requireNotEmpty(argument, IllegalArgumentException::new);
  }

  // char

  public static char[] requireNotEmpty(final char[] argument, final CharArrayFunction<String> messageSupplier) {
    return requireNotEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static char[] requireNotEmpty(final char[] argument, final Supplier<String> messageSupplier) {
    return Conditions.requireNotEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static char[] requireNotEmpty(final char[] argument, final String message) {
    return Conditions.requireNotEmpty(argument, message, IllegalArgumentException::new);
  }

  public static char[] requireNotEmpty(final char[] argument) {
    return Conditions.requireNotEmpty(argument, IllegalArgumentException::new);
  }

  // short

  public static short[] requireNotEmpty(final short[] argument, final ShortArrayFunction<String> messageSupplier) {
    return requireNotEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static short[] requireNotEmpty(final short[] argument, final Supplier<String> messageSupplier) {
    return Conditions.requireNotEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static short[] requireNotEmpty(final short[] argument, final String message) {
    return Conditions.requireNotEmpty(argument, message, IllegalArgumentException::new);
  }

  public static short[] requireNotEmpty(final short[] argument) {
    return Conditions.requireNotEmpty(argument, IllegalArgumentException::new);
  }

  // int

  public static int[] requireNotEmpty(final int[] argument, final IntArrayFunction<String> messageSupplier) {
    return requireNotEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static int[] requireNotEmpty(final int[] argument, final Supplier<String> messageSupplier) {
    return Conditions.requireNotEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static int[] requireNotEmpty(final int[] argument, final String message) {
    return Conditions.requireNotEmpty(argument, message, IllegalArgumentException::new);
  }

  public static int[] requireNotEmpty(final int[] argument) {
    return Conditions.requireNotEmpty(argument, IllegalArgumentException::new);
  }

  // long

  public static long[] requireNotEmpty(final long[] argument, final LongArrayFunction<String> messageSupplier) {
    return requireNotEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static long[] requireNotEmpty(final long[] argument, final Supplier<String> messageSupplier) {
    return Conditions.requireNotEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static long[] requireNotEmpty(final long[] argument, final String message) {
    return Conditions.requireNotEmpty(argument, message, IllegalArgumentException::new);
  }

  public static long[] requireNotEmpty(final long[] argument) {
    return Conditions.requireNotEmpty(argument, IllegalArgumentException::new);
  }

  // float

  public static float[] requireNotEmpty(final float[] argument, final FloatArrayFunction<String> messageSupplier) {
    return requireNotEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static float[] requireNotEmpty(final float[] argument, final Supplier<String> messageSupplier) {
    return Conditions.requireNotEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static float[] requireNotEmpty(final float[] argument, final String message) {
    return Conditions.requireNotEmpty(argument, message, IllegalArgumentException::new);
  }

  public static float[] requireNotEmpty(final float[] argument) {
    return Conditions.requireNotEmpty(argument, IllegalArgumentException::new);
  }

  // double

  public static double[] requireNotEmpty(final double[] argument, final DoubleArrayFunction<String> messageSupplier) {
    return requireNotEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static double[] requireNotEmpty(final double[] argument, final Supplier<String> messageSupplier) {
    return Conditions.requireNotEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static double[] requireNotEmpty(final double[] argument, final String message) {
    return Conditions.requireNotEmpty(argument, message, IllegalArgumentException::new);
  }

  public static double[] requireNotEmpty(final double[] argument) {
    return Conditions.requireNotEmpty(argument, IllegalArgumentException::new);
  }

  // Iterable

  public static <T extends Iterable<U>, U> T requireNotEmpty(final T argument, final Function<T, String> messageSupplier) {
    return requireNotEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static <T extends Iterable<U>, U> T requireNotEmpty(final T argument, final Supplier<String> messageSupplier) {
    return Conditions.requireNotEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Iterable<U>, U> T requireNotEmpty(final T argument, final String message) {
    return Conditions.requireNotEmpty(argument, message, IllegalArgumentException::new);
  }

  public static <T extends Iterable<U>, U> T requireNotEmpty(final T argument) {
    return Conditions.requireNotEmpty(argument, IllegalArgumentException::new);
  }

  // Collection

  public static <T extends Collection<U>, U> T requireNotEmpty(final T argument, final Function<T, String> messageSupplier) {
    return requireNotEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static <T extends Collection<U>, U> T requireNotEmpty(final T argument, final Supplier<String> messageSupplier) {
    return Conditions.requireNotEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Collection<U>, U> T requireNotEmpty(final T argument, final String message) {
    return Conditions.requireNotEmpty(argument, message, IllegalArgumentException::new);
  }

  public static <T extends Collection<U>, U> T requireNotEmpty(final T argument) {
    return Conditions.requireNotEmpty(argument, IllegalArgumentException::new);
  }

  // String

  public static String requireNotEmpty(final String argument, final Function<String, String> messageSupplier) {
    return requireNotEmpty(argument, () -> messageSupplier.apply(argument));
  }

  public static String requireNotEmpty(final String argument, final Supplier<String> messageSupplier) {
    return Conditions.requireNotEmpty(argument, messageSupplier, IllegalArgumentException::new);
  }

  public static String requireNotEmpty(final String argument, final String message) {
    return Conditions.requireNotEmpty(argument, message, IllegalArgumentException::new);
  }

  public static String requireNotEmpty(final String argument) {
    return Conditions.requireNotEmpty(argument, IllegalArgumentException::new);
  }

  // requireContainsEquals
  //--------------------------------------------------

  // Array

  public static <T> T[] requireContainsEquals(final T[] argument, final T expected, final BiFunction<T[], T, String> messageSupplier) {
    return requireContainsEquals(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static <T> T[] requireContainsEquals(final T[] argument, final T expected, final Supplier<String> messageSupplier) {
    return Conditions.requireContainsEquals(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static <T> T[] requireContainsEquals(final T[] argument, final T expected, final String message) {
    return Conditions.requireContainsEquals(argument, expected, message, IllegalArgumentException::new);
  }

  public static <T> T[] requireContainsEquals(final T[] argument, final T expected) {
    return Conditions.requireContainsEquals(argument, expected, IllegalArgumentException::new);
  }

  // Iterable

  public static <T extends Iterable<U>, U> T requireContainsEquals(final T argument, final U expected, final BiFunction<T, U, String> messageSupplier) {
    return requireContainsEquals(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static <T extends Iterable<U>, U> T requireContainsEquals(final T argument, final U expected, final Supplier<String> messageSupplier) {
    return Conditions.requireContainsEquals(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Iterable<U>, U> T requireContainsEquals(final T argument, final U expected, final String message) {
    return Conditions.requireContainsEquals(argument, expected, message, IllegalArgumentException::new);
  }

  public static <T extends Iterable<U>, U> T requireContainsEquals(final T argument, final U expected) {
    return Conditions.requireContainsEquals(argument, expected, IllegalArgumentException::new);
  }

  // Collection

  public static <T extends Collection<U>, U> T requireContainsEquals(final T argument, final U expected, final BiFunction<T, U, String> messageSupplier) {
    return requireContainsEquals(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static <T extends Collection<U>, U> T requireContainsEquals(final T argument, final U expected, final Supplier<String> messageSupplier) {
    return Conditions.requireContainsEquals(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Collection<U>, U> T requireContainsEquals(final T argument, final U expected, final String message) {
    return Conditions.requireContainsEquals(argument, expected, message, IllegalArgumentException::new);
  }

  public static <T extends Collection<U>, U> T requireContainsEquals(final T argument, final U expected) {
    return Conditions.requireContainsEquals(argument, expected, IllegalArgumentException::new);
  }

  // requireNotContainsEquals
  //--------------------------------------------------

  // Array

  public static <T> T[] requireNotContainsEquals(final T[] argument, final T unexpected, final BiFunction<T[], T, String> messageSupplier) {
    return requireNotContainsEquals(argument, unexpected, () -> messageSupplier.apply(argument, unexpected));
  }

  public static <T> T[] requireNotContainsEquals(final T[] argument, final T unexpected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotContainsEquals(argument, unexpected, messageSupplier, IllegalArgumentException::new);
  }

  public static <T> T[] requireNotContainsEquals(final T[] argument, final T unexpected, final String message) {
    return Conditions.requireNotContainsEquals(argument, unexpected, message, IllegalArgumentException::new);
  }

  public static <T> T[] requireNotContainsEquals(final T[] argument, final T unexpected) {
    return Conditions.requireNotContainsEquals(argument, unexpected, IllegalArgumentException::new);
  }

  // Iterable

  public static <T extends Iterable<U>, U> T requireNotContainsEquals(final T argument, final U unexpected, final BiFunction<T, U, String> messageSupplier) {
    return requireNotContainsEquals(argument, unexpected, () -> messageSupplier.apply(argument, unexpected));
  }

  public static <T extends Iterable<U>, U> T requireNotContainsEquals(final T argument, final U unexpected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotContainsEquals(argument, unexpected, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Iterable<U>, U> T requireNotContainsEquals(final T argument, final U unexpected, final String message) {
    return Conditions.requireNotContainsEquals(argument, unexpected, message, IllegalArgumentException::new);
  }

  public static <T extends Iterable<U>, U> T requireNotContainsEquals(final T argument, final U unexpected) {
    return Conditions.requireNotContainsEquals(argument, unexpected, IllegalArgumentException::new);
  }

  // Collection

  public static <T extends Collection<U>, U> T requireNotContainsEquals(final T argument, final U unexpected,
      final BiFunction<T, U, String> messageSupplier) {
    return requireNotContainsEquals(argument, unexpected, () -> messageSupplier.apply(argument, unexpected));
  }

  public static <T extends Collection<U>, U> T requireNotContainsEquals(final T argument, final U unexpected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotContainsEquals(argument, unexpected, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Collection<U>, U> T requireNotContainsEquals(final T argument, final U unexpected, final String message) {
    return Conditions.requireNotContainsEquals(argument, unexpected, message, IllegalArgumentException::new);
  }

  public static <T extends Collection<U>, U> T requireNotContainsEquals(final T argument, final U unexpected) {
    return Conditions.requireNotContainsEquals(argument, unexpected, IllegalArgumentException::new);
  }

  // requireContainsSame
  //--------------------------------------------------

  // boolean

  public static boolean[] requireContainsSame(final boolean[] argument, final boolean expected,
      final BooleanArrayAndBooleanBiFunction<String> messageSupplier) {
    return requireContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static boolean[] requireContainsSame(final boolean[] argument, final boolean expected, final Supplier<String> messageSupplier) {
    return Conditions.requireContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static boolean[] requireContainsSame(final boolean[] argument, final boolean expected, final String message) {
    return Conditions.requireContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static boolean[] requireContainsSame(final boolean[] argument, final boolean expected) {
    return Conditions.requireContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // byte

  public static byte[] requireContainsSame(final byte[] argument, final byte expected, final ByteArrayAndByteBiFunction<String> messageSupplier) {
    return requireContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static byte[] requireContainsSame(final byte[] argument, final byte expected, final Supplier<String> messageSupplier) {
    return Conditions.requireContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static byte[] requireContainsSame(final byte[] argument, final byte expected, final String message) {
    return Conditions.requireContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static byte[] requireContainsSame(final byte[] argument, final byte expected) {
    return Conditions.requireContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // char

  public static char[] requireContainsSame(final char[] argument, final char expected, final CharArrayAndCharBiFunction<String> messageSupplier) {
    return requireContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static char[] requireContainsSame(final char[] argument, final char expected, final Supplier<String> messageSupplier) {
    return Conditions.requireContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static char[] requireContainsSame(final char[] argument, final char expected, final String message) {
    return Conditions.requireContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static char[] requireContainsSame(final char[] argument, final char expected) {
    return Conditions.requireContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // short

  public static short[] requireContainsSame(final short[] argument, final short expected, final ShortArrayAndShortBiFunction<String> messageSupplier) {
    return requireContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static short[] requireContainsSame(final short[] argument, final short expected, final Supplier<String> messageSupplier) {
    return Conditions.requireContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static short[] requireContainsSame(final short[] argument, final short expected, final String message) {
    return Conditions.requireContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static short[] requireContainsSame(final short[] argument, final short expected) {
    return Conditions.requireContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // int

  public static int[] requireContainsSame(final int[] argument, final int expected, final IntArrayAndIntBiFunction<String> messageSupplier) {
    return requireContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static int[] requireContainsSame(final int[] argument, final int expected, final Supplier<String> messageSupplier) {
    return Conditions.requireContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static int[] requireContainsSame(final int[] argument, final int expected, final String message) {
    return Conditions.requireContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static int[] requireContainsSame(final int[] argument, final int expected) {
    return Conditions.requireContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // long

  public static long[] requireContainsSame(final long[] argument, final long expected, final LongArrayAndLongBiFunction<String> messageSupplier) {
    return requireContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static long[] requireContainsSame(final long[] argument, final long expected, final Supplier<String> messageSupplier) {
    return Conditions.requireContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static long[] requireContainsSame(final long[] argument, final long expected, final String message) {
    return Conditions.requireContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static long[] requireContainsSame(final long[] argument, final long expected) {
    return Conditions.requireContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // float

  public static float[] requireContainsSame(final float[] argument, final float expected, final FloatArrayAndFloatBiFunction<String> messageSupplier) {
    return requireContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static float[] requireContainsSame(final float[] argument, final float expected, final Supplier<String> messageSupplier) {
    return Conditions.requireContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static float[] requireContainsSame(final float[] argument, final float expected, final String message) {
    return Conditions.requireContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static float[] requireContainsSame(final float[] argument, final float expected) {
    return Conditions.requireContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // double

  public static double[] requireContainsSame(final double[] argument, final double expected, final DoubleArrayAndDoubleBiFunction<String> messageSupplier) {
    return requireContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static double[] requireContainsSame(final double[] argument, final double expected, final Supplier<String> messageSupplier) {
    return Conditions.requireContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static double[] requireContainsSame(final double[] argument, final double expected, final String message) {
    return Conditions.requireContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static double[] requireContainsSame(final double[] argument, final double expected) {
    return Conditions.requireContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // Generic

  public static <T> T[] requireContainsSame(final T[] argument, final T expected, final BiFunction<T[], T, String> messageSupplier) {
    return requireContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static <T> T[] requireContainsSame(final T[] argument, final T expected, final Supplier<String> messageSupplier) {
    return Conditions.requireContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static <T> T[] requireContainsSame(final T[] argument, final T expected, final String message) {
    return Conditions.requireContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static <T> T[] requireContainsSame(final T[] argument, final T expected) {
    return Conditions.requireContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // Iterable

  public static <T extends Iterable<U>, U> T requireContainsSame(final T argument, final U expected, final BiFunction<T, U, String> messageSupplier) {
    return requireContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static <T extends Iterable<U>, U> T requireContainsSame(final T argument, final U expected, final Supplier<String> messageSupplier) {
    return Conditions.requireContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Iterable<U>, U> T requireContainsSame(final T argument, final U expected, final String message) {
    return Conditions.requireContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static <T extends Iterable<U>, U> T requireContainsSame(final T argument, final U expected) {
    return Conditions.requireContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // Collection

  public static <T extends Collection<U>, U> T requireContainsSame(final T argument, final U expected, final BiFunction<T, U, String> messageSupplier) {
    return requireContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static <T extends Collection<U>, U> T requireContainsSame(final T argument, final U expected, final Supplier<String> messageSupplier) {
    return Conditions.requireContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Collection<U>, U> T requireContainsSame(final T argument, final U expected, final String message) {
    return Conditions.requireContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static <T extends Collection<U>, U> T requireContainsSame(final T argument, final U expected) {
    return Conditions.requireContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // requireNotContainsSame
  //--------------------------------------------------

  // boolean

  public static boolean[] requireNotContainsSame(final boolean[] argument, final boolean expected,
      final BooleanArrayAndBooleanBiFunction<String> messageSupplier) {
    return requireNotContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static boolean[] requireNotContainsSame(final boolean[] argument, final boolean expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static boolean[] requireNotContainsSame(final boolean[] argument, final boolean expected, final String message) {
    return Conditions.requireNotContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static boolean[] requireNotContainsSame(final boolean[] argument, final boolean expected) {
    return Conditions.requireNotContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // byte

  public static byte[] requireNotContainsSame(final byte[] argument, final byte expected, final ByteArrayAndByteBiFunction<String> messageSupplier) {
    return requireNotContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static byte[] requireNotContainsSame(final byte[] argument, final byte expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static byte[] requireNotContainsSame(final byte[] argument, final byte expected, final String message) {
    return Conditions.requireNotContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static byte[] requireNotContainsSame(final byte[] argument, final byte expected) {
    return Conditions.requireNotContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // char

  public static char[] requireNotContainsSame(final char[] argument, final char expected, final CharArrayAndCharBiFunction<String> messageSupplier) {
    return requireNotContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static char[] requireNotContainsSame(final char[] argument, final char expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static char[] requireNotContainsSame(final char[] argument, final char expected, final String message) {
    return Conditions.requireNotContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static char[] requireNotContainsSame(final char[] argument, final char expected) {
    return Conditions.requireNotContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // short

  public static short[] requireNotContainsSame(final short[] argument, final short expected, final ShortArrayAndShortBiFunction<String> messageSupplier) {
    return requireNotContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static short[] requireNotContainsSame(final short[] argument, final short expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static short[] requireNotContainsSame(final short[] argument, final short expected, final String message) {
    return Conditions.requireNotContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static short[] requireNotContainsSame(final short[] argument, final short expected) {
    return Conditions.requireNotContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // int

  public static int[] requireNotContainsSame(final int[] argument, final int expected, final IntArrayAndIntBiFunction<String> messageSupplier) {
    return requireNotContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static int[] requireNotContainsSame(final int[] argument, final int expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static int[] requireNotContainsSame(final int[] argument, final int expected, final String message) {
    return Conditions.requireNotContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static int[] requireNotContainsSame(final int[] argument, final int expected) {
    return Conditions.requireNotContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // long

  public static long[] requireNotContainsSame(final long[] argument, final long expected, final LongArrayAndLongBiFunction<String> messageSupplier) {
    return requireNotContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static long[] requireNotContainsSame(final long[] argument, final long expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static long[] requireNotContainsSame(final long[] argument, final long expected, final String message) {
    return Conditions.requireNotContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static long[] requireNotContainsSame(final long[] argument, final long expected) {
    return Conditions.requireNotContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // float

  public static float[] requireNotContainsSame(final float[] argument, final float expected, final FloatArrayAndFloatBiFunction<String> messageSupplier) {
    return requireNotContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static float[] requireNotContainsSame(final float[] argument, final float expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static float[] requireNotContainsSame(final float[] argument, final float expected, final String message) {
    return Conditions.requireNotContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static float[] requireNotContainsSame(final float[] argument, final float expected) {
    return Conditions.requireNotContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // double

  public static double[] requireNotContainsSame(final double[] argument, final double expected, final DoubleArrayAndDoubleBiFunction<String> messageSupplier) {
    return requireNotContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static double[] requireNotContainsSame(final double[] argument, final double expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static double[] requireNotContainsSame(final double[] argument, final double expected, final String message) {
    return Conditions.requireNotContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static double[] requireNotContainsSame(final double[] argument, final double expected) {
    return Conditions.requireNotContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // Generic

  public static <T> T[] requireNotContainsSame(final T[] argument, final T expected, final BiFunction<T[], T, String> messageSupplier) {
    return requireNotContainsSame(argument, expected, () -> messageSupplier.apply(argument, expected));
  }

  public static <T> T[] requireNotContainsSame(final T[] argument, final T expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotContainsSame(argument, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static <T> T[] requireNotContainsSame(final T[] argument, final T expected, final String message) {
    return Conditions.requireNotContainsSame(argument, expected, message, IllegalArgumentException::new);
  }

  public static <T> T[] requireNotContainsSame(final T[] argument, final T expected) {
    return Conditions.requireNotContainsSame(argument, expected, IllegalArgumentException::new);
  }

  // Iterable

  public static <T extends Iterable<U>, U> T requireNotContainsSame(final T iterable, final U expected, final BiFunction<T, U, String> messageSupplier) {
    return requireNotContainsSame(iterable, expected, () -> messageSupplier.apply(iterable, expected));
  }

  public static <T extends Iterable<U>, U> T requireNotContainsSame(final T iterable, final U expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotContainsSame(iterable, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Iterable<U>, U> T requireNotContainsSame(final T iterable, final U expected, final String message) {
    return Conditions.requireNotContainsSame(iterable, expected, message, IllegalArgumentException::new);
  }

  public static <T extends Iterable<U>, U> T requireNotContainsSame(final T iterable, final U expected) {
    return Conditions.requireNotContainsSame(iterable, expected, IllegalArgumentException::new);
  }

  // Collection

  public static <T extends Collection<U>, U> T requireNotContainsSame(final T collection, final U expected, final BiFunction<T, U, String> messageSupplier) {
    return requireNotContainsSame(collection, expected, () -> messageSupplier.apply(collection, expected));
  }

  public static <T extends Collection<U>, U> T requireNotContainsSame(final T collection, final U expected, final Supplier<String> messageSupplier) {
    return Conditions.requireNotContainsSame(collection, expected, messageSupplier, IllegalArgumentException::new);
  }

  public static <T extends Collection<U>, U> T requireNotContainsSame(final T collection, final U expected, final String message) {
    return Conditions.requireNotContainsSame(collection, expected, message, IllegalArgumentException::new);
  }

  public static <T extends Collection<U>, U> T requireNotContainsSame(final T collection, final U expected) {
    return Conditions.requireNotContainsSame(collection, expected, IllegalArgumentException::new);
  }

  // TODO: requireSize
  //--------------------------------------------------

  // TODO: requireNotSize
  //--------------------------------------------------

  // Constructors
  //--------------------------------------------------

  private Arguments() {
    super();

    throw new UnsupportedInstantiationException();
  }

  // Helper classes
  //--------------------------------------------------

  @FunctionalInterface
  public interface BooleanArrayAndBooleanBiFunction<R> {

    R apply(boolean[] argument1, boolean argument2);

    // TODO.

  }

  @FunctionalInterface
  public interface ByteArrayAndByteBiFunction<R> {

    R apply(byte[] argument1, byte argument2);

    // TODO.

  }

  @FunctionalInterface
  public interface CharArrayAndCharBiFunction<R> {

    R apply(char[] argument1, char argument2);

    // TODO.

  }

  @FunctionalInterface
  public interface ShortArrayAndShortBiFunction<R> {

    R apply(short[] argument1, short argument2);

    // TODO.

  }

  @FunctionalInterface
  public interface IntArrayAndIntBiFunction<R> {

    R apply(int[] argument1, int argument2);

    // TODO.

  }

  @FunctionalInterface
  public interface LongArrayAndLongBiFunction<R> {

    R apply(long[] argument1, long argument2);

    // TODO.

  }

  @FunctionalInterface
  public interface FloatArrayAndFloatBiFunction<R> {

    R apply(float[] argument1, float argument2);

    // TODO.

  }

  @FunctionalInterface
  public interface DoubleArrayAndDoubleBiFunction<R> {

    R apply(double[] argument1, double argument2);

    // TODO.

  }

}
