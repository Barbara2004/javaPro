package lesson02;
import java.util.*;

public class MyArrayList<E> implements List<E> {

    private Object[] array = new Object[10];
    private int size = 0;

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
        for (int i = 0; i < size; i++) {
            if (o == null & array[i] == null) {
                return true;
            }
            if (array[i] == null || o == null) {
                continue;
            }
            if (o.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] array4 = new Object[size];
        for (int i = 0; i < size; i++) {
            array4[i] = array[i];
        }
        return array4;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (size == array.length) {
            grow();
        }
        array[size] = e;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int foundIndex = 0;
        for (int index = 0; index < size - 1; index++) {
            if (o.equals(array[index])) {
                array[index] = null;
                foundIndex = index;
            }
        }
        for (int i = foundIndex + 1; i < size; i++) {
            array[i - 1] = array[i];
            array[i] = null;
        }
        size--;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
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
        array = new Object[10];
        size = 0;
    }

    @Override
    public E get(int index) {
        return (E) array[index];
    }

    @Override
    public E set(int index, E element) {
        if (index <= size & index > 0) {
            array[index] = element;
            return element;
        }
        return null;
    }

    @Override
    public void add(int index, E element) {
        if (size == array.length) {
            grow();
        }
        if (index > size) {
            System.out.println("It is forbidden");
        }
        Object[] array3 = new Object[array.length + 1];
        for (int i = 0; i < index; i++) {
            array3[i] = array[i];
        }
        array3[index] = element;
        for (int i = index + 1; i < array3.length; i++) {
            array3[i] = array[i - 1];
        }
        array = array3;
        size++;
    }

    @Override
    public E remove(int index) {
        int foundIndex = 0;
        for (int j = 0; j < size - 1; j++) {
            if (j == index) {
                array[index] = null;
                foundIndex = index;
            }
        }
        for (int i = foundIndex + 1; i < size; i++) {
            array[i - 1] = array[i];
            array[i] = null;
        }
        size--;
        return (E) array[index];
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
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        MyArrayList<E> list = new MyArrayList();
        for (int i = fromIndex; i <= toIndex; i++) {
            list.add((E) array[i]);
        }
        return list;
    }

    private boolean grow() {
        Object[] array2 = new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;
        return true;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

