package Access1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class SplitFunction {

    public static void main(String[] args) {
        String s="sahbaz siddique is a good boy";
        String str[]=s.split(" ");
        System.out.println(Arrays.toString(str));
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
        System.out.println("==========================================");

//        String s1="sahbaz.is.a.good.boy";
//        System.out.println(s1);
//        String ch[]=s1.split("[.]");
//        for(int i=0;i<ch.length;i++){
//            System.out.println(ch[i]);
//        }
//        String s1="sahbaz,is,a,good,boy";
//        System.out.println(s1);
//        String ch[]=s1.split(",");
//        for(int i=0;i<ch.length;i++){
//            System.out.println(ch[i]);
//        }
        String s1="sahbaz, is a good \"boy\" i'm in japan";
        System.out.println(s1);
        String ch[]=s1.split("\"");
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
        char ch1[]={'a','b','c','d','e','f','g'};
        String str1=new String(ch1,2,3);
        System.out.println(str1);
        String a1="Indii is a country";
        System.out.println("index of  e: "+a1.indexOf('i'));
        System.out.println("index of j : "+a1.indexOf('j'));
        System.out.println("index of : "+a1.indexOf("is"));
        System.out.println("index of second i : "+a1.indexOf('i',6));
       int index=0;
       while(index!=-1){
           index=a1.indexOf('i',index+1);
           System.out.println("index of i : "+index);
       }
    }


}
