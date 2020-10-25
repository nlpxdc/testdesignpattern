package io.cjf.testdesignpattern.bridge;

public class SonyControl implements TVControl{

    private Sony sony;

    public SonyControl(Sony sony)  {
        this.sony = sony;
    }

    @Override
    public void changeBattery() {
        System.out.println("sony control change battery");
    }

    @Override
    public void on() {
        System.out.println("sony control on");
        sony.on();
    }

    @Override
    public void off() {
        System.out.println("sony control off");
        sony.off();
    }
}
