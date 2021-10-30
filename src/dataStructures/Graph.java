package dataStructures;

import dataStructures.Nodes.GraphNode;

import java.util.ArrayList;

public interface Graph {

    public int degree(GraphNode node);

    public ArrayList<GraphNode> getNeighbors(GraphNode node);

    public ArrayList<GraphNode> getNodes();

    public int nodeCount();

    public int edgeCount();

    public boolean isLeaf(GraphNode node);

    public boolean isIsolate(GraphNode node);

    public boolean isAdjacent(GraphNode i, GraphNode j);

}
