package org.example.stacks;

public interface Stack<E> {

    boolean empty();
    E peak();
    E pop();
    void push(E element);
    int search(E item);

}
