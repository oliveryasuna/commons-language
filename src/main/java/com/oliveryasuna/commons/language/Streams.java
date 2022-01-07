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

import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Stream;

/**
 * Various {@code static} utility methods for operating on streams.
 *
 * @author Oliver Yasuna
 */
public final class Streams {

  /**
   * TODO: Documentation.
   */
  public static <T> Stream<T> reverse(final Stream<T> stream) {
    final Deque<T> stack = new LinkedList<>();

    stream.forEach(stack::push);

    return stack.stream();
  }

  /**
   * Various {@code static} utility methods for operating on streams that relate to collectors.
   *
   * @author Oliver Yasuna
   */
  public static final class Collectors {

    /**
     * TODO: Documentation.
     */
    public static <T> Collector<T, ?, Stream<T>> reverse() {
      return java.util.stream.Collectors.collectingAndThen(java.util.stream.Collectors.toList(), list -> {
        Collections.reverse(list);

        return list.stream();
      });
    }

    /**
     * Default {@code private} constructor that throws a {@link UnsupportedInstantiationException} in case of reflection.
     */
    private Collectors() {
      super();

      throw new UnsupportedInstantiationException();
    }

  }

  /**
   * Various {@code static} utility methods for operating on streams that relate to iterators.
   *
   * @author Oliver Yasuna
   */
  public static final class Iterators {

    /**
     * TODO: Documentation.
     */
    public static <T> Iterator<T> reverseIterator(final Stream<T> stream) {
      return stream.collect(java.util.stream.Collectors.toCollection(LinkedList::new)).descendingIterator();
    }

    /**
     * Default {@code private} constructor that throws a {@link UnsupportedInstantiationException} in case of reflection.
     */
    private Iterators() {
      super();

      throw new UnsupportedInstantiationException();
    }

  }

  /**
   * Default {@code private} constructor that throws a {@link UnsupportedInstantiationException} in case of reflection.
   */
  private Streams() {
    super();

    throw new UnsupportedInstantiationException();
  }

}
