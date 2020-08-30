package com.company;

abstract class Vegetable{
    protected double caloricity;
    protected double weight;
    protected String vegetables;
    abstract public void Caloricity();
    abstract public void Weight();
    abstract public double getWeight();
    abstract public double getCaloricity();
    abstract public String toString();

    public Vegetable(double caloricity, double weight, String vegetables) {
        if (caloricity <= 0) throw new IllegalCaloricityException("This product impossible!");
        if (weight <= 0) throw new IllegalWeightException("Weight must be >0!");
        this.caloricity = caloricity;
        this.weight = weight;
        this.vegetables = vegetables;
    }
}