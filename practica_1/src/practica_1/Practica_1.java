/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1;
import isma4.IFigura;
import isma4.animales.IAnimales;
import isma4.estudiante.IEstudiante;
import isma4.algoritmos.IAlgoritmos;

/**
 *
 * @author JESUS
 */
public class Practica_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public double getFigureArea(IFigura figure){
    return figure.getArea();
    }
    public double getAnimalesSonido(IAnimales animales){
            return animales.getSonido();
        }
          public double getEstudiantesColor(IEstudiante estudiantes){
            return estudiantes.getColor();
        }
          
}
