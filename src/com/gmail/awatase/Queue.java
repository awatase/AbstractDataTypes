package com.gmail.awatase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by austin on 21/03/15.
 */
public class Queue {
    private List<Object> list;

    Queue() {
        list = new ArrayList<Object>();
        System.out.println("New queue instantiated");
    }

    public void enqueue (Object obj) {
        list.add(obj); // add the object at the end of the list
        System.out.println(obj.toString() + " was enqueued " + list.toString());
    }

    public Object dequeue () {
        Object obj = null;
        if (list.size() > 0) {
            obj = list.get(0);
            list.remove(0);
            System.out.println(obj.toString() + " was dequeued " + list.toString());
        } else {
            System.out.println("No element to pop in the queue");
        }
        return obj;
    }

    public boolean empty() {
        if (list.size() == 0) {
            System.out.println("The queue has no element");
            return true;
        }
        else {
            System.out.println("The queue has at least 1 element");
            return false;
        }
    }

    public int search(Object search) {
        for (int i=0; i < list.size(); i++) {
            if (list.get(i).equals(search)) {
                System.out.println(search.toString() + " found at index: " + i);
                return i;
            }
        }
        System.out.println(search.toString() + " was not found in the queue");
        return -1;
    }
}
