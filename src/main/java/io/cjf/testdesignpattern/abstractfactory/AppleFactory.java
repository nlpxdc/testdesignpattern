package io.cjf.testdesignpattern.abstractfactory;

import io.cjf.testdesignpattern.product.EarPhone;
import io.cjf.testdesignpattern.product.IPhone;
import io.cjf.testdesignpattern.product.Phone;
import io.cjf.testdesignpattern.product.Sennheiser;

public class AppleFactory extends PhoneFactory{

    @Override
    public Phone createPhone() {
        Phone phone = new IPhone();
        return phone;
    }

    @Override
    public EarPhone createEarPhone() {
        Sennheiser sennheiser = new Sennheiser();
        return sennheiser;
    }
}
