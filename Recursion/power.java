package Recursion;

public class power {
    static int pow(int n,int x){
       
        if(n==0){
            return 0;
        }
        if(x==0){
        return 1;
        }
        if(x>0){
            return n*pow(n,x-1);
        }
        return 0;
       
       
    }
    
    public static void main(String[] args) {
        int n=5;
        int x=4;
        int a=pow(n,x);
        System.out.println(a);
        
    }
    
}
