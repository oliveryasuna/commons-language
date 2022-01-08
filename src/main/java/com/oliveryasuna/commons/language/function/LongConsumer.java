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

package com.oliveryasuna.commons.language.function;

import com.oliveryasuna.commons.language.Arguments;

/**
 * Represents an operation that accepts a single {@code long} argument and returns no result.
 *
 * @author Oliver Yasuna
 */
@FunctionalInterface
public interface LongConsumer extends java.util.function.LongConsumer {

  /**
   * Performs the operation.
   */
  @Override
  void accept(long argument);

  /**
   * Creates a composed {@link LongConsumer} that performs this operation followed by the operation specified by the argument {@code after}.
   *
   * @param after The operation to perform after this operation.
   *
   * @return A composed {@link LongConsumer} that performs this operation followed by the operation specified by the argument {@code after}.
   *
   * @throws IllegalArgumentException If the argument {@code after} is {@code null}.
   */
  @Override
  default LongConsumer andThen(final java.util.function.LongConsumer after) {
    Arguments.requireNonNull(after, "after");

    return (argument -> {
      accept(argument);
      after.accept(argument);
    });
  }

}
