package Gitone;
class A {
    private String s = "Ash";

    public String getS() {
        return s;
    }
}
        /*public void setS(String s){
    this.s=s;
        }*/
public class Encapsulate {
    public static void main(String args[]){
        A a=new A();
        a.getS();
        System.out.println("Name="+a.getS());
    }

    }
