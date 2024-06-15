package LinkedList;
class Node1{
    String  data;
    Node1 next;
    Node1(String data){
        this.data=data;
        this.next=null;

    }
}
public class LinkedList2 {
    static void print(Node1 temp){
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    static Node1 insertAtHead(Node1 head,String data){
        Node1 temp=new Node1(data);
        temp.next=head;
        head=temp;
        return head;

    }
    static Node1 insertAtLast(Node1 head,String data){
        if(head==null) return new Node1(data);
        Node1 temp=new Node1(data);
        Node1 last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=temp;
        return head;
    }
    public static void main(String[] args) {
//        Node1 head=new Node1("Apple");
//        Node1 second =new Node1("Banana");
//        head.next=second;
//        Node1 third=new Node1("Fruit");
//        second.next=third;
////        print(head);
//        head=insertAtHead(head,"Grapes");
//
//        print(head);
//        System.out.println("=============Insert at last==============");
//        head=insertAtLast(head,"Pineapple");
//        print(head);

Node1 head2=insertAtLast(null,"Lion");
print(head2);

    }
}
