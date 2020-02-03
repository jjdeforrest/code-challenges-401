package Tree;

public class BinaryTree {

    public Node root;
    public FizzNode fizzNode;

    public BinaryTree(FizzNode strRoot) {
        this.fizzNode = strRoot;
        this.root= null;
    }

    public BinaryTree(Node root){
        this.root = root;
    }

    public void insert(int value){

        this.root = add(this.root, value);
    }


    public Node add(Node root, int value){
        if (root == null){
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