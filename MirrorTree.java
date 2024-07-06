package BinaryTree;
class node_1{
    int data;
    node_1 left,right;
    node_1(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class MirrorTree {
node_1 root;
MirrorTree(int data){
    root=new node_1(data);
}

public boolean mirror(node_1 root1,node_1 root2){
    if(root1==null && root2==null) return true;
    if(root1==null || root2==null) return false;
    return (root1.data==root2.data) && mirror(root1.left,root2.right) && mirror(root1.right,root2.left);
}
public  boolean SameDataStructure(node_1 root1,node_1 root2){
    if(root1==null && root2==null)return true;
    if(root1==null || root2==null)return false;

    return SameDataStructure(root1.left,root2.left) && SameDataStructure(root1.right ,root2.right);
}



    public static void main(String[] args) {
        MirrorTree bt=new MirrorTree(2);
        bt.root.left=new node_1(3);
        bt.root.right=new node_1(4);
        bt.root.left.right=new node_1(9);
        bt.root.right.left=new node_1(7);



        MirrorTree bt1=new MirrorTree(2);
        bt1.root.left=new node_1(4);
        bt1.root.right=new node_1(3);
        bt1.root.left.right=new node_1(7);
        bt1.root.right.left=new node_1(9);
        System.out.println("check if two tree are mirror of one another : ");
        if(bt.mirror(bt.root,bt1.root)){
            System.out.println("given tree are mirror ");

        }
        else{
            System.out.println("given treee are not mirror");
        }
        System.out.println("check if two tree are of same data structure");
        if(bt.SameDataStructure(bt.root,bt1.root)){
            System.out.println("same sructure ");
        }
        else{
            System.out.println("not same");
        }
    }
}
