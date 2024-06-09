package Access1;

import java.util.Arrays;

public class String1 {
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
        System.out.println("==============Selection Sort==================");
        int a[]={64,25,11,2,5,6};
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;

        }
        System.out.println(Arrays.toString(a));


    }
}
