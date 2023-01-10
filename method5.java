// INSERTION AFTER FIRST OCCURENCE
  package linkedlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class method5 {
    static Node insertBeginning(Node head, int data) {
        Node temp = new Node(data);
        temp.next=head;
        head=temp;
        return head;
    }
    static Node insertAfterFirstOcc(Node head, int searchedData, int dataToBeAdd)
    {
        Node temp=head;
        Node newNode=new Node(dataToBeAdd);
        boolean matchFound=false;
        int ctr=0;
        while (temp!=null)
        {
            ctr++;
            if(temp.data==searchedData)
            {
                newNode.next=temp.next;
                temp.next=newNode;
                matchFound=true;
                break;
            }
            temp=temp.next;
        }
        if(matchFound==false)
        {
            System.out.println(searchedData+": Match not Found; Not able to insert Node after key Element");
        }
        return head;
    }
    static void display(Node linkedList)
    {
        Node temp=linkedList;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head=null;
        head=insertBeginning(head,10);
        head=insertBeginning(head,20);
        head=insertBeginning(head,30);
        head=insertBeginning(head,30);
        head=insertBeginning(head,30);
        insertAfterFirstOcc(head, 30,100);
        display(head);
    }
    
}
