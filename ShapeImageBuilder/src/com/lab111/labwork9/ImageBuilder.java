package com.lab111.labwork9;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ImageBuilder {//тут должен создаваться композит
    private double x;
    private double y;
    private double w;
    private double h;

    private void setX(double x){
        this.x=x;
    }

    private void setY(double y){
        this.y=y;
    }

    private void setW(double w){
        this.w=w;
    }

    private void setH(double h){
        this.h=h;
    }

    Shape createImage(String file) throws IOException, ClassNotFoundException {
        Shape shape=readFromFile(file);
        shape.setX(x);
        shape.setY(y);
        shape.setW(w);
        shape.setH(h);
        return shape;
    }

    private Composite readFromFile(String file) throws IOException,ClassNotFoundException{
        Scanner sc = new Scanner(new File(file));

        String className=sc.nextLine();
        className = className.substring(className.indexOf('[')+1,className.indexOf(']'));

        String rDotColour=sc.nextLine();
        rDotColour=rDotColour.substring(rDotColour.indexOf('[')+1,rDotColour.indexOf(']'));

        String rCircleColour=sc.nextLine();
        rCircleColour=rCircleColour.substring(rCircleColour.indexOf('[')+1,rCircleColour.indexOf(']'));

        String rLineLength = sc.nextLine();
        rLineLength= rLineLength.substring(rLineLength.indexOf('[')+1,rLineLength.indexOf(']'));
        double lineLength=Double.valueOf(rLineLength);

        String rCircleRadius = sc.nextLine();
        rCircleRadius= rCircleRadius.substring(rCircleRadius.indexOf('[')+1,rCircleRadius.indexOf(']'));
        double circleRadius=Double.valueOf(rCircleRadius);

        if (className.equals(Composite.class.getSimpleName())) {
            for (Shape aShape : shape) {
                aShape.setX(x);
                aShape.setY(y);
                aShape.setW(w);
                aShape.setH(h);
            }
            setX();
            setY();
            setW();
            setH();
        }
        else throw new ClassNotFoundException(className);
        sc.close();
        return composite;
    }
}
