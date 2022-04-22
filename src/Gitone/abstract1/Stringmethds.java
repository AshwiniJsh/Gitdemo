package Gitone.abstract1;

import java.util.Locale;

public class Stringmethds {
    public static void main(String args[]){
        char[] ch={'A','s','h','w','i','n','i'};
        String s=new String(ch);
       // System.out.println(s);
        System.out.println(s.intern());
        String l1=s.toLowerCase(Locale.ROOT);
        System.out.println(l1);
 char a=l1.charAt(3);
        System.out.println(a);
        System.out.println(l1.compareTo(s));
        s=s.concat("    "+l1);
        s=s.concat("   Hello Ashu");
        System.out.println(s);
        System.out.println(s.contains(" ashwini"));
        System.out.println(s.getBytes());
        System.out.println(s.compareToIgnoreCase(l1));



    }
}
