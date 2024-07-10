package SetAndMap;

public class MaxHeap2 {

int arr[];
MaxHeap2(int arr[]){
    this.arr=arr;



}

void heapify(int i){
    int p=(i-1)/2;
    if(arr[p]>=0){
        if(arr[p]<arr[i]){
            int temp=arr[i];
            arr[i]=arr[p];
            arr[p]=temp;
            heapify(p);
        }
    }
}
int insert(int data,int n){
    n++;
    arr[n-1]=data;

    heapify(n-1);

    return n;
}
void print(int n){
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
void delete(int i,int n){
    arr[i]=arr[n-1];
    n--;
    heapifyDown(i,n);
}
void heapifyDown(int i,int n){

    int larger=i;
    int left=2*i+1;
    int right=2*i+2;
    if(left<n && arr[left]>arr[larger]){
        larger=left;
    }
    if(right<n && arr[right]>arr[larger]){
        larger=right;
    }
    if(larger!=i){
        int temp=arr[larger];
        arr[larger]=arr[i];
        arr[i]=temp;
        heapifyDown(larger,n);
    }


}



    public static void main(String[] args) {
    int size=100;
    int arr[]=new int[100];
    arr[0]=100;
    arr[1]=80;
    arr[2]=90;
    arr[3]=40;
    arr[4]=50;
    arr[5]=55;
    arr[6]=70;
    MaxHeap2 aa=new MaxHeap2(arr);
    int n=aa.insert(60, 7);
        System.out.println(n);
        aa.print(n);
        System.out.println();

aa.delete(0,n);
n--;
aa.print(n);
    }
}
