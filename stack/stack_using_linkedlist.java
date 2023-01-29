
package Stack;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class Stack{
    Node push(Node top,int data){
        Node temp=new Node(data);
        if(top!=null){
            temp.next=top;
            top=temp;
        }
        else{
            top=temp;
        }
        return top;
    }
    Node pop(Node top){
        if(top!=null){
            System.out.println("poped element are"+top.data);
            top=top.next;
        }
        else{
            System.out.println("stack underflow");
        }
        return top;
    }
    void peak(Node top){
        if(top!=null){
            System.out.println("element available in stack");
            while(top!=null){
                System.out.println(top.data);
                top=top.next;
            }
        }
        else{
            System.out.println("stack is empty");
        }
    }
}
public class stack_using_linkedlist {
    public static void main(String[] args) {
        Node mystack=null;
        Stack s=new Stack();
        mystack=s.push(mystack,1);
        mystack=s.push(mystack,2);
        mystack=s.push(mystack,3);
       s.peak(mystack);
      s.peak(mystack);
       mystack=s.pop(mystack);
    }
    
}
