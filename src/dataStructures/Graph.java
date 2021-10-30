package dataStructures;

import java.util.ArrayList;

public interface Graph {

    public int degree(GraphNode node);

    public ArrayList<GraphNode> getNeighbors(GraphNode node);

    public int nodeCount();

    public int edgeCount();

    public boolean isLeaf(GraphNode node);

    public boolean isIsolate(GraphNode node);

}
