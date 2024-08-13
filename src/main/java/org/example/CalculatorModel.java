package org.example;

public class CalculatorModel  {

   private double result;

   public void calculatorAdd (double x, double y){
            result = x + y;
        }
   public void calculatorMultiply (double x, double y){
       result = x*y;
   }

    public void calculatorDivide (double x, double y){
        result = x/y;
    }

 public double getResult(){
       return result;
    }

}
