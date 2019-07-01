package ex5;

public class ReserveOp extends StringOp{
	
	    @Override
	    public String f(String str) {
	        StringBuilder b = new StringBuilder();
	        ObjectStack stack = new ObjectStack();
	         
	        for (int i = 0; i < str.length(); i++) 
	            stack.push(str.charAt(i));
	         
	        while(!stack.isEmpty()) 
	            b.append(stack.pop());
	         
	        return b.toString();
	    }
	    
	}