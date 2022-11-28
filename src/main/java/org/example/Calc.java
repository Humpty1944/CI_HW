package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calc {
    String expression;

    public void setExpr(String expr) throws Exception {
        if (expr.matches("[a-zA-Z]+")){
            throw new Exception("Contains letters");
        }
        String[] res = expr.split(" ");
        if (res.length!=3){
            throw new Exception("Sowwy I'm stupid calculator ");
        }
        for(int i=0;i< res.length;i++){
            if (!isNumeric(res[i])){
                if((!res[i].equals("-")&&!res[i].equals("+")&&!res[i].equals("/")&&!res[i].equals("%")&&!res[i].equals("*"))){
                    throw new Exception("Not correct");
                }
            }

        }
        this.expression=expr;
    }

    public int calc() throws RuntimeException {
        String[] res = expression.split(" ");
        if(res[1].equals("+")){
            return Integer.parseInt(res[0])+Integer.parseInt(res[2]);
        }
        else if(res[1].equals("-")){
            return Integer.parseInt(res[0])-Integer.parseInt(res[2]);
        }
        else if(res[1].equals("/")){
            return Integer.parseInt(res[0])/Integer.parseInt(res[2]);
        }
        else if(res[1].equals("*")){
            return Integer.parseInt(res[0])*Integer.parseInt(res[2]);
        }
        else if(res[1].equals("%")){
            return Integer.parseInt(res[0])%Integer.parseInt(res[2]);
        }
        throw new RuntimeException("Something is wrong");
    }


    public Calc(String expr) throws Exception {
        setExpr(expr);
    }

    public  boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
