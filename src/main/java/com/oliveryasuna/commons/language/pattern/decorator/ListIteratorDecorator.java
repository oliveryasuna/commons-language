package com.oliveryasuna.commons.language.pattern.decorator;

import java.util.ListIterator;

public class ListIteratorDecorator<T> extends ListIteratorDecoratorBase<T, ListIterator<T>> {

  // Constructors
  //--------------------------------------------------

  public ListIteratorDecorator(final ListIterator<T> iterator) {
    super(iterator);
  }

}
