package com.practice;


class Tree{
    int value;
    Tree left;
    Tree right;
    public Tree(int value){//used to initialize the node value
        this.value=value;//set the node value
        this.left=null;//left as null
        this.right=null;//right as null
    }
}
public class BinaryTree {
    public static void inorderTraverse(Tree node){// Tree node is current node
        if(node!=null){
            inorderTraverse(node.left);// Traverse left
            System.out.print(node.value+ " ");//for space
            inorderTraverse(node.right);// Traverse right
        }

    }

    public static void main(String[] args) {
        //create the values for tree
        Tree root=new Tree(5);
        root.left=new Tree(2);
        root.right=new Tree(1);
        root.left.right=new Tree(4);
        root.left.left=new Tree(6);
        root.right.right=new Tree(7);
        root.right.left=new Tree(8);

       inorderTraverse(root) ;//method calling

    }
}
