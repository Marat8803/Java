/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication62;

/**
 *
 * @author Marat
 */
public class NewClass {
  private double a;
   private double b;

    public NewClass() {
        a=2;
        b=3;
    }
   
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
   
   public double Summ(){
       double i=a+b;
       System.out.println(i);
       return i;
   }
}  
