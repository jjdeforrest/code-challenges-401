package Tree;


import java.util.ArrayList;

public class BinarySearchTree {

    public Node root;

    public BinarySearchTree(Node root){
        this.root = root;
    }

    // method overloading
    public BinarySearchTree(){
        this.root = null;
    }


    ArrayList list = new ArrayList<>();



    public ArrayList preOrder(Node node) {
        if(node != null) {
            list.add(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }

        return list;
    }

    public ArrayList inOrder(Node node) {
        if(node != null) {
            preOrder(node.left);
            list.add(node.data);
            preOrder(node.right);
        }
        return list;
    }

    public ArrayList postOrder(Node node) {
        if(node != null) {
            postOrder(node.left);
            postOrder(node.right);
            list.add(node.data);
        }
        return list;
    }


    public boolean contains(Node root, int value){
        if (root == null){
            return false;
        }
        if (root.data == value){
            return true;
        }
        if(root.data >= value){
            return contains(root.left, value);
        }
        return contains(root.right, value);
    }


    //runs recursive insert
    public void insert(int value){

        this.root = add(this.root, value);
    }


    public Node add(Node root, int value){
        // if the tree is empty return the new value
        if (root == null){
            // this case solves insert being called on an empty tree
            root = new Node(value);
            return root;
        }
        else if(value < root.data){
            root.left = add(root.left, value);
        }
        else if (value > root.data){
            root.right = add(root.right, value);
        }
        return root;
    }


}
