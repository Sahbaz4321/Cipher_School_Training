package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=next;
    }
}
public class LinkedList1 {
    static void print(Node temp){
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(5);
        Node second=new Node(6);
        head.next=second;
        Node third=new Node(8);
        second.next=third;
        Node fourth=new Node(9);
        third.next=fourth;
        System.out.println(head.data);
        System.out.println(head.next.data);

        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
        System.out.println("========using loop to print linked lsit==========");
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("=============print element of linked list============");
        print(head);



    }
}
