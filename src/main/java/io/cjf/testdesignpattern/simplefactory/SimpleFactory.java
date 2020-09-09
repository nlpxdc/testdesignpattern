package io.cjf.testdesignpattern.simplefactory;

public class SimpleFactory {

    public static Phone createPhone(Integer type) {
        Phone phone = null;
        if (type == 0) {
            phone = new IPhone();
        } else if (type == 1) {
            phone = new Honor();
        } else {
            phone = new Nokia();
        }
        return phone;
    }

}