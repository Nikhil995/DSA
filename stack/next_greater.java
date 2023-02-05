package Stack;
import java.util.*;
public class next_greater {
    public static void main(String[] args) {
	    ArrayList<Integer> r=new ArrayList();
	    int z=0;
	Stack<Integer> s=new Stack<>();
	int []a={3,10,5,1,15,10,7,6};
	for(int i=a.length-1;i>=0;i--){
	    while(!s.isEmpty() && s.peek()<=a[i]){
	        s.pop();
	    }
	    if(s.isEmpty()){
	         z=-1;
	        
	    }
	    else{
	         z=s.peek();
	    }
	    r.add(z);
	   
	    s.push(a[i]);
	}
	 Collections.reverse(r);
	    System.out.print(r);
	
	}
}

    
}
