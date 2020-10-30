package io.cjf.testdesignpattern.facade;

public class UserServiceImpl implements UserService{
    @Override
    public String load(String username) {
        System.out.println("load username");
        return null;
    }

    @Override
    public void save(String username) {
        System.out.println("save username");
    }
}
