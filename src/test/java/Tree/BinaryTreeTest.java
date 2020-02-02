package Tree;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNull;
//import com.sun.source.tree.BinaryTree;
//import javafx.scene.Node;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class BinaryTreeTest {
//    BinaryTree tree;
//
//    //    Can successfully instantiate a tree with a single root node
//    @Test
//    public void rootTest() {
//        //     1
//        //  10    3
//        Node root = new Node(1, new Node(10), new Node(3));
//
//        BinaryTree tree = new BinaryTree(root);
//
//        assertEquals(1, tree.root.value);
//        assertEquals(root, tree.root);
//    }
//
////    Can successfully add a left child and right child to a single root node
//
//    @Test
//    public void addChildTest() {
//        //             1
//        //       10            3
//        //    20   40      50
//        Node root = new Node(1, new Node(10), new Node(3));
//        Node node1 = new Node(20);
//        Node node2 = new Node(40);
//        Node node3 = new Node(50);
//
//        root.left.left = node1;
//        root.left.right = node2;
//        root.right.left = node3;
//        BinaryTree tree = new BinaryTree(root);
//
//        assertEquals(20, tree.root.left.left.value);
//        assertEquals(50, tree.root.right.left.value);
//
//    }
//
//    @Test
//    public void preOrder() {
//        Node root = new Node(1, new Node(10), new Node(3));
//        Node node1 = new Node(20);
//        Node node2 = new Node(40);
//        Node node3 = new Node(50);
//        //             1
//        //       10            3
//        //    20   40      50
//
//        root.left.left = node1;
//        root.left.right = node2;
//        root.right.left = node3;
//        BinaryTree tree = new BinaryTree(root);
//
//        Integer[] stuff = new  Integer[]{1, 10, 20, 40, 3, 50};
//        ArrayList<Integer> expected = new ArrayList<>();
//        expected.addAll(Arrays.asList(stuff));
//
//        assertEquals(expected, tree.preOrder());
//
//    }
//
//    @Test
//    public void inOrder() {
//        Node root = new Node(1, new Node(10), new Node(3));
//        Node node1 = new Node(20);
//        Node node2 = new Node(40);
//        //             1
//        //       10            3
//        //    20   40
//
//        root.left.left = node1;
//        root.left.right = node2;
//        BinaryTree tree = new BinaryTree(root);
//
//        Integer[] stuff = new  Integer[]{20,10,40,1,3};
//        ArrayList<Integer> expected = new ArrayList<>();
//        expected.addAll(Arrays.asList(stuff));
//
//        assertEquals(expected, tree.inOrder());
////        System.out.println(tree.inOrder().toString());
//    }
//
//    @Test
//    public void postOrder() {
//
//
//        Node root = new Node(1, new Node(10), new Node(3));
//        Node node1 = new Node(20);
//        Node node2 = new Node(40);
//        Node node3 = new Node(50);
//        //             1
//        //       10            3
//        //    20   40      50
//
//        root.left.left = node1;
//        root.left.right = node2;
//        root.right.left = node3;
//        BinaryTree tree = new BinaryTree(root);
//
//        Integer[] stuff = new  Integer[]{20, 40, 10, 50, 3, 1};
//        ArrayList<Integer> expected = new ArrayList<>();
//        expected.addAll(Arrays.asList(stuff));
//        assertEquals(expected, tree.postOrder());
////                System.out.println(tree.postOrder().toString());
//    }
//}
////
//}