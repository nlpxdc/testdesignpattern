package io.cjf.testdesignpattern.factorymethod;

import io.cjf.testdesignpattern.product.Phone;
import io.cjf.testdesignpattern.product.IPhone;

public class IPhoneFactory extends AbstractSimpleFactory {

    @Override
    public Phone createPhone() {
        Phone phone = new IPhone();
        return phone;
    }
}
