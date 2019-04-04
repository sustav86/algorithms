package binarysearchtree;

public class TreeNode {
    public static final TreeNode EMPTY_NODE = new TreeNode(-1);
    private int data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {
            if (leftNode == null) {
                leftNode = new TreeNode(value);
            } else {
                leftNode.insert(value);
            }
        } else {
            if (rightNode == null) {
                rightNode = new TreeNode(value);
            } else {
                rightNode.insert(value);
            }
        }
    }

    public TreeNode get(int value) {
        if (value == data) {
            return this;
        }
        if (value < data) {
            if (leftNode != null) {
                return leftNode.get(value);
            }
        }else {
            if (rightNode != null) {
                return rightNode.get(value);
            }
        }

        return EMPTY_NODE;
    }

    public int min() {
        if (leftNode == null) {
            return data;
        }

        return leftNode.min();
    }

    public int max() {
        if (rightNode == null) {
            return data;
        }

        return rightNode.max();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public void traverseInOrder() {
        if (leftNode != null) {
            leftNode.traverseInOrder();
        }
        System.out.print(data + ", ");
        if (rightNode != null) {
            rightNode.traverseInOrder();
        }
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}
