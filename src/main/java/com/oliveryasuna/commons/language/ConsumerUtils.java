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

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public final class ConsumerUtils {

  // Static methods
  //--------------------------------------------------

  public static <T> Consumer<T> andThen(final Consumer<T> consumer, final Consumer<T>... others) {
    Arguments.requireNotNull(consumer, "consumer");
    Arguments.requireNotContainsSame(others, null, "others");

    if(others == null) return consumer;

    return (t -> {
      consumer.accept(t);

      ArrayUtils.forEach(others, other -> other.accept(t));
    });
  }

  public static <T, U> BiConsumer<T, U> andThen(final BiConsumer<T, U> biConsumer, final BiConsumer<? super T, ? super U>... others) {
    Arguments.requireNotNull(biConsumer, "biConsumer");
    Arguments.requireNotContainsSame(others, null, "others");

    if(others == null) return biConsumer;

    return ((t, u) -> {
      biConsumer.accept(t, u);

      ArrayUtils.forEach(others, other -> other.accept(t, u));
    });
  }

  public static <T, U> BiConsumer<T, U> andThenT(final BiConsumer<T, U> biConsumer, final Consumer<? super T>... consumers) {
    Arguments.requireNotNull(biConsumer, "biConsumer");
    Arguments.requireNotContainsSame(consumers, null, "consumers");

    if(consumers == null) return biConsumer;

    return ((t, u) -> {
      biConsumer.accept(t, u);

      ArrayUtils.forEach(consumers, consumer -> consumer.accept(t));
    });
  }


  public static <T, U> BiConsumer<T, U> andThenU(final BiConsumer<T, U> biConsumer, final Consumer<? super U>... consumers) {
    Arguments.requireNotNull(biConsumer, "biConsumer");
    Arguments.requireNotContainsSame(consumers, null, "consumers");

    if(consumers == null) return biConsumer;

    return ((t, u) -> {
      biConsumer.accept(t, u);

      ArrayUtils.forEach(consumers, consumer -> consumer.accept(u));
    });
  }

  // Constructors
  //--------------------------------------------------

  /**
   * Default {@code private} constructor that throws a {@link UnsupportedInstantiationException} in case of reflection.
   */
  private ConsumerUtils() {
    super();

    throw new UnsupportedInstantiationException();
  }

}
