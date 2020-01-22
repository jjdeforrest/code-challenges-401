package stackandqueues;

public class PseudoQueue {

    Stack front = new Stack();
    Stack back = new Stack();

    public void enqueue(int position) {
        if (!front.isEmpty()){
            back.push(front.pop());
        }
        front.push(position);

        if (!back.isEmpty()){
            front.push(back.pop());
        }
    }


    public int dequeue(){
        return front.pop();
    }


}
