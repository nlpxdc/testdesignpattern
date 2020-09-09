package io.cjf.testdesignpattern.simplefactory;

public class SimpleFactoryApp {
    public static void main(String[] args) {
        Phone phone = SimpleFactory.createPhone(2);
        System.out.println(phone);
    }
}
