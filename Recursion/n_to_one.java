package Recursion;

public class n_to_one {
    static void fun(int n){
        if(n==0){
            return ;
        }
        else{
            System.out.print(" "+n);
            fun(n-1);
        }

    }
    public static void main(String[] args) {
        fun(5);
    }
    
}
