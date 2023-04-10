package Sorting;
class Node{
    int data;
    Node next;
   
    Node(int data){
        this.data=data;
    }

}

public class bubble_sort_linklist {
    static Node insert(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return head;

    }
    static void display(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;

        }
    }


    static void sorting(Node head){
        Node current=head;
        Node index=null;
        int temp;
        if(head==null){
            return;

        }
        while(current!=null){
            index=current.next;
            while(index!=null){
                if(current.data>index.data){
                    temp=current.data;
                    current.data=index.data;
                    index.data=temp;

                }
                index=index.next;
            }
            current=current.next;


        }
        


    }
    public static void main(String[] args) {
        Node head=null;
        head=insert(head, 10);
        head=insert(head, 50);
        head=insert(head, 40);
        head=insert(head, 80);
        head=insert(head, 20);
        sorting(head);
        display(head);

    }
    
}
