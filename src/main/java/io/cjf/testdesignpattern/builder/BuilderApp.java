package io.cjf.testdesignpattern.builder;

public class BuilderApp {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhoneBuilder()
                .setCPU("990")
                .setDisk(999L)
                .setRAM(128)
                .build();
        System.out.println(mobilePhone);

    }
}
