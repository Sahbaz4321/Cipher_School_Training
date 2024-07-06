package BinaryTree;

import org.w3c.dom.Node;

class NodeTree{
    int data;
    NodeTree left,right;

    NodeTree(int data){
        this.data=data;
        this.right=this.left=null;
    }
}
public class Tree3 {
    NodeTree root;
    Tree3(int data){
        root=new NodeTree(data);
    }
public void preorder(NodeTree root){
        if(root==null){
            return;
        }
    System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
}
public void inorder(NodeTree root){
        if(root==null){
            return;
        }
        preorder(root.left);
    System.out.print(root.data+" ");
    preorder(root.right);
}
public void postorder(NodeTree root){
        if(root==null){
            return;
        }
        preorder(root.left);
        preorder(root.right);
    System.out.print(root.data+" ");
}

public boolean identical(NodeTree root1,NodeTree root2){
        if(root1==null && root2==null ){
            return true;
        }
        if(root1==null || root2==null)return false;

        return (root1.data==root2.data && identical(root1.left,root2.left) && identical(root1.right,root2.right));

}

    public static void main(String[] args) {
     Tree3 bt=new Tree3(2);
        bt.root.left=new NodeTree(23);
        bt.root.right=new NodeTree(21);
        bt.root.left.right=new NodeTree(3);
        bt.root.right.right=new NodeTree(4);


        System.out.println("element of tree are : ");
        bt.preorder(bt.root);
        System.out.println();
        System.out.println("inorder traversal is : ");
        bt.inorder(bt.root);
        System.out.println();
        System.out.println("postorder traversal is : ");
        bt.postorder(bt.root);
        System.out.println();


        System.out.println("tree 2 : ");
        Tree3 bt1=new Tree3(2);
        bt1.root.left=new NodeTree(23);
        bt1.root.right=new NodeTree(21);
        bt1.root.left.right=new NodeTree(3);
        bt1.root.right.right=new NodeTree(4);
        bt1.inorder(bt1.root);
if(bt.identical(bt.root,bt1.root)){
    System.out.println("identical tree");
}
else{
    System.out.println("not identical");
}
    }
}
