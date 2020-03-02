package graph;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GraphTest {

    Graph graph;

    @Before
    public void startGraph(){
        graph = new Graph();
    }

    //Node can be successfully added to the graph
    @Test
    public void testAddNode(){
        graph.addNode(3);
        assertEquals(1,graph.size());
        assertEquals(3,graph.list.get(0).value);
    }

    //An edge can be successfully added to the graph
    @Test
    public void testAddEdge(){
        graph.addEdge(graph.addNode(9),graph.addNode(2),4);
        assertEquals(graph.list.get(0).edges.get(0).node,graph.list.get(1));

    }

    //A collection of all nodes can be properly retrieved from the graph
    @Test
    public void testGetNodes(){
        graph.addNode(9);
        graph.addNode(7);
        graph.addNode(3);
        graph.addNode(1);
        graph.addNode(1);
        graph.addNode(5);
        graph.addNode(2);
        graph.addNode(6);
        ArrayList<Node> joker = graph.getNodes();
        assertEquals(joker.get(0).value,9);
        assertEquals(joker.get(1).value,7);
        assertEquals(joker.get(2).value,3);
        assertEquals(joker.get(3).value,1);
        assertEquals(joker.get(4).value,1);
        assertEquals(joker.get(5).value,5);
        assertEquals(joker.get(6).value,2);
        assertEquals(joker.get(7).value,6);
    }

    //All appropriate neighbors can be retrieved from the graph
    @Test
    public void testGetNeighbors(){
        Node joker = graph.addNode(13);
        graph.addEdge(joker,graph.addNode(7),99);
        graph.addEdge(joker,graph.addNode(13),13);
        ArrayList<Edge> bane = graph.getNeighbors(joker);
        assertEquals(bane.get(0).node.value,7);
        assertEquals(bane.get(1).node.value,13);
    }

    //Neighbors are returned with the weight between nodes included
    @Test
    public void testGetNeighborsWeight(){
        Node joker = graph.addNode(9);
        graph.addEdge(joker,graph.addNode(3),13);
        graph.addEdge(joker,graph.addNode(2),7);
        ArrayList<Edge> bane = graph.getNeighbors(joker);
        assertEquals(bane.get(0).data,13);
        assertEquals(bane.get(1).data,7);
    }

    //The proper size is returned, representing the number of nodes in the graph
    @Test
    public void testSize(){
        graph.addNode(3);
        graph.addNode(13);
        graph.addNode(7);
        assertEquals(3,graph.size());
    }

}