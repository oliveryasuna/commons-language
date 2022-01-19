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

package com.oliveryasuna.commons.language.function;

import com.oliveryasuna.commons.language.condition.Arguments;

import java.util.function.BiPredicate;

@FunctionalInterface
public interface IterationPredicate<T> {

  boolean test(T element, int index);

  default IterationPredicate<T> and(final IterationPredicate<? super T> other) {
    Arguments.requireNotNull(other, "other");

    return ((element, index) -> test(element, index) && other.test(element, index));
  }

  default IterationPredicate<T> and(final BiPredicate<? super T, Integer> other) {
    Arguments.requireNotNull(other, "other");

    return ((element, index) -> test(element, index) && other.test(element, index));
  }

  default IterationPredicate<T> or(final IterationPredicate<? super T> other) {
    Arguments.requireNotNull(other, "other");

    return ((element, index) -> test(element, index) || other.test(element, index));
  }

  default IterationPredicate<T> or(final BiPredicate<? super T, Integer> other) {
    Arguments.requireNotNull(other, "other");

    return ((element, index) -> test(element, index) || other.test(element, index));
  }

  default IterationPredicate<T> negate() {
    return ((element, index) -> !test(element, index));
  }

}
