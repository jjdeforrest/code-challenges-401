package utilities;


import Tree.BinaryTree;
import Tree.FizzNode;

public class FizzBuzzTree extends BinaryTree {
    
    public FizzBuzzTree(FizzNode fizzNode) {
        super(fizzNode);
    }

    private static void fizzBuzz(FizzNode node) {
        if (Integer.parseInt(node.value) % 3 == 0 && Integer.parseInt(node.value) % 5 == 0) {
            node.value = "FizzBuzz";
        } else if (Integer.parseInt(node.value) % 3 == 0) {
            node.value = "Fizz";
        } else if (Integer.parseInt(node.value) % 5 == 0) {
            node.value = "Buzz";
        }
    }

    public void runFizzBuzz() {
        runFizzBuzz(this.fizzNode);
    }

    private void runFizzBuzz(FizzNode current) {

        if (current == null) {
            return;
        }
        fizzBuzz(current);
        runFizzBuzz(current.left);
        runFizzBuzz(current.right);
    }
}