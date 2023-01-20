package doublylinkedlist;
class Node{
    Node pre;
    int data;
    Node next;
    Node(int data){
       this.data=data;
    }
}
public class method2 {
    static Node insertlast(Node head,int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=temp;
            n.pre=n;
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
        head=insertlast(head, 0);
        head=insertlast(head, 20);
        head=insertlast(head, 10);
        display(head);
    }
    
}
