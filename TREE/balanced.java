
class tree{
    int key;
    tree right;
    tree left;
    tree(int key){
        this.key=key;
    }


}
    public class balanced {
        static boolean isbalance(tree root){
            if(root==null){
                return true;
            }
            if(Math.abs(height(root.left)-height(root.right))>1){
                return false;
            }
            return isbalance(root.left) && isbalance(root.right);

        }
        static int height(tree root){
            if(root==null){
                return 0;

            }
            return Math.max(height(root.left),height(root.right))+1;
        }
        public static void main(String[] args) {
            tree root=new tree(100);
            root.left=new tree(80);
            root.left.left=new tree(120);
            root.left.left.right=new tree(30);
            root.right=new tree(200);
            System.out.println( isbalance(root));
          
        }
    
}
