package Access1;

public class SubArr1 {
    public static void main(String[] args) {
        int curr=0;
        int K=2;
        int a[]={100,200,300,400};
        int max=0;
        for(int i=0;i<K;i++){
            curr+=a[i];
        }
        max=curr;
        for(int i=0;i<a.length-K;i++){
            curr=curr-a[i]+a[i+K];
            if(curr>max){
                max=curr;
            }

        }
        System.out.println(max);
    }
}
