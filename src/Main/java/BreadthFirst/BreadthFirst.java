package BreadthFirst;


import graph.Edge;
import graph.Node;

import java.util.*;

public class BreadthFirst {
    public static List<graph.Node> breadththrough(graph.Node node) {
        List<graph.Node> nodes = new ArrayList<>();
        Queue<graph.Node> qChecker = new LinkedList<>();
        HashSet<graph.Node> set = new HashSet<>();

        Node currentNode = node;
        nodes.add(currentNode);
        set.add(currentNode);

        while (currentNode != null) {
            ArrayList<Edge> nodesNeighbors = currentNode.listEdges;
            for (Edge edge : nodesNeighbors) {
                if (!set.contains(edge.node)) {
                    set.add(edge.node);
                    qChecker.add(edge.node);
                    nodes.add(edge.node);
                }
            }
            currentNode = qChecker.poll();
        }
        return nodes;
    }
}