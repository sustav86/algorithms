package binarysearchtree;

public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }

        return TreeNode.EMPTY_NODE;
    }

    public int min() {
        if (root == null) {
            return -1;
        }

        return root.min();
    }

    public int max() {
        if (root == null) {
            return -1;
        }

        return root.max();
    }
}
