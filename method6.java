//INSERT BEFORE
package linkedlist;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class method6{
    static Node  insertBeginning(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return head;
    }
    static Node insertbefore(Node head,int searchdata,int insertdata){
        Node temp=head;
        Node t1=new Node(insertdata);
        Node t2=null;
        boolean found=false;
        if(temp.data==searchdata){
            t1.next=temp;
            head=t1;
            return head;
        }
        while(temp!=null){
            if(temp.data==searchdata){
                t2.next=t1;
                t1.next=temp;
                found=true;
                break;

            }
            t2=temp;
            temp=temp.next;
        }
      if(found==false){
        System.out.println("data not found");
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
        head=insertBeginning(head, 10);
       head=insertBeginning(head, 20);
       head=insertBeginning(head, 30);
       head=insertBeginning(head, 40);
       head=insertBeginning(head, 0);
       
        head=insertbefore(head, 0, 500);
        display(head);
    }

}
