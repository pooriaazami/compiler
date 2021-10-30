package dataStructures.Nodes;

abstract public class GraphNode<T> {
    protected T data;

    private int color;
    private int weight;
    private int key;

    public GraphNode(T data, int key) {
        this.data = data;
        this.key = key;
        this.color = -1;
        this.weight = -1;
    }

    public GraphNode(T data, int weight, int color, int key) {
        this.data = data;
        this.color = color;
        this.weight = weight;
        this.key = key;
    }

    public abstract T getData();

    public abstract void setData(T newData);

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        return this.key;
    }
}
