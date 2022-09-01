package com.github.TheTrueHooha.DataStructure.BinarySearchTree;

public class BinarySearchTreeApplication {
    public static void main(String[] args) {
        SearchOperation bst = new SearchOperation();
        bst.insertionKey(6);
        bst.insertionKey(3);
        bst.insertionKey(2);
        bst.insertionKey(7);
        bst.insertionKey(8);
        bst.insertionKey(1);

        bst.preOrderTraversal(bst.root);
    }
}

// holds the tree that contain the left and right nodes
class Tree{
    int key;
    Tree left, right;

    Tree(int key){
        this.key = key;
    }
}

class SearchOperation{
    Tree root;

    void insertionKey(int key){
        root = insertInTreeMethod(root, key);
    }

    // insert in tree method defines the logic for the binary search tree operation
     Tree insertInTreeMethod(Tree root, int key) {
        if (root == null){
            root = new Tree(key);
            return root;
        }
        if (key < root.key){
            root.left = insertInTreeMethod(root.left, key);
        } else if (key > root.key){
            root.right = insertInTreeMethod(root.right, key);
        }
        return root;
    }

    void preOrderTraversal(Tree root){
        if ( root != null){
            System.out.print(root.key+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
}

