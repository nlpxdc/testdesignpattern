package io.cjf.testdesignpattern.factorymethod;

import io.cjf.testdesignpattern.Phone;
import io.cjf.testdesignpattern.Honor;

public class HonorFactory extends AbstractSimpleFactory {
    @Override
    public Phone createPhone() {
        Phone phone = new Honor();
        return phone;
    }
}
