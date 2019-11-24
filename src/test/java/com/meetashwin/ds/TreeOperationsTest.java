package com.meetashwin.ds;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TreeOperationsTest {
    private static final Logger logger = LogManager.getLogger(TreeOperationsTest.class);

    @Test
    public void testInorderTraversal() {
        //1. Create a basic tree
        TreeOperations basicTree = createBasicTree();

        //2. Invoke Inorder Traversal
        basicTree.printInorder(basicTree.getRoot());

        logger.info("Finished executing testInorderTraversal");
    }

    @Test
    public void testPreOrderTraversal() {
        //1. Create a basic tree
        TreeOperations basicTree = createBasicTree();

        //2. Invoke Inorder Traversal
        basicTree.printPreOrder(basicTree.getRoot());

        logger.info("Finished executing testPreorderTraversal");
    }

    @Test
    public void testPostOrderTraversal() {
        //1. Create a basic tree
        TreeOperations basicTree = createBasicTree();

        //2. Invoke Inorder Traversal
        basicTree.printPostOrder(basicTree.getRoot());

        logger.info("Finished executing testPostorderTraversal");
    }

    private TreeOperations createBasicTree() {
        TreeOperations basicTree = new TreeOperations();
        TreeNode root = new TreeNode(1);
        TreeNode tn1 = new TreeNode(2);
        TreeNode tn2 = new TreeNode(5);
        TreeNode tn3 = new TreeNode(3);
        TreeNode tn4 = new TreeNode(7);
        TreeNode tn5 = new TreeNode(11);
        TreeNode tn6 = new TreeNode(8);

        basicTree.setRoot(root);
        basicTree.getRoot().setLeft(tn1);
        basicTree.getRoot().setRight(tn2);
        basicTree.getRoot().getLeft().setLeft(tn3);
        basicTree.getRoot().getLeft().setRight(tn4);
        basicTree.getRoot().getRight().setLeft(tn5);
        basicTree.getRoot().getRight().setRight(tn6);

        return basicTree;
    }
}
