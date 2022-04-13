package Gitone.abstract1;

import java.util.Scanner;
class  prime{
    static boolean isPrime(int num1){
        if(num1==1||num1==0)return false;

        //Run a loop from 2 to square root of n
        for(int i=2; i*i<=num1; i++){
            // if the number is divisible by i, then n is not a prime number.
            if(num1%i==0)return false;
        }
        //otherwise, n is prime number.
        return true;
    }
}
public class Primeno {
    public static void main(String args[]){
        System.out.println("Enter the number to find prime numbers upto that number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(prime.isPrime(i)){
                System.out.print(" "+i);
            }
        }

    }
}
