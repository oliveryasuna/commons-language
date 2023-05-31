package com.oliveryasuna.commons.language.pattern.decorator;

import java.util.Iterator;
import java.util.function.Consumer;

public abstract class IteratorDecoratorBase<T, ITR extends Iterator<T>> implements Iterator<T> {

  // Constructors
  //--------------------------------------------------

  public IteratorDecoratorBase(final ITR iterator) {
    super();

    this.iterator = iterator;
  }

  // Fields
  //--------------------------------------------------

  private final ITR iterator;

  // Methods
  //--------------------------------------------------

  // Iterator methods
  //

  @Override
  public boolean hasNext() {
    return getIterator().hasNext();
  }

  @Override
  public T next() {
    return getIterator().next();
  }

  @Override
  public void remove() {
    getIterator().remove();
  }

  @Override
  public void forEachRemaining(final Consumer<? super T> action) {
    getIterator().forEachRemaining(action);
  }

  // Getters/setters
  //--------------------------------------------------

  protected ITR getIterator() {
    return iterator;
  }

}
