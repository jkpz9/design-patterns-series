package bai2.concreteClass;

import bai2.interfaces.Expression;
import bai2.interfaces.Notation;

public class MinomialExp implements Expression {
    private final double a;
    private final double n;
    
    public static  Expression creatInstance( double a, double n)
    {
    	if (a == 0) return new ConstExp(0);
    	else if ( a !=0 &&  n == 0) return new ConstExp(a);
    	 return new MinomialExp(a, n);
    }
    
    private MinomialExp(double a, double n)
    {
        this.a = a;
        this.n = n;
    }
    
    @Override
    public double evaluate(double x) {
        return  a* Math.pow(x, n);
    }

    @Override
    public Expression derive() {
        return MinomialExp.creatInstance(a*n, n-1);
    }

    @Override
    public String _toString(Notation ntn) {
    	return  (a == 0)  ?  "0":
			(n == 0) ?   Double.toString(a) :
							    (n  == 1) ?   Double.toString(a) + "x":
							    		              Double.toString(a) + "x^" + Double.toString(n);							     
    }
}
