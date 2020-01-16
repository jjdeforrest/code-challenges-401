package code.challenges.linkedList;


import java.util.StringJoiner;

public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int value) {
        Node node = new Node(value, head);
        this.head = node;
    }

    public boolean includes(int value) {

        Node search = this.head;
        while (search != null) {
            if (search.value == value)
                return true;
            search = search.next;
        }
        return false;
    }

    public String toString() {
        Node currentNode = this.head;
        StringJoiner position = new StringJoiner(", ");
        while (currentNode != null) {
            position.add(Integer.toString(currentNode.value));
            currentNode = currentNode.next;
        }
        return position.toString();
    }

    public void append(int value) {
        Node freshNode = new Node(value, null);

        if (head == null) {
            head = new Node(value, null);
            return;
        }
        freshNode.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = freshNode;
    }

    public void insertBefore(int value, int newValue) {
        if (this.head.value == value) {
            this.insert(newValue);
            return;
        } else if (!this.includes(value)) {
            return;
        }

        Node present = this.head;
        while (present != null) {
            if (present.next.value == value) {
                Node newNode = new Node(newValue, null);
                newNode.next = present.next;
                present.next = newNode;
                break;
            }
            present = present.next;
        }
    }

    public void insertAfter(int value, int newValue) {
        if (!this.includes(value)) {
            return;
        }

        Node present = this.head;
        while (present != null) {
            if (present.value == value) {
                Node newNode = new Node(newValue, null);
                newNode.next = present.next;
                present.next = newNode;
                break;
            }
            present = present.next;
        }
    }


    public int kthFromEnd(int k) {
        int counter = 0;
        Node position = this.head;
        while (position != null){
            counter++;
            position = position.next;
        }
        if(k > counter){
            throw new NullPointerException("Inputted value is to big");
        }
        for(int i = 1; i < (counter - k); i++){
            this.head = this.head.next;
        }
        return this.head.value;
    }




}




