package com.company;

public interface Tree<T extends Comparable> {

    public  boolean add(T value);
    public void print();
    public boolean search(T value);
}
