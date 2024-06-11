package Access1;

import java.util.Arrays;

public class String3 {

    public static void main(String[] args) {
        String s="Helelo is a is a is a Iedia";
        System.out.println(s.replace('e','I'));
        System.out.println(s.replaceAll("is","good"));

//trim()-> function remove white space from starting and ending
        String s1="Hello          ";
        String s2="     Hello       ";
        String s3="    Hello       India     ";
        System.out.println("*"+s1.trim()+"*");
        System.out.println("*"+s2.trim()+"*");
        System.out.println("*"+s3.trim()+"*");




        String s4="Hello";
        String s5="Bye";
//        compare character by character lexograpically
//     A B C D E F G H
//     1 2 3 4 5 6 7 8
//        8-2=6
        System.out.println(s4.compareTo(s5));
        System.out.println(s5.compareTo(s4));
        System.out.println(s4.compareToIgnoreCase(s5));
        String s6="";
        String s7=new String();
        System.out.println(s6.isBlank());
        System.out.println(s6.isEmpty());

        System.out.println(s7.isBlank());
        System.out.println(s7.isEmpty());
        System.out.println(s6.equals(s7));

        

        String s8= "Hello Hi";
        char ch[]=s8.toCharArray();
        for(int i=0;i< ch.length;i++){
            System.out.println(ch[i]);
        }

    }
}
