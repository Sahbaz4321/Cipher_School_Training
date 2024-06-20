package LinkedList;
class Nodes{
    int data;
    Nodes next;
    Nodes(int data){
        this.data=data;
        this.next=next;
    }
}

public class LinkedList3 {
    static Nodes insertAtAny(int data,Nodes head,int n){
        Nodes any=new Nodes(data);

        if(n==0) {
            any.next = head;
            return any;
        }
        Nodes temp=head;
            for(int i=0;i<n-1;i++){
         temp=temp.next;
            }
            any.next=temp.next;
            temp.next=any;

            return head;

    }
    static void print(Nodes head){
        if(head==null) System.out.println("empty linked list");
        Nodes temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static Nodes deleteAtAny(Nodes head,int n){
        if(n==0){
            head=head.next;
            return head;
        }
        Nodes temp=head;
        for(int i=0;i<n-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
    static Nodes delete(Nodes head){
        return null;
    }
    static Nodes recursivelyRiverse(Nodes head){
        if(head==null || head.next== null){
            return head;
        }
        Nodes newHead=recursivelyRiverse(head.next);
        Nodes headNext=head.next;
        headNext.next=head;
        head.next=null;
        return  newHead;
    }
    static Nodes reverse(Nodes head){
        Nodes curr=head;
        Nodes prev=null;
        while(curr!=null){
            Nodes temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
   static void val(Nodes head,int k){
        Nodes slow=head;
        Nodes fast=head;

        for(int i=0;i<k;i++){
            if(fast==null) System.out.println("null");
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String[] args) {
     Nodes head=new Nodes(5);
        Nodes second=new Nodes(6);
        Nodes third=new Nodes(7);
     head.next=second;
     second.next=third;
     print(head);
        System.out.println();
     head=insertAtAny(34,head,0);
     print(head);
//     head=delete(head);
//        System.out.println();
//     print(head);
        System.out.println();
//head=deleteAtAny(head,2);
//print(head);
        System.out.println("=============reverse=========");
//head=reverse(head);
//        head=recursivelyRiverse(head);
//print(head);
        System.out.println();
        val(head,1);
    }
}
