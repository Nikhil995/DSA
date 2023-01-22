// DELETION FROM GIVEN POSITION
package linkedlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class method10 {
    static Node insertfirst(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return head;


    }
    static Node deleteat (Node head,int position){
        Node temp=head;
        int c=0;
        int n=position;
        if(position<=0){
            System.out.println("invalid position");
        }
        if(position==1){
            System.out.println("deleted data"+head.data);
            head=head.next;
        }
        
        else{
            if(temp!=null){
                while(temp!=null){
                    c++;
                    if(c!=n-1){
                        temp=temp.next;
                    }
                    else{
                        System.out.println("deleted data"+temp.next.data);
                        temp.next=temp.next.next;
                    }
                }
            }
            else{
                System.out.println("linkedlist is empty");
            }
          

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
         head=insertfirst(head, 0);
        head=insertfirst(head, 10);
        head=insertfirst(head, 20);
        head=deleteat(head, 3);
        display(head);
    }
    
}
