package BreadthFirst;

import graph.Edge;

import java.util.ArrayList;

public class Node {
    public String name;
    public ArrayList<Edge> listEdges;


    public Node(String name) {
        this.name = name;
        this.listEdges = new ArrayList<>();
    }

    public Node() {

    }

    @Override
    public String toString() {
        return name  ;


    }
}