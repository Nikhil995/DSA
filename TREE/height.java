package tree;
class Tree2{
    Tree2 left;
    Tree2 right;
    int key;
    Tree2(int key){
        this.key=key;
    }
}

public class height {
    static int heightOf(Tree2 root){
        if(root==null){
            return 0;
        }
        else{
            return Math.max(heightOf(root.left),heightOf(root.right))+1;
        }
    }
    
    public static void main(String[] args) {
        Tree2 root=new Tree2(10);
        root.left=new Tree2(20);
        root.right=new Tree2(30);
        root.left.left=new Tree2(40);
        root.left.right=new Tree2(50);
        root.right.left=new Tree2(60);
        root.left.right.left=new Tree2(70);
        System.out.println( heightOf(root));
       
        
    }
    
}
