package dataStructures.Tests;

import dataStructures.StringNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringNodeTest {

    @Test
    void testToString() {
        StringNode node = new StringNode("This is my node");

        System.out.println(node);
    }
}