package Breadthfirst;


import graph.Edge;
import graph.Node;

import java.util.*;

public class BreadthFirst {


    public static List<graph.Node> BreadthFirst(graph.Node node) {
        List<graph.Node> joker = new ArrayList<>();
        Queue<graph.Node> bane = new LinkedList<>();
        HashSet<graph.Node> group = new HashSet<>();
        Node currentNode = node;
        joker.add(currentNode);
        group.add(currentNode);
        while (currentNode != null) {
            ArrayList<Edge> nodesNeighbors = currentNode.listEdges;
            for (Edge edge : nodesNeighbors) {
                if (!group.contains(edge.node)) {
                    group.add(edge.node);
                    bane.add(edge.node);
                    joker.add(edge.node);
                }
            }
            currentNode = bane.poll();
        }
        return joker;
    }
}