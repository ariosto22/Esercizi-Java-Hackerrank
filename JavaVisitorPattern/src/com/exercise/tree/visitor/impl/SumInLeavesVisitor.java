package com.exercise.tree.visitor.impl;

import com.example.tree.model.TreeLeaf;
import com.example.tree.model.TreeNode;
import com.example.tree.visitor.TreeVisitor;

public class SumInLeavesVisitor implements TreeVisitor {
    int result = 0;

    @Override
    public Integer getResult() {

        return result;
    }

    @Override
    public Integer visitNode(TreeNode node) {
        return null;
    }

    @Override
    public Integer visitLeaf(TreeLeaf leaf) {
        return result+=leaf.getValue();
    }
}
