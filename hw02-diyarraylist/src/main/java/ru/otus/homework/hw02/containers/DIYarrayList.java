package ru.otus.homework.hw02.containers;

import java.util.*;
import java.util.function.UnaryOperator;

public class DIYarrayList<T> implements List<T>{

    private Object[] myList;
    private int size = 0;

    public DIYarrayList(){
        myList = new Object[1];
    }

    @Override
    public String toString() {
        return Arrays.toString(myList);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(Object o) {
        if (myList.length == size)
            increaseList();

        myList[size] = o;
        size++;
        return true;
    }

    private void increaseList() {
        int i = myList.length + 5;
        myList = Arrays.copyOf(myList, i);
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection c) {
        while ((c.size() + size) > myList.length)
            increaseList();

        for (Object o : c)
        {
            myList[size] = o;
            size++;
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceAll(UnaryOperator operator) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sort(Comparator c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public T get(int index) {
        if (index >= size){
            throw new IndexOutOfBoundsException();
        }

        Object t = myList[index];
        return (T) t;
    }

    @Override
    public T set(int index, Object element) {
        Object t = myList[index];
        myList[index] = element;
        return (T) t;
    }

    @Override
    public void add(int index, Object element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Spliterator spliterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException();
    }
}