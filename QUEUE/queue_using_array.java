package QUEUE;
class  Queue{
    
        static int arr[];
        static int size;
        static int front=0;
        static int rear=-1;
        Queue(int max){
            this.size=max;
            arr=new int[max];
        }
    
    
        //Function to check queue is empty.
    
        static boolean isEmpty(){          
            return rear== -1;
    
        }
    
    
        //Function to add element to queue.
    
        static void enqueue(int data){
            if(rear==size-1){
                System.out.println("queue is full");
            }
            arr[++rear]=data;
        }
    
        //Function to remove element from queue.
    
        static int dequeue(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
    
        //  return peek of queue.
    
        static void peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
               
            }
           System.out.println("peek element is"+arr[0]);
        }
        static void display(){
            if(isEmpty()){
                System.out.println("queue is empty");
            }
           for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
           }
        }
    
    

    }
    public class queue_using_array {
        public static void main(String[] args) {
            Queue q=new Queue(5);
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);
            System.out.println("deleted element is"+q.dequeue());
           
            q.peek();
            q.display();
    
        }
        
    }
    
    