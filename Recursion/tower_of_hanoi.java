package Recursion;

public class tower_of_hanoi {
    static void tower(int n,char A,char B,char C){
        if(n==1){
            System.out.println("move 1 from" +" "+ A +" "+ "to" +" "+ C);
            return;
        }
        tower(n-1,A,C,B);
        System.out.println("move"+" " +n+" "+ "from" +" "+ A + " "+"to" +" "+ C );
        tower(n-1,B,A,C);
    }
    public static void main(String[] args) {
        tower(3,'A','B','C');
    }
    
}
