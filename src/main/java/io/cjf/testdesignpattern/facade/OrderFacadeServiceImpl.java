package io.cjf.testdesignpattern.facade;

public class OrderFacadeServiceImpl implements OrderFacadeService{

    private UserService userService = new UserServiceImpl();

    private ProductService productService = new ProductServiceImpl();

    @Override
    public String getDetail(String username, Long productId) {
        String user = userService.load(username);
        Long product = productService.load(productId);
        System.out.println(""+user+product);
        return null;
    }
}
