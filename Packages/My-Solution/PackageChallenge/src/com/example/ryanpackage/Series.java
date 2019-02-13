package com.example.ryanpackage;

public class Series {
    public static int nSum(int n){
        for(int i = n-1; i>0; i--){
            n+=i;
        }
        return n;
    }

    public static int factorial(int n){
        for(int i = n-1; i>0; i--){
            n*=i;
        }
        return n;
    }

    public static int fibonacci(int n) {

        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
