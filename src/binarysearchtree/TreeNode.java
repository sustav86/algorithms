package binarysearchtree;

public class TreeNode {
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
}
