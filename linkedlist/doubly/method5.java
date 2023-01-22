// INSERT BEFORE GIVEN NODE
package doublylinkedlist;

class Node{
    Node pre;
    int data;
    Node next;
    Node(int data){
       this.data=data;
    }
}
public class method5 {
    static Node insertbeginning(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        head.pre=temp;
        return head;
    }
    static Node insertbefore(Node head,int datas,int datai){
        Node temp=head;
        Node t1=new Node(datai);
        Node t2=null;
        boolean found=false;
        if(temp.data==datas){
            t1.next=head;
            head.pre=t1;
            head=t2;
        }
            while(temp!=null){
                if(temp.data==datas){
                    t2.next=t1;
                    t1.next=temp;
                    temp.pre=t1;
                    found=true;
                    break;
                }
                t2=temp;
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
   head=insertbefore(head, 0, 22);
   display(head);
   } 
}

