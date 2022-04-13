package Gitone.abstract1;
abstract class addition{

   abstract void add();
}
 class Abstractiono extends addition{
    void add()
    {
        int a=10;
        int b=20;
        int c;
        c=a+b;
        System.out.println("Addition ="+c);
    }
    public static void main(String[] arg)
    {

        addition s=new Abstractiono();
s.add();

    }
    }
