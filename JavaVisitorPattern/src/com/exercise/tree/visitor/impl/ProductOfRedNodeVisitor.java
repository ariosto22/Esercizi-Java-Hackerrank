package com.exercise.tree.visitor.impl;

import com.example.tree.model.TreeLeaf;
import com.example.tree.model.TreeNode;
import com.example.tree.visitor.TreeVisitor;

public class ProductOfRedNodeVisitor implements TreeVisitor {
    long result = 1;
    final int T = (int) (Math.pow(10, 9)) + 7;

    @Override
    public Integer getResult() {

        return (int) result;
    }

    @Override
    public Integer visitNode(TreeNode node) {
        return null;
    }

    @Override
    public Integer visitLeaf(TreeLeaf leaf) {
        return null;
    }
}
