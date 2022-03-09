package com.simplilearn.typecasting;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Double value: ");
        double Double = input.nextDouble();

        int intvalue = (int) Double;
        short shortvalue = (short) Double;
        byte bytevalue = (byte) Double;

        System.out.println("The Typecasted values for Double value is: ");
        System.out.println("Intvalue: "+intvalue);
        System.out.println("shortvalue "+shortvalue);
        System.out.println("bytevalue: "+bytevalue);

        System.out.println("----------------------------");
        System.out.print("Enter a Long value: ");
        long Long = input.nextLong();

        int Intvalue = (int) Long;
        short Shortvalue = (short) Long;
        byte Bytevalue = (byte) Long;

        System.out.println("The Typecasted values for Long values is: ");
        System.out.println("Intvalue: "+Intvalue);
        System.out.println("shortvalue "+Shortvalue);
        System.out.println("bytevalue: "+Bytevalue);
    }
}
