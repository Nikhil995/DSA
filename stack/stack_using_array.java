// STACK IMPLEMENTATION USING ARRAY
package Stack;
class Stack{
    int top=-1;
    int max=0;
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
            System.out.println("stack is overflow");
        }
    }
    void pop(){
        if(top>-1){
            System.out.println("poped element is"+stack[top]);
            top--;

        }
        else{
            System.out.println("stack is underflow");
        }
    }
    void display(){
        if(top>=0){
            System.out.println("element of stack are");
            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
        else{
            System.out.println("stack is empty");
        }
    }
}

public class stack_using_array {
    public static void main(String[] args) {
        Stack mystack=new Stack(3);
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.pop();
        mystack.display();
    }
    
}
