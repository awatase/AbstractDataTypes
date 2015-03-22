package com.gmail.awatase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by austin on 21/03/15.
 */
public class Stack {
    private List<Object> list;

    Stack() {
        list = new ArrayList<Object>();
        System.out.println("New stack instantiated");
    }

    Stack(List<Object> l) {
        list = l;
        System.out.println("The stack " + l.toString() + " was copied");
    }

    public void push(Object obj) {
        list.add(0, obj);
        System.out.println(obj.toString() + " pushed " + list.toString());
    }

    public Object pop() {
        Object obj = null;
        if (list.size() > 0) {
            obj = list.get(0);
            list.remove(0);
            System.out.println(obj.toString() + " popped " + list.toString());
        } else {
            System.out.println("No element to pop in the stack");
        }
        return obj;
    }

    public Object peek() {
        Object obj = null;
        if (list.size() > 0) {
            obj = list.get(0);
            System.out.println(obj.toString() + " peeked");
        }
        else {
            System.out.println("No element to peek in the stack");
        }
        return obj;
    }

    public boolean empty() {
        if (list.size() == 0) {
            System.out.println("The stack has no element");
            return true;
        }
        else {
            System.out.println("The stack has at least 1 element");
            return false;
        }
    }

    public int search(Object search) {
        if (empty()) {
            return -1;
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(search)) {
                    System.out.println(search.toString() + " found at index: " + i);
                    return i;
                }
            }
            System.out.println(search.toString() + "was not found in the stack");
            return -1;
        }
    }
}