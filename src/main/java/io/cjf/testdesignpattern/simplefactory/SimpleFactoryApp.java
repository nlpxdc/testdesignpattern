package io.cjf.testdesignpattern.simplefactory;

import io.cjf.testdesignpattern.product.Phone;

public class SimpleFactoryApp {
    public static void main(String[] args) {
        Phone phone = SimpleFactory.createPhone(2);
        System.out.println(phone);

        SimpleFactory simpleFactory = new SimpleFactory();
        Phone phone1 = simpleFactory.makePhone(1);
        System.out.println(phone1);
    }
}
