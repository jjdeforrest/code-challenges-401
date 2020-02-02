//package utilities;
//
//import Tree.BinarySearchTree;
//import Tree.Node;
//
//
//import java.util.ArrayList;
//
//public class FizzBuzzTree extends BinarySearchTree {
//
//    public FizzBuzzTree(Node<T> root) {
//        super(root);
//    }
//
//    // create a helper method
//    public void process(Node<T> node){
//        int num = Integer.parseInt(node.data);
//        if(num % 15 == 0 ){
//            node.data = "FizzBuzz";
//        }
//        else if (num % 3 == 0){
//            node.data = "Fizz";
//        }
//        else if (num % 5 == 0){
//            node.data = "Buzz";
//        }
//    }
//
//    public void fizzBuzzTree() {
//        fizzBuzzTree(this.root);
//    }
//
//    private void fizzBuzzTree(Node<String> node) {
//        if (node ==  null){
//            return;
//        }
//        process(node);
//        fizzBuzzTree(node.left);
//        fizzBuzzTree(node.right);
//    }
//
//}