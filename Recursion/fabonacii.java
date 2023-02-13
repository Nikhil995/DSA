package Recursion;

public class fabonacii {
    static int fab(int n){
        if(n<=1)
        return n;
        else{
            return fab(n-1)+fab(n-2);
        }
       

    }
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){

        
        System.out.print(fab(i)+" ");
        }
        
    }
        
}
    

