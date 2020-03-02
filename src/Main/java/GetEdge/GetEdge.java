package GetEdge;

import graph.Edge;
import graph.Graph;
import graph.Node;

import java.util.ArrayList;

public class GetEdge {

    public String listNodes;
    public static String GetEdge(Graph graph, String[] position) {
        if (position.length <= 0 || graph.listNodes.size() == 0) return "no";
        Node place = null;
        ArrayList<Edge> joker;
        int total = 0;
        boolean first = false;
        for (Node node : graph.listNodes) {
            if (position[0] != null) {
                place = node;
            }
        }

        if (place == null) return "no";
        for (int i = 1; i < position.length; i++) {
            joker = place.listEdges;
            for (Edge edge : joker) {
                if (edge != null) {
                    total += (int) edge.weight;
                    place = edge.nextNode;
                    first = true;
                }
            }
            if (first) {
                first = false;
            } else {
                return "no";
            }
        }
        return "yes" + total;
    }

}