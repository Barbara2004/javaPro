package lesson03;

import java.util.*;

public class MyLinkedList<Integer> implements List<Integer>, Deque<Integer> {

    private Node head;
    private Node tail;
    private int size;

    @Override
    public void addFirst(Integer integer) {
        Node node = new Node(integer);
        if (head == null) {
            node.next = null;
            node.prev = null;
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            node.prev = null;
            tail.next = null;
            node.element = integer;
        }
        head = node;
        size++;

    }

    @Override
    public void addLast(Integer integer) {
        Node node = new Node(integer);
        if (tail == null) {
            tail = node;
            head = node;
        } else {
            tail.next = node;
            node.prev = tail;
            node.next = null;
        }
        tail = node;
        size++;
    }

    @Override
    public boolean offerFirst(Integer integer) {
        return false;
    }

    @Override
    public boolean offerLast(Integer integer) {
        return false;
    }

    @Override
    public Integer removeFirst() {
        head = head.next;
        head.prev = null;
        size--;
        return head.element;
    }

    @Override
    public Integer removeLast() {
        tail = tail.prev;
        tail.next = null;
        size--;
        return tail.element;
    }

    @Override
    public Integer pollFirst() {
        return null;
    }

    @Override
    public Integer pollLast() {
        return null;
    }

    @Override
    public Integer getFirst() {
        return head.element;
    }

    @Override
    public Integer getLast() {
        return tail.element;
    }

    @Override
    public Integer peekFirst() {
        return null;
    }

    @Override
    public Integer peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean offer(Integer integer) {
        return false;
    }

    @Override
    public Integer remove() {
        return removeFirst();
    }

    @Override
    public Integer poll() {
        return null;
    }

    @Override
    public Integer element() {
        return getFirst();
    }

    @Override
    public Integer peek() {
        return null;
    }

    @Override
    public void push(Integer integer) {

    }

    @Override
    public Integer pop() {
        return removeFirst();
    }

    @Override
    public Iterator<Integer> descendingIterator() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (size == 0) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (get(i).equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer integer) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        if (size == 0) {
            return false;
        }
        Node prev = head;
        for (int k = 0; k < size - 1; k++) {
            if (get(k) == o) {
                prev.prev = prev;
            }
        }
        Node delete = prev.next, after = delete.next;
        prev.next = after;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
//        for (int i = 0; i < c.size(); i++) {
//            add(c.p);
//        }
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        head = null;
        tail = null;
    }

    @Override
    public Integer get(int index) {
        Node result = head;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.element;
    }

    @Override
    public Integer set(int index, Integer element) {
        return null;
    }

    @Override
    public void add(int index, Integer element) {
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        Node after = prev.next;
        Node node = new Node(element);
        node.next = after;
        prev.next = node;
    }

    @Override
    public Integer remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
    }

    private class Node {
        Integer element;
        Node next;
        Node prev;

        public Node(Integer element) {
            this.element = element;
        }
    }
}
