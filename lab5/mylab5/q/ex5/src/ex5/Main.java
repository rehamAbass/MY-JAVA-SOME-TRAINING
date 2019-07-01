package ex5;

public class Main {
    public static void main(String[] args) {
        StringOp op1 = new ToUpperOp();
        StringOp op2 = new ChangeOp('O', 'o');
        StringOp op3 = new ReserveOp();
         
        String str = "hello World";
         
        System.out.println(op1.f(str));
        System.out.println(op3.f(str));
        System.out.println(op2.f(op1.f(str)));
     
        StringOp op4 = new TwoOps(op1, op2);
        System.out.println(op4.f(str) + " : " + op4.cost());
         
        CompositeOp op5 = new CompositeOp();
        op5.add(op1);
        op5.add(op2);
        op5.add(op3);
        System.out.println(op5.f(str) + " : " + op5.cost());
        op5.undo();
        System.out.println(op5.f(str) + " : " + op5.cost());        
    }
}