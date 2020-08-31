package com.lab111.labwork8;

public class BinarySearchTree{

    Node root;//корень дерева

    private int compare(int key,int searchEllKey){//сравнение ключей

        return Integer.compare(key, searchEllKey);
    }

    public boolean isEmpty() {

        return root == null;
    }

    public Object get(int key) {//получение еллемента по ключу

        Node searchEll = root;
        while (searchEll != null) {
            int flag = compare(key,searchEll.key);
            if (flag == 0) {
                return searchEll.value;
            }
            if (flag < 0) {
                searchEll = searchEll.left;
            } else {
                searchEll = searchEll.right;
            }
        }
        return 0;
    }

    void add(int key, Object value) {
        Node xNode = root, yNode = null;
        while (xNode != null) {
            int flag = compare(key,xNode.key);
            if (flag == 0) {
                xNode.value = value;
                return;
            } else {
                yNode = xNode;
                if (flag < 0) {
                    xNode = xNode.left;
                } else {
                    xNode = xNode.right;
                }
            }
        }
        Node newNode = new Node(key, value);
        if (yNode == null) {
            root = newNode;
        } else {
            if (compare(key,yNode.key) < 0) {
                yNode.left = newNode;
            } else {
                yNode.right = newNode;
            }
        }
    }

    public void remove(int key) {
        Node xNode = root, yNode = null;
        while (xNode != null) {
            int flag = compare(key,xNode.key);
            if (flag == 0) {
                break;
            } else {
                yNode = xNode;
                if (flag < 0) {
                    xNode = xNode.left;
                } else {
                    xNode = xNode.right;
                }
            }
        }
        if (xNode == null) {
            return;
        }
        if (xNode.right == null) {
            if (yNode == null) {
                root = xNode.left;
            } else {
                if (xNode == yNode.left) {
                    yNode.left = xNode.left;
                } else {
                    yNode.right = xNode.left;
                }
            }
        } else {
            Node leftMost = xNode.right;
            yNode = null;
            while (leftMost.left != null) {
                yNode = leftMost;
                leftMost = leftMost.left;
            }
            if (yNode != null) {
                yNode.left = leftMost.right;
            } else {
                xNode.right = leftMost.right;
            }
            xNode.key = leftMost.key;
            xNode.value = leftMost.value;
        }
    }
    public Search getSearchByName(DataTypes dataTypes){
        if(dataTypes.equals(DataTypes.BFS)){
            return new BFS();
        }
        else if(dataTypes.equals(DataTypes.DFS)){
            return new DFS();
        }
        throw  new RuntimeException("Такой поиск не поддерживается");
    }
}
