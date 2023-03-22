package tree;
class Tree{
    public static Tree root;
    Tree left;
    Tree right;
    char data;
    Tree(char data){
        this.data=data;
    }
}

public class inorder_traversal {

    public static void main(String[] args) {
      
        Tree root=new Tree('A');
       
        root.left=new Tree('B');
        root.right=new Tree('C');
        root.left.left=new Tree('D');
        root.left.right=new Tree('E');
     
        root.left.left.left=new Tree('F');
        root.left.left.right=new Tree('G');
        root.left.right.left=new Tree('H');
        root.left.right.right=new Tree('I');
       
        inorder(root);
    }

    static void inorder(Tree root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    
}
