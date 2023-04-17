
class Tree6{
    int data;
    Tree6 left;
    Tree6 right;
    Tree6(int data){
        this.data=data;
    }
    
    
}
    public class no_of_nodes {
       static  int c;

        static void count(Tree6 root){
         
            
            if(root==null){
                return;
            }
            c++;
            count(root.left);
            count(root.right);
            
            
                
            
        }
        public static void main(String[] args) {
            Tree6 root=new Tree6(10);
            root.left=new Tree6(20);
            root.right=new Tree6(20);
            root.left.left=new Tree6(20);
            root.left.right=new Tree6(20);
            root.right.left=new Tree6(20);
            count(root);
            System.out.println(c);
        }
        
    
}
