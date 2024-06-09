package Access1;

import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        String s="India";
        String str="India";
        String s2=new String("India");
        String s3=new String("India");
        System.out.println("===================Concat ===================");
        System.out.println(s==str);
        System.out.println(s==s2);

        System.out.println(s+" , is a country");
        System.out.println(s);
        s+=" people";
        System.out.println(s);
        System.out.println(s.equals(s2));
        System.out.println("=============Character Array to String===============");
        char ch[]={'a','b','c','d','e'};
        String s1=new String(ch);
        System.out.println(s1);
    }
}