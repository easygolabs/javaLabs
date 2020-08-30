package com.company;
import java.util.Scanner; // импорт сканера

//С5=2          (A+B)
//С7=0          (double)
//С11=10        (найти среднее значение елемента матрицы)

public class Main {

    public static void main(String[] args) {
        //переменная для среднего значения
    double average=0.0;
    System.out.print("Введите число строк и столбцов для матриц А і В :\n");
    Scanner number = new Scanner(System.in);
        //присвоение числа которое ввели переменной inputN
    int inputN = number.nextInt();
        //инициализация двумерных массивов
    double[][] A = new double[inputN][inputN];
    double[][] B = new double[inputN][inputN];
    double[][] C = new double[inputN][inputN];
    System.out.println("Вы ввели "+inputN+" строк и столбцов.\n");
    System.out.print("Матрица A: \n");
     //заполнение и вывод массива А
    for (int i = 0; i < inputN; i++) {
         for (int j = 0; j < inputN; j++) {
                A[i][j] = (Math.random()*2000 - 1000);//стандартный диапазан = [0;1), наш диапазон =[-1000;1000)
                System.out.print(A[i][j]+"    ");
            }
            System.out.println(" ");
        }
     //заполнение и вывод массива В
        System.out.print("Матрица B: \n");
        for (int i = 0; i < inputN; i++) {
            for (int j = 0; j < inputN; j++) {
                B[i][j] = (Math.random()*2000 - 1000);//стандартный диапазан = [0;1), наш диапазон =[-1000;1000)
                System.out.print(B[i][j]+"    ");
            }
            System.out.println("");
        }
     //создание массива С
        System.out.print("Матрица C=A+B: \n");
        for (int i = 0; i < inputN; i++) {
            for (int j = 0; j < inputN; j++) {
                C[i][j]=A[i][j]+B[i][j];
                average =average+C[i][j];
                System.out.print(C[i][j]+"    ");
            }
            System.out.println("");
        }
        average=(average/(inputN*inputN));
        System.out.print("\nСреднее значение елемента матрицы = "+average);
    }
}