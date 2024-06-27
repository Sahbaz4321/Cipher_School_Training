package LinkedListInJava;
class node12
{
    int data;
    node12 next;
    node12(int data){
        this.data=data;
        this.next=null;
    }
}
public class RemoveCycle {
    static node12 insert(node12 head,int n){

        node12 temp=new node12(n);
        if(head==null){
            head=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }

        return head;
    }

    static void print(node12 head){
        node12 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }
    static void createLoop(node12 head){
        if(head==null ||  head.next==null){
            return;
        }
        node12 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head.next.next;
    }
    static node12 detectCycle(node12 head){
        node12 slow=head;
        node12 fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return slow;
            }

        }
        return null;
    }
    static node12 detectFirstNode(node12 head){
        node12 meet=detectCycle(head);
        node12 temp=head;
        while(temp!=meet){
            meet=meet.next;
            temp=temp.next;
        }
        return temp;
    }
    static void removeCycle(node12 head){
        node12 meet=detectCycle(head);
        node12 prev=meet.next;
        prev.next=null;
        System.out.println("cycle is removed");
    }

    public static void main(String[] args) {
        node12 head=new node12(23);

        head=insert(head,1);
        head=insert(head,22);
        head= insert(head,42);
        head=insert(head,2);


        print(head);
        createLoop(head);
        node12 temp=detectCycle(head);
        System.out.println(temp.data);
        System.out.println("==============detect starting cycle node=========");
        node12 start=detectFirstNode(head);
        System.out.println(start.data);
        removeCycle(head);

    }
}
