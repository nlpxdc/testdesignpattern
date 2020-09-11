package io.cjf.testdesignpattern.prototype;

public class DemoPhone implements Cloneable{
    private int cpu;
    private boolean wifi;
    private String os;
    private Battery battery;

    public DemoPhone clone() {
        DemoPhone demoPhone = new DemoPhone();
        demoPhone.setCpu(this.cpu);
        demoPhone.setWifi(this.wifi);
        demoPhone.setOs(this.os);
//        demoPhone.setBattery(this.battery);
        Battery battery = new Battery();
        battery.setBrand(this.battery.getBrand());
        battery.setTime(this.battery.getTime());
        demoPhone.setBattery(battery);
        return demoPhone;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
