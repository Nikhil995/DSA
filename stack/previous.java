//previous smallerv element
package Stack;

public class previous
{
	public static void main(String[] args) {
	Stack<Integer> s=new Stack<>();
	int []a={4,10,5,8,20,15,3,12};
	int []b=new int[a.length];
	for(int i=0;i<a.length;i++){
	    while(!s.isEmpty() && s.peek()>=a[i]){
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
