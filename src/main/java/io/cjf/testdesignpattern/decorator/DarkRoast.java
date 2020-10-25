package io.cjf.testdesignpattern.decorator;

public class DarkRoast implements Beverage {
    @Override
    public double cost() {
        return 1;
    }
}
