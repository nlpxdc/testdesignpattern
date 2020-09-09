package io.cjf.testdesignpattern.factorymethod;

import io.cjf.testdesignpattern.product.Phone;

public abstract class AbstractSimpleFactory {
    public abstract Phone createPhone();

    public void doSth() {
        Phone phone = createPhone();
        String s = phone.toString();
        System.out.println(s);
    }
}
