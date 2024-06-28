package Stack;
class stack{
    int size=10;
    int arr[]=new int[size];
    int top=-1;

    int pop(){
        if(this.isEmpty()){
            System.out.println("nothing to pop");
            return -1;
        }
int ele=arr[top];
top--;
return ele;
    }
    boolean isEmpty(){
return top==-1;
    }
    void push(int data){
        if(top>=size-1){
            System.out.println("stack overflow");
            return;
        }

top++;
arr[top]=data;

    }
    int peek(){
        if(isEmpty()){
            System.out.println("stack is Empty");
            return -1;
        }
        return arr[top];
    }
}
public class Mystack {


    public static void main(String[] args) {
stack a1=new stack();
        System.out.println("=============Stack is Implemented==============");
        System.out.println(a1.isEmpty());
        System.out.println(a1.peek());
a1.push(23);
a1.push(43);
        a1.push(23);


        System.out.println(a1.isEmpty());
        System.out.println(a1.peek());
        System.out.println(a1.pop());
        System.out.println(a1.peek());
    }
}
