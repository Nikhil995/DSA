package doublylinkedlist;
class Node{
    Node pre;
    int data;
    Node next;
    Node(int data){
       this.data=data;
    }
}
public class reverse {
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
   static Node reverselist(Node head){
        Node current=head;
        Node previous=null;
        if(head==null || head.next==null){
            return head;
        }
        while(current!=null){
           previous=current.pre;
            current.pre=current.next;
            current.next=previous;
            current=current.pre;  
        }
        return previous.pre; 
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
    
   display(head);
  head= reverselist(head);
  display(head);
   } 
}