
package stackandqueues;

import java.util.EmptyStackException;


public class Queue {

    public Node front;

    public Queue() {};

    public void enqueue(int value) {
        Node newer = new Node(value);
        if (this.front == null) {
            front = newer;
        } else {
            Node position = front;
            while (position.next != null) {
                position = position.next;
            }
            position.next = newer;
        }
    }

    public int dequeue() {
        if (this.front == null) {
            throw new EmptyStackException();
        } else {
            Node position = front;
            front = position.next;
            position.next = null;
            return position.value;
        }
    }

    public int peek() {
        if (this.front == null) {
            throw new EmptyStackException();
        };
        return this.front.value;
    }

    public boolean isEmpty() {
        return this.front == null;
    }
}
