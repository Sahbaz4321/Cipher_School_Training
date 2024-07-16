package bst_package;


import java.util.Scanner;

class nodebst{
    int data;
    nodebst right,left;
    nodebst(int data){
        this.right=this.left=null;
        this.data=data;
    }
}
public class Solution {

    public nodebst insert(nodebst root,int data){
        if(root==null){
            root=new nodebst(data);
            return root;
        }
        if(data < root.data){
            root.left=insert(root.left,data);
        }
        else{
            root.right=insert(root.right,data);
        }
        return root;
    }
    public void inOrder(nodebst root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

    }

    public void PreOrder(nodebst root){

        if(root!=null){

            System.out.print(root.data+" ");
            PreOrder(root.left);
            PreOrder(root.right);
        }

    }

    public void PostOrder(nodebst root){
        if(root!=null){
           PostOrder(root.left);

            PostOrder(root.right);
            System.out.print(root.data+" ");
        }

    }

    public nodebst delete(nodebst root,int data){
        if(root==null)return root;

        if(data <root.data){
            root.left=delete(root.left,data);
        }
        else if(data > root.data){
            root.right=delete(root.right,data);
        }
        else{
            if(root.left==null){
             return    root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            root.data=minValue(root.right);
            root.right=delete(root.right,root.data);
        }
        return root;
    }
    public int minValue(nodebst root){
        int min= root.data;
        while(root.left!=null){
            min=root.left.data;
            root=root.left;
        }
        return min;
    }


    public boolean search(nodebst root,int data){
        if(root==null)return false;
        if(root.data==data){
            return true;
        }
        else if(data < root.data){
            return search(root.left,data);
        }
        else{
            return search(root.right,data);
        }
    }


    public static void main(String[] args) {
        nodebst root=new nodebst(100);
        Scanner sc=new Scanner(System.in);
        Solution obj=new Solution();
        obj.insert(root,80);
        obj.insert(root,90);
        obj.insert(root,70);
        obj.insert(root,60);
        obj.insert(root,50);
        obj.insert(root,55);
        System.out.print("Binary Tree is :");
//        System.out.print("Inorder traversal is : ");
        obj.inOrder(root);
        System.out.println();
        System.out.print("40 is inserted and Inorder Traversal is :");
        obj.insert(root,40);
        obj.inOrder(root);
        System.out.println();
        System.out.println("90 is deleted");
        System.out.print("After deleting tree is : ");
        root=obj.delete(root,90);
        obj.inOrder(root);
        System.out.println();
        System.out.print("Enter key for search :");

        int n=sc.nextInt();
        boolean found=obj.search(root,n);
        if(found){
            System.out.println(n+" is found ");
        }
        else {
            System.out.println(n+" is not found");
        }
        System.out.print("Inorder traversal is : ");
        obj.inOrder(root);
        System.out.println();
        System.out.print("PreOrder traversal is :");
        obj.PreOrder(root);
        System.out.println();
        System.out.print("PostOrder traversal is :");
        obj.PostOrder(root);
        System.out.println();




    }
}
