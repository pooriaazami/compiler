package dataStructures;

public class StringNode extends GraphNode<String> {
    public StringNode(String data, int key) {
        super(data, key);
    }

    @Override
    public String getData() {
        return this.data;
    }

    @Override
    public void setData(String newData) {
        this.data = newData;
    }
}
