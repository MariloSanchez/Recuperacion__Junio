/*
 * 
 * Realiza el programa bomba numérica. En primer lugar, el programa debe generar y mostrar por
   pantalla un array de 5 filas por 8 columnas con números aleatorios entre 100 y 200. A continuación se
   le preguntará al usuario las coordenadas donde quiere hacer explotar la bomba. Justo en la posición
   donde explota la bomba, el número se multiplica por 2. Los números adyacentes a éste se multiplican
   por 3 y los números adyacentes a éstos últimos se multiplican por 4. La bomba se puede hacer
   explotar en cualquier parte del array, incluso en los bordes.
 * 
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class BombaNumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int bombaNumerica [][] = new int [5][8];
        
        //introducimos los valores aleatorios del array
        
        System.out.println("ARRAY ORIGINAL\n-------------");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 8; j++){
                bombaNumerica [i][j] = (int)((Math.random() *101) + 100); 
                System.out.printf("%5d  ", bombaNumerica[i][j]);
            }
            System.out.println();
        }
        Scanner s = new Scanner (System.in);
        
        System.out.println("Introduce las coordenadas donde quieres hacer explotar la bomba: ");
        System.out.print("Fila: \n");
        int fila = s.nextInt();
        System.out.print("Columna: \n");
        int columna = s.nextInt();
        
        //empezamos la multiplicacion de los numeros
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 8; j++){
                if(((j == (columna - 1)) || (j == (columna - 2))) || 
                        ((j == (columna + 1)) || (j == (columna + 2))) || 
                        (j == columna)){
                    if(((i == (fila - 1)) || (i == (fila - 2))) || 
                        ((i == (fila + 1)) || (i == (fila + 2))) || (i == fila)){
                        if((i == fila - 2) || (i == fila + 2) || (j == columna - 2) ||
                            (j == columna + 2)){
                            bombaNumerica[i][j] *= 4;
                        }else if((i == fila) && (j == columna)){
                            bombaNumerica[i][j] *= 2;
                        }else{
                            bombaNumerica[i][j] *= 3;
                        }
                    }
                }
            }
        }
        
        //Muestro el array resultante
        for (int i = 0; i < 5; i++){
            for ( int j = 0; j < 8; j++){
                System.out.printf("%5d   ", bombaNumerica [i][j]);
            }
            System.out.println();
        }
    }
    
}
