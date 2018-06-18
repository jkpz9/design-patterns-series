package bai2.abstractClass;

import bai2.interfaces.Expression;
import bai2.interfaces.Notation;

public abstract class BinaryExp implements Expression {
    protected Expression u;
    protected Expression v;
    
    @Override
    public String _toString(Notation ntn)
    {
         String op = getOperator();
         String operand1 = u._toString(ntn);
         String operand2 = v._toString(ntn);
        return ntn.arrage(op, operand1, operand2);
    }
    
    public abstract String getOperator();
    public abstract double doEvaluate(double val1, double val2);
    @Override
    public double evaluate (double x)
    {
        double val1 = u.evaluate(x);
        double val2 = v.evaluate(x);
        return doEvaluate(val1, val2);
    }
    public BinaryExp(Expression u, Expression v)
    {
        this.u = u;
        this.v = v;
    }
}
