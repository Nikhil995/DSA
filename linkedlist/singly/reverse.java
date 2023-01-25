//REVERSE A LINKEDLIST
package linkedlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class reverse {
    static Node insertfirst(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return head;

    }
    static Node reverse(Node head){
        Node curr=head;
        Node previous=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=previous;
            previous=curr;
            curr=temp;
        }
        return previous;
    }
    
    static void display(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node head=null;
        head=insertfirst(head, 0);
        head=insertfirst(head, 10);
        head=insertfirst(head, 1);
        head=insertfirst(head, 1);
        head=insertfirst(head, 40);
        head=reverse(head);
        
       
        
        display(head);
    }
    
}
