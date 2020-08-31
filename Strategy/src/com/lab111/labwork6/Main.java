package com.lab111.labwork6;

public class Main {

    public static void main(String[] args) {
        double firstCord=55.9;
        double secondCord=77.8;
        double firstCord1=1.0;
        double secondCord2=Math.PI;

        StrategyClient showFunc=new StrategyClient();

        showFunc.setCoordinateSystem(new CartesianSystem(firstCord,secondCord));
        showFunc.function();

        showFunc.setCoordinateSystem(new PolarSystem(firstCord1,secondCord2));
        showFunc.function();
    }
}
