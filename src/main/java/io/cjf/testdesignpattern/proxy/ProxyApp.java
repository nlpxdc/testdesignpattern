package io.cjf.testdesignpattern.proxy;

public class ProxyApp {
    public static void main(String[] args) {
        CMBAccount cmbAccount = new CMBAccount();
//        cmbAccount.transfer();
        CMBAccountProxy cmbAccountProxy = new CMBAccountProxy(cmbAccount);
        cmbAccountProxy.transfer();

        CCBAccount ccbAccount = new CCBAccount();
        CCBAccountProxy ccbAccountProxy = new CCBAccountProxy(ccbAccount);
        ccbAccountProxy.transfer();

        Object proxy = BeanUtil.createProxy(CMBAccount.class, Account.class);

    }
}
