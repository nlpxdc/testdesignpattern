package io.cjf.testdesignpattern.proxy;

public class CMBAccount implements Account{

    @Override
    public void transfer() {
        System.out.println("transfer");
    }
}
