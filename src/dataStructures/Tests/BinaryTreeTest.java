package dataStructures.Tests;

import dataStructures.BinaryTree;
import dataStructures.Nodes.BinaryTreeNode;
import dataStructures.Nodes.BinaryTreeStringNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    private BinaryTree binaryTree;

    @BeforeEach
    void setUp() {
        binaryTree = new BinaryTree();
    }

    @Test
    void setChild() {
        BinaryTreeStringNode node1 = new BinaryTreeStringNode("1");
        BinaryTreeStringNode node2 = new BinaryTreeStringNode("2");
        BinaryTreeStringNode node3 = new BinaryTreeStringNode("3");
        BinaryTreeStringNode node4 = new BinaryTreeStringNode("4");
        BinaryTreeStringNode node5 = new BinaryTreeStringNode("5");
        BinaryTreeStringNode node6 = new BinaryTreeStringNode("6");
        BinaryTreeStringNode node7 = new BinaryTreeStringNode("7");

        binaryTree.setRoot(node1);
        binaryTree.setChild(node1, node2, BinaryTree.CHILD.LEFT);
        binaryTree.setChild(node1, node3, BinaryTree.CHILD.RIGHT);
        binaryTree.setChild(node2, node4, BinaryTree.CHILD.LEFT);
        binaryTree.setChild(node2, node5, BinaryTree.CHILD.RIGHT);
        binaryTree.setChild(node3, node6, BinaryTree.CHILD.LEFT);
        binaryTree.setChild(node3, node7, BinaryTree.CHILD.RIGHT);

        binaryTree.printTree();
    }

    @Test
    void degree() {
    }

    @Test
    void getNeighbors() {
    }

    @Test
    void getNodes() {
    }

    @Test
    void nodeCount() {
    }

    @Test
    void edgeCount() {
    }

    @Test
    void isLeaf() {
    }

    @Test
    void isIsolate() {
    }

    @Test
    void isAdjacent() {
    }

    @Test
    void printTree() {
    }
}