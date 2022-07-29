package lesson07;

import java.util.Iterator;
import java.util.List;

public class MyTreeSet<E> implements TreeIterator<E> {
    //I create two fields
    private int size;
    private final Node<E> root;

    //constructor
    public MyTreeSet() {
        root = new Node<>(null);
    }

    public boolean add(Object e) {
        //If the tree is empty I make the resulting element the root
        if (size == 0) {
            return addRoot((E) e);
        }
        //If the tree is not empty I create new object of type Node. I also create lastNode.
        Node<E> newNode = new Node<>((E) e);
        Node<E> lastNode = findLastNode(root, newNode);
        size++;
        newNode.parent = lastNode;

        if (lastNode.compareTo(newNode) < 0) {
            lastNode.right = newNode;
            return true;
        } else {
            lastNode.left = newNode;
            return true;
        }
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public List<E> get() {
        return null;
    }

    @Override
    public Node find(E e) {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    static class Node<E> implements Comparable {
        private Node<E> right;
        private Node<E> left;
        private Node<E> parent;
        private E element;

        public Node(E element) {
            this.element = element;
        }

        public E getElement() {
            return element;
        }

        //This method compare two objects
        @Override
        public int compareTo(Object o) {
            Node<E> node = (Node<E>) o;
            return this.hashCode() - node.hashCode();
        }

        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + element.hashCode();
            return result;
        }

    }

    //This method is used to add the root if the tree is empty
    private boolean addRoot(E e) {
        root.element = e;
        size++;
        return true;
    }

    private Node<E> findLastNode(final Node<E> oldNode, final Node<E> newNode) {
        Node<E> lastNode = oldNode;
        int compare = oldNode.compareTo(newNode);
        if (compare < 0 && oldNode.right != null) {
            lastNode = findLastNode(oldNode.right, newNode);
            return lastNode;
        }
        if (compare > 0 && oldNode.left != null) {
            lastNode = findLastNode(oldNode.left, newNode);
            return lastNode;
        }
        if (compare == 0) {
            return null;
        }
        return lastNode;
    }
}
