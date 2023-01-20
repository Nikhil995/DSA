//DELETION FROM LAST
package linkedlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
 }


public class method9 {
    static Node insertbeginning(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return head;
    }
   static Node deletelast(Node head){
        Node temp=head;
        Node t=head.next;
        if(temp==null){
            System.out.println("linked list is empty");
        }
        while(temp.next!=null){
            t=temp;
            temp=temp.next;
        }
        System.out.println("data to be deleted"+t.next.data);
        t.next=null;
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
        head=insertbeginning(head, 0);
        head=insertbeginning(head, 10);
        head=insertbeginning(head, 20);
        head=deletelast(head);                                                                                                                                                                                                                                                                                                                                
        display(head);
    }
    
}
