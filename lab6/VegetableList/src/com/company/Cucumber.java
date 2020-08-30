package com.company;

public class Cucumber extends Vegetable{
        public Cucumber(double caloricity, double weight, String vegetables){
            super.caloricity=caloricity;
            super.weight=weight;
            super.vegetables=vegetables;
        }
        @Override
        public void Caloricity(){
            System.out.println("         Калорийность огурца: "+ super.caloricity);
        }
        @Override
        public void Weight(){
            System.out.print("Вес огурца: "+super.weight);
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