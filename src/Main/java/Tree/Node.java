package Tree;

public class Node<T> {

    public Node<T> root;


    public Node() {
        this.root = null;
    }


    public int data;
    public Node<T> left;
    public Node<T> right;

    // constructor
    public Node(int value){
        this.data = value;
        this.left = null;
        this.right = null;
    }

    // method overloading
    public Node(int value, Node leftNode, Node rightNode){
        this.data = value;
        this.left = leftNode;
        this.right = rightNode;
    }


    @Override
    public String toString() {
        return "Node{" + "data=" + data + '}';
    }

    public int getData() {
        return data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}
