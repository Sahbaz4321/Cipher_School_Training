package Tree_Data_Structure;


import java.util.ArrayList;

class nodeIn {
    int data;
    nodeIn left,right;
    nodeIn(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class DeleteNodeInBST{







    public static nodeIn insert(nodeIn root,int val){
        if(root==null){
            root=new nodeIn(val);
        }
        else if(val< root.data){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(nodeIn root){
        if(root!=null){


            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    public static boolean search(nodeIn root,int val){
        if(root==null)return false;
        if(root.data==val){
            return true;
        }
        else if(val<root.data){
            return search(root.left,val);
        }
        else{
            return     search(root.right,val);
        }

    }
    public static nodeIn delete(nodeIn root,int val){
       if(root==null)return root;
       if(val <root.data){
           root.left=delete(root.left,val);
       }
       else if(val > root.data){
           root.right=delete(root.right,val);
       }
       else{
           if(root.left==null){
               return root.right;
           }
           else if(root.right==null){
               return root.left;
           }
           root.data=minValue(root.right);
           root.right=delete(root.right,root.data);
       }
       return root;
    }
    public static int minValue(nodeIn root){
        int min=root.data;
        while(root.left!=null){
            min=root.left.data;
            root=root.left;
        }
        return min;
    }
    public static void printInRange(nodeIn root,int x,int y){
        if(root==null) return;
        if(root.data>=x && root.data<=y){
            printInRange(root.left,x,y);
            System.out.print(root.data+" ");
            printInRange(root.right,x,y);
        }
        else if(root.data>=y){
            printInRange(root.left,x,y);
//            System.out.print(root.data+" ");
        }
        else{
            printInRange(root.right,x,y);
//            System.out.print(root.data+" ");
        }
    }
    public static void printRoot2Leaf(nodeIn root, ArrayList<Integer> list){
       if(root==null)return;
        list.add(root.data);
        printRoot2Leaf(root.left,list);
        printRoot2Leaf(root.right,list);
        list.remove(list.size()-1);
    }

    public static void main(String[] args) {
        nodeIn root=new nodeIn(5);
        insert(root,1);
        insert(root,3);
        insert(root,4);
        insert(root,2);
        insert(root,7);
        inorder(root);

        boolean c=search(root,3);
        if(c){
            System.out.println("key is found");
        }
        else{
            System.out.println("key is not found");
        }
//        root=delete(root,4);
        System.out.println("deleting a node ");
//        System.out.println(delete(root,4).data);
        printInRange(root,3,7);
        printRoot2Leaf(root,);
    }
}


