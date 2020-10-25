package io.cjf.testdesignpattern.bridge;

public class Sharp implements TV{
    @Override
    public void on() {
        System.out.println("sharp on");
    }

    @Override
    public void off() {
        System.out.println("sharp off");
    }
}
