package ex5;

public class StringStack {
    private ObjectStack stack = new ObjectStack();
     
    public void push(String s) {
        stack.push(s);
    }
     
    public String pop() {
        return (String)stack.pop();
    }
     
    public boolean isEmpty() {
        return stack.isEmpty(); 
    }
}