package graph;

import java.util.ArrayList;

public class Node {
    String name;
    int value;
    ArrayList<Edge> edges;
    public ArrayList<Edge> listEdges;
    public Node(int value){
        super();
        this.value = value;
        this.edges = new ArrayList<>();
    }

    public Node(String name) {
        this.name = name;
        this.listEdges = new ArrayList<>();
    }



    public Node(){
    }

    @Override
    public String toString() {
        return name  ;


    }
}
