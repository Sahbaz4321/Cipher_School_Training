package SetAndMap;

public class MaxHeap1 {

    void heapify(int a[],int n,int i) {
        int p = (i - 1) / 2;
        if (a[p] >= 0) {


            if (a[p] < a[i]) {
                int temp = a[i];
                a[i] = a[p];
                a[p] = temp;
                heapify(a, n, p);
            }
        }
    }
    int insert(int a[],int n,int data){
        n=n+1;
        a[n-1]=data;
        heapify(a,n,n-1);



        return n;
    }
    void print(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        MaxHeap1 h1=new MaxHeap1();
        int size=100;
        int a[]=new int[size];
        a[0]=100;
        a[1]=80;
        a[2]=90;
        a[3]=40;
        a[4]=50;
        a[5]=25;
        a[6]=45;
        int n=h1.insert(a,7,95);
        h1.print(a,n);
    }
}
