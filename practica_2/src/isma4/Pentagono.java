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
public class Pentagono extends Hexagono {
    
    public Pentagono (double L, double ap){
        super (L, ap);
    }

 
    @Override
public double getArea(){
    return (L*ap)/2;
}
}

