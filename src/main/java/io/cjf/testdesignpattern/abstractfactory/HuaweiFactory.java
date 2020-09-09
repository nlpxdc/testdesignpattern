package io.cjf.testdesignpattern.abstractfactory;

import io.cjf.testdesignpattern.product.EarPhone;
import io.cjf.testdesignpattern.product.Honor;
import io.cjf.testdesignpattern.product.Phone;
import io.cjf.testdesignpattern.product.SONY;

public class HuaweiFactory extends PhoneFactory{
    @Override
    public Phone createPhone() {
        Honor honor = new Honor();
        return honor;
    }

    @Override
    public EarPhone createEarPhone() {
        SONY sony = new SONY();
        return sony;
    }
}
