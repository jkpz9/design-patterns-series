package bai2.concreteClass;

import bai2.abstractClass.BinaryExp;
import bai2.interfaces.Expression;

public class SubExp  extends BinaryExp {

    public SubExp(Expression u, Expression v)
    {
        super(u, v);
    }
    @Override
    public String getOperator() {
        return "-";
    }

   @Override
   public double doEvaluate(double val1, double val2) { 
       return val1 - val2; 
   }

    @Override
    public Expression derive() {
        return new SubExp(super.u.derive(), super.v.derive());
    }

}
