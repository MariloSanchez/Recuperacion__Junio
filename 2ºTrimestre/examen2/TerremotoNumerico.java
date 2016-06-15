/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class TerremotoNumerico {
    public static void main(String[] args) {
        
        int array [][] = new int [5][10];
        
         System.out.println("ARRAY ORIGINAL\n-------------");
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                array [i][j] = (int)(Math.random()*99) + 10;
                System.out.printf("%5d" , array[i][j]);
            }
            System.out.println();
        }
        
        System.out.print("¿Que desea, un terremoto horizontal o vertical?:");
        Scanner s = new Scanner (System.in);
        String respuesta = s.next();
        
        if(respuesta.equals("horizontal")){       
            int x = 0;  
            for(int i = 0; i < 5; i++){
                //rota la linea hacia la derecha
                if((i%2)==0) {
                    int aux = array[i][9];//vale ultimo numero de la fila del array
                    
                    for (int j = 9; j > 0; j--) {
                        array[x][j] = array[x][j - 1];
                    }
                    array[x][0] = aux;//el ultimo numero de la fila pasa a ser el primero (x = aux)  
                //rota la linea hacia la izquierda
                }else{
                    int aux = array[x][0];//vale primer numero de la fila del array
                    for (int j = 0; j < 9; j++) {
                        array[x][j] = array[x][j + 1];
                    }
                    array[x][9] = aux;//el primer numero pasa a ser el ultimo de la fila
                }
                x++;
            }    
        }
            
        if (respuesta.equals("vertical")){
            int i = 0;
            for (int j = 0; j < 10; j++){
                //rota la columna hacia arriba
                if((j%2)==0){
                    int aux = array [0][i];//vale primer numero de la columna del array (aux = i primer num columna)
                    
                    for(int x = 0; x < 4; x++){
                        array[x][i] = array[x + 1][i];
                    }
                    array[4][i] = aux;//el primer numero de la columna pasa a ser el ultimo
                //rota la columna hacia abajo
                }else{
                    int aux = array[4][i];//vale el ultimo numero de la columna del array
                    for(int x = 4; x > 0; x--){
                        array[x][i] = array [x - 1][i];
                    }
                    array[0][i] = aux;
                }
                i++;
            }
        }
        
        //Pinta el array
        System.out.println("ARRAY MOVIDO");
        System.out.println("--------------");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
    }
    
}
