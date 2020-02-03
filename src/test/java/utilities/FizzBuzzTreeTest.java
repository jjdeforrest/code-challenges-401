package utilities;


import Tree.BinarySearchTree;
import Tree.FizzNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FizzBuzzTreeTest {

    @Test
    public void fizzBuzzTree() {
        FizzNode root = new FizzNode("5", new FizzNode("15"), new FizzNode("3"));
        FizzNode node1 = new FizzNode("20");
        FizzNode node2 = new FizzNode("40");
        FizzNode node3 = new FizzNode("50");
        FizzNode node4 = new FizzNode("7");
        root.left.left = node1;
        root.left.right = node2;
        root.right.left = node3;
        root.right.right = node4;
        FizzBuzzTree fizz = new FizzBuzzTree(root) ;
        fizz.runFizzBuzz();
        assertEquals("Buzz", root.value);
        assertEquals("FizzBuzz", root.left.value);
        assertEquals("Fizz", root.right.value);
    }


    @Test
    public void testEmptyTree(){
        BinarySearchTree emptyTree = new BinarySearchTree();
        assertNull(emptyTree.root);
    }


}

