package tree;
class Tree{
    Tree left;
    Tree right;
  
    char data;
    public Object rigth;
    Tree(char data){
        this.data=data;
    }
}

public class posstorder_traversal {
    public static void main(String[] args) {
        
    
    Tree root=new Tree('A');
       
    root.left=new Tree('B');
    root.right=new Tree('C');
    root.left.right=new Tree('D');
    
    

    postorder(root);
    }

     static void postorder(Tree root){
        if(root==null){
            return;
        }
        
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
     }

    
}

