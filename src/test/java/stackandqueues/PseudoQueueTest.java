package stackandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {


    @Test
    public void TestEnqueue() {
        PseudoQueue first = new PseudoQueue();
        first.enqueue(5);
        first.enqueue(7);
        int position = first.dequeue();
        assertEquals("follow first in first out",5,position);
    }
    @Test
    public void TestEnqueue2(){
        PseudoQueue first = new PseudoQueue();
        first.enqueue(2);
        first.enqueue(1);

        assertEquals("follow first in first out",2,first.dequeue());
    }

    @Test
    public void TestDequeue() {
        PseudoQueue first = new PseudoQueue();
        first.enqueue(4);
        assertEquals("return value in Queue",4,first.dequeue());
    }



}