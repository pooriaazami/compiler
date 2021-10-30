package automata;

import dataStructures.Graph;
import dataStructures.Nodes.BinaryNode;
import dataStructures.Nodes.GraphNode;
import dataStructures.Pair;

import java.util.ArrayList;

public class DFA implements Graph {

    private ArrayList<BinaryNode> nodes;
    private ArrayList<ArrayList<Pair<BinaryNode, String>>> edges;

    private int nodeCount;

    public DFA() {
        this.nodeCount = 0;
        this.nodes = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    public int addNewState(boolean isFinalState) {
        this.nodes.add(new BinaryNode(isFinalState, nodeCount));

        return nodeCount++;
    }

    public void addNewEdge(int from, int to, String value) {
        this.edges.get(from).add(new Pair<BinaryNode, String>(nodes.get(to), value));
    }

    public boolean processInput(String input) {
        int state = 0;

        for (char c : input.toCharArray()) {
            for (Pair<BinaryNode, String> node : this.edges.get(state)) {
                if (node.getSecond().equals(c)) {
                    state = node.getFirst().getKey();
                    break;
                }
            }
        }

        return this.nodes.get(state).getData();
    }

    @Override
    public int degree(GraphNode node) {
        return this.edges.get(node.getKey()).size();
    }

    @Override
    public ArrayList<GraphNode> getNeighbors(GraphNode node) {
        ArrayList<GraphNode> nodes = new ArrayList<>();

        for (Pair<BinaryNode, String> pair : this.edges.get(node.getKey())) {
            nodes.add(pair.getFirst());
        }

        return nodes;
    }

    @Override
    public ArrayList<GraphNode> getNodes() {
        ArrayList<GraphNode> nodes = new ArrayList<>();

        for (GraphNode node : this.nodes) {
            nodes.add(node);
        }

        return nodes;
    }

    @Override
    public int nodeCount() {
        return this.nodeCount;
    }

    @Override
    public int edgeCount() {
        return this.edges.size() / 2;
    }

    @Override
    public boolean isLeaf(GraphNode node) {
        return this.nodes.get(node.getKey()).getData();
    }

    @Override
    public boolean isIsolate(GraphNode node) {
        return degree(node) == 0;
    }

    @Override
    public boolean isAdjacent(GraphNode i, GraphNode j) {
        for (Pair<BinaryNode, String> pair : this.edges.get(i.getKey()))
            if (pair.getFirst().getKey() == j.getKey())
                return true;

        return false;
    }
}
