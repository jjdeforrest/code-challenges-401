package graph;

public class Edge {

    public Node nextNode;
    public int weight;
    public int data;
    public Node node;

    public Edge(int weight, Node node){
        this.data = weight;
        this.node = node;
    }
    @Override
    public String toString() {
        return  ""+ nextNode + " "+
                + weight
                ;
    }

    public Edge(Node nextNode, int weight) {
        this.nextNode = nextNode;
        this.weight = weight;
    }
}


