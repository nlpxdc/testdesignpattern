package io.cjf.testdesignpattern.iterator;

public class ConcreteIterator<Item> implements Iterator {

    private Item[] items;
    private int position = 0;

    public ConcreteIterator(Item[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        Item item = items[position];
        position++;
        return item;
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }
}
