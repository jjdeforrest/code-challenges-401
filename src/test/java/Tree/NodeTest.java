//package Tree;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNull;
//
//import javafx.scene.Node;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class NodeTest {
//
//
//    Node<Integer> newNode;
//
//    @Before
//    public void preTestBuild() {
//        newNode = new Node<>(5);
//    }
//
//    @Test
//    public void testNodeInstance() {
//        Integer correct = 5;
//        assertEquals("should return correct newNode left", correct, newNode.data);
//        assertNull("should return correct newNode left", newNode.left);
//        assertNull("should return correct newNode right", newNode.right);
//    }
//
//}