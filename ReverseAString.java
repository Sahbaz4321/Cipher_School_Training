package Access1;

public class ReverseAString {
    public static void main(String[] args) {
        String s="sahbaz";
        char ch[]=new char[s.length()];
        for(int i=0;i<ch.length;i++){
            ch[i]=s.charAt(s.length()-1-i);

        }
        System.out.println("reverse string are : ");
        String str=new String(ch);
        System.out.println(str);
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);

        }
        System.out.println(s1);

        char ch1[]=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            char temp=ch1[l];
            ch1[l]=ch1[r];
            ch1[r]=temp;
l++;
r--;
        }
        String str1=new String(ch1);
        System.out.println(str1);
    }
}
