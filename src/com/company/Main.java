package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("tenemos 5 manzanas");
        System.out.println("nos roban 3 manzanas");
        System.out.println(calcula(5, 3));
        System.out.println("Adios muy buenas");
    }

    public static int calcula(int a, int b){
        return a - b;
    }
}
