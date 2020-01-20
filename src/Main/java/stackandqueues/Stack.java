package stackandqueues;

import code.challenges.linkedList.Node;

public class Stack {

    code.challenges.linkedList.Node head;


    public static void main (String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
    }


    public void insert(int value) {

        code.challenges.linkedList.Node newNode = new Node(value);
        //newNode.value = value;
        newNode.next = head;
        head = newNode;

    }

    public void pop() {
        pop();
    }

    public void peek(){
        peek();
    }

    public boolean isEmpty(){
        Node n = head;
        while(n.next != null){
            return true;
        }
    }




}
