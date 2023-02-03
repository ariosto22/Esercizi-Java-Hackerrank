package com.exercise.tree.model;

public class Tree {

    protected Integer value;
    protected String color;

    protected Integer depth;

    public Tree(Integer value, String color, Integer depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }
}
