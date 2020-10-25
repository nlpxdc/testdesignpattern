package io.cjf.testdesignpattern.bridge;

public class Sony implements TV{
    @Override
    public void on() {
        System.out.println("sony on");
    }

    @Override
    public void off() {
        System.out.println("sony off");
    }
}
