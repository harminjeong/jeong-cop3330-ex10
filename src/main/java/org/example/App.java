/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Harmin Jeong
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        double p1 = input.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        double q1 = input.nextDouble();
        System.out.print("Enter the price of item 2: ");
        double p2 = input.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        double q2 = input.nextDouble();
        System.out.print("Enter the price of item 3: ");
        double p3 = input.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        double q3 = input.nextDouble();

        double subtotal = Math.round((p1*q1+p2*q2+p3*q3)*100.0)/100.0;
        double tax = Math.round((subtotal*0.055)*100.0)/100.0;
        double total = Math.round((subtotal+tax)*100.0)/100.0;

        System.out.println("Subtotal: $"+subtotal);
        System.out.println("Tax: $"+tax);
        System.out.println("Total: $"+total);
    }
}
