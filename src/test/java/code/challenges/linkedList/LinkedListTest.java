package code.challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void constructorTest() {
        LinkedList linky = new LinkedList();
        assertEquals("The head should be a null pointer", null, linky.head);
    }
    @Test
    public void insert() {
        LinkedList linky = new LinkedList();
        linky.insert(5);
        assertEquals("The value of the head node should be 5", 5, linky.head.value);
    }
    @Test
    public void testHeadPointsCorrectly() {
        LinkedList linky = new LinkedList();
        linky.insert(49);
        linky.insert(89);
        linky.insert(99);
        assertEquals("The value of the head node should be 99", 99, linky.head.value);
    }
    @Test
    public void multiEntryInsertTest() {
        LinkedList linky = new LinkedList();
        for (int i = 0; i < 100; i++) {
            linky.insert(i);
        }
        Node nodey = linky.head;
        int counter = 99;
        while (nodey.next != null && counter >= 0) {
            assertEquals("Nodey should equal counter", counter, nodey.value);
            counter--;
            nodey = nodey.next;
        }
    }
    @Test
    public void returnsTrueWhenIncludes() {
        LinkedList linky = new LinkedList();
        linky.insert(1);
        linky.insert(5);
        linky.insert(2);
        linky.insert(3);
        assertTrue("Will return true if linked list includes 5", linky.includes(5));
    }
    @Test
    public void returnsFalseWhenDoesntInclude() {
        LinkedList linky = new LinkedList();
        linky.insert(1);
        linky.insert(5);
        linky.insert(2);
        linky.insert(3);
        assertFalse("Will return false doesnt include 6", linky.includes(6));
    }
    @Test
    public void testShowString() {
        LinkedList linkyLink = new LinkedList();
        linkyLink.insert(5);
        linkyLink.insert(8);
        linkyLink.insert(12);
        linkyLink.insert(3);
        linkyLink.insert(26);
        String expected = "{ 26 } -> { 3 } -> { 12 } -> { 8 } -> { 5 } -> NULL";
        assertEquals("The string should be an accurate representation of the list", expected, linkyLink.showString());

    }
    @Test
    public void testAppendValue() {
        LinkedList linky = new LinkedList();
        linky.insert(5);
        linky.insert(8);
        linky.insert(12);
        linky.append(99);
        Node n = linky.head;
        while (n.next != null) {
            n = n.next;
        }
        assertEquals("Last node should equal 99", 99, n.value);
    }
    @Test
    public void testMultiInsertAtEnd(){
        LinkedList linky = new LinkedList();
        linky.insert(5);
        linky.insert(8);
        linky.insert(12);
        linky.append(99);
        linky.append(89);
        Node n = linky.head;
        Node next = n.next;
        while(next.next != null){
            n = n.next;
            next = n.next;
        }
        assertEquals("second to last value should be 99",99,n.value);
        assertEquals("last value should be 89",89,next.value);
    }
    @Test
    public void testInsertBefore() {
        LinkedList linky = new LinkedList();
        linky.insert(5);
        linky.insert(8);
        linky.insert(12);
        linky.insertBefore(8, 99);
        Node n = linky.head;
        Node next = n.next;
        while (n.next != null) {
            if (next.value == 8) {
                break;
            }
            n = n.next;
            next = n.next;
        }
        System.out.println(linky.showString());
        assertEquals("Value of node before value 8 should equal 99", 99, n.value);
    }
    @Test
    public void testInsertBeforeHead() {
        LinkedList linky = new LinkedList();
        linky.insert(5);
        linky.insert(8);
        linky.insert(12);
        linky.insertBefore(12, 99);
        Node n = linky.head;
        System.out.println(linky.showString());
        assertEquals("Head should be 99", 99, n.value);
    }
    @Test
    public void testInsertBeforeEndOfListExpectFail(){
        LinkedList linky = new LinkedList();
        linky.insert(5);
        linky.insert(8);
        linky.insert(12);
        linky.insertAfter(5, 99);
        Node n = linky.head;
        Node next = n.next;
        while (n.next != null) {
            if (n.value == 5) {
                break;
            }
            n = n.next;
            next = n.next;
        }
        assertEquals("Value after 5 should be 99", 99, next.value);
    }
    @Test
    public void testInsertAfter() {
        LinkedList linky = new LinkedList();
        linky.insert(5);
        linky.insert(8);
        linky.insert(12);
        linky.insertAfter(8, 99);
        Node n = linky.head;
        Node next = n.next;
        while (n.next != null) {
            if (n.value == 8) {
                break;
            }
            n = n.next;
            next = n.next;
        }
        System.out.println(linky.showString());
        assertEquals("Value after 8 should be 99", 99, next.value);
    }
    @Test
    public void testInsertAfterHead() {
        LinkedList linky = new LinkedList();
        linky.insert(5);
        linky.insert(8);
        linky.insert(12);
        linky.insertAfter(12, 99);
        Node n = linky.head.next;
        assertEquals("The second value should be 99",99,n.value);

    }
    @Test
    public void testInsertAtEndOfList(){
        LinkedList linky = new LinkedList();
        linky.insert(5);
        linky.insert(8);
        linky.insert(12);
        linky.insertAfter(5, 99);
        Node n = linky.head;
        while (n.next != null) {
            n = n.next;
        }
        assertEquals("The new value should insert at end of list",99,n.value);
    }
    @Test
    public void returnFromEndEnd(){
        LinkedList linky = new LinkedList();
        linky.insert(5);
        linky.insert(8);
        linky.insert(12);
        assertEquals("The last element in the array should be returned",5,linky.returnFromEnd(0));
    }
    @Test
    public void returnFromEndMiddle(){
        LinkedList linky = new LinkedList();
        linky.insert(5);
        linky.insert(8);
        linky.insert(12);
        assertEquals("The last element in the array should be returned",8,linky.returnFromEnd(1));
    }
    @Test
    public void returnFromListLengthOne(){
        LinkedList linky = new LinkedList();
        linky.insert(5);
        assertEquals("The last element in the array should be returned",5,linky.returnFromEnd(0));
    }



    @Test(expected = IllegalArgumentException.class)
    public void returnKGreaterThanLength(){
        LinkedList linky = new LinkedList();
        linky.insert(5);
        linky.insert(5);
        linky.insert(5);
        linky.insert(5);
        linky.returnFromEnd(7);
    }
    @Test(expected = IllegalArgumentException.class)
    public void returnKIsNegative(){
        LinkedList linky = new LinkedList();
        linky.insert(5);
        linky.insert(5);
        linky.returnFromEnd(-1);
    }
    @Test
    public void kAndLengthAreSame(){
        LinkedList linky = new LinkedList();
        linky.insert(5);
        linky.insert(6);
        assertEquals("The value of the first node should be returned",6,linky.returnFromEnd(2));
    }

    ///merge test code challenge 08
    @Test
    public void testMergeList(){
        LinkedList linky = new LinkedList();
        linky.insert(0);
        linky.insert(0);
        linky.insert(0);
        LinkedList linky2 = new LinkedList();
        linky2.insert(1);
        linky2.insert(1);
        linky2.insert(1);
        LinkedList.mergeList(linky,linky2);
        Node nodey = linky.head;
        assertEquals("The values should alternate",1,nodey.next.value);
        assertEquals("The values should alternate",0,nodey.next.next.value);
    }

    @Test
    public void testMerging(){
        LinkedList linky = new LinkedList();
        linky.insert(0);
        linky.insert(0);
        linky.insert(0);
        linky.insert(0);
        linky.insert(0);
        LinkedList linky2 = new LinkedList();
        linky2.insert(1);
        linky2.insert(1);
        linky2.insert(1);

        LinkedList.mergeList(linky,linky2);
        Node nodey = linky.head;
        assertEquals("The values should alternate",1,nodey.next.value);
        assertEquals("The values should alternate",0,nodey.next.next.value);
    }


}