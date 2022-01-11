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

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/**
 * Various {@code static} utility methods for operating on method arguments.
 *
 * @author Oliver Yasuna
 */
public final class Arguments {

  // Exception suppliers
  //--------------------------------------------------

  private static final Function<String, ? extends RuntimeException> EXCEPTION_SUPPLIER = IllegalArgumentException::new;

  // TODO: requireAll
  //--------------------------------------------------

  // TODO: requireArrayContainsEquals
  //--------------------------------------------------

  // TODO: requireArrayContainsSame
  //--------------------------------------------------

  // TODO: requireArrayEquals
  //--------------------------------------------------

  // TODO: requireArrayNotContainsEquals
  //--------------------------------------------------

  // TODO: requireArrayNotEquals
  //--------------------------------------------------

  // TODO: requireArraySame
  //--------------------------------------------------

  // requireArrayNotContainsSame
  //--------------------------------------------------

  // boolean

  public static boolean[] requireArrayNotContainsSame(final boolean[] argument, final boolean search, final IntFunction<String> messageSupplier) {
    return Conditions.requireArrayNotContainsSame(argument, search, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static boolean[] requireArrayNotContainsSame(final boolean[] argument, final boolean search, final String message) {
    return Conditions.requireArrayNotContainsSame(argument, search, message, EXCEPTION_SUPPLIER);
  }

  public static boolean[] requireArrayNotContainsSame(final boolean[] argument, final boolean search) {
    return Conditions.requireArrayNotContainsSame(argument, search, EXCEPTION_SUPPLIER);
  }

  // byte

  public static byte[] requireArrayNotContainsSame(final byte[] argument, final byte search, final IntFunction<String> messageSupplier) {
    return Conditions.requireArrayNotContainsSame(argument, search, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static byte[] requireArrayNotContainsSame(final byte[] argument, final byte search, final String message) {
    return Conditions.requireArrayNotContainsSame(argument, search, message, EXCEPTION_SUPPLIER);
  }

  public static byte[] requireArrayNotContainsSame(final byte[] argument, final byte search) {
    return Conditions.requireArrayNotContainsSame(argument, search, EXCEPTION_SUPPLIER);
  }

  // char

  public static char[] requireArrayNotContainsSame(final char[] argument, final char search, final IntFunction<String> messageSupplier) {
    return Conditions.requireArrayNotContainsSame(argument, search, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static char[] requireArrayNotContainsSame(final char[] argument, final char search, final String message) {
    return Conditions.requireArrayNotContainsSame(argument, search, message, EXCEPTION_SUPPLIER);
  }

  public static char[] requireArrayNotContainsSame(final char[] argument, final char search) {
    return Conditions.requireArrayNotContainsSame(argument, search, EXCEPTION_SUPPLIER);
  }

  // short

  public static short[] requireArrayNotContainsSame(final short[] argument, final short search, final IntFunction<String> messageSupplier) {
    return Conditions.requireArrayNotContainsSame(argument, search, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static short[] requireArrayNotContainsSame(final short[] argument, final short search, final String message) {
    return Conditions.requireArrayNotContainsSame(argument, search, message, EXCEPTION_SUPPLIER);
  }

  public static short[] requireArrayNotContainsSame(final short[] argument, final short search) {
    return Conditions.requireArrayNotContainsSame(argument, search, EXCEPTION_SUPPLIER);
  }

  // int

  public static int[] requireArrayNotContainsSame(final int[] argument, final int search, final IntFunction<String> messageSupplier) {
    return Conditions.requireArrayNotContainsSame(argument, search, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static int[] requireArrayNotContainsSame(final int[] argument, final int search, final String message) {
    return Conditions.requireArrayNotContainsSame(argument, search, message, EXCEPTION_SUPPLIER);
  }

  public static int[] requireArrayNotContainsSame(final int[] argument, final int search) {
    return Conditions.requireArrayNotContainsSame(argument, search, EXCEPTION_SUPPLIER);
  }

  // long

  public static long[] requireArrayNotContainsSame(final long[] argument, final long search, final IntFunction<String> messageSupplier) {
    return Conditions.requireArrayNotContainsSame(argument, search, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static long[] requireArrayNotContainsSame(final long[] argument, final long search, final String message) {
    return Conditions.requireArrayNotContainsSame(argument, search, message, EXCEPTION_SUPPLIER);
  }

  public static long[] requireArrayNotContainsSame(final long[] argument, final long search) {
    return Conditions.requireArrayNotContainsSame(argument, search, EXCEPTION_SUPPLIER);
  }

  // float

  public static float[] requireArrayNotContainsSame(final float[] argument, final float search, final IntFunction<String> messageSupplier) {
    return Conditions.requireArrayNotContainsSame(argument, search, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static float[] requireArrayNotContainsSame(final float[] argument, final float search, final String message) {
    return Conditions.requireArrayNotContainsSame(argument, search, message, EXCEPTION_SUPPLIER);
  }

  public static float[] requireArrayNotContainsSame(final float[] argument, final float search) {
    return Conditions.requireArrayNotContainsSame(argument, search, EXCEPTION_SUPPLIER);
  }

  // double

  public static double[] requireArrayNotContainsSame(final double[] argument, final double search, final IntFunction<String> messageSupplier) {
    return Conditions.requireArrayNotContainsSame(argument, search, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static double[] requireArrayNotContainsSame(final double[] argument, final double search, final String message) {
    return Conditions.requireArrayNotContainsSame(argument, search, message, EXCEPTION_SUPPLIER);
  }

  public static double[] requireArrayNotContainsSame(final double[] argument, final double search) {
    return Conditions.requireArrayNotContainsSame(argument, search, EXCEPTION_SUPPLIER);
  }

  // Generic

  public static <T> T[] requireArrayNotContainsSame(final T[] argument, final T search, final IntFunction<String> messageSupplier) {
    return Conditions.requireArrayNotContainsSame(argument, search, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static <T> T[] requireArrayNotContainsSame(final T[] argument, final T search, final String message) {
    return Conditions.requireArrayNotContainsSame(argument, search, message, EXCEPTION_SUPPLIER);
  }

  public static <T> T[] requireArrayNotContainsSame(final T[] argument, final T search) {
    return Conditions.requireArrayNotContainsSame(argument, search, EXCEPTION_SUPPLIER);
  }

  // TODO: requireArrayNotSame
  //--------------------------------------------------

  // TODO: requireEquals
  //--------------------------------------------------

  // TODO: requireFalse
  //--------------------------------------------------

  // TODO: requireIterableEquals
  //--------------------------------------------------

  // TODO: requireLinesMatch
  //--------------------------------------------------

  // TODO: requireNotEquals
  //--------------------------------------------------

  // requireNotNull
  //--------------------------------------------------

  public static <T> T requireNotNull(final T argument, final Supplier<String> messageSupplier) {
    return Conditions.requireNotNull(argument, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static <T> T requireNotNull(final T argument, final String message) {
    return Conditions.requireNotNull(argument, message, EXCEPTION_SUPPLIER);
  }

  public static <T> T requireNotNull(final T argument) {
    return Conditions.requireNotNull(argument, EXCEPTION_SUPPLIER);
  }

  // TODO: requireNotSame
  //--------------------------------------------------

  // requireSame
  //--------------------------------------------------

  // boolean

  public static boolean requireSame(final boolean argument, final boolean expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static boolean requireSame(final boolean argument, final boolean expected, final String message) {
    return Conditions.requireSame(argument, expected, message, EXCEPTION_SUPPLIER);
  }

  public static boolean requireSame(final boolean argument, final boolean expected) {
    return Conditions.requireSame(argument, expected, EXCEPTION_SUPPLIER);
  }

  // byte

  public static byte requireSame(final byte argument, final byte expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static byte requireSame(final byte argument, final byte expected, final String message) {
    return Conditions.requireSame(argument, expected, message, EXCEPTION_SUPPLIER);
  }

  public static byte requireSame(final byte argument, final byte expected) {
    return Conditions.requireSame(argument, expected, EXCEPTION_SUPPLIER);
  }

  // char

  public static char requireSame(final char argument, final char expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static char requireSame(final char argument, final char expected, final String message) {
    return Conditions.requireSame(argument, expected, message, EXCEPTION_SUPPLIER);
  }

  public static char requireSame(final char argument, final char expected) {
    return Conditions.requireSame(argument, expected, EXCEPTION_SUPPLIER);
  }

  // short

  public static short requireSame(final short argument, final short expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static short requireSame(final short argument, final short expected, final String message) {
    return Conditions.requireSame(argument, expected, message, EXCEPTION_SUPPLIER);
  }

  public static short requireSame(final short argument, final short expected) {
    return Conditions.requireSame(argument, expected, EXCEPTION_SUPPLIER);
  }

  // int

  public static int requireSame(final int argument, final int expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static int requireSame(final int argument, final int expected, final String message) {
    return Conditions.requireSame(argument, expected, message, EXCEPTION_SUPPLIER);
  }

  public static int requireSame(final int argument, final int expected) {
    return Conditions.requireSame(argument, expected, EXCEPTION_SUPPLIER);
  }

  // long

  public static long requireSame(final long argument, final long expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static long requireSame(final long argument, final long expected, final String message) {
    return Conditions.requireSame(argument, expected, message, EXCEPTION_SUPPLIER);
  }

  public static long requireSame(final long argument, final long expected) {
    return Conditions.requireSame(argument, expected, EXCEPTION_SUPPLIER);
  }

  // float

  public static float requireSame(final float argument, final float expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static float requireSame(final float argument, final float expected, final String message) {
    return Conditions.requireSame(argument, expected, message, EXCEPTION_SUPPLIER);
  }

  public static float requireSame(final float argument, final float expected) {
    return Conditions.requireSame(argument, expected, EXCEPTION_SUPPLIER);
  }

  // double

  public static double requireSame(final double argument, final double expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static double requireSame(final double argument, final double expected, final String message) {
    return Conditions.requireSame(argument, expected, message, EXCEPTION_SUPPLIER);
  }

  public static double requireSame(final double argument, final double expected) {
    return Conditions.requireSame(argument, expected, EXCEPTION_SUPPLIER);
  }

  // Generic

  public static <T> T requireSame(final T argument, final Object expected, final Supplier<String> messageSupplier) {
    return Conditions.requireSame(argument, expected, messageSupplier, EXCEPTION_SUPPLIER);
  }

  public static <T> T requireSame(final T argument, final Object expected, final String message) {
    return Conditions.requireSame(argument, expected, message, EXCEPTION_SUPPLIER);
  }

  public static <T> T requireSame(final T argument, final Object expected) {
    return Conditions.requireSame(argument, expected, EXCEPTION_SUPPLIER);
  }

  // TODO: requireThrows
  //--------------------------------------------------

  // TODO: requireTimeout
  //--------------------------------------------------

  // TODO: requireTimeoutPreemptively
  //--------------------------------------------------

  // TODO: requireTrue
  //--------------------------------------------------

  // Constructors
  //--------------------------------------------------

  /**
   * Default {@code private} constructor that throws a {@link UnsupportedInstantiationException} in case of reflection.
   */
  private Arguments() {
    super();

    throw new UnsupportedInstantiationException();
  }

}
