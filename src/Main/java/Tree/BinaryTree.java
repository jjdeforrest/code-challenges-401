package Tree;

public class BinaryTree {

    public Node root;

    public BinaryTree(Node root){
        this.root = root;
    }

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