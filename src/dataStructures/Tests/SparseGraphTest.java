package dataStructures.Tests;

import dataStructures.GraphNode;
import dataStructures.SparseGraph;
import dataStructures.StringNode;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class SparseGraphTest {

    private SparseGraph graph;

    private void addEdges() {
        StringNode node1 = new StringNode("1");
        StringNode node2 = new StringNode("2");
        StringNode node3 = new StringNode("3");
        StringNode node4 = new StringNode("4");
        StringNode node5 = new StringNode("5");

        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);
        graph.addNode(node5);

        graph.addEdge(node1, node1);
        graph.addEdge(node1, node2);
        graph.addEdge(node2, node3);
        graph.addEdge(node4, node5);
        graph.addEdge(node2, node4);
        graph.addEdge(node2, node4);
    }

    @BeforeEach
    void initializer() {
        graph = new SparseGraph();
    }

    @org.junit.jupiter.api.Test
    void addNode() {
        assertEquals(graph.nodeCount(), 0);

        StringNode node1 = new StringNode("First node");
        graph.addNode(node1);
        assertEquals(graph.nodeCount(), 1);

        StringNode node2 = new StringNode("Second node");
        graph.addNode(node2);
        assertEquals(graph.nodeCount(), 2);
    }

    @org.junit.jupiter.api.Test
    void addEdge() {
        assertEquals(graph.edgeCount(), 0);

        addEdges();

        assertEquals(graph.edgeCount(), 5);
    }

    @org.junit.jupiter.api.Test
    void degree() {
    }

    @org.junit.jupiter.api.Test
    void getNeighbors() {
        addEdges();

        for (GraphNode i : graph.getNodes())
            for (GraphNode j : graph.getNeighbors(i))
                System.out.println(i + " <-> " + j);

    }

    @org.junit.jupiter.api.Test
    void nodeCount() {
        assertEquals(graph.nodeCount(), 0);

        addEdges();

        assertEquals(graph.nodeCount(), 5);
    }

    @org.junit.jupiter.api.Test
    void edgeCount() {
        assertEquals(graph.edgeCount(), 0);

        addEdges();

        assertEquals(graph.edgeCount(), 5);
    }

}