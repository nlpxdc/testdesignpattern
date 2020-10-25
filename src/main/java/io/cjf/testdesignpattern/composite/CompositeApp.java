package io.cjf.testdesignpattern.composite;

import com.alibaba.fastjson.JSON;

public class CompositeApp {
    public static void main(String[] args) {
        Component root = new Component("root");
        Component main = new Component("main");
        Component navbar = new Component("navbar");
        Component header = new Component("header");
        Component footer = new Component("footer");
        Component mainContent = new Component("main-content");

        root.addChild(main);
        root.addChild(navbar);
        root.addChild(header);
        root.addChild(footer);
        main.addChild(mainContent);

        System.out.println(JSON.toJSONString(root));

    }
}
