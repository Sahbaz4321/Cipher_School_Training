package Access1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("Enter element of array : ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array element are : ");
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}
