// MIDDLE OF LINKEDLIST
package linkedlist;
class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;

        }
}

public class middledata {
    static Node insertfirst(Node head,int data){
        Node temp=new Node(data);
        
            temp.next=head;
            head=temp;
            return head;
    }
    static void middle(Node head){
        Node t1=head;
        Node t2=head;
        while(t2!=null && t2.next!=null){
            t1=t1.next;
            t2=t2.next.next;
        }
        System.out.println(t1.data);
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
        head=insertfirst(head, 20);
        head=insertfirst(head, 30);
        head=insertfirst(head, 40);
        head=insertfirst(head, 40);
        display(head);
        middle(head);

    }
    
}
