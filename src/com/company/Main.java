package com.company;

public class Main {

    public static void main(String[] args) {

        Box<String, Integer> genericObject = new Box<>("This is a Generics", 123456789);
        genericObject.showTAndV();
        System.out.println(genericObject.getObject1());
        System.out.println(genericObject.getObject2());
    }
}