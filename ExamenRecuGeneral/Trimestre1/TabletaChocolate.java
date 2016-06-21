/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trimestre1;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class TabletaChocolate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        System.out.println("Por favor introduzca el ancho de la tableta de chocolate: ");
        int ancho = s.nextInt();
        System.out.println("Por favor introduzca la altura de la tableta de chocolate: ");
        int alto = s.nextInt();
        
        String signo = " ";
                
        for(int i = 0; i < alto; i++){
            for (int j = 0; j < ancho; j++){
                switch( (int)(Math.random()*5) ){
                    case 0: signo = "# "; break;
                    case 1: signo = "# "; break;
                    case 2: signo = "# "; break;
                    case 3: signo = "# "; break;
                    case 4: signo = " "; break;
                }
                System.out.print(signo);
            }
            System.out.println();
        }
    }
    
}