package com.lab111.labwork6;

import static java.lang.Math.max;
import static java.lang.Math.pow;

public class PolarSystem implements CoordinateSystem {
    private double x_Cartesian_cord,y_Cartesian_cord,r,fi;
    PolarSystem(double x_Cartesian_cord,double y_Cartesian_cord){
        this.x_Cartesian_cord=x_Cartesian_cord;
        this.y_Cartesian_cord=y_Cartesian_cord;
    }
    @Override
    public void showGraph() {
        System.out.println();
        System.out.println("This method show graph in PolarSystem");
        r=Math.sqrt(pow(x_Cartesian_cord,2)+pow(y_Cartesian_cord,2));
        fi=Math.atan2(y_Cartesian_cord,x_Cartesian_cord);
        if(r<0) {
            throw new IllegalArgumentException("Радиус (r) должен быть больше или равен 0, а не :" + r);
        }
        else {
            System.out.println("Функция c переменными r: " + r + " и fi: " + fi);
            System.out.println("Отображена в виде графика в полярной системе координат");
        }
    }
}
