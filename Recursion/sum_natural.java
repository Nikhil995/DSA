package Recursion;

public class sum_natural {
    static int sum(int n){
        if(n==0){
            return 0;   
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        int s=sum(5);
        System.out.println(s);
        
    }
    
}
