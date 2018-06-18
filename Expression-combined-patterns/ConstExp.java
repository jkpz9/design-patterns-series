package bai2.concreteClass;

import bai2.interfaces.Expression;
import bai2.interfaces.Notation;

public class ConstExp implements Expression {
    private final double value;
    public ConstExp(double value)
    {
        this.value = value;
    }
    @Override
    public double evaluate(double x) {
        return value;
    }

    @Override
    public Expression derive() {
        return new ConstExp(0);
    }

    @Override
    public String _toString(Notation ntn) {
        return Double.toString(value);
    }

    
}
