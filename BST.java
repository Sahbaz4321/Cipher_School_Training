package Tree_Data_Structure;
class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class BST {

    public static Node insert(Node root,int val) {

        if (root == null) {
            root = new Node(val);

            return root;
        }
if(val < root.data){
    root.left=insert(root.left,val);
}
else{
    root.right=insert(root.right,val);
}

return root;
    }

    public  static void Inorder(Node root) {
        if (root != null) {


            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }
    public static void PreOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }
    public static void PostOrder(Node root){
        if(root!=null){
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data+" ");
        }
    }


    public static void main(String[] args) {
Node root=new Node(5);
insert(root,1);
        insert(root,3);
        insert(root,4);
        insert(root,2);
        insert(root,7);
Inorder(root);
        System.out.println();
PreOrder(root);
        System.out.println();
PostOrder(root);
    }
}
