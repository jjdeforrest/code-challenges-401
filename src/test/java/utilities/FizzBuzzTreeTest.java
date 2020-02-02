//package utilities;
//
//import Tree.BinarySearchTree;
//import Tree.Node;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNull;
//
//public class FizzBuzzTreeTest {
//
//
//    static BinarySearchTree<String> tree;
//    static BinarySearchTree<String> fizzBuzzTree;
//    @Before
//    public void initial(){
//        tree = new BinarySearchTree<>();
//
//        tree.root = new Node<>("5");
//        tree.root.left = new Node<>("20");
//        tree.root.left.left = new Node<>("15");
//        tree.root.right = new Node<>("11");
//        tree.root.right.right = new Node<>("3");
//        tree.root.right.right.right = new Node<>("12");
//
//        fizzBuzzTree = FizzBuzzTree.fizzBuzzTree(tree);
//    }
//
//    @Test
//    public void testReplaceFizzBuzz(){
//        assertEquals("buzz",fizzBuzzTree.root.data);
//        assertEquals("buzz",fizzBuzzTree.root.left.data);
//        assertEquals("fizzBuzz",fizzBuzzTree.root.left.left.data);
//        assertEquals("11",fizzBuzzTree.root.right.data);
//        assertEquals("fizz",fizzBuzzTree.root.right.right.data);
//        assertEquals("fizz",fizzBuzzTree.root.right.right.right.data);
//    }
//
//    @Test
//    public void testEmptyTree(){
//        BinarySearchTree<String> emptyTree = new BinarySearchTree<>();
//        assertNull(emptyTree.root);
//    }
//
//
//}