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
public class Energias_renovables extends Estudiantes {
    double Negro;
    public Energias_renovables (double Negro){
        this.Negro = Negro;
                
    }
    @Override
    public double getColor(){
    return Negro;
}
}

