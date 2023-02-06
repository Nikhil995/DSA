package Recursion;

public class table2 {
    static void tab(int n ,int i){
        if(i>10){
            return;
        }
        else{
            System.out.println(n+ "*"+ i+ "="+ n*i);
            tab(n,i+1);
        }
       
    }
    public static void main(String[] args) {
        tab(2,1);
    }
    
}
