package org.example.service;

public class ExampleService {

    public int plus(int a, int b){
        return a + b;
    }

    public int square(int a){
        return a * a;
    }

    public int minus(int a, int b){
        return a - b;
    }

    public int divide(int a, int b){
        if(b == 0){
            return 0;
        }

        return a / b;
    }

    // 足し算した後に2乗する
    public int plusSquare(int a, int b){

        int result = plus(a, b);
        return square(result);
    }
}
