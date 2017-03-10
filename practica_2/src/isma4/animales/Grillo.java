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
public class Grillo extends animales {
    double cricri;
    public Grillo (double cricri){
        this.cricri = cricri;
                
    }
    @Override
    public double getSonido(){
    return cricri;
}
}
