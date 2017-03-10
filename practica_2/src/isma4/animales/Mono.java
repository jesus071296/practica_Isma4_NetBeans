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
public class Mono extends animales {
    double Ua;
    public Mono (double Ua){
        this.Ua = Ua;
                
    }
    @Override
    public double getSonido(){
    return Ua;
}
}