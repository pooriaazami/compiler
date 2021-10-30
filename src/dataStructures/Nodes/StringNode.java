package dataStructures.Nodes;

public class StringNode extends GraphNode<String> {
    public StringNode(String data, int key) {
        super(data, key);
    }

    public StringNode(String data) {
        super(data, -1);
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
        return String.format("StringNode{data = '%s'}", this.data);
    }
}
