// DELETE FIRST NODE
package doublylinkedlist;
class Node{
    Node pre;
    int data;
    Node next;
    Node(int data){
       this.data=data;
    }
}
public class method6 {
   static Node insertbeginning(Node head,int data){
       Node temp=new Node(data);
          if(head==null){
           head=temp;
       }
       else{
           temp.next=head;
           head.pre=temp;
           head=temp;
       }
       return head;
   }
   static void display(Node head){
       while(head!=null){
           System.out.println(head.data);
           head=head.next;
       }
   }
   static Node deletefirst(Node head){
    if(head==null){
        System.out.println("linkedlist is empty");
    }
    else{
        System.out.println("data to be deleted"+head.data);
        head=head.next;
        head.next.pre=null;
    }
    return head;
   }
   
   public static void main(String[] args) {
       Node head=null;
   
   head=insertbeginning(head,0);
   head=insertbeginning(head,10);
   head=insertbeginning(head,20);
   head=deletefirst(head);
    
   display(head);
   } 
}
