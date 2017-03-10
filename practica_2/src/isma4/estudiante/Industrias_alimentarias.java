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
public class Industrias_alimentarias extends Estudiantes {
  double AzulOscuro;
    public Industrias_alimentarias (double AzulOscuro){
        this.AzulOscuro = AzulOscuro;
                
    }
    @Override
    public double getColor(){
    return AzulOscuro;
}  
}

