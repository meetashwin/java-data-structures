package com.meetashwin.ds;

public class TreeOperations {
    TreeNode root;

    public TreeOperations() {
        root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void printInorder(TreeNode node) {
        if (node == null)
            return;

        printInorder(node.getLeft());
        System.out.println(node.getKey() + " ");
        printInorder((node.getRight()));
    }

    public void printPreOrder(TreeNode node) {
        if (node == null)
            return;

        System.out.println(node.getKey() + " ");
        printInorder(node.getLeft());
        printInorder((node.getRight()));
    }

    public void printPostOrder(TreeNode node) {
        if (node == null)
            return;

        printInorder(node.getLeft());
        printInorder((node.getRight()));
        System.out.println(node.getKey() + " ");
    }
}

class TreeNode {
    private int key;
    private TreeNode left, right;

    public TreeNode(int key) {
        this.key = key;
        left = right = null;
    }

    public int getKey() {
        return this.key;
    }

    public void setKey() {
        this.key = key;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public void setLeft(TreeNode tn) {
        this.left = tn;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public void setRight(TreeNode tn) {
        this.right = tn;
    }
}
