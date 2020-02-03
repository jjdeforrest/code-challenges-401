package Tree;

public class FizzNode {

    public String value;
    public FizzNode right;
    public FizzNode left;

    public FizzNode(String value, FizzNode left, FizzNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public FizzNode(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

}
