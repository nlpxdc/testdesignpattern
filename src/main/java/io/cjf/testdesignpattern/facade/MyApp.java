package io.cjf.testdesignpattern.facade;

public class MyApp {
    public static void main(String[] args) {
        OrderFacadeService orderFacadeService = new OrderFacadeServiceImpl();
        String cjf = orderFacadeService.getDetail("cjf", 123L);
        System.out.println(cjf);
    }
}
