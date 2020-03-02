package DepthFirst;

import graph.Graph;
import graph.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DepthFirstTest {

    @Test
    public void depthFirst() {
        Graph graph = new Graph();
        Node joker = graph.addn("joker");
        Node bane = graph.addn("bane");
        Node batman = graph.addn("batman");
        Node thanos = graph.addn("thanos");
        Node purge = graph.addn("purge");
        graph.addE(joker, bane, 1);
        graph.addE(bane, batman, 2);
        graph.addE(thanos, batman, 3);
        graph.addE(purge, batman, 4);
        graph.addE(joker, batman, 5);
        List<Node> compareList = new ArrayList<>();
        compareList.add(joker);
        compareList.add(bane);
        compareList.add(batman);
        compareList.add(thanos);
        compareList.add(purge);
        assertEquals("[thanos, batman, bane, purge, joker]", DepthFirst.depthFirst(thanos).toString());

    }

}