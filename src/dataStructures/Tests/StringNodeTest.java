package dataStructures.Tests;

import dataStructures.Nodes.StringNode;
import org.junit.jupiter.api.Test;

class StringNodeTest {

    @Test
    void testToString() {
        StringNode node = new StringNode("This is my node");

        System.out.println(node);
    }
}