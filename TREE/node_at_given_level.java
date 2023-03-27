package tree;
class Tree3{
    Tree3 right;
    Tree3 left;
    int key;
    Tree3(int key){
        this.key=key;
    }
}


public class node_at_given_level {
    static void atlevel(Tree3 root,int level){
        if(root==null){
            return;
        }
        if(level==0){
            System.out.print(root.key+"  ");
        }
        atlevel(root.left,level-1);
        atlevel(root.right,level-1);
    }
    public static void main(String[] args) {
        Tree3 root=new Tree3(10);
        root.left=new Tree3(20);
        root.right=new Tree3(30);
        root.left.left=new Tree3(40);
        root.left.right=new Tree3(50);
        root.right.right=new Tree3(60);
        root.right.right.right=new Tree3(70);
        atlevel(root, 2);
        
    }
    
}
