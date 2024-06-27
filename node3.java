package LinkedListInJava;
class node1
{
    int data;
    node1 next;
    node1(int data){
        this.data=data;
        this.next=null;
    }
}
public class node3 {
    static node1 insert(node1 head,int n){

        node1 temp=new node1(n);
        if(head==null){
            head=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        if(temp.next==null){
            temp.next=head.next.next;
        }
        return head;
    }

    static void print(node1 head){
        node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }
    static void createLoop(node1 head){
        if(head==null ||  head.next==null){
            return;
        }
        node1 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head.next.next;
    }
    static node1 detectCycle(node1 head){
        node1 slow=head;
        node1 fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return slow;
            }

        }
        return null;
    }
    static node1 detectFirstNode(node1 head){
        node1 meet=detectCycle(head);
        node1 temp=head;
        while(temp!=meet){
            meet=meet.next;
            temp=temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        node1 head=new node1(23);

        head=insert(head,1);
        head=insert(head,22);
       head= insert(head,42);
        head=insert(head,2);


        print(head);
        createLoop(head);
        node1 temp=detectCycle(head);
        System.out.println(temp.data);
        System.out.println("==============detect starting cycle node=========");
        node1 start=detectFirstNode(head);
        System.out.println(start.data);
    }
}
