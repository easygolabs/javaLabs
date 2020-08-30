package com.company;

public class RedPepper extends Vegetable{
    public RedPepper(double caloricity, double weight, String vegetables){
        super(caloricity,weight,vegetables);
    }
    @Override
    public void Caloricity(){
        System.out.println(" Калорийность красного перца: "+ super.caloricity);
    }
    @Override
    public void Weight(){
        System.out.print("Вес красного перца: "+super.weight);
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