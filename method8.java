//DELTION FROM BEGNINNING
package linkedlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class method8 {

    static Node  insertBeginning(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return head;
    }
    static Node deletefirst(Node head){
     
       if(head==null){
        System.out.println("linked list is empty");
       }
       else{
        System.out.println("deleted data is"+head.data);
        head=head.next;
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
        head=insertBeginning(head, 0);
        head=insertBeginning(head, 10);
        head=insertBeginning(head, 20);
        head=deletefirst(head);
        display(head);    
    }
}
    
