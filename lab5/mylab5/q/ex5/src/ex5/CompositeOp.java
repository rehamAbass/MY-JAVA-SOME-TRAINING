package ex5;

public class CompositeOp extends StringOp {
    ObjectStack stack = new ObjectStack();
     
    public void add(StringOp sop) {
        stack.push(sop);
    }
     
    public void undo() {
        stack.pop();
    }
     
    @Override
    public String f(String str) {
        for (int i = 0; i < stack.num; i++) {
            StringOp op = (StringOp)stack.stack[i];
            str = op.f(str);
        }
        return str;
    }
     
    @Override
    public int cost() {
        int cost = 0;
        for (int i = 0; i < stack.num; i++) {
            StringOp op = (StringOp)stack.stack[i];
            cost += op.cost();
        }
        return cost;
    }
}