/*
 * Copyright 2023 Oliver Yasuna
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

package com.oliveryasuna.commons.language.pattern.fluent.breakdown;

import com.oliveryasuna.commons.language.function.IntConsumer;
import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;

public class IntArrayValueBreak<T, F extends IFluentFactory<T, F>> extends ValueBreak<T, F, int[]> {

  // Constructors
  //--------------------------------------------------

  public IntArrayValueBreak(final F factory, final int[] value) {
    super(factory, value);
  }

  // Methods
  //--------------------------------------------------

  public IntArrayValueBreak<T, F> handle(final int index, final IntConsumer action) {
    if(action != null) {
      action.accept(getValue()[index]);
    }

    return this;
  }

  public F handleOnce(final int index, final IntConsumer action) {
    return handle(index, action).back();
  }

  public int get(final int index) {
    return getValue()[index];
  }

  public IntArrayValueBreak<T, F> set(final int index, final int value) {
    getValue()[index] = value;

    return this;
  }

  public F setOnce(final int index, final int value) {
    return set(index, value).back();
  }

}
