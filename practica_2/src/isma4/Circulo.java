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
public class Circulo extends Figura {
    double radio;
    
    public Circulo(double radio){
this.radio=radio;

}
    @Override
    public double getArea(){
    return Math.PI*radio*radio;
}
}