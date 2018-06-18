package bai2.concreteClass;

import bai2.interfaces.Notation;

public class InfixNotation implements Notation {

    @Override
    public String arrage(String op, String operand1, String operand2) {
        return "(" + operand1  + "  " + op + "  " + operand2 + ")";
    }

}
