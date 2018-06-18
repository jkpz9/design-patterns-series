package bai2.interfaces;

public interface Expression {
    public double evaluate(double x);
    public Expression derive();
    public String _toString(Notation ntn);
}
