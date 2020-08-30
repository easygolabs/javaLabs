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
}