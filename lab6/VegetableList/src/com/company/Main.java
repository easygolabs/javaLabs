package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Salad salad=new Salad();
        salad.Salad();
        System.out.println("\nKaлорийность салата: " + salad.CalSalad());
        System.out.println("Как вы хотите отсортировать овощи? 1-по калориям 2-по массе");
        Scanner sort=new Scanner(System.in);
        int number=sort.nextInt();
        salad.Sort(number);
        System.out.println("Введите диапазон калорийности от a до b:");
        System.out.print("a:");
        Scanner from=new Scanner(System.in);
        int a=from.nextInt();
        System.out.print("b:");
        Scanner to=new Scanner(System.in);
        int b=to.nextInt();
        salad.Search(a,b);
        */
        VegetableList vegetableList=new VegetableList();
        Vegetable a=new Cucumber(1,1,"a");
        Vegetable b=new Cucumber(2,2,"b");
        Vegetable c=new Cucumber(3,3,"c");
        Vegetable d=new Cucumber(3,3,"c");
        vegetableList.add(a);
        vegetableList.add(b);
        vegetableList.add(c);
        //System.out.println(vegetableList.get(0));
       // System.out.println(vegetableList.size());
       // System.out.println(vegetableList.isEmpty());
       // System.out.println(vegetableList.contains(d));
       // Vegetable list2[] = new Vegetable[vegetableList.size()];
        //list2 = vegetableList.toArray(list2);
        //for(Vegetable number : list2){
         //   System.out.println("Number = " + number);
       // }
        //vegetableList.remove(1);
        //System.out.println(vegetableList.get(1));
        ArrayList<Vegetable> deliveryCities = new ArrayList<>();

        deliveryCities.add(d);
        deliveryCities.add(c);
        vegetableList.addAll(deliveryCities);
        System.out.println(vegetableList.get(4));
    }
}







