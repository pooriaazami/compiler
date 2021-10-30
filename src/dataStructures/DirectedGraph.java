package dataStructures;

import dataStructures.Nodes.GraphNode;

import java.util.ArrayList;

public class DirectedGraph implements Graph {
    private ArrayList<GraphNode> nodes;
    private ArrayList<ArrayList<Integer>> edges;

    private int nodeCount;
    private int edgeCount;

    public DirectedGraph() {
        this.nodeCount = 0;
        this.edgeCount = 0;

        this.nodes = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    public void addNode(GraphNode node) {
        node.setKey(this.nodeCount++);

        this.nodes.add(node);
        this.edges.add(new ArrayList<>());
    }

    public void addEdge(GraphNode i, GraphNode j) {
        if (!isAdjacent(i, j)) {
            edges.get(i.getKey()).add(j.getKey());
            this.edgeCount++;
        }
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
    public ArrayList<GraphNode> getNodes() {
        return this.nodes;
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
        return degree(node) == 1;
    }

    @Override
    public boolean isIsolate(GraphNode node) {
        return degree(node) == 0;
    }

    @Override
    public boolean isAdjacent(GraphNode i, GraphNode j) {
        for (int hash : this.edges.get(i.hashCode()))
            if (hash == j.hashCode())
                return true;

        return false;
    }
}
