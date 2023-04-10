package binary_tree;

class Tree2{
    int key;
    Tree2 right;
    Tree2 left;
    Tree2(int data){
        key=data;
    }
}
public class search_in_bst {

    static boolean search(Tree2 root,int key){
        if(root==null){
            return  false;
        }
        if(root.key==key){
            return true;
        }
        if(root.key>key){

        
        return search(root.left,key);
        }
        return search(root.right,key);

    }
    public static void main(String[] args) {
        Tree2 root=new Tree2(100);
        root.left=new Tree2(75);
        root.right=new Tree2(150);
        root.left.right=new Tree2(80);
        root.left.left=new Tree2(50);
        root.right.left=new Tree2(125);
        root.right.right=new Tree2(175);
        System.out.println(search(root,650));
      

    }
    
}

    

