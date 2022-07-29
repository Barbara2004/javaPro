package lesson07;

import java.util.List;

public interface TreeIterator <E> extends Iterable {
    boolean add (E e);
    int size();
    List<E> get();
    MyTreeSet.Node find (E e);

}
