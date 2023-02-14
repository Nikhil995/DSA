package QUEUE;
class Queue{
    static int arr[];
    static int size;
    static int rear=-1;
    static int front=-1;


    Queue(int n){
        arr=new int[n];
        this.size=n;
    }

    static boolean isEmpty(){
        return rear==-1 && front==-1;
    }

    static boolean isFull(){
        return (rear+1)%size==front;
    }

    static void add(int data){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    }

    static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int result=arr[front];
        if(rear==front){
            rear=front=-1;
        }
        else{
            front=(front+1)%size;
        }
        return result;

    }

    static int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[front];

    }



    static void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        for(int i=front;i!=rear;i=(i+1)%size){
            System.out.println(arr[i]);
        }
      System.out.println(arr[rear]);
    }



}


public class circular_queue_using_array {
    public static void main(String[] args) {
        Queue q=new Queue (5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println("peek element is"+q.peek());
        q.display();
        q.remove();
        q.remove();
        q.add(100);
        q.add(200);
        q.display();

    }
    
}
