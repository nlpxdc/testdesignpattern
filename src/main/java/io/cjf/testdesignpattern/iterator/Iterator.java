package io.cjf.testdesignpattern.iterator;

public interface Iterator<Item> {

    Item next();

    boolean hasNext();
}

