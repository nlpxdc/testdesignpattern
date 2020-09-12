package io.cjf.testdesignpattern.proxy;

public class ProxyApp {
    public static void main(String[] args) {
        CMBAccount cmbAccount = new CMBAccount();
//        cmbAccount.transfer();
        CMBAccountProxy cmbAccountProxy = new CMBAccountProxy(cmbAccount);
        cmbAccountProxy.transfer();

    }
}
