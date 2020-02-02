package Tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NodeTest {


    @Test
    public void constructorTest(){
        Tree.Node root = new Tree.Node(1, new Tree.Node(2), new Node(3));
        BinaryTree tree = new BinaryTree(root);
        ArrayList<Integer> actual = new ArrayList<>();
        assertEquals(1, root.data);
        assertEquals(2, root.left.data);
        assertEquals(3, root.right.data);
    }
}