package io.cjf.testdesignpattern.proxy;

public class CCBAccount implements Account {
    @Override
    public void transfer() {
        System.out.println("ccb transfer");
    }
}
