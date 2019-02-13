package com.company;

import com.example.ryanpackage.Series;

public class Main {

    public static void main(String[] args) {
        System.out.println("SUM");
        for(int i = 1; i<=10; i++){
            System.out.println(Series.nSum(i));
        }
        System.out.println("----------");
        System.out.println("FACTORIAL");
        for(int i = 1; i<=10; i++){
            System.out.println(Series.factorial(i));
        }
        System.out.println("------------");
        System.out.println("FIBONACII");
        for(int i = 1; i<=10; i++){
            System.out.println(Series.fibonacci(i));
        }
    }
}
