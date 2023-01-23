// DELETE LAST NODE
package doublylinkedlist;
class Node{
    Node pre;
    int data;
    Node next;
    Node(int data){
       this.data=data;
    }
}
public class method7 {
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
   static Node deletelast(Node head){
    Node temp=head;
    if(head==null){
        System.out.println("linkedlist is empty");
    }
    else{
        while(temp.next!=null){
            temp=temp.next;
        }
        System.out.println("data to be deleted"+temp.data);
        temp.pre.next=null;
    }
    return head;
}
   static void display(Node head){
       while(head!=null){
           System.out.println(head.data);
           head=head.next;
       }
   }
   
   public static void main(String[] args) {
       Node head=null;
   
   head=insertbeginning(head,0);
   head=insertbeginning(head,10);
   head=insertbeginning(head,20);
   head=deletelast(head);
    
   display(head);
   } 
}
