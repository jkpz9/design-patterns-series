package demo;

import bai2.concreteClass.AddExp;
import bai2.concreteClass.ConstExp;
import bai2.concreteClass.DivExp;
import bai2.concreteClass.InfixNotation;
import bai2.concreteClass.MinomialExp;
import bai2.concreteClass.MulExp;
import bai2.concreteClass.PostfixNotation;
import bai2.concreteClass.PrefixNotation;
import bai2.interfaces.Expression;
import bai2.interfaces.Notation;

public class DemoBai2 {
	public static void  testExpr(Expression  exp, Notation ntn)
	{
        System.out.println("TO STRING");
        System.out.println(exp._toString(ntn));
        System.out.println("DERIVE");
        Expression derive1 = exp.derive();
         System.out.println(derive1._toString(ntn));
         System.out.println("EVALUATE");
         System.out.println(exp.evaluate(2));
	}
	public static void main(String[] args) {
	    Notation prefix = new PrefixNotation(),
	    					 infix = new InfixNotation(),
	    					 postfix = new PostfixNotation();
		System.out.println("*************** Const Express **************");
		testExpr(new ConstExp(100),prefix);
		 System.out.println("*************** Minomial Express **************");
		  System.out.println("Form 1 => Constant 0");
		  testExpr(MinomialExp.creatInstance(0, 5), prefix);  // 0x^5 => 0
		   System.out.println("Form 2 => Constant #0");
		   testExpr(MinomialExp.creatInstance(2, 0), prefix); // 2x^0 => 2
		   System.out.println("Form 3");
		   testExpr(MinomialExp.creatInstance(9, 1), prefix); // 9x^1 => 9x
		   System.out.println("Form 4");
		   testExpr(MinomialExp.creatInstance(3, 7), prefix); // 3x^7
		   System.out.println("*************** Add Express **************");
		// 2x + 5x^3
		   Expression add = new AddExp(MinomialExp.creatInstance(2,1), MinomialExp.creatInstance(5,3));
		   System.out.println("PREFIX  STYLE");
		   testExpr(add, prefix);  
		   System.out.println("INFIX  STYLE");
		   testExpr(add, infix);  
		   System.out.println("POSTFIX  STYLE");
		   testExpr(add, postfix);  
		   System.out.println("*************** Mul Express **************");
		   // 2x * 5x^3
		   Expression mult = new MulExp(MinomialExp.creatInstance(2,1), MinomialExp.creatInstance(5,3));
		   System.out.println("PREFIX  STYLE");
		   testExpr(mult, prefix);  
		   System.out.println("INFIX  STYLE");
		   testExpr(mult, infix);  
		   System.out.println("POSTFIX  STYLE");
		   testExpr(mult, postfix);  
		   System.out.println("*************** Div  Express **************");
		   Expression divExp = new DivExp(MinomialExp.creatInstance(2,3), MinomialExp.creatInstance(5,3));
		   System.out.println("PREFIX  STYLE");
		   testExpr(divExp, prefix);  
		   System.out.println("INFIX  STYLE");
		   testExpr(divExp, infix);  
		   System.out.println("POSTFIX  STYLE");
		   testExpr(divExp, postfix);    
	    }
}
