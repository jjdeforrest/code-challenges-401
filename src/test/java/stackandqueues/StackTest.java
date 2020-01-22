package stackandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {


    //1. push on stack 2.push multiple values onto a stack
    @Test public void testPush() {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        assertEquals("should return value of top node", 3, s.top.value);
    }
    //3. push off a stack
    @Test public void testPop() {
        Stack first = new Stack();
        first.push(5);
        first.push(4);
        first.push(3);
        first.push(2);
        first.push(1);
        first.pop();
        first.pop();
        assertEquals("should return value of popped node", 3, first.pop());
        assertEquals("should return value of new top node", 4, first.top.value);
    }

    //4.empty stack after multiple pops
    @Test public void testEmpty() {
        Stack first = new Stack();
        first.push(1);
        assertEquals("return top value", 1, first.peek());

        first.pop();
        assertTrue("return true after pop executed", first.isEmpty());
    }

    //5.peek next item on stack
    @Test public void testPeek() {
        Stack first = new Stack();
        Stack second = new Stack();

        first.push(1);
        second.push(2);

        assertEquals("return correct stack", 1, first.peek());

    }

    //6. instantiate an empty stack
    @Test
    public void testInstance() {
        Stack first = new Stack();
        assertEquals("return top equal to none", null, first.top);
    }


}