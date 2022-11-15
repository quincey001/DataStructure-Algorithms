package advanced_java;

import java.util.*;

public class ImmutableList<E> implements List<E> {
    public static <T> ImmutableList<T> of(T... data){
        return new ImmutableList<>(data);
    }
    private static final RuntimeException ILLEGAL_ACCESS = new RuntimeException("Object Immutable");

    private  final List<E> data;

    public ImmutableList(E... data) {//...（varargs == variable number of arguments） Pass in parameters of variable length
        this.data = Arrays.asList(data);
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return data.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return data.iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return data.toArray(a);
    }

    @Override
    public boolean add(E e) {
        throw ILLEGAL_ACCESS;
    }

    @Override
    public boolean remove(Object o) {
        throw ILLEGAL_ACCESS;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return data.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw ILLEGAL_ACCESS;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw ILLEGAL_ACCESS;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw ILLEGAL_ACCESS;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw ILLEGAL_ACCESS;
    }

    @Override
    public void clear() {
        throw ILLEGAL_ACCESS;
    }

    @Override
    public E get(int index) {
        return data.get(index);
    }

    @Override
    public E set(int index, E element) {
        throw ILLEGAL_ACCESS;
    }

    @Override
    public void add(int index, E element) {
        throw ILLEGAL_ACCESS;
    }

    @Override
    public E remove(int index) {
        throw ILLEGAL_ACCESS;
    }

    @Override
    public int indexOf(Object o) {
        return data.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return data.lastIndexOf(o);
    }

    @Override
    public ListIterator<E> listIterator() {
        return data.listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return data.listIterator(index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw ILLEGAL_ACCESS;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
