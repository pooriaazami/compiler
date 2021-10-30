package automata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DFATest {

    void firstTest() {
        DFA dfa = new DFA();

        int s0 = dfa.addNewState(false);
        int s1 = dfa.addNewState(false);
        int s2 = dfa.addNewState(false);
        int s3 = dfa.addNewState(false);
        int s4 = dfa.addNewState(true);

        dfa.addNewEdge(s0, s1, 'a');
        dfa.addNewEdge(s0, s3, 'b');
        dfa.addNewEdge(s1, s2, 'a');
        dfa.addNewEdge(s1, s3, 'b');
        dfa.addNewEdge(s2, s4, 'b');
        dfa.addNewEdge(s2, s3, 'a');
        dfa.addNewEdge(s3, s3, 'a');
        dfa.addNewEdge(s3, s3, 'b');
        dfa.addNewEdge(s4, s4, 'a');
        dfa.addNewEdge(s4, s4, 'b');

        assertTrue(dfa.processInput("aab"));
        assertTrue(dfa.processInput("aabb"));
        assertFalse(dfa.processInput("aa"));
        assertFalse(dfa.processInput("abb"));
        assertFalse(dfa.processInput("babb"));

        assertThrows(IllegalArgumentException.class, () -> {
            dfa.processInput("cbaa");
        });
    }

    @Test
    void processInput() {
        firstTest();
    }
}