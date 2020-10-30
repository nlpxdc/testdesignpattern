package io.cjf.testdesignpattern.facade;

public class ProductServiceImpl implements ProductService{
    @Override
    public Long load(Long productId) {
        System.out.println("load product");
        return null;
    }

    @Override
    public void save(Long productId) {
        System.out.println("save product");
    }
}
