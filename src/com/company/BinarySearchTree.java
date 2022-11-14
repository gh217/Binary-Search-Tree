package com.company;


public class BinarySearchTree<T extends Comparable> implements Tree<T>  {

    private Node<T> root=null;

    @Override
    public boolean add(T value) {
        if(root==null){
             root =new Node(value);
            return true;
        }
        return  addValueIterative(value,root);
    }

    private boolean addvalue(T value, Node node){


        if(value.compareTo(node.value)<0){
            if(node.left==null){
                node.left=new Node(value);
                return true;
            }
            return addvalue(value,node.left);
        }

        if(value.compareTo(node.value)>0){
            if(node.right==null){
                node.right=new Node(value);
                return true;
            }
            return addvalue(value,node.right);
        }
        return false;
    }

    private boolean addValueIterative(T value, Node node){
        while (node!=null){

            if(value.compareTo(node.value)==0)return false;

            if(value.compareTo(node.value)<0){
                if(node.left==null){
                    node.left=new Node(value);
                    return true;
                }
                node=node.left;
            }

            if(value.compareTo(node.value)>0){
                if(node.right==null){
                    node.right=new Node(value);
                    return true;
                }
                node=node.right;
            }
        }
        return false;
    }

    @Override
    public void print(){
        print(root);
    }

    // preorder
    private void print(Node node){
        if(node==null)return;

        print(node.left);
        System.out.println(node.value);
        print(node.right);
    }


    @Override
    public boolean search(T value){
        return  searchR( value ,root);
    }

    public boolean search(T value , Node node){

        if(node==null)return false;

        if(value.compareTo(node.value)==0)return true;

        if(value.compareTo(node.value)<0) return search( value, node.left);
        if(value.compareTo(node.value)>0) return search( value, node.right);

        return false;
    }

    public boolean searchR(T value , Node node){

       while (node!=null){
           if(value.compareTo(node.value)==0)return true;

           if(value.compareTo(node.value)<0) node=node.left;

           if(value.compareTo(node.value)>0) node=node.right;
       }
        return false;
    }

}
