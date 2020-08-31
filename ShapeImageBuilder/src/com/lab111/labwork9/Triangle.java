package com.lab111.labwork9;

public class Triangle extends Shape {
    private double x;
    private double y;
    private double w;
    private double h;
    @Override
    void setX(double x) {
        this.x=x;
    }

    @Override
    void setY(double y) {
        this.y=y;
    }

    @Override
    void setW(double w) {
        this.w=w;
    }

    @Override
    void setH(double h) {
        this.h=h;
    }
    @Override
    public String toString(){
        return "Triangle [x = "+x+"]"+
                "[y = "+y+"]"+
                "[w = "+w+"]"+
                "[h = "+h+"]";
    }
}
