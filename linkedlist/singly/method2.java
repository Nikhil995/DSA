//INSERT AT LAST
package linkedlist;


class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
public class method2 {
   
         static Node addAtEnd(Node head, int data) {
            
            Node temp = new Node(data);

            //Checks if the list is empty
            if (head == null) {
                //If list is empty, both head will point to new node
                head =temp;
            }
            else {
                Node n=head;
                while(n.next!=null)
                {
                    n=n.next;
                }
                n.next=temp;
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
        Node head = null;
       
       head=addAtEnd(head,20);
       head=addAtEnd(head,88);
       
        display(head);
    }
}