package code.challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    //
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
    //
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
    
    //
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


//lab07

    //test 1
    @Test(expected = IllegalArgumentException.class)
    public void KGreaterThanLength(){
        LinkedList linky = new LinkedList();
        linky.insert(5);
        linky.insert(5);
        linky.insert(5);
        linky.insert(5);
        linky.returnFromEnd(7);
    }

    // k is not a positive integer
    @Test(expected = IllegalArgumentException.class)
    public void KIsNotaPositiveInteger(){
        LinkedList linky = new LinkedList();
        linky.insert(5);
        linky.insert(5);
        linky.returnFromEnd(-1);
    }

    //test k and the length of the list are the same
    @Test
    public void kAndLengthAreSame(){
        LinkedList linky = new LinkedList();
        linky.insert(5);
        linky.insert(6);
        assertEquals("value of first node should be returned",6,linky.returnFromEnd(2));
    }


        //k linked list is the size of 1
    @Test
    public void kLinkListSizeOne(){
        LinkedList linky = new LinkedList();
        linky.insert(1);
        assertEquals("value of first node should be returned",1, linky.returnFromEnd(1));
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
        assertEquals("values should alternate",1,nodey.next.value);
        assertEquals("values should alternate",0,nodey.next.next.value);
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
        assertEquals("values should alternate",1,nodey.next.value);
        assertEquals("values should alternate",0,nodey.next.next.value);
    }


}