package code.challenges.linkedList;


import java.util.*;

public class LinkedList {

    Node head;

    public void insert(int value) {

        Node newNode = new Node(value);
        //newNode.value = value;
        newNode.next = head;
        head = newNode;

    }

    public String showString() {
        Node n = head;
        String result = "";
        while (n.next != null) {
            String fruit = String.format("{ %d } -> ", n.value);
            result += fruit;
            n = n.next;
        }
        String orange = String.format("{ %d } -> NULL", n.value);
        result += orange;
        System.out.println(result);
        return result;
    }
    public boolean includes ( int value){
        Node n = head;
        while (n.next != null) {
            if (n.value == value) {
                return true;
            }
            n = n.next;
        }
        if (n.value == value) {
            return true;
        }
        return false;
    }
    public void append ( int value){
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        Node newNode = new Node(value);
        n.next = newNode;
        //newNode.value = value;
    }
    public void insertBefore ( int value, int newValue){
        Node n = head;
        Node next = n.next;
        while (n.next != null) {
            if (n.value == value || next.value == value) {
                break;
            }
            n = n.next;
        }
        if (next.value == value) {
            Node newNode = new Node(newValue);
            newNode.next = next;
            n.next = newNode;
            //newNode.value = newValue;
        } else if (n.value == value && n.next != null) {
            Node newNode = new Node(newValue);
            //newNode.value = newValue;
            newNode.next = head;
            head = newNode;
        } else {
            System.out.println("Value not found in linked list");
        }
    }
    public void insertAfter ( int value, int newValue){
        Node n = head;
        Node next = n.next;
        while (n.next != null || n.value == value) {
            if (n.value == value) {
                Node newNode = new Node(newValue);
                //newNode.value = newValue;
                n.next = newNode;
                newNode.next = next;
                break;
            }
            n = n.next;
            next = n.next;
        }
    }



    //code challenge 07
    public int returnFromEnd ( int k){
        if (k < 0) {
            throw new IllegalArgumentException();
        }
        int counter = 0;
        Node n = this.head;
        while (n.next != null) {
            n = n.next;
            counter++;
        }
        if (k - 1 > counter) {
            throw new IllegalArgumentException();
        }
        n = this.head;
        for (int i = 0; i < counter - k; i++) {
            n = n.next;
        }
        return n.value;
    }


    //code challenge 08
    public static LinkedList mergeList(LinkedList list1, LinkedList list2){
        Node current1 = list1.head;
        Node current2 = list2.head;
        Node zipper1;
        Node zipper2;
        while(current1 != null && current2 != null){

            zipper1 = current1.next;
            zipper2 = current2.next;

            current2.next = zipper1;
            current1.next = current2;

            // switching the pointers
            current1 = zipper1;
            current2 = zipper2;

        }
        list2.head = current2;
        return list1;
    }
}