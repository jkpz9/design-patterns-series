
package bai2.concreteClass;

import bai2.interfaces.Notation;

public class PostfixNotation implements Notation {

    @Override
    public String arrage(String op, String operand1, String operand2) {
        return op + "  " + operand1  + "  " + operand2;
    }

}
