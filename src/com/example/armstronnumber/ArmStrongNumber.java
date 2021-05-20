package com.example.armstronnumber;

public class ArmStrongNumber {
    public static void main(String[] args) {

        int n=153; //It is the number to check armstrong
        int temp = n; /* we will be doing  operations on temp so we dont want
             to lose original number */
        int r,sum = 0;

        while(n>0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;
        }
        if(temp == sum)
            System.out.println("Its an Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
// Armstrong Number in Java: A positive number is called armstrong number
// if it is equal to the sum of cubes of its digits
// for example 0, 1, 153, 370, 371, 407 etc

