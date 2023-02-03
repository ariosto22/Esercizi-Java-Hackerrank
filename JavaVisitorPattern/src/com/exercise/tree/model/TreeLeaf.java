package com.exercise.tree.model;

import com.example.tree.visitor.TreeVisitable;
import com.example.tree.visitor.TreeVisitor;

public class TreeLeaf extends Tree implements TreeVisitable {

    public TreeLeaf(Integer value, String color, Integer depth) {
        super(value, color, depth);
    }

    @Override
    public Integer accept(TreeVisitor treeVisitor) {
        return treeVisitor.visitLeaf(this);
    }
}
