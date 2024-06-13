package Access1;

public class TwoPointerSum {
    public static void main(String[] args) {
        int a[]={12,32,36,78,100};
        int l=0;
        int r=a.length-1;
        int x=13;
        while(l<r){
            int sum=a[l]+a[r];
            if(sum == x){
                System.out.println("sum is found "+sum+" at index "+l+" and "+r);
                return;
            }
            else if(sum<x){
                l++;
            }
            else{
                r--;
            }
        }
        System.out.println("sum not found");
    }
}
