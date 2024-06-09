package Access1;

public class PrimeNumber {
  static   boolean prime(int n){
        if (n<=1) return false;
        if(n==2) return true;

        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static   boolean primePrint(int n){
        if (n<=1) return false;
        if(n==2) return true;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("prime number : "+prime(13));
        for(int i=1;i<100;i++){
            if(primePrint(i))
            System.out.println(i);
        }


    }
}
