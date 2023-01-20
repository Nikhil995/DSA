//FIND FIRST OCCRUENCE
package linkedlist;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;

    }
}
public class method3{
    

    static Node insertBeginning(Node head, int data) {
        Node temp = new Node(data);
        temp.next=head;
        head=temp;
        

        return head;

    }
    static void searchFirstOccurrence(Node head, int data)
    {
        Node temp=head;
        boolean matchFound=false;
        int ctr=0;
        while (temp!=null)
        {
            ctr++;
            if(temp.data==data)
            {
                System.out.println(data+": Match found at Node: "+ctr);
                matchFound=true;
                break;
            }
            temp=temp.next;
        }
        if(matchFound==false)
        {
            System.out.println(data+": Match not Found");
        }
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
        searchFirstOccurrence(head, 30);
    }
}
    

