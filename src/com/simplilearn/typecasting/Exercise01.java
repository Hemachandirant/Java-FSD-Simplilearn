package com.simplilearn.typecasting;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Integer value: ");
        int Integer = input.nextInt();

        float Floatvalue = Integer;
        double Doublevalue = Integer;
        long Longvalue = Integer;

        System.out.println("The Typecasted values for Integer is : ");
        System.out.println("Floatvalue: "+ Floatvalue);
        System.out.println("doublevalue: "+ Doublevalue);
        System.out.println("Longvalue "+ Longvalue);

        System.out.println("----------------------");

        System.out.print("Enter a Byte value: ");
        byte Byte = input.nextByte();

        float floatvalue = Byte;
        double doublevalue = Byte;
        long longvalue = Byte;

        System.out.println("The Typecasted values for Integer is : ");
        System.out.println("floatvalue: "+ floatvalue);
        System.out.println("doublevalue: "+ doublevalue);
        System.out.println("longvalue "+ longvalue);

        System.out.println("----------------------");

        System.out.print("Enter a Short value: ");
        short Short = input.nextShort();

        float FloatValue = Short;
        double DoubleValue = Short;
        long LongValue = Short;

        System.out.println("The Typecasted values for Integer is : ");
        System.out.println("Floatvalue: "+ FloatValue);
        System.out.println("doublevalue: "+ DoubleValue);
        System.out.println("Longvalue "+ LongValue);



    }
}