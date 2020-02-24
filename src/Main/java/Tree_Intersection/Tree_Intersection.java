package Tree_Intersection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class Tree_Intersection {


    public static ArrayList<Integer> tree_Intersection(Tree one, Tree two) {
        ArrayList<Integer> val = new ArrayList<>();
        HashSet<Integer> seenNumbers = new HashSet<>();
        Stack<Node> nodes = new Stack<>();
        nodes.add(one.root);
        while (!nodes.empty()) {
            Node temp = nodes.pop();
            seenNumbers.add(temp.value);
            if (temp.left != null) {
                nodes.add(temp.left);
            }
            if (temp.right != null) {
                nodes.add(temp.right);
            }
        }
        nodes.add(two.root);
        while (!nodes.empty()) {
            Node temp = nodes.pop();
            if (seenNumbers.contains(temp.value)) {
                val.add(temp.value);
            }
            if (temp.left != null) {
                nodes.add(temp.left);
            }
            if (temp.right != null) {
                nodes.add(temp.right);
            }
        }
        return val;
    }

    static class Tree {
        Node root;
    }

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}
