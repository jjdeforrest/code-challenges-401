
package stackandqueues;

import code.challenges.linkedList.Node;

import java.util.EmptyStackException;

public class Stack {

    Node top;

    public void push(int value) {
        Node newer = new Node(value);
        newer.next = top;
        top = newer;
    }

    public int pop() {
        if (this.top == null) {
            throw new EmptyStackException();
        };
        Node position = top;
        top = position.next;
        position.next = null;
        return position.value;
    }

    public int peek() {
        if (this.top == null) {
            throw new EmptyStackException();
        }
        return this.top.value;
    }

    public boolean isEmpty() {

        return this.top == null;
    }
}
