package circularlinklist;



class Node{
    int data;
    Node next;
    Node pre;
    Node(int data){
        this.data=data;
    }
}

public class method1 {
    static  Node insert_first(Node head,int data){
        Node temp=head;
        Node n=new Node(data);
        if(head==null){
            n.next=n;
            n.pre=n;
            head=n;
        }
        else{
            n.pre=head.pre;
            head.pre.next=n;
            n.next=head;
            head.pre=n;
            head=n;
        }
        return head;
    }




    static  Node insert_last(Node head,int data){
        Node temp=head;
        Node n=new Node(data);
        if(head==null){
            n.next=n;
            n.pre=n;
            head=n;
        }
        else{
            n.pre=head.pre;
            head.pre.next=n;
            n.next=head;
            head.pre=n;
          
        }
        return head;
    }



    static void display(Node head){
        Node temp=head;
        if(head!=null){
            do{
                System.out.println(temp.data);
                temp=temp.next;
            }
            while(temp!=head);
        }
    }
    public static void main(String[] args) {
        Node head=null;
        head=insert_first(head, 0);
        head=insert_first(head, 10);
        head=insert_first(head, 20);
        head=insert_last(head, 0);

        display(head);
    }
    
}
