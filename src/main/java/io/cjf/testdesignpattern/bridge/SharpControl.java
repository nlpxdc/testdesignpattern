package io.cjf.testdesignpattern.bridge;

public class SharpControl implements TVControl{

    private Sharp sharp;

    public SharpControl(Sharp sharp) {
        this.sharp = sharp;
    }

    @Override
    public void changeBattery() {
        System.out.println("sharp control change battery");
    }

    @Override
    public void on() {
        System.out.println("sharp control on");
        sharp.on();
    }

    @Override
    public void off() {
        System.out.println("sharp control off");
        sharp.off();
    }
}
