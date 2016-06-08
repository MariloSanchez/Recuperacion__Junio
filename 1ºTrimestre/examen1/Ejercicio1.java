/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        System.out.print("Introduzca la base imponible: ");
        Scanner s = new Scanner (System.in);
        int baseImponible = s.nextInt();
        
        System.out.println();
        
        System.out.println("Introduzca el tipo de IVA( ");
        System.out.println("1. General");
        System.out.println("2. Reducido");
        System.out.println("3. Superreducido");
        System.out.print("Introduzca una opción (1-3): ");
        int tipoIva = s.nextInt();
        
         System.out.println();
        
        double opcion=0;
        
        switch (tipoIva){
            case 1:
                opcion = baseImponible * 0.21;
                break;
            case 2:
                opcion = baseImponible * 0.1;
                break;
            case 3:
                opcion = baseImponible * 0.04;
                break;             
        }
        System.out.println();
        
        System.out.println("Introduzca el código promocional ");
        System.out.println("1. Nopro");
        System.out.println("2. Mitad");
        System.out.println("3. meno5");
        System.out.println("4. 5porc");
        System.out.print("Introduzca una opción (1-4): ");
        int codPromo = s.nextInt();
        
        double promocion = 0;
        
        switch (codPromo){
            case 1:
                promocion =  0;
                break;
            case 2:
                promocion = (baseImponible + opcion) / 2;
                break;
            case 3:
                promocion =   5;
                break;
            case 4:
                promocion = (baseImponible + opcion) * 0.05;
        }
        System.out.println("-----------------------------------------");
        System.out.println("BASE IMPONIBLE:\t         " + baseImponible);
        System.out.println("IVA:\t                 " + opcion);
        System.out.println("Precio con IVA\t         " + (baseImponible + opcion));
        System.out.println("Código Promoción\t" + "-"+promocion);
        System.out.println("TOTAL:\t                 " + ((baseImponible + opcion) - promocion));
    }
    
}
