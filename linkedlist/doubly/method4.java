// INSERT AFTER GIVEN NODE
package doublylinkedlist;
class Node{
    Node pre;
    int data;
    Node next;
    Node(int data){
       this.data=data;
    }
}
public class method4 {
    static Node insertbeginning(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        head.pre=temp;
        return head;
    }
    static Node insertafter(Node head,int datas,int datai){
        Node temp=head;
        Node t=new Node(datai);
        boolean found=false;
        while(temp!=null){
            if(temp.data==datas){
                t.next=temp.next;
                temp.next=t;
                t.pre=temp;
                found=true;
                break;
            }
           temp=temp.next;

        }
        if(found==false){
            System.out.println("data not inserted");
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
    head=insertbeginning(head,0);
    head=insertafter(head, 0, 42);
     display(head);
   } 
}


    

