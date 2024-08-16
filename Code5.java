package com.assignment16;

public class Code5 {
    //5. Write program to demonstrate ArrayIndexOutOfBoundsException
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for (int i = 0; i <=5 ; i++) {
            //causes exception when i==5;
            System.out.print(arr[i]+" ");
        }
    }
}

//  OUTPUT:
//  1 2 3 4 5 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//	at com.assignment16.Code5.main(Code5.java:9)
