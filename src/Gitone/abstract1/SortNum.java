package Gitone.abstract1;

import java.util.Scanner;

public class SortNum {
    public static void main(String args[]) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter how many numbers you want sort");
        int n = sn.nextInt();
        int num;
        int a[] = new int[n];
        System.out.println("Enter " + n + " numbers");
        for (int i = 0; i < n; i++) {
            a[i] = sn.nextInt();
        }
        System.out.println(" sorted list");
        for (int i = 0; i < n; i++) {
           // for (int j = i + 1; j < n; j++) {
               try {
                   if (a[i] > a[i + 1]) {
                       num = a[i];
                       a[i] = a[i + 1];
                       a[i + 1] = num;

                   }

                  // i=i-1;
               } catch (ArrayIndexOutOfBoundsException e) {
                  // e.printStackTrace();
                   System.out.println("Exception is  "+e.getMessage());
               }

               /* if (a[i] < a[j]) {
                    num = a[i];
                    a[i] = a[j];
                    a[j] = num;
                }*/

            //}
            System.out.println(a[i]);
        }
            }
        }

