package QueueDataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueue {
Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();


    public void add(int data){
        q1.add(data);
    }
    public int pop(){
        if(q1.isEmpty())return -1;

        while(q1.size()!=1){
            q2.add(q1.poll());
        }
        int temp=q1.poll();

        Queue<Integer> queue=q1;
        q1=q2;
        q2=queue;
//        System.out.println(q1);
//        System.out.println(q2);



        return temp;

    }
    public static void main(String[] args) {
StackUsingQueue q=new StackUsingQueue();

Stack<Integer> stack=new Stack<>();
stack.add(32);
        stack.add(1);
        stack.add(4);
        stack.add(5);
        System.out.println("Stack element are : "+stack);
        System.out.println("remove element in stack : "+stack.pop());
        System.out.println("remove element in stack : "+stack.pop());


q.add(32);
q.add(1);
q.add(4);
q.add(5);

        System.out.println(q.pop());
        System.out.println("=================Queue act as stack=====================");
        System.out.println(q.q1);
        System.out.println("pop element are : "+q.pop());
        System.out.println("pop element are : "+q.pop());
    }
}
