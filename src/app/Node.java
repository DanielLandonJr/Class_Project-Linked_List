package app;

public class Node<T> {

    Node<T> next;

    T element;

    static int counter = 0;

    public Node(T element) {
        this.element = element;
    }

}