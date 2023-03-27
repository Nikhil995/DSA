package tree;
import java.util.*;
class Tree4{
    public static Tree root;
    Tree4 left;
    Tree4 right;
    int key;
    Tree4(int key){
        this.key=key;
    }
}


public class levelordert_traversal {
   
    static void levelorder(Tree4 root){
        if(root==null){
            return;
        }
        Queue<Tree4> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size()>1){
            Tree4 current=q.poll();
            if(current==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(current.key+"  ");
            if(current.left!=null)  q.add(current.left);
            if(current.right!=null)  q.add(current.right);
            
        }

    }

    public static void main(String[] args) {
        Tree4 root=new Tree4(10);
        root.left=new Tree4(20);
        root.right=new Tree4(30);
        root.left.left=new Tree4(40);
        root.left.right=new Tree4(50);
        root.right.right=new Tree4(60);
        root.right.right.right=new Tree4(70);
        levelorder(root);
    }
    
}
