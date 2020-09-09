package io.cjf.testdesignpattern.factorymethod;

import io.cjf.testdesignpattern.Phone;

public class FactoryMethodApp {
    public static void main(String[] args) {
        AbstractSimpleFactory honorFactory = new HonorFactory();
        AbstractSimpleFactory iPhoneFactory = new IPhoneFactory();
//        Phone phone = honorFactory.createPhone();
//        Phone phone1 = iPhoneFactory.createPhone();
        honorFactory.doSth();
        iPhoneFactory.doSth();

    }
}
