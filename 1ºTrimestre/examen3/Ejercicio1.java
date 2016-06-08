/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class Ejercicio1 {
    public static void main (String [] args) {
        
        System.out.print("Introduzca la nota del primer examen: ");
        Scanner s = new Scanner (System.in);
        double notaExamen = s.nextDouble();
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double notaTrimestre = s.nextDouble();
        
        double porcentajePrimerEx = notaExamen * 0.4;
        double porcentajeSegundoEx = (notaTrimestre - porcentajePrimerEx) / 0.6;
        
        System.out.print("Tienes que sacar en el segundo examen " + porcentajeSegundoEx + 
                " para tener en la evaluación un " + notaTrimestre);
    }
    
}
