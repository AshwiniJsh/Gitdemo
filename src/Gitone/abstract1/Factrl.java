package Gitone.abstract1;

import java.util.Scanner;

public class Factrl {
    public static void main(String args[]){
        System.out.println("Enter number to find Factorial");
        Scanner s2=new Scanner(System.in);
        int num=s2.nextInt();
        int i=1;
        long fact=1;
        System.out.println(" Factorial of "+num);
        while(i<=num){
            fact *= i;
            i++;
        }
        System.out.println(fact);

    }
}
