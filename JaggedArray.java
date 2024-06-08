package Access1;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {

    public static void main(String[] args) {
        int a[][]=new int[3][];
        a[0]=new int[3];
        a[1]=new int[2];
        a[2]=new int[1];
        System.out.println(Arrays.deepToString(a));

        int arr[][]=new int[3][];
        arr[0]=new int[]{1,2,3};
        arr[1]=new int[]{4,5};
        arr[2]=new int[]{6,7};
        System.out.println(Arrays.deepToString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s);
        String str=sc.next();
        System.out.println(str);

        System.out.println();
        System.out.println("Enter your detail :");
        System.out.print("Enter first name :");
        String first=sc.nextLine();
        System.out.print("Enter last name :");
        String last=sc.nextLine();
        System.out.print("Enter address :");
        String address=sc.nextLine();
        System.out.println("Enter house number :");
        String num=sc.nextLine();
        System.out.println(first);
        System.out.println(last);
        System.out.println(address);
        int n=Integer.parseInt(num);
        System.out.println(n);
    }
}
