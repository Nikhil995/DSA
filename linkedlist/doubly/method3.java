// INSERT AT GIVEN POSITION
package doublylinkedlist;
class Node{
    Node pre;
    int data;
    Node next;
    Node(int data){
       this.data=data;
    }
}
public class method3 {
    static Node insertbeginning(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        head.pre=temp;
        return head;
    } static Node insertat(Node head,int position,int data){
        Node temp=head;
        Node t=new Node(data);
        if(position<0){
            System.out.println("invalid position");
        }
        if(position==1){
            t.next=temp;
            temp.pre=t;
            head=t;
        }
        else{
            for(int i=0;i<position-1;i++){
                temp=temp.pre;
            }
            t.next=temp.next;
            temp.next=t;
            t.pre=temp;

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
   
   head=insertat(head, 3, 42);
    
   display(head);
   } 

    
}
