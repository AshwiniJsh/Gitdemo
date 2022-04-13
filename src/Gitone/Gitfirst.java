package Gitone;
interface Testinter{
    int a=10;//Static and final variable by default
    void display();//because Abstract method directly call

}
public class Gitfirst implements Testinter {
    @Override
    public void display() {//we take public here bcoz it is public in interface
        System.out.println(a);
    }

    public static void main(String[] args){
        /*Gitfirst g=new Gitfirst();//here we can also write*/ Testinter t=new Gitfirst();
        t.display();
        System.out.println(" HI");
    }
}
