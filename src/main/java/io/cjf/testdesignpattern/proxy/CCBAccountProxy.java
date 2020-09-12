package io.cjf.testdesignpattern.proxy;

public class CCBAccountProxy implements Account{

    private CCBAccount ccbAccount;

    public CCBAccountProxy(CCBAccount ccbAccount) {
        this.ccbAccount = ccbAccount;
    }

    @Override
    public void transfer() {
        System.out.println("begin ccb transaction");
        ccbAccount.transfer();
        System.out.println("end ccb transaction");
    }
}
