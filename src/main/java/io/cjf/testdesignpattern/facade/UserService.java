package io.cjf.testdesignpattern.facade;

public interface UserService {

    String load(String username);

    void save(String username);

}
