package com.exercise.tree.model;

import com.example.tree.visitor.TreeVisitable;
import com.example.tree.visitor.TreeVisitor;

public class TreeNode extends Tree implements TreeVisitable {

    public TreeNode(Integer value, String color, Integer depth) {
        super(value, color, depth);
    }


    @Override
    public Integer accept(TreeVisitor treeVisitor) {
        return treeVisitor.visitNode(this);
    }
}
