package Gitone.abstract1;
abstract class Shapeon{
    abstract void show();
    //abstract void display();
        }
        class Circle extends Shapeon{
    void show()
    {
        System.out.println("Draw Circle");
    }
        }
        class Rect extends Shapeon{
    void show()
    {
        System.out.println("Draw Rectangle");
    }
        }
public class Shape{
    public static void main(String[] args) {
        Shapeon sh = new Circle();
        sh.show();
     Shapeon ds=new Rect();
        ds.show();
    }

}
