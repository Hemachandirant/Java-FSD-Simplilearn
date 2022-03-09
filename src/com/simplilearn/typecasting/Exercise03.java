package com.simplilearn.typecasting;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("** String to Numeric Convertor **");
        System.out.println("-----------------------------------------");

        System.out.print(" Enter a number string value : ");
        String number = input.nextLine();

        int Intvalue = Integer.parseInt(number);
        short Shortvalue = Short.parseShort(number);
        byte Bytevalue = Byte.parseByte(number);
        Long Longvalue = Long.parseLong(number);
        float Floatvalue = Float.parseFloat(number);
        double Doublevalue = Double.parseDouble(number);

        System.out.println("The Converted values are : ");

        System.out.println("Integervalue: "+Intvalue);
        System.out.println("Shortvalue: "+ Shortvalue);
        System.out.println("Bytevalue: "+ Bytevalue);
        System.out.println("Longvalue: "+ Longvalue);
        System.out.println("Floatvalue : "+Floatvalue);
        System.out.println("Doublevalue: "+ Doublevalue);
    }
}

