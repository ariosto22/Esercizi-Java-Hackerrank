package com.exercise.tree.visitor;

import com.example.tree.model.TreeLeaf;
import com.example.tree.model.TreeNode;

public interface TreeVisitor {

    Integer getResult();

    Integer visitNode(TreeNode node);
    Integer visitLeaf(TreeLeaf leaf);
}
