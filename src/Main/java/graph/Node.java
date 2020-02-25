package graph;

import java.util.ArrayList;

public class Node {
    int value;
    ArrayList<Edge> edges;
    public Node(int value){
        this.value = value;
        this.edges = new ArrayList<>();
    }
    public Node(){
    }
}
