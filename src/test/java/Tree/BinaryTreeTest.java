package Tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {


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
}