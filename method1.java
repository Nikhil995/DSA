//INSERT AT BEGINNING
package linkedlist;

//INSERT AT BEGINNING
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;

    }
}
public class method1{
    

    static Node insertBeginning(Node head, int data) {
        Node temp = new Node(data);
        temp.next=head;
        head=temp;
        

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
        head=insertBeginning(head,10);
        head=insertBeginning(head,20);
        head=insertBeginning(head,30);
        display(head);
    }
}