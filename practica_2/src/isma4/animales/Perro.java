/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isma4.animales;



/**
 *
 * @author JESUS
 */
public class Perro extends animales {
    double Woof;
    public Perro (double Woof){
        this.Woof = Woof;
                
    }
    @Override
    public double getSonido(){
    return Woof;
}
}
