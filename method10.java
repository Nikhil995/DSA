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
    static Node insertbeginning(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return head;
    }
    static Node deleteat(Node head,int position){
        Node temp=head;
        if(temp!=null){
            for(int i=1;i<position-1;i++){
                temp=temp.next;
            }
            System.out.println("data to be deleted"+temp.next.data);
            temp.next=temp.next.next;
        }
        else{
            System.out.println("linkled list is empty");
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
        head=insertbeginning(head, 0);
        head=insertbeginning(head, 10);
        head=insertbeginning(head, 20);
        head=deleteat(head, 2);                                                                                                                                                                                                                                                                                                                            
        display(head);
    }
}