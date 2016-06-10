/*
 *
 * El nuevo partido político Izquierda Hacia la Izquierda nos ha pedido una aplicación que genere su
    logotipo. El logotipo de este partido es la letra I inclinada hacia la izquierda. Se debe pedir por teclado
    la altura del logotipo. La anchura siempre es de 4 asteriscos.
 * 
 * 
 */
package examen5Recu;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class logotipoPartidoPolitico {
    public static void main (String [] args) {
        
        System.out.println("Introduzca la altura del logotipo: ");
        Scanner s = new Scanner (System.in);
        int altura = s.nextInt();
        
        int espacios = 1;
        
        
        
        for (int j = 0; j < altura; j++){
            for (int i = 0; i < espacios; i++){
                System.out.print( " " );
            }
            espacios++;
            System.out.println( "####");
        }
    }
}
