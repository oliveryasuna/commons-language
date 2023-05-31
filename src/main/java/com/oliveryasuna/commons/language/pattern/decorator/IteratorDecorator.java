package com.oliveryasuna.commons.language.pattern.decorator;

import java.util.Iterator;

public class IteratorDecorator<T> extends IteratorDecoratorBase<T, Iterator<T>> {

  // Constructors
  //--------------------------------------------------

  public IteratorDecorator(final Iterator<T> iterator) {
    super(iterator);
  }

}
