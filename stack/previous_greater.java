package Stack;
import java.util.*;

public class previous_greater {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        int []a={15,10,18,12,4,6,2,8};
        int []b=new int[a.length];
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() && s.peek()<=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                System.out.print("-1"+" ");
            }
            else{
                System.out.print(s.peek()+" ");
                
            }
            s.push(a[i]);
        
        
        
        }
        }
    }
    


