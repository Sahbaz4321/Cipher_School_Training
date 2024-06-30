package Stack;

import java.util.Stack;

public class InfixToPostfix {
public static int evaluate(String s)
{
    Stack<Integer> stack=new Stack<>();
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(Character.isDigit(ch)){
            stack.push(ch - '0');

        }
        else
        {
            int right=stack.pop();
            int left=stack.pop();
            int res=calculate(left,right,ch);
            stack.push(res);
        }
    }
    return stack.pop();
}
public static int calculate(int left,int right,char ch)
{
    int res=0;
    switch(ch)
    {
        case '+':
            res=left+right;
            break;

        case '-':
            res=left-right;
            break;

        case '*':
            res=left*right;
            break;

        case '/':
            res=left/right;
            break;
    }
    return res;
}
    public static void main(String[] args) {
        System.out.println(evaluate("231*+9-"));
    }
}
