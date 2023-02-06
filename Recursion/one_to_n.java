package Recursion;

public class one_to_n {
    static void fun(int n){
        if(n==0){
            return;
        }
        else{
            fun(n-1);
            System.out.print(" "+n);
        }
    }
    public static void main(String[] args) {
        fun(5);
    }
    
}
