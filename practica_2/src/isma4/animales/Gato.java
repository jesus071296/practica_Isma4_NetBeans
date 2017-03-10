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
public class Gato extends animales {
    double Meuw;
    public Gato (double Meuw){
        this.Meuw = Meuw;
                
    }
    @Override
    public double getSonido(){
    return Meuw;
}
}
