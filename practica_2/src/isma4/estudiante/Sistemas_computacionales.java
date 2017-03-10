/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isma4.estudiante;

/**
 *
 * @author JESUS
 */
public class Sistemas_computacionales extends Estudiantes {
    double Azul;
    public Sistemas_computacionales (double Azul){
        this.Azul = Azul;
                
    }
    
    @Override
    public double getColor(){
    return Azul;
}
}
    
    

