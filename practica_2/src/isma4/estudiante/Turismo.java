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
public class Turismo extends Estudiantes {
    double Amarillo;
    public Turismo (double Amarillo){
        this.Amarillo = Amarillo;
                
    }
    @Override
    public double getColor(){
    return Amarillo;
}
}
