package Gitone;

public class ExceptnHand {
public static void main(String args[]){
    int a=10;
    int b=0;
    int c;
    try{
        c=a/b;
        System.out.println(" value of c"+c);
    }

    catch (ArithmeticException e ) {
        System.out.println("Exception"+e.getMessage());
       // e.printStackTrace();
    }
    System.out.println(" Hello");


}
}
