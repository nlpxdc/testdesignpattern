package io.cjf.testdesignpattern.flyweight;

public class User {

    private Integer energy;

    public User(Integer energy) {
        this.energy = energy;
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public void doSth(String action) {
        System.out.println(action);
    }

}
