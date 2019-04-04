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

    public void traversePreOrder() {
        if (root != null) {
            root.traversePreOrder();
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }

        return TreeNode.EMPTY_NODE;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTree, int value) {
        if (subTree == null) {
            return subTree;
        }

        if (value < subTree.getData()) {
            subTree.setLeftNode(delete(subTree.getLeftNode(), value));
        } else if (value > subTree.getData()) {
            subTree.setRightNode(delete(subTree.getRightNode(), value));
        } else {
            if (subTree.getLeftNode() == null) {
                return subTree.getRightNode();
            } else if (subTree.getRightNode() == null) {
                return subTree.getLeftNode();
            }

            subTree.setData(subTree.getRightNode().min());
            subTree.setRightNode(delete(subTree.getRightNode(), subTree.getData()));
        }

        return subTree;
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
