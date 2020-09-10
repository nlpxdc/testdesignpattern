package io.cjf.testdesignpattern.builder;

public class MobilePhoneBuilder {

    private MobilePhone mobilePhone;

    public MobilePhoneBuilder setCPU(String cpu) {
        if (mobilePhone == null) {
            mobilePhone = new MobilePhone();
        }
        mobilePhone.setCpu(cpu);
        return this;
    }

    public MobilePhoneBuilder setRAM(Integer ram) {
        if (mobilePhone == null) {
            mobilePhone = new MobilePhone();
        }
        mobilePhone.setRam(ram);
        return this;
    }

    public MobilePhoneBuilder setDisk(Long disk) {
        if (mobilePhone == null) {
            mobilePhone = new MobilePhone();
        }
        mobilePhone.setDisk(disk);
        return this;
    }

    public MobilePhone build() {
        return mobilePhone;
    }


}
