package dataStructures.Nodes;

public class BinaryNode extends GraphNode<Boolean> {
    public BinaryNode(Boolean data, int key) {
        super(data, key);
    }

    public BinaryNode(Boolean data) {
        super(data, -1);
    }

    public BinaryNode(Boolean data, int weight, int color, int key) {
        super(data, weight, color, key);
    }

    @Override
    public Boolean getData() {
        return this.data;
    }

    @Override
    public void setData(Boolean newData) {
        this.data = newData;
    }
}
