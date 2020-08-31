package com.lab111.labwork6;

public class StrategyClient {

    private CoordinateSystem coordinateSystem;

    void setCoordinateSystem(CoordinateSystem coordinateSystem){
        this.coordinateSystem=coordinateSystem;};

    void function(){
        coordinateSystem.showGraph();
    }
}
