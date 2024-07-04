package BinaryTree;
class node{
    int data;
    node left,right;
    node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class Tree1 {
    node root;
    Tree1(int data){
        this.root=new node(data);
    }

    int treeSum(node root){

        if(root==null)return 0;

        return root.data+treeSum(root.left)+treeSum(root.right);
    }

    int countNode(node root){
        if(root==null) return 0;

        return 1+ countNode(root.left)+countNode(root.right);
    }


    public static void main(String[] args) {
Tree1 bt=new Tree1(2);
bt.root.left=new node(3);
bt.root.right=new node(5);
bt.root.left.right=new node(9);
bt.root.right.left=new node(7);

        System.out.println("sum of all nodes in binary tree : ");
        int sum= bt.treeSum(bt.root);
        System.out.println(sum);
        int count= bt.countNode(bt.root);
        System.out.println("count of node is : "+count);

    }
}
