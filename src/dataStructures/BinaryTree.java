package dataStructures;

import dataStructures.Nodes.BinaryTreeNode;
import dataStructures.Nodes.GraphNode;

import java.util.ArrayList;

public class BinaryTree implements Graph {
    private BinaryTreeNode root;

    private int nodeCount;
    private int edgesCount;

    public static enum CHILD {
        LEFT,
        RIGHT
    }

    public BinaryTree() {
        this.nodeCount = 0;
        this.edgesCount = 0;
    }

    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    private BinaryTreeNode convertNode(GraphNode node) {
        if (node instanceof BinaryTreeNode)
            return (BinaryTreeNode) node;

        throw new IllegalArgumentException();
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public void setChild(BinaryTreeNode parent, BinaryTreeNode node, CHILD child) {
        switch (child) {
            case LEFT -> parent.setLeft(node);
            case RIGHT -> parent.setRight(node);
        }
    }

    @Override
    public int degree(GraphNode node) {
        BinaryTreeNode currentNode = convertNode(node);

        return ((currentNode.getLeft() != null) ? 1 : 0) +
                ((currentNode.getRight() != null) ? 1 : 0);
    }

    @Override
    public ArrayList<GraphNode> getNeighbors(GraphNode node) {
        BinaryTreeNode currentNode = convertNode(node);

        ArrayList<GraphNode> nodes = new ArrayList<>();

        if (currentNode.getRight() != null)
            nodes.add(currentNode.getRight());

        if (currentNode.getLeft() != null)
            nodes.add(currentNode.getLeft());

        return nodes;
    }

    @Override
    public ArrayList<GraphNode> getNodes() {
        return null;
    }

    @Override
    public int nodeCount() {
        return this.nodeCount;
    }

    @Override
    public int edgeCount() {
        return this.edgesCount;
    }

    @Override
    public boolean isLeaf(GraphNode node) {
        BinaryTreeNode currentNode = convertNode(node);

        return currentNode.getLeft() == null && currentNode.getRight() == null;
    }

    @Override
    public boolean isIsolate(GraphNode node) {
        return false;
    }

    @Override
    public boolean isAdjacent(GraphNode i, GraphNode j) {

        return false;
    }

    private void printTree(BinaryTreeNode root, int tab) {
        if (root == null)
            return;

        for (int i = 0; i < tab; i++)
            System.out.print("\t");

        System.out.println(root);

        printTree(root.getLeft(), tab + 1);
        printTree(root.getRight(), tab + 1);
    }

    public void printTree() {
        printTree(root, 0);
    }
}
