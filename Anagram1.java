package Access1;

import java.util.Arrays;

public class Anagram1 {
    static boolean checkPalindrome(String s){
        s.toLowerCase();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            r--;
            l++;
        }
        return true;
    }
    static boolean Anagram(String s,String str){
        str.toLowerCase();
        s.toLowerCase();

        int freq1[]=new int[26];
        int freq2[]=new int[26];
        int index=0;
        int index1=0;
        if(s.length()!=str.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            index=s.charAt(i)- 'a';
            freq1[index]++;

            index1=str.charAt(i) - 'a';
            freq2[index1]++;
        }
        System.out.println(Arrays.toString(freq1));
        System.out.println(Arrays.toString(freq2));

        for(int i=0;i<26;i++){
            if(freq2[i]!=freq1[i]){
                return false;

            }

        }
        return true;
    }
    static boolean Anagram1(String s,String str){
        str.toLowerCase();
        s.toLowerCase();

        int freq1[]=new int[256];
        int freq2[]=new int[256];
        int index=0;
        int index1=0;
        if(s.length()!=str.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            index=s.charAt(i);
            freq1[index]++;

            index1=str.charAt(i) ;
            freq2[index1]++;
        }
//        System.out.println(Arrays.toString(freq1));
//        System.out.println(Arrays.toString(freq2));

        for(int i=0;i<256;i++){
            if(freq2[i]!=freq1[i]){
                return false;

            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("===============Anagram===================");
        System.out.println(Anagram("listen","silent"));
        System.out.println(Anagram1("listen is@","silent @is"));
        System.out.println("==============Palindrome=================");
        System.out.println(checkPalindrome("madam"));
        if(checkPalindrome("ARORA")){
            System.out.println("String is palindrome ");
        }
        else System.out.println("not palindrome");
    }
}
