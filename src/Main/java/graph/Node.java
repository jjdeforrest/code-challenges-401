package graph;

import java.util.ArrayList;

public class Node {

    String name;
    public int value;
    public ArrayList<Edge> edges;
    public ArrayList<Edge> listEdges;
    public Node(int value){
        this.value = value;
        this.edges = new ArrayList<>();
    }

    public Node(String name) {
        this.name = name;
        this.listEdges = new ArrayList<>();
    }



    @Override
    public String toString() {
        return name  ;


    }
}