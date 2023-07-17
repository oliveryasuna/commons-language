package com.oliveryasuna.commons.language.pattern.decorator;

import java.util.ListIterator;

public class ListIteratorDecoratorBase<T, ITR extends ListIterator<T>> extends IteratorDecoratorBase<T, ITR> implements ListIterator<T> {

  // Constructors
  //--------------------------------------------------

  public ListIteratorDecoratorBase(final ITR iterator) {
    super(iterator);
  }

  // Methods
  //--------------------------------------------------

  // ListIterator methods
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
  public boolean hasPrevious() {
    return getIterator().hasPrevious();
  }

  @Override
  public T previous() {
    return getIterator().previous();
  }

  @Override
  public int nextIndex() {
    return getIterator().nextIndex();
  }

  @Override
  public int previousIndex() {
    return getIterator().previousIndex();
  }

  @Override
  public void remove() {
    getIterator().remove();
  }

  @Override
  public void set(final T t) {
    getIterator().set(t);
  }

  @Override
  public void add(final T t) {
    getIterator().add(t);
  }

}
