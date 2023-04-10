package binary_tree;



class Tree{
    int key;
    Tree left;
    Tree right;
    Tree(int data){
        key=data;
    }
}

public class min_value {
    static Tree insert(Tree root,int data){
        if(root==null){
            return new Tree(data);
        }
        if(data<root.key){
           return root.left=insert(root.left,data);

        }
        return root.right=insert(root.right,data);
    }

    static int  min(Tree root){
        if(root==null){
            return -1;
        }
        if(root.left==null){
            return root.key;
        }
        return min(root.left);
    }
    public static void main(String[] args) {
        Tree root=null;
        root=insert(root,200);
        insert(root,50);
        insert(root,100);
        insert(root,150);
        insert(root,250);
        insert(root,225);
        insert(root,25);
        System.out.println(min(root));

    }
    
}
