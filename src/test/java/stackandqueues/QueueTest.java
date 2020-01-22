package stackandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    // 7.enqueue into a queue 8. enqueue multiple values into a queueu
    @Test public void testEnqueue() {
        Queue first = new Queue();
        first.enqueue(1);
        first.enqueue(2);

        assertEquals("return front node null", 1, first.front.value);
    }
    // 9. dequeue out of queue
    @Test public void testDequeue() {
        Queue first = new Queue();
        first.enqueue(1);
        first.enqueue(2);
        first.dequeue();
        assertEquals("return dequeue value", 2, first.dequeue());
    }
    //10.peek into queue
    @Test public void testPeek() {
        Queue first = new Queue();
        first.enqueue(1);
        first.enqueue(2);
        assertEquals("return current value first node", 1, first.peek());
    }
    //11.empty queue
    @Test public void testEmpty() {
        Queue first = new Queue();
        first.enqueue(1);
        assertFalse("return false when queue is not empty", first.isEmpty());
        first.dequeue();
        assertTrue("should return true when queue is empty", first.isEmpty());
    }

    //12. instantiate an empty queue
    @Test
    public void testInstance() {
        Queue first = new Queue();
        assertEquals("return front node of null", null, first.front);
    }


}