package io.cjf.testdesignpattern.adapter;

public class CNUSAdapter implements CNPlug{

    private USPlug usPlug;

    public CNUSAdapter(USPlug usPlug) {
        this.usPlug = usPlug;
    }

    @Override
    public void smallInsert() {
        usPlug.bigInsert();
    }
}
