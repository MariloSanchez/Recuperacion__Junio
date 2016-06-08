/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen4;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class Ejercicio2 {
    public static void main (String [] args) {
        
        System.out.println("¿Cuánto falta para el fin de semana?");
        System.out.println("************************************");

        Scanner s = new Scanner (System.in);

        System.out.print ("¿Qué día es? De lunes a viernes(1-5): ");
        int dia = s.nextInt();
        System.out.print("Introduce la hora: ");
        int hora = s.nextInt();
        System.out.print("Introduce los minutos: ");
        int min = s.nextInt();
        
        int minutosDeHoy;
        int minutosHastaViernes = 0;
        int minutosDeViernes = 15 * 60;//solo tiene 15h que no es finde el viernes y las pasamos a minutos
        int diasRestantes = 4 - dia;//son 4 dias hata el viernes y le resto el dia que meto por teclado
        
        if ( dia <= 5){
            minutosDeHoy = ((24 - hora) * 60) - min;//minutos hasta el final del dia que se meta por teclado
            minutosHastaViernes = ((24 * 60) * diasRestantes) + minutosDeHoy + minutosDeViernes;  
        }
        System.out.println("Los minutos que faltan hasta el finde son: " + minutosHastaViernes);
      
    }   
}
