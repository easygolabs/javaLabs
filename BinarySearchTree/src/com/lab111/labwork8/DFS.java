package com.lab111.labwork8;

import java.util.Stack;

public class DFS implements Search {

    private boolean flag=true;
    //прямой (pre-order), симметричный (in-order) и обратный (post-order).
    @Override
    public void showTree(Node root) { //Pre-order(прямой обход в глубину)

        /*if(flag) {
            System.out.println("DFS search method:");
            flag=false;
        }

        if (root == null)   // Базовый случай
        {
            return;
        }
        System.out.println("Key("+root.key +")"+ " Value: " + root.value);
        showTree(root.left);   //рекурсивный вызов левого поддерева
        showTree(root.right);  //рекурсивный вызов правого поддерева*/
        System.out.println("DFS search method:");
        if(flag) {
            flag=false;
        }
        Stack<Node> node=new Stack<>();
        node.push(root);
        while (node.isEmpty()==false){
            Node temp =node.peek();
            node.pop();
            System.out.println(temp.value);
            if(temp.right!=null){
                node.push(temp.right);
            }
            if (temp.left!=null){
                node.push(temp.left);
            }
        }

    }


}
