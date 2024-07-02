package QueueDataStructure;

import java.util.Stack;

public class QueueUsingTwoStack {
Stack<Integer> s1=new Stack<>();
Stack<Integer> s2=new Stack<>();

public void add(int data){
    s1.push(data);
}
public int pop(){
    while(!s1.isEmpty()){
        s2.push(s1.pop());
    }
    int ans=s2.pop();
    while(!s2.isEmpty()){
        s1.push(s2.pop());
    }
    return ans;
}

    public static void main(String[] args) {
    QueueUsingTwoStack q1=new QueueUsingTwoStack();
    q1.add(32);
    q1.add(54);
    q1.add(3);
        System.out.println(q1.s1);
        System.out.println(q1.pop());

    }
}
