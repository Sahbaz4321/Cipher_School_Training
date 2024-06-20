package LinkedList;

import java.util.Scanner;

class node12 {
    int data;
    node12 next;
    node12(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedList4 {
static node12 insert(int data,node12 head){
    node12 n=new node12(data);
    if(head==null){
        head=n;
        return head;
    }
    else{
        node12 current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=n;
    }
    return head;


}
    static node12 insertAtHead(node12 head,int data){
        node12 temp=new node12(data);
        temp.next=head;
        head=temp;
        return head;

    }
    static node12 insertAtLast(node12 head,int data){
        if(head==null) return new node12(data);
        node12 temp=new node12(data);
        node12 last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=temp;
        return head;
    }

    static node12 insertAtPosition(node12 head,int data,int n){
        node12 Any =new node12(data);
        if(n==0) {
            Any.next = head;
            head=Any;
            return Any;
        }
        node12 temp=head;
        for(int i=0;i<n-1 && temp!=null;i++){
            temp=temp.next;
        }
        Any.next=temp.next;
        temp.next=Any;
        return head;
    }
static void print(node12 head){
    node12 temp=head;
    while(temp!=null){
        System.out.print(temp.data+" -> ");
        temp=temp.next;
    }

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbe rof elemen to enter linked list :");
        int n=sc.nextInt();

        node12 p=null;
for(int i=0;i<n;i++){
    System.out.print("enter element");

    int ele=sc.nextInt();
//    node1 p=new node1();
    p=insert(ele,p);


}
        print(p);
    }
}
