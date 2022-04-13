package Gitone;
interface Abc{
    int a=10;
    String s="Welcome";
void display();
}
interface Xyz{
    int x=20;
    String st="Home";
    void show();
}
public class Multinherit implements Xyz,Abc {
    public void display(){
        System.out.println("s"+x);
    }
    public void show() {
        System.out.println(s);
    }
    public static void main(String[] args) {
        Xyz ab = new Multinherit();//can also write Multinherit ab = new Multinherit();
        ab.show();                                 //ab.show();
        Abc xy=new Multinherit();      // no need to write this directly we can ab.display();
       xy.display();
    }
}
