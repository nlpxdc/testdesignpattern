package io.cjf.testdesignpattern.bridge;

public class BridgeApp {
    public static void main(String[] args) {
        System.out.println("aaa");

        Sony sony = new Sony();
        Sharp sharp = new Sharp();
        SonyControl sonyControl = new SonyControl(sony);
        SharpControl sharpControl = new SharpControl(sharp);

        sonyControl.on();
        sonyControl.off();
        sonyControl.changeBattery();
        sharpControl.on();
        sharpControl.off();
        sharpControl.changeBattery();


    }
}
