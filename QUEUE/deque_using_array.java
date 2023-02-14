package QUEUE;
class Deque{
    static int size,capacity;
    static int arr[];
    Deque(int n){
        capacity=n;
        size=0;
        arr=new int[capacity];
    }


    static  boolean isFull(){
        return size==capacity;
    }


    static boolean isEmpty(){
        return size==0;
    }

    static void insertRear(int x){
        if(isFull()){
            System.out.println("Deque is full");
            return;
        }
        arr[size]=x;
        size++;
    }

    static void insertFront(int x){
        if(isFull()){
            System.out.println("deque is full");
            return;
        }
        for(int i=size-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
            arr[0]=x;
            size++;

        
    }

    static void deleteRear(){
        if(isEmpty()){
            System.out.println("deque is empty");
            return;
        }
        size--;
    }

    static void deleteFront(){
        if(isEmpty()){
            System.out.println("deque is empty");
            return;
        }
        for(int i=0;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;

    }


    static int getRear(){
        if(isEmpty()){
            System.out.println("dequeis empty");
            return -1;
        }
        else{
            return arr[size-1];
        }
    }


    static int getFront(){
        if(isEmpty()){
            System.out.println("deque is empty");
            return -1;
        }
        else{
            return arr[0];
        }
    }

    static void Display(){
        if(isEmpty()){
            System.out.println("deque is empty");
            return;
        }
        for(int i=0;i<=size-1;i++){
            System.out.println(arr[i]);
        }
    }
}


public class deque_using_array {
    public static void main(String[] args) {
        Deque q=new Deque(4);
        q.insertFront(10);
        q.insertRear(20);
        q.insertFront(30);
        q.insertRear(40);
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        
         q.deleteFront();
        q.deleteRear();
        q.Display();
    }
    
}
