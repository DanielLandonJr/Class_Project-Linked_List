package app;

public class Node<T> {

    Node<T> next;

    T element;

    public Node(T element) {
        this.element = element;
    }

}