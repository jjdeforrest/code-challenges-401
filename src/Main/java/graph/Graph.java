package graph;

import java.util.ArrayList;

public class Graph {

    public ArrayList<Node> listNodes;

    public Graph() {
        this.listNodes = new ArrayList<>();
    }


    ArrayList<Node> list = new ArrayList<>();
    public Node addNode(int value){
        Node newNode = new Node(value);
        this.list.add(newNode);
        return newNode;
    }

    public Node addn(String label) {
        Node returningNode = new Node(label);
        listNodes.add(returningNode);
        return returningNode;
    }

    public void addE(Node node1, Node node2, int weight) {

        if (listNodes.contains(node1) && listNodes.contains(node2)) {
            Edge edge1 = new Edge(node2, weight);
            node1.listEdges.add(edge1);
            Edge edge2 = new Edge(node1, weight);
            node2.listEdges.add(edge2);
        } else throw new IllegalArgumentException("Not existing Node!");
    }


    public void addEdge(Node first, Node second, int weight){
        Edge firstEdge = new Edge(weight,second);
        Edge secondEdge = new Edge(weight,first);
        first.edges.add(firstEdge);
        second.edges.add(secondEdge);
    }

    public ArrayList<Node> getNodes(){
        return this.list;
    }

    public ArrayList<Edge> getNeighbors(Node node){
        return node.edges;
    }

    public int size(){
        return this.list.size();
    }

    public void addEdge(Node v1) {
    }




}