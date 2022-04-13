package Gitone;

import java.util.Scanner;

public class Scannerdemo {
    public static void main(String[] args){
        System.out.println("Enter String=");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enetr Number");
        int a=sc.nextInt();
        System.out.println("Name="+str);
        System.out.println("a="+a);
    }
}
