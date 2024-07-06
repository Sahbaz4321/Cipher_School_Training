package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class node_12{
    int data;
    node_12 left,right;
    node_12(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class Tree4 {
    node_12 root;

    Tree4(int data) {
        root = new node_12(data);
    }

    public int height(node_12 root){
        if(root==null) return 0;
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }

    public void bfs(node_12 root){
        int h=height(root);
        for(int i=1;i<=h;i++){
            printAtlevel(root,i);
        }

    }
    public void IterativeBFS(node_12 root){
        Queue<node_12> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            node_12 temp=q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
    }
    public void printAtlevel(node_12 root,int level){
        if(root==null)return;
        if(level==1){
            System.out.print(root.data+" ");
        }
        printAtlevel(root.left,level-1);
        printAtlevel(root.right,level-1);
    }

    public static void main(String[] args) {

     Tree4 bt1=new Tree4(2);
     bt1.root=new node_12(23);
     bt1.root.left=new node_12(2);
     bt1.root.right=new node_12(3);
     bt1.root.left.right=new node_12(54);
     bt1.root.right.left=new node_12(33);
     int h=bt1.height(bt1.root);
        System.out.println(h);
//bt1.bfs(bt1.root);
bt1.IterativeBFS(bt1.root);
}
}