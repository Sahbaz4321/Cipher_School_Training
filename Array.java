package Access1;

import java.util.Scanner;

public class A {
    static  void addOne(int x){
//        pass by value
        x++;
    }
    static void addOne(int arr[]) {
        // passed array as reference(address)
        for (int i = 0; i < arr.length; i++) {


            arr[i]++;
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=5;
       int a[]=new int[size];
        System.out.print("Enter elements of Array :");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Elements of array are :");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("size of array are increased");
        int copy[]=new int[size*2];
        for(int i=0;i<size;i++){
            copy[i]=a[i];
        }
        copy[6]=45;
        copy[7]=46;
        for(int x:copy){
            System.out.print(x+" ");
        }
        int x=10;
        addOne(x);
        System.out.println(x);
        int arr[]={1,2,3,4,5};
        addOne(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
