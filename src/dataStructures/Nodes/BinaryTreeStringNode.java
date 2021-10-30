package dataStructures.Nodes;

public class BinaryTreeStringNode extends BinaryTreeNode<String> {

    public BinaryTreeStringNode(String data, int key) {
        super(data, key);
    }

    public BinaryTreeStringNode(String data, int weight, int color, int key) {
        super(data, weight, color, key);
    }

    @Override
    public String getData() {
        return this.data;
    }

    @Override
    public void setData(String newData) {
        this.data = newData;
    }

    @Override
    public String toString() {
        return String.format("BinaryTreeStringNode{data = '%s'}", this.data);
    }
}
