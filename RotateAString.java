package Access1;

public class RotateAString {
    static boolean rotate(String s,String str){

        return (s.length()==str.length() && (s+s).contains(str));
    }
    public static void main(String[] args) {
        System.out.println(rotate("ABCDE","CDEAB"));
    }
}
