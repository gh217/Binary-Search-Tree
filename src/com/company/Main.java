/*
    Mohamed Ghanem
    Using Genric
    Binary Search Tree BST
 */

package com.company;

public class Main {

    public static void main(String[] args) {

       Tree<Integer> tre = new BinarySearchTree();
       tre.add(12);
        tre.add(11);
        tre.add(11);
        tre.add(78);
        tre.add(19);
        tre.print();
        System.out.println( tre.search(19));

        Tree<User> obj=new BinarySearchTree<>();

        obj.add(new User("mo",1));
        obj.add(new User("mo",1));

        obj.add(new User("mo12",12));
        obj.add(new User("a",5));


        obj.print();

        System.out.println( obj.search(new User("op",1)));


    }
}
