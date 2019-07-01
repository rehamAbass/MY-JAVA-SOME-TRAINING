package ex5;

 import java.util.Arrays;

public class ObjectStack {

	// using the mother class of all : Object
		protected Object [] stack = new Object[10];
		//Array of objects!!!!!!
		
		protected int num =0 ;
			
	    public void push(Object x) {
	        if (num == stack.length-1) 
	            stack = Arrays.copyOf(stack, stack.length * 2);
	        stack[num++] = x;
	    }
	     
	    public Object pop() {
	    	if(!isEmpty()) {
	        if (num < stack.length / 4)
	            stack = Arrays.copyOf(stack, stack.length / 2);
	        return stack[--num];
	    	}
	    	System.out.println("\nCan't pop,It's Empty Stack");
	    	return null;
	    }
	     
	    public boolean isEmpty() {
	        return num == 0;
	    }
		
		
		
}
