package Access1;

import com.sun.security.jgss.GSSUtil;

public class Recursion {
   static void fun(int n){
        if(n<1)return;

        System.out.println(n);
        fun(n-1);
    }
    static int fibo(int n){
       if(n<2) return n;
       return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println("===============Print n to 1=================");
//        fun(5);


        System.out.println("==================fibonacci series================");
        for(int i=0;i<=10;i++) {


            System.out.println(fibo(i));
        }
        System.out.println("==========================Binary Serach========================");
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int key=6;
        int l=0;
        int r=a.length-1;
        while(l<r){
            int mid=(l+r)/2;
            if(a[mid]==key){
                System.out.println("key is found : "+mid);
                return;
            }
            else if(a[mid]>key){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println("key not found");

    }
}
