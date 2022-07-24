package org.example;

import org.example.service.ExampleService;

public class Main {
    public static void main(String[] args) {

        ExampleService exampleService = new ExampleService();

        int result = exampleService.plus(1, 2);
        System.out.println("plus:" + result);
    }
}