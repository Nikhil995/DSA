class Nodee{
    int data;
    Nodee next;
    Nodee(int data){
        this.data=data;

    }
}
public class combinemethod{
    static Nodee insertbeginning(Nodee head,int data){
        Nodee temp=new Nodee(data);
        temp.next=head;
        head=temp;
        return head;

    }

    static Nodee insertlast(Nodee head,int data){
        Nodee temp=new Nodee(data);
        if(head==null){
            head=temp;
        }
        else{
            Nodee n=head;
            while(n.next!=null){
                n=n.next;

            }
            n.next=temp;


        }
        return head;
    }

    static Nodee insertat(Nodee head,int data,int position){
        Nodee temp=new Nodee(data);
        Nodee t=head;
        if(position<1){
            System.out.println("invalid");
        }
        else if(position==1){
            temp.next=head;
            head=temp;

        }
        else{
            for(int i=1;i<position-1;i++){
                t=t.next;
            }
            temp.next=t.next;
            t.next=temp;

        }
        return head;

    }


    static Nodee deletebeginning(Nodee head){
        if(head==null){
            System.out.println("linklist is empty");
        }
        else{
            System.out.println("deleted node"+head.data);
            head=head.next;

        }
        return head;
    }


    static Nodee deletelast(Nodee head){
        if(head==null){
            System.out.println("linklist is empty");
        }
        else{
            Nodee temp=head;
            Nodee t=head.next;
            while(temp.next!=null){
                t=temp;
                temp=temp.next;
            }
            System.out.println("deleted node "+t.next.data);
            t.next=null;

        }
        return head;
    }



    static Nodee deleteat(Nodee head,int position){
        Nodee temp=head;
        int c=0;
        if(position<1){
            System.out.println("invalid");
        }
        
        if(position==1){
                System.out.println("deleted Node"+head.data);
                head=head.next;

         }
        else{
            if(temp!=null){
                while(temp!=null){
                    c++;
                    if(c!=position-1){
                        temp=temp.next;
                    }
                    else{
                        System.out.println("deleted Node"+temp.next.data);
                        temp.next=temp.next.next;
                    }
                }
            }
            else{
                System.out.println("linklist is empty");
            }

        }
        return head;
        
    }



    static Nodee reverse(Nodee head){
        Nodee current=head;
        Nodee previous=null;
        while(current!=null){
            Nodee temp=current.next;
            current.next=previous;
            previous=current;
            current=temp;

        }
        return previous;
    }


    static void firstocc(Nodee head,int data){
        int c=0;
        boolean found=false;
        Nodee temp=head;
        while(temp!=null){
            c++;
            if(temp.data==data){
                found=true;
                System.out.println("data found at"+c);
                break;
            }
            temp=temp.next;
        }
            if(found==false){
                System.out.println("data not found");
            }
        
    }


    static void lastocc(Nodee head,int data){
        int c=0;
        int last=0;
        boolean found=false;
        Nodee temp=head;
        while(temp!=null){
            c++;
            if(temp.data==data){
                last=c;
                found=true;
            }
            temp=temp.next;

        }
        if(last>0){
            System.out.println("data found at"+last);
        }
        if(found==false){
            System.out.println("data not found");
        }

    }


    static Nodee insertafter(Nodee head,int datai,int dataf){
        Nodee temp=head;
        Nodee t=new Nodee(datai);
        boolean found=false;
        while(temp!=null){
            if(temp.data==dataf){
                t.next=temp.next;
                temp.next=t;
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


    static Nodee insertbefore(Nodee head,int datai,int dataf){
        Nodee temp=head;
        Nodee t1=new Nodee(datai);
        Nodee t2=null;
        boolean found=false;
        if(temp.data==dataf){
            t1.next=temp;
            head=t1;
            return head;
        }
        while(temp!=null){
            if(temp.data==dataf){
                t2.next=t1;
                t1.next=temp;
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

    static void display(Nodee head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
       

    }
    public static void main(String[] args) {
        Nodee head=null;
      //  head=insertlast(head, 200);
        head=insertbeginning(head, 0);
        head=insertbeginning(head, 0);
        head=insertbeginning(head, 20);
     //   head=insertlast(head, 40);
      
       // head=insertlast(head, 100);
     //  head=insertat(head, 100, 4);
    // head=deletebeginning(head);
    // head=deletelast(head);
    //head=deleteat(head, 3);
   // reverse(head);
   //lastocc(head, 4);
 //  head=insertafter(head, 100, 0);
 head=insertbefore(head, 100, 0);
        display(head);
    }

}