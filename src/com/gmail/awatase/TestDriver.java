package com.gmail.awatase;

public class TestDriver {

    public static void main(String[] args) {
        new TestDriver().testQueue();
        new TestDriver().testStack();
    }

    private void testStack () {
        System.out.println("*** testing Stack");
        Stack s = new Stack();
        s.push("a");
        s.push("b");
        s.push("c");
        s.search("a");
        s.pop();
        s.peek();
        s.pop();
        s.pop();
        s.empty();
    }

    private void testQueue () {
        System.out.println("*** testing Queue");
        Queue q = new Queue();
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");
        q.dequeue();
        q.search("a");
        q.dequeue();
        q.empty();
        q.dequeue();
        q.empty();
    }
}
