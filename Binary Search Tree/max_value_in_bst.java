package binary_tree;
class Tree3{
    int key;
    Tree3 left;
    Tree3 right;
    Tree3(int data){
        key=data;
    }
}
public class max_value_in_bst {
    static Tree3 insert(Tree3 root,int data){
        if(root==null){
            return new Tree3(data);
        }
        if(data<root.key){
           return root.left=insert(root.left,data);

        }
        return root.right=insert(root.right,data);
    }

    static int  max(Tree3 root){
        if(root==null){
            return -1;
        }
        if(root.right==null){
            return root.key;
        }
        return max(root.right);
    }
    public static void main(String[] args) {
        Tree3 root=null;
        root=insert(root,200);
        insert(root,50);
        insert(root,100);
        insert(root,150);
        insert(root,250);
        insert(root,225);
        insert(root,25);
        System.out.println(max(root));

    }
    
}

    

