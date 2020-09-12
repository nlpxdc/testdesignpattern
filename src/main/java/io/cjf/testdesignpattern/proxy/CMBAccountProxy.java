package io.cjf.testdesignpattern.proxy;

public class CMBAccountProxy implements Account{

    private CMBAccount cmbAccount;

    public CMBAccountProxy(CMBAccount cmbAccount) {
        this.cmbAccount = cmbAccount;
    }

    @Override
    public void transfer() {
        System.out.println("begin cmb transaction");
        cmbAccount.transfer();
        System.out.println("end cmb transaction");
    }
}
