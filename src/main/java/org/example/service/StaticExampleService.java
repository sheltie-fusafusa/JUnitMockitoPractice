package org.example.service;

public class StaticExampleService {

    public static int plus(int a, int b){
        return a + b;
    }

    public static int square(int a){
        return a * a;
    }

    public static int minus(int a, int b){
        return a - b;
    }

    public static int divide(int a, int b){
        if(b == 0){
            return 0;
        }

        return a / b;
    }

    // 足し算した後に2乗する
    public static int plusSquare(int a, int b){

        int result = StaticExampleService.plus(a, b);
        return StaticExampleService.square(result);
    }
}
