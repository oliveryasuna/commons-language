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

import com.oliveryasuna.commons.language.function.CharConsumer;
import com.oliveryasuna.commons.language.pattern.fluent.IFluentFactory;

public class CharArrayValueBreak<T, F extends IFluentFactory<T, F>> extends ValueBreak<T, F, char[]> {

  // Constructors
  //--------------------------------------------------

  public CharArrayValueBreak(final F factory, final char[] value) {
    super(factory, value);
  }

  // Methods
  //--------------------------------------------------

  public CharArrayValueBreak<T, F> handle(final int index, final CharConsumer action) {
    if(action != null) {
      action.accept(getValue()[index]);
    }

    return this;
  }

  public F handleOnce(final int index, final CharConsumer action) {
    return handle(index, action).back();
  }

  public char get(final int index) {
    return getValue()[index];
  }

  public CharArrayValueBreak<T, F> set(final int index, final char value) {
    getValue()[index] = value;

    return this;
  }

  public F setOnce(final int index, final char value) {
    return set(index, value).back();
  }

}
