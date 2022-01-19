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

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Various {@code static} utility methods for operating on {@link Predicate} and similar.
 *
 * @author Oliver Yasuna
 */
public final class PredicateUtils {

  public static <T> Predicate<T> and(final Predicate<T> predicate, final Predicate<? super T>... others) {
    Arguments.requireNotNull(predicate, "predicate");
    Arguments.requireNotContainsSame(others, null, "others");

    if(others == null) return predicate;

    return (t -> {
      if(!predicate.test(t)) return false;

      for(final Predicate<? super T> other : others) {
        if(!other.test(t)) {
          return false;
        }
      }

      return true;
    });
  }

  public static <T> Predicate<T> or(final Predicate<T> predicate, final Predicate<? super T>... others) {
    Arguments.requireNotNull(predicate, "predicate");
    Arguments.requireNotContainsSame(others, null, "others");

    if(others == null) return predicate;

    return (t -> {
      if(predicate.test(t)) return true;

      for(final Predicate<? super T> other : others) {
        if(other.test(t)) {
          return true;
        }
      }

      return false;
    });
  }

  public static <T, U> BiPredicate<T, U> and(final BiPredicate<T, U> biPredicate, final BiPredicate<? super T, ? super U>... others) {
    Arguments.requireNotNull(biPredicate, "biPredicate");
    Arguments.requireNotContainsSame(others, null, "others");

    if(others == null) return biPredicate;

    return ((t, u) -> {
      if(!biPredicate.test(t, u)) return false;

      for(final BiPredicate<? super T, ? super U> other : others) {
        if(!other.test(t, u)) {
          return false;
        }
      }

      return true;
    });
  }

  public static <T, U> BiPredicate<T, U> andT(final BiPredicate<T, U> biPredicate, final Predicate<? super T>... predicates) {
    Arguments.requireNotNull(biPredicate, "biPredicate");
    Arguments.requireNotContainsSame(predicates, null, "predicates");

    if(predicates == null) return biPredicate;

    return ((t, u) -> {
      if(!biPredicate.test(t, u)) return false;

      for(int i = 0; i < predicates.length; i++) {
        if(!predicates[i].test(t)) {
          return false;
        }
      }

      return true;
    });
  }

  public static <T, U> BiPredicate<T, U> andU(final BiPredicate<T, U> biPredicate, final Predicate<? super U>... predicates) {
    Arguments.requireNotNull(biPredicate, "biPredicate");
    Arguments.requireNotContainsSame(predicates, null, "predicates");

    if(predicates == null) return biPredicate;

    return ((t, u) -> {
      if(!biPredicate.test(t, u)) return false;

      for(int i = 0; i < predicates.length; i++) {
        if(!predicates[i].test(u)) {
          return false;
        }
      }

      return true;
    });
  }

  public static <T, U> BiPredicate<T, U> or(final BiPredicate<T, U> biPredicate, final BiPredicate<? super T, ? super U>... others) {
    Arguments.requireNotNull(biPredicate, "biPredicate");
    Arguments.requireNotContainsSame(others, null, "others");

    if(others == null) return biPredicate;

    return ((t, u) -> {
      if(biPredicate.test(t, u)) return true;

      for(int i = 0; i < others.length; i++) {
        if(others[i].test(t, u)) {
          return true;
        }
      }

      return false;
    });
  }

  public static <T, U> BiPredicate<T, U> orT(final BiPredicate<T, U> biPredicate, final Predicate<? super T>... predicates) {
    Arguments.requireNotNull(biPredicate, "biPredicate");
    Arguments.requireNotContainsSame(predicates, null, "predicates");

    if(predicates == null) return biPredicate;

    return ((t, u) -> {
      if(biPredicate.test(t, u)) return true;

      for(int i = 0; i < predicates.length; i++) {
        if(predicates[i].test(t)) {
          return true;
        }
      }

      return false;
    });
  }

  public static <T, U> BiPredicate<T, U> orU(final BiPredicate<T, U> biPredicate, final Predicate<? super U>... predicates) {
    Arguments.requireNotNull(biPredicate, "biPredicate");
    Arguments.requireNotContainsSame(predicates, null, "predicates");

    if(predicates == null) return biPredicate;

    return ((t, u) -> {
      if(biPredicate.test(t, u)) return true;

      for(int i = 0; i < predicates.length; i++) {
        if(predicates[i].test(u)) {
          return true;
        }
      }

      return false;
    });
  }

  /**
   * Default {@code private} constructor that throws a {@link UnsupportedInstantiationException} in case of reflection.
   */
  private PredicateUtils() {
    super();

    throw new UnsupportedInstantiationException();
  }

}
