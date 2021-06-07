/*
 *   UCF COP3330 SUMMER 2021 ASSIGNMENT 18 SOLUTION
 *   COPYRIGHT 2021 RAYME PERSAD
 */

/*Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompt for the starting temperature.
The program should prompt for the type of conversion and then perform the conversion.
 */


package org.example;
import java.util.Scanner;

public class practiceexample18 {
    public static void main(String arg[])
    {
        double f,c; //declare variables
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit"); //case prompt for conversion
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:  System.out.println("Enter  Fahrenheit temperature"); //conversion for f to c
                f=sc.nextDouble();
                c=(f-32)*5/9;
                System.out.println("Celsius temperature is = "+c);
                break;
            case 2:  System.out.println("Enter  Celsius temperature"); //conversion for c to f
                c=sc.nextDouble();
                f=((9*c)/5)+32;
                System.out.println("Fahrenheit temperature is = "+f);
                break;
            default:  System.out.println("please choose valid choice"); //prompt for choose 1 or 2 if not then redo
        }
    }
}
