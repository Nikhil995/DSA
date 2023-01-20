package doublylinkedlist;
class Node{
     Node pre;
     int data;
     Node next;
     Node(int data){
        this.data=data;
     }
}
public class method1 {
    static Node insertbeginning(Node head,int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }
        else{
            temp.next=head;
            head.pre=temp;
            head=temp;
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
    
    head=insertbeginning(head,0);
    head=insertbeginning(head,10);
    head=insertbeginning(head,20);
     
    display(head);
    } 
}
