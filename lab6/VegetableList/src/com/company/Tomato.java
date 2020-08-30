package com.company;

public class Tomato extends Vegetable{
    public Tomato(double caloricity, double weight, String vegetables){
        super.caloricity=caloricity;
        super.weight=weight;
        super.vegetables=vegetables;
    }
    @Override
    public void Caloricity(){
        System.out.println("       Калорийность помидора: "+ super.caloricity);
    }
    @Override
    public void Weight(){
        System.out.print("Вес помидора: "+super.weight);
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
