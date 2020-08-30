package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Salad{
    Vegetable param[]={new Cucumber(16,100,"Cucumber"),new RedPepper(20,110,"RedPepper"),new Tomato(180,101,"Tomato"),new Feta(264,200,"Feta"),new Onion(35,90,"Onion")};
    public void Salad(){
        for(int i=0;i<param.length;i++){
            this.param[i].Weight();
            this.param[i].Caloricity();
        }
    }
    public double CalSalad(){
        double cal=0;
        for(int i=0;i<param.length;i++){
            cal=cal+param[i].caloricity;
        }
        return cal;
    }
    public void Sort(int number)
    {
        switch (number){
            case 1: Arrays.sort(param, Comparator.comparingDouble(o -> o.getCaloricity()));
                System.out.println("Отсортировано по калориям: ");
                for(int i=0;i<param.length;i++){
                    System.out.print(param[i].getCaloricity()+"   ");
                    System.out.println(param[i].toString());
                }
                break;
            case 2:  Arrays.sort(param, Comparator.comparingDouble(o -> o.getWeight()));
                System.out.println("Отсортировано по весу: ");
                for(int i=0;i<param.length;i++){
                    System.out.print(param[i].getWeight()+"   ");
                    System.out.println(param[i].toString());
                }
                break;
            default: System.out.println("Вы ввели не то число!");
        }
    }
    public void Search(int a,int b){
        System.out.println("В этот диапазон входят: ");
        for(int i=0;i<param.length;i++){
            if((param[i].getCaloricity()>=a)&&(param[i].getCaloricity()<=b)){
                System.out.println(param[i].toString());
            }
        }
    }
}
