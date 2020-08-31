package com.lab111.labwork8;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        Search search = tree.getSearchByName(DataTypes.DFS);

        tree.add(3, "A");
        tree.add(2, "B");
        tree.add(1,"ccc");
        tree.add(4, "C");
        tree.add(5, "D");

        search.showTree(tree.root);
        System.out.println("*************************");
        search = tree.getSearchByName(DataTypes.BFS);
        search.showTree(tree.root);

    }
}
