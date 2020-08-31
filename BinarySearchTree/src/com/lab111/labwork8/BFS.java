package com.lab111.labwork8;

import java.util.LinkedList;
import java.util.Queue;

//поиск в ширину; посещает все вершины на расстоянии одного ребра от root, потом на расстоянии два ребра; FIFO
public class BFS implements Search {
    @Override
    public void showTree(Node root) {

        System.out.println("BFS search method:");
        Queue<Node> queue = new LinkedList<>();

        if (root == null)
        {
            return;
        }

        queue.add(root);    // Вставляем корень в очередь

        while (!queue.isEmpty() )
        {
            Node temp = queue.poll(); // возвращает с удалением элемент из начала очереди

            System.out.println("Key("+temp.key +")"+ " Value: " + temp.value);

            if ( temp.left != null )
                queue.offer(temp.left);  // Вставляем  в очередь левого потомка

            if ( temp.right != null )
                queue.offer(temp.right);  // Вставляем  в очередь правого потомка
        }
    }
}
