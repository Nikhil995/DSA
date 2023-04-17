
class Tree7{
    int data;
    Tree7 right;
    Tree7 left;
    Tree7(int data){
        this.data=data;
    }


}
    public class leave_node {
        static int c;
        static void leave(Tree7 root){
            if(root==null){
                return;
            }
            if(root.left==null  && root.right==null){
                c++;
                System.out.println(root.data);
                
                return;
            }
            leave(root.left);
            leave(root.right);


        }
        public static void main(String[] args) {
            Tree7 root=new Tree7(10);
            root.left=new Tree7(20);
            root.right=new Tree7(30);
            root.left.left=new Tree7(40);
            root.left.right=new Tree7(50);
            root.right.left=new Tree7(60);
            root.right.right=new Tree7(70);
            root.left.left.left=new Tree7(90); 
         //   root.left.left.right=new Tree7(100);
            leave(root);
            System.out.println(c);

            
        }
    
}
