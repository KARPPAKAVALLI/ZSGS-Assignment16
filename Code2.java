package com.assignment16;

import java.util.Scanner;

class AgeException extends Exception{
    AgeException(){
        super("Error: Age cannot be less than 18!");
    }
}
public class Code2 {
    //2. Create a custom Exception by yourself and try throwing and catching the same.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age: ");
        int age=sc.nextInt();
        try {
            if(age<18)
                throw new AgeException();
            System.out.println("Your age: "+age);
        }
        catch (AgeException e){
            System.out.println(e.getMessage());
        }
    }
}
