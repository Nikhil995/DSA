//INSERT AT GIVEN POSITION
package linkedlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;

    }
}
public class method7 {

    static Node  insertBeginning(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return head;
    }
    
    static Node insertat(Node head,int position,int data){
        Node temp=head;
        if(position<1){
            System.out.println("invalid position");
        }
        if(position==1){
            Node t=new Node(data);
            t.next=temp;
            head=t;

        }
        else{
            for(int i=1;i<position-1;i++){
               temp=temp.next;
            }
            Node t=new Node(data);
            t.next=temp.next;
            temp.next=t;
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
         head=insertBeginning(head, 30);
        
         head=insertat(head, 3, 50);
         display(head);
    
}
}
