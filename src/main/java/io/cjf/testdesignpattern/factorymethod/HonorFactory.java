package io.cjf.testdesignpattern.factorymethod;

import io.cjf.testdesignpattern.product.Phone;
import io.cjf.testdesignpattern.product.Honor;

public class HonorFactory extends AbstractSimpleFactory {
    @Override
    public Phone createPhone() {
        Phone phone = new Honor();
        return phone;
    }
}
