package dataStructures.Nodes;

public abstract class BinaryTreeNode<T> extends GraphNode<T> {

    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(T data, int key) {
        super(data, key);
    }

    public BinaryTreeNode(T data, int weight, int color, int key) {
        super(data, weight, color, key);
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
}
