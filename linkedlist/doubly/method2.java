package doublylinkedlist;

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
    
}
