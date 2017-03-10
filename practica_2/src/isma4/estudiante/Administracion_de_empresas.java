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
public class Administracion_de_empresas extends Estudiantes {
    double Rojo;
    public Administracion_de_empresas (double Rojo){
        this.Rojo = Rojo;
                
    }
    
    @Override
    public double getColor(){
    return Rojo;
}
}

