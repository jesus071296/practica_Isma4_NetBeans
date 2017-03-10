/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isma4;

/**
 *
 * @author JESUS
 */
public class Trapecio extends Figura {
    double a;
    double b;
    
    public Trapecio (double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double getArea(){
        return (a+b)/2;
    }
}
