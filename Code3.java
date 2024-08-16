package com.assignment16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Code3 {
    //3. Create a program to get phone number from the user and throw InputMismatchException if the user enters non-number input
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Enter your phone number: ");
            long phoneNumber = sc.nextLong();
            System.out.println("Your Number: " + phoneNumber);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter only numbers.");
        }
    }
}
