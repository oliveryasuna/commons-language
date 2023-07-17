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

package com.oliveryasuna.commons.language.pattern.fluent;

import com.oliveryasuna.commons.language.pattern.CastThis;

import java.util.function.Consumer;

@FunctionalInterface
public interface IFluentFactory<T, F extends IFluentFactory<T, F>> extends CastThis<F> {

  // Methods
  //--------------------------------------------------

  T get();

  default F condition(final boolean value, final Consumer<F> trueAction) {
    final F this_ = uncheckedThis();

    if(value && trueAction != null) trueAction.accept(this_);

    return this_;
  }

  default F condition(final boolean value, final Consumer<F> trueAction, final Consumer<F> falseAction) {
    final F this_ = uncheckedThis();

    if(value) {
      if(trueAction != null) trueAction.accept(this_);
    } else {
      if(falseAction != null) falseAction.accept(this_);
    }

    return this_;
  }

  default F complete(final Consumer<F> action) {
    final F this_ = uncheckedThis();

    if(action != null) action.accept(this_);

    return this_;
  }

  default F completeGet(final Consumer<T> action) {
    final F this_ = uncheckedThis();

    if(action != null) action.accept(get());

    return this_;
  }

}
