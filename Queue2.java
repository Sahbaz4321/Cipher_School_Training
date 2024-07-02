package QueueDataStructure;

public class Queue2 {
int size=6;
int arr[]=new int[size];
int rear=-1,front=-1;
public void add(int data){
    if(rear==size-1){
        System.out.println("queue is full");
        return;
    }
    arr[++rear]=data;
}
    public boolean isFull(){
        return (rear+1)%size==front;
    }
    public void add1(int data){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        int res=arr[front];
        if(rear==front){
            rear=front=-1;
        }
        else{
            front=(front+1)%size;
        }
        return  res;

    }
    public boolean isEmpty(){
        return (rear==-1 && front==-1);
    }

    public int peek1(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        return arr[front];
    }

    public int remove1(){
    if(rear==-1){
        System.out.println("queue is empty");
        return -1;
    }
    int val=arr[0];
    for(int i=0;i<rear;i++){
        arr[i]=arr[i+1];
    }
    rear--;
    return val;

}
public int peek(){
    if(rear==-1){
        System.out.println("queue is empty");
        return -1;
    }
    return arr[0];
}

    public static void main(String[] args) {
        Queue2 q=new Queue2();
        q.add(12);
        q.add(43);
        System.out.println(q.peek());
//        System.out.println("remove element is : "+q.remove());
        System.out.println(q.peek());
    }
}
