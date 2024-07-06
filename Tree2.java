package BinaryTree;
class next{
    int data;
    next left,right;
    next(int data){
        this.left=null;
        this.right=null;
        this.data=data;
    }
}
public class Tree2 {
    next root;
    Tree2(int data){
        this.root=new next(data);
    }
    public static int sum(next root){
        if(root==null) return 0;
        return root.data+sum(root.left)+sum(root.right);
    }
    public static int countNode(next root){
        if(root==null) return 0;
        return 1+countNode(root.left)+countNode(root.right);
    }
    public static int leafCount(next root){
        if(root==null) return 0;
        if(root.left==null && root.right==null){
            return 1;
        }
        else{
            return leafCount(root.left)+leafCount(root.right);
        }
    }
    public static int height(next root){
        if(root==null)return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return Math.max(leftHeight,rightHeight)+1;
    }
    public void printAtLevel(next root,int level) {
        if (root == null) return;
        if (level == 1) {
            System.out.print(root.data + " ");


        } else if (level > 1) {


            printAtLevel(root.left, level - 1);

            printAtLevel(root.right, level - 1);
        }
    }


    public static void main(String[] args) {
        Tree2 bt=new Tree2(2);
        bt.root.left=new next(3);
        bt.root.right=new next(4);
        bt.root.left.right=new next(34);
        bt.root.right.left=new next(21);
        System.out.println("sum of node : ");
        int sum=sum(bt.root);
        System.out.println(sum);
        System.out.println("count node is : ");
        int count=countNode(bt.root);
        System.out.println("no of node is : "+count);
int leaf=leafCount(bt.root);
        System.out.println("child is : "+leaf);
        System.out.println("Height of tree is : "+height(bt.root));
bt.printAtLevel(bt.root,1);
        System.out.println();
bt.printAtLevel(bt.root,2);
        System.out.println();
bt.printAtLevel(bt.root,3);
        System.out.println();
    }
}
