// LAST OCCRUENCE 
 package linkedlist;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class method4{
    static Node insertBeginning(Node head, int data) {
        Node temp = new Node(data);
        temp.next=head;
        head=temp;
        return head;
    }
    static void searchLastOccurrence(Node head, int data)
    {
        Node temp=head;
        int ctr=0;
        int lastSearched=0;
        while (temp!=null) {
            ctr++;
            if (temp.data == data) {
                lastSearched = ctr;
            }
            temp=temp.next;
        }
        if(lastSearched>0)
            System.out.println("Last Occurrence of Searched Element "+data+": at Node "+lastSearched);
        else
            System.out.println(data+": Element not found");
    }
    public static void main(String[] args) {
        Node head=null;
        head=insertBeginning(head,10);
        head=insertBeginning(head,20);
        head=insertBeginning(head,30);
        head=insertBeginning(head,30);
        head=insertBeginning(head,30);
        searchLastOccurrence(head, 30);
    }
}