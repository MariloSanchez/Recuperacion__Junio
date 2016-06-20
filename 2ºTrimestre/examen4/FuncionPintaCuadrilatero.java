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
public class FuncionPintaCuadrilatero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner t = new Scanner (System.in);
        System.out.println("CUADRILATERO");
        System.out.println("-----------------------------------------------------------------------------");
        
        System.out.println("Cuadrilatero hueco con 4 de lados: ");
        pintaCuadri(4, false);
        
        System.out.println("Cuadrilatero relleno con 4 de lado: ");
        pintaCuadri(4, true);
        
        System.out.println("Rectangulo hueco con 5 de ancho y 9 de alto: ");
        pintaCuadri(5, 9, false);
        
        System.out.println("Rectangulo con relleno con 15 de ancho y 3 de alto: ");
        pintaCuadri(15, 3, true);
        
        System.out.println("--------------------------------------------------");
    }
    
    
     public static void pintaCuadri(int lado, boolean relleno){
        pintaCuadri(lado, lado, relleno);
    }
    
    public static void pintaCuadri(int anchura, int altura, boolean relleno){
        for(int i = 0; i < altura; i++){
            for(int j = 0; j < anchura; j++){
                if(i == 0 || i == (altura - 1) || j == 0 || j == (anchura - 1) || relleno){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
