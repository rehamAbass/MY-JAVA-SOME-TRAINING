package ex5;

public class TwoOps extends StringOp {
    StringOp op1, op2;
     
    public TwoOps(StringOp op1, StringOp op2) {
        this.op1 = op1;
        this.op2 = op2;
    }
 
    @Override
    public String f(String str) {
        return op2.f(op1.f(str));
    }
     
    @Override
    public int cost() {
        return op1.cost() + op2.cost();
    }
}