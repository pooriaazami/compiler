package dataStructures;

import java.util.ArrayList;
import java.util.HashSet;

public class SparseGraph implements Graph {

    private ArrayList<GraphNode> nodes;
    private ArrayList<ArrayList<Integer>> edges;

    private int nodeCount;
    private int edgeCount;

    public SparseGraph() {
        this.nodeCount = 0;
        this.edgeCount = 0;

        this.nodes = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    public void addNode(GraphNode node) {
        node.setKey(this.nodeCount++);

        this.nodes.add(node);
        this.edges.add(new ArrayList<Integer>());
    }

    public void addEdge(GraphNode i, GraphNode j) {
        edges.get(i.getKey()).add(j.getColor());
        edges.get(j.getKey()).add(i.getKey());
        this.edgeCount++;
    }

    @Override
    public int degree(GraphNode node) {
        return this.edges.get(node.getKey()).size();
    }

    @Override
    public ArrayList<GraphNode> getNeighbors(GraphNode node) {
        ArrayList<GraphNode> nodes = new ArrayList<>();

        for (int hash : this.edges.get(node.getKey()))
            nodes.add(this.nodes.get(hash));

        return nodes;
    }

    @Override
    public int nodeCount() {
        return nodeCount;
    }

    @Override
    public int edgeCount() {
        return this.edgeCount;
    }

    @Override
    public boolean isLeaf(GraphNode node) {
        return false;
    }

    @Override
    public boolean isIsolate(GraphNode node) {
        return false;
    }
}
