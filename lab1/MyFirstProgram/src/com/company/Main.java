package com.company;
import java.util.Scanner;

public class Main {
    //O1="+"
    //C=C3=1
    //O2="/"
    //i,j = long
    //S=(i/j)/(i+C)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double C = 6412%3;
        long n,m;
        double stepres=0;
        double res=0;
	    System.out.println("S=(i/j)/(i+C)");
        System.out.println("C="+C);
        System.out.println("Input i: ");
        n=in.nextLong();
        System.out.println("Input j: ");
        m=in.nextLong();
        for (int i=0;i<n;i++)
        {
            System.out.println("i="+i);
            for (int j=0;j<m;j++)
            {
                if (j==0)
                    continue;
                System.out.println("j=" + j);
                stepres = (double)(i / j) / (i + C);
                System.out.println("StepResult=" + stepres);
                res+=stepres;
            }
        }
        System.out.println("Result=" + res);
    }
}
