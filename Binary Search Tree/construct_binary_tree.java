package binary_tree;

class Tree1{
    int key;
    Tree1 left;
    Tree1 right;
   
}

public class construct_binary_tree {
    static Tree1 newnode(int key){
        Tree1 temp=new Tree1();
        temp.key=key;
        temp.left=temp.right=null;
        return temp;

    }
   static Tree1 insert(Tree1 root,int key){
    if(root==null){
        return newnode(key);
    }
    if(key<root.key){
        root.left=insert(root.left,key);
    }
    else if(key>root.key){
        root.right=insert(root.right,key);

    }
    return root;

   }

   static void inorder(Tree1 root){
    if(root!=null){
        inorder(root.left);
        System.out.println(" "+root.key);
        inorder(root.right);
    }
   }
   public static void main(String[] args) {
    Tree1 root=null;
    root=insert(root,50);
    root=insert(root,30);
    root=insert(root,20);
    root=insert(root,40);
    root=insert(root,70);
    root=insert(root,60);
    root=insert(root,80);
    inorder(root);
   }
}
