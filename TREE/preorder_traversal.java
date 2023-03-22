package tree;
class Tree{
    Tree left;
    Tree right;
  
    char data;
    Tree(char data){
        this.data=data;
    }
}

public class preorder_traversal {
    public static void main(String[] args) {
        
    
    Tree root=new Tree('A');
       
    root.left=new Tree('B');
    root.right=new Tree('C');
    root.left.right=new Tree('D');

    preorder(root);
    }

     static void preorder(Tree root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
     }

    
}
