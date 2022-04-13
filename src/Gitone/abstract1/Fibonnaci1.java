package Gitone.abstract1;

import java.util.Scanner;

public class Fibonnaci1 {

    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sn=new Scanner(System.in);
        int num=sn.nextInt();
        int num1=0;
        int num2=1;
        System.out.println("Fibbonicci series upto:"+num);
        while(num1<=num){

            System.out.print(num1+" ,");
            int n=num1+num2;
            num1=num2;
            num2=n;
        }
    }
}
