package com.lab111.labwork6;

public class CartesianSystem implements CoordinateSystem {
    private double x_Cartesian_cord,y_Cartesian_cord;
    CartesianSystem(double x_Cartesian_cord,double y_Cartesian_cord){
        this.x_Cartesian_cord=x_Cartesian_cord;
        this.y_Cartesian_cord=y_Cartesian_cord;
    }

    @Override
    public void showGraph() {
        System.out.println("This method show graph in CartesianSystem");
        System.out.println("Функция c переменными x: "+x_Cartesian_cord+ " и y: "+y_Cartesian_cord);
        System.out.println("Отображена в виде графика в декартовой системе координат");
    }
}
