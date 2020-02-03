package Tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    static BinarySearchTree tree;




    @Before
    public void initial() {
        tree = new BinarySearchTree();
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(5);
        tree.insert(15);
        tree.insert(16);
    };

    @Test
    public void constructorTest(){
        Node root = new Node(1, new Node(2), new Node (3));
        BinaryTree tree = new BinaryTree(root);
        ArrayList<Integer> actual = new ArrayList<>();
        assertEquals(1, root.data);
        assertEquals(2, root.left.data);
        assertEquals(3, root.right.data);
    }

    @Test
    public void testPreOrder() {
        ArrayList<Integer> list = tree.preOrder(tree.root);
        assertEquals("[20, 10, 5, 15, 16, 30]", list.toString());
    }

    @Test
    public void testInOrder() {
        ArrayList<Integer> list = tree.inOrder(tree.root);
        assertEquals("[10, 5, 15, 16, 20, 30]", list.toString());
    }
    //
    @Test
    public void testPostOrder() {
        ArrayList<Integer> list = tree.postOrder(tree.root);
        assertEquals("[5, 16, 15, 10, 30, 20]", list.toString());
    }

    @Test
    public void testContains() {
        assertTrue(tree.contains(tree.root, 15));
        assertTrue(tree.contains(tree.root, 30));
        assertFalse(tree.contains(tree.root, 50));

    }

    @Test
    public void testInsert(){
        assertFalse(tree.contains(tree.root, 50));
        tree.insert(50);
        assertTrue(tree.contains(tree.root, 50));

    }


    @Test
    public void breathFirst() {
        assertEquals("[10, 5, 15, 16, 20, 30]", "[10, 5, 15, 16, 20, 30]");
    }



}