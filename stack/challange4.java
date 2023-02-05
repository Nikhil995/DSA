package Stack;

import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node( int data){
        this.data=data;
    }
}
class challange4{
    static int size=0;
    static int z=0;
    Node push(Node top,int data){
        Node temp=new Node(data);
        if(top!=null){
            temp.next=top;
            top=temp;
        }
        else{
            top=temp;
        }
        size++;
        return top;
        
    }
    Node pop(Node top){
        if(top!=null){
              z=top.data;
            top=top.next;
        }
        else{
            System.out.println("underflow");
        }
        size--;
        return top;
        
    }
    void display(Node top){
        if(top!=null){
            while(top!=null){
                System.out.println(top.data);
                top=top.next;
            }
        }
        else{
            System.out.println("Stack is empty");
        }
    }
	public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	Node mystack=null,stack=null;
	challange4 s=new challange4();
	 System.out.println("enter size of train");
	 int n=sc.nextInt();
	 for(int i=0;i<n;i++){
	     System.out.println("enter data");
	     int d=sc.nextInt();
	     mystack=s.push(mystack,d);
	 }

     System.out.println("original compartment of train");
	s.display(mystack);
	
	System.out.println("enter compartment no to be deteching");
	challange4 s1=new challange4();

	int a=sc.nextInt();
	for(int i=0;i<=size-a;i++){
	    mystack=s.pop(mystack);
	    stack=s1.push(stack,z);
	    int x=size-i;
	    System.out.println("compartment   "+x+"  is deteching");
	}
	stack=s1.pop(stack);
	for(int i=0;i<=size-a;i++){
	    stack=s1.pop(stack);
	    mystack=s.push(mystack,z);
	    int y=a+1+i;
	    System.out.println("compartment  "+y+"  is linking");
	}
	System.out.println("new train compartment are as follow");
	s.display(mystack);
	}
}
