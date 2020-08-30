package com.company;

public class Feta extends Vegetable{
    public Feta(double caloricity, double weight, String vegetables){
        super(caloricity,weight,vegetables);
    }
    @Override
    public void Caloricity(){
        System.out.println("           Калорийность феты: "+ super.caloricity);
    }
    @Override
    public void Weight(){
        System.out.print("Вес феты: "+super.weight);
    }
    @Override
    public double getWeight(){
        return super.weight;
    }
    @Override
    public double getCaloricity(){
        return super.caloricity;
    }
    @Override
    public String toString() {
        return super.vegetables;
    }
}

