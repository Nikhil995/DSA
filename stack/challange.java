import java.util.Scanner;
class Stack{
    int top=-1;
    int  max=0;
    int stack[];
    Stack(int size){
        max=size;
        stack=new int[max];

    }
    void push(int data){
        if(top<max-1){
            stack[++top]=data;
           
        }
        else{
            System.out.println("position out of range");
        }
        
    }
    int pop(){
        
        return stack[top--];
    }
    void display(){
        if(top>=0){
            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
        else{
            System.out.println("stack is empty");
        }
    }
}
public class challange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
         System.out.println("enter no of element in stack");
          int n=sc.nextInt();
        Stack mystack=new Stack(n);
       for(int i=0;i<n;i++){
           System.out.println("enter element in stack");
             int z=sc.nextInt();
           mystack.push(z);
       }
        System.out.println("element in stack are");
       mystack.display();
       System.out.println("enter no of row to be deleted");
        int a=sc.nextInt();
        int q=n-a+1;
       Stack s=new Stack(q);
       for(int i=0;i<=n-a;i++){
           int m=n-i;
           System.out.println("row"+ m+"is detching");
           int x=mystack.pop();
           s.push(x);
       }
       s.pop();
       for(int i=0;i<q-1;i++){
           int l=a+1+i;
           System.out.println("row"+ l +"is adding");
           int x=s.pop();
           mystack.push(x);
       }
       mystack.display();
       
    }
}