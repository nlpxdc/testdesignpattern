package io.cjf.testdesignpattern.abstractfactory;

import io.cjf.testdesignpattern.product.EarPhone;
import io.cjf.testdesignpattern.product.Phone;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        Phone phone = appleFactory.createPhone();
        EarPhone earPhone = appleFactory.createEarPhone();
        System.out.println(phone);
        System.out.println(earPhone);

        HuaweiFactory huaweiFactory = new HuaweiFactory();
        Phone phone1 = huaweiFactory.createPhone();
        EarPhone earPhone1 = huaweiFactory.createEarPhone();
        System.out.println(phone1);
        System.out.println(earPhone1);

    }
}
