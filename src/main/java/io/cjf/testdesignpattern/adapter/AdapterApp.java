package io.cjf.testdesignpattern.adapter;

public class AdapterApp {

    public static void main(String[] args) {
        USPlugImpl usPlug = new USPlugImpl();
        CNUSAdapter cnusAdapter = new CNUSAdapter(usPlug);
        cnusAdapter.smallInsert();
    }

}
