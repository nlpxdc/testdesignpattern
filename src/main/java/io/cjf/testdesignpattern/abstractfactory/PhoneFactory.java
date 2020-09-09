package io.cjf.testdesignpattern.abstractfactory;

import io.cjf.testdesignpattern.product.EarPhone;
import io.cjf.testdesignpattern.product.Phone;

public abstract class PhoneFactory {
    public abstract Phone createPhone();
    public abstract EarPhone createEarPhone();
}
