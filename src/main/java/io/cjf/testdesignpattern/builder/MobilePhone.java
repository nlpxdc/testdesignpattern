package io.cjf.testdesignpattern.builder;

public class MobilePhone {
    private String cpu;
    private Integer ram;
    private Long disk;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Long getDisk() {
        return disk;
    }

    public void setDisk(Long disk) {
        this.disk = disk;
    }

    public static MobilePhoneBuilder newBuilder() {
        return new MobilePhoneBuilder();
    }

}
