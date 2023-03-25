package tree;
class Tree1{
    Tree1 left;
    Tree1 right;
    int key;
    Tree1(int key){
        this.key=key;
    }
}

public class search {
    static void match(Tree1 root,int key){
        if(root==null){
            return;
        }
        if(root.key==key){
            System.out.println("match found");
        }
        match(root.left,key);
        match(root.right,key);
    }
    public static void main(String[] args) {
        Tree1 root=new Tree1(10);
        root.left=new Tree1(20);
        root.right=new Tree1(30);
        root.left.left=new Tree1(40);
        root.left.right=new Tree1(50);
        root.right.left=new Tree1(60);
        root.right.right=new Tree1(70);
        match(root,60);
    }
    
}
