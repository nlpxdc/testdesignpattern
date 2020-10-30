package io.cjf.testdesignpattern.facade;

public interface ProductService {

    Long load(Long productId);

    void save(Long productId);

}
