package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sveiki, iveskite du  skaicius");

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite pirmaji skaiciu su kabeliu");

        float a = sc.nextFloat();

        System.out.println("Iveskite pirmaji skaiciu be kabelio");

        int b = sc.nextInt();

        System.out.println("Iveskite antraji skaiciu su kableliu");

        float intA = sc.nextFloat();

        System.out.println("Iveskite antraji skaiciu be kabelelio");

        int intB = sc.nextInt();

        System.out.println("Ju suma");

        System.out.println(suma(a, intA));

        System.out.println(suma(b, intB));

        System.out.println("Ju skirtumas");

        System.out.println(skirtumas(a, intA));

        System.out.println(skirtumas(b, intB));


    }

    public static int skirtumas(int b, int intB) {
        return b - intB;
    }

    public static float skirtumas(float a, float intA) {
        return a - intA;
    }

    public static int suma(int b, int intB) {
        return b + intB;
    }

    public static float suma(float a, float intA) {
        return a + intA;
    }
}

