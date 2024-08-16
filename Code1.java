package com.assignment16;

import java.util.Scanner;

public class Code1 {
    //1. Write a program for division with proper divide-by-zero exception handling
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y= sc.nextInt();
        try {
            System.out.println(x/y);
        }
        catch (ArithmeticException e){
            System.out.println("Error: Can't divide by 0");
        }
    }
}
