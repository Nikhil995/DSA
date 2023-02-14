package QUEUE;
 class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        

    }
}
   class Q{
    
    static  Node head=null; 
    static  Node tail=null;
        
    static boolean isEmpty(){
        return head==null && tail==null;
    }

    static void enqueue(int data){
        Node t=new Node(data);
        if(tail==null){
            tail=head=t;
            return;
        }
        tail.next=t;
        tail=t;
    }

    static Node dequeue(){
        if(head==tail){
            tail=null;

        }
        head=head.next;
        return head;
    }

    static void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
        
     }

     static void peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        System.out.println("peek element is"+head.data);
     }
}


public class queue_using_linklist {
    public static void main(String[] args) {
        
        Q q=new Q();
         q.enqueue(10);
         q.enqueue(20);
         q.enqueue(30);
         q.enqueue(40);
         q.peek();
         q.dequeue();
         q.display();

    }

    
    
}
 