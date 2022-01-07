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

package com.oliveryasuna.commons.language.reflection;

import com.oliveryasuna.commons.language.exception.UtilityClassException;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Various reflection-upon-class utilities.
 *
 * @author Oliver Yasuna
 */
public final class ClassReflectionUtils {

  /**
   * Gets all declared methods of {@code clazz} will all annotations, {@code annotationTypes}.
   *
   * @param clazz           The class.
   * @param annotationTypes The annotations.
   *
   * @return All declared methods of {@code clazz} will all annotations, {@code annotationTypes}.
   */
  @SafeVarargs
  public static List<Method> getAnnotatedMethods(Class<?> clazz, final Class<? extends Annotation>... annotationTypes) {
    Objects.requireNonNull(clazz);

    final List<Method> result = new ArrayList<>();

    while(!clazz.equals(Object.class)) {
      for(final Method method : clazz.getDeclaredMethods()) {
        if(annotationTypes != null) {
          boolean match = true;

          for(final Class<? extends Annotation> annotationType : annotationTypes) {
            if(!method.isAnnotationPresent(annotationType)) {
              match = false;

              break;
            }
          }

          if(match) {
            result.add(method);
          }
        }
      }

      clazz = clazz.getSuperclass();
    }

    return result;
  }

  /**
   * Gets all declared fields of {@code clazz} will all annotations, {@code annotationTypes}.
   *
   * @param clazz           The class.
   * @param annotationTypes The annotations.
   *
   * @return All declared fields of {@code clazz} will all annotations, {@code annotationTypes}.
   */
  @SafeVarargs
  public static List<Field> getAnnotatedFields(Class<?> clazz, final Class<? extends Annotation>... annotationTypes) {
    Objects.requireNonNull(clazz);

    final List<Field> result = new ArrayList<>();

    while(!clazz.equals(Object.class)) {
      for(final Field field : clazz.getDeclaredFields()) {
        if(annotationTypes != null) {
          boolean match = true;

          for(final Class<? extends Annotation> annotationType : annotationTypes) {
            if(!field.isAnnotationPresent(annotationType)) {
              match = false;

              break;
            }
          }

          if(match) {
            result.add(field);
          }
        }
      }

      clazz = clazz.getSuperclass();
    }

    return result;
  }

  private ClassReflectionUtils() {
    throw new UtilityClassException();
  }

}
