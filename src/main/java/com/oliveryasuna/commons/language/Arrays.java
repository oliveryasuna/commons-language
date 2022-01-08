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

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Various {@code static} utility methods for operating on arrays.
 *
 * @author Oliver Yasuna
 */
public final class Arrays {

  public static <T> T[] map(final T[] array, final Function<? super T, ? extends T> mapper) {
    Arguments.requireNonNull(array, "array");

    for(int i = 0; i < array.length; i++) {
      array[i] = mapper.apply(array[i]);
    }

    return array;
  }

  @SuppressWarnings("unchecked")
  public static <T, R> R[] mapTo(final T[] array, final Function<? super T, ? extends R> mapper) {
    Arguments.requireNonNull(array, "array");
    Arguments.requireNonNull(mapper, "mapper");

    final Object[] result = new Object[array.length];

    for(int i = 0; i < array.length; i++) {
      result[i] = mapper.apply(array[i]);
    }

    return (R[])result;
  }

  public static <T> Optional<T> max(final T[] array, final Comparator<? super T> comparator) {
    Arguments.requireNonNull(array, "array");

    if(array.length == 0) return Optional.empty();
    if(array.length == 1) return Optional.of(array[0]);

    Arguments.requireNonNull(comparator, "comparator");

    T max = array[0];

    for(int i = 1; i < array.length; i++) {
      max = comparator.compare(array[i], max) > 0 ? array[i] : max;
    }

    return Optional.of(max);
  }

  public static <T extends Comparable<T>> Optional<T> max(final T[] array) {
    return max(array, T::compareTo);
  }

  public static <T> Optional<T> min(final T[] array, final Comparator<? super T> comparator) {
    Arguments.requireNonNull(array, "array");

    if(array.length == 0) return Optional.empty();
    if(array.length == 1) return Optional.of(array[0]);

    Arguments.requireNonNull(comparator, "comparator");

    T min = array[0];

    for(int i = 1; i < array.length; i++) {
      min = comparator.compare(array[i], min) < 0 ? array[i] : min;
    }

    return Optional.of(min);
  }

  public static <T extends Comparable<T>> Optional<T> min(final T[] array) {
    return min(array, T::compareTo);
  }

  public static <T> boolean allMatch(final T[] array, final Predicate<? super T> predicate) {
    Arguments.requireNonNull(array, "array");
    Arguments.requireNonNull(predicate, "predicate");

    for(final T element : array) {
      if(!predicate.test(element)) {
        return false;
      }
    }

    return true;
  }

  public static <T> boolean anyMatch(final T[] array, final Predicate<? super T> predicate) {
    Arguments.requireNonNull(array, "array");
    Arguments.requireNonNull(predicate, "predicate");

    for(final T element : array) {
      if(predicate.test(element)) {
        return true;
      }
    }

    return false;
  }

  public static <T> boolean noneMatch(final T[] array, final Predicate<? super T> predicate) {
    Arguments.requireNonNull(array, "array");
    Arguments.requireNonNull(predicate, "predicate");

    for(final T element : array) {
      if(predicate.test(element)) {
        return false;
      }
    }

    return true;
  }

  public static <T> void forEach(final T[] array, final Consumer<T> consumer) {
    Arguments.requireNonNull(array, "array");
    Arguments.requireNonNull(consumer, "consumer");

    for(final T element : array) {
      consumer.accept(element);
    }
  }

  /**
   * Gets whether an array is empty.
   *
   * @param array The array.
   *
   * @return {@code true}, if the array is empty; otherwise, {@code false}.
   */
  public static boolean isEmpty(final Object[] array) {
    return (Arguments.requireNonNull(array, "array").length == 0);
  }

  /**
   * Gets whether an array is not empty.
   *
   * @param array The array.
   *
   * @return {@code true}, if the array is not empty; otherwise, {@code false}.
   */
  public static boolean isNotEmpty(final Object[] array) {
    return !isEmpty(array);
  }

  /**
   * Default {@code private} constructor that throws a {@link UnsupportedInstantiationException} in case of reflection.
   */
  private Arrays() {
    super();

    throw new UnsupportedInstantiationException();
  }

}
