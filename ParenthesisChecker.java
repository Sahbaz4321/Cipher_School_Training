package Stack;
import java.util.Stack;
public class ParenthesisChecker {
  static   public boolean checker(String x){
        if(x.length()%2!=0)return false;

        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty())return false;
               if(isPair(stack.peek(),ch)){
                   stack.pop();
               }
               else{
                   return false;
               }
            }
        }
        if(!stack.isEmpty())return false;
        return true;
    }
    static boolean isPair(char a,char b){
        return (a=='{' && b=='}' || a=='[' && b==']' || a=='(' && b==')');
    }
    public static void main(String[] args) {

        System.out.println(checker("[({})]"));
    }
}
