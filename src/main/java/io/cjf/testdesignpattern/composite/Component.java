package io.cjf.testdesignpattern.composite;

import java.util.LinkedList;
import java.util.List;

public class Component {
    private String name;
    List<Component> children = new LinkedList<>();

    public Component(String name) {
        this.name = name;
    }

    public List<Component> getChildren() {
        return children;
    }

    public void setChildren(List<Component> children) {
        this.children = children;
    }

    public void addChild(Component component) {
        this.children.add(component);
    }

    public void removeChild(Component component) {
        this.children.remove(component);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
