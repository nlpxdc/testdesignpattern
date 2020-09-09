package io.cjf.testdesignpattern.simplefactory;

import io.cjf.testdesignpattern.product.Honor;
import io.cjf.testdesignpattern.product.IPhone;
import io.cjf.testdesignpattern.product.Nokia;
import io.cjf.testdesignpattern.product.Phone;

public class SimpleFactory {

    public static Phone createPhone(Integer type) {
        Phone phone;
        if (type == 0) {
            phone = new IPhone();
        } else if (type == 1) {
            phone = new Honor();
        } else {
            phone = new Nokia();
        }
        return phone;
    }

    public Phone makePhone(Integer type) {
        Phone phone;
        if (type == 0) {
            phone = new IPhone();
        } else if (type == 1) {
            phone = new Honor();
        } else {
            phone = new Nokia();
        }
        return phone;
    }

}
