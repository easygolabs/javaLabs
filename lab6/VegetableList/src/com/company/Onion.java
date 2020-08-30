package com.company;

public class Onion extends Vegetable{
    public Onion(double caloricity, double weight, String vegetables){
        super.caloricity=caloricity;
        super.weight=weight;
        super.vegetables=vegetables;
    }
    @Override
    public void Caloricity(){
        System.out.println("            Калорийность лука: "+ super.caloricity);
    }
    @Override
    public void Weight(){
        System.out.print("Вес лука: "+super.weight);
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
