package io.cjf.testdesignpattern.prototype;

public class PrototypeApp {
    public static void main(String[] args) {
        DemoPhone demoPhone = new DemoPhone();
        demoPhone.setCpu(123);
        demoPhone.setWifi(false);
        demoPhone.setOs("abc");

        Battery battery = new Battery();
        battery.setBrand("nanfu");
        battery.setTime(456);

        demoPhone.setBattery(battery);

        DemoPhone clone = demoPhone.clone();
        System.out.println(demoPhone);
        System.out.println(clone);

        DemoPhone demoPhone1 = BeanUtil.<DemoPhone>deepClone(demoPhone);
        DemoPhone demoPhone2 = BeanUtil.deepClone(demoPhone);

        Object o = BeanUtil.deepCopy(demoPhone);
        Object o1 = BeanUtil.shallowCopy(demoPhone);
    }
}
