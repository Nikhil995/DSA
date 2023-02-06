package Recursion;

public class sum_of_digit {
    static int sum(int n){
        if(n>0){
           int  r=n%10;
           n=n/10;
            return r+sum(n);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
       int a= sum(549);
       System.out.println(a);
        
    }
    
}
