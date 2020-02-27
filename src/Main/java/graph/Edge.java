package graph;

public class Edge {
    public int data;
    public Node node;
    public Edge(int weight, Node node){
        this.data = weight;
        this.node = node;
    }
}

