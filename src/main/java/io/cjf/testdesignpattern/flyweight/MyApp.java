package io.cjf.testdesignpattern.flyweight;

public class MyApp {
    public static void main(String[] args) {
        User user = new User(100);
        user.doSth("sing");
        user.doSth("dance");
    }
}
