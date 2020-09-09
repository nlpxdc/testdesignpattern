package io.cjf.testdesignpattern.factorymethod;

import io.cjf.testdesignpattern.Phone;
import io.cjf.testdesignpattern.simplefactory.IPhone;

public class IPhoneFactory extends AbstractSimpleFactory {

    @Override
    public Phone createPhone() {
        Phone phone = new IPhone();
        return phone;
    }
}
