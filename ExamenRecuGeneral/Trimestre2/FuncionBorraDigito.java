/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trimestre2;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class FuncionBorraDigito {
    public static void main(String[] args) {
        
        System.out.println("Borra número: ");
        long numero = borra(49854, 4);
        System.out.println(numero);
        
        /*Scanner s = new Scanner (System.in);
        System.out.println("Introduce un numero:");
        long numIntro = s.nextLong();
        System.out.println("Introduce el digito que quieras quitarle al numero introducido anteriormente: ");
        long digito = s.nextLong();
        
        numIntro = borra(x);
        digito = borra(d);*/
        
    }
    //FUNCIONES//
    public static long borra(long x, int d){
        long num = x;
        int numBorra = d;
        long digito = 0;
        long nuevoNum = 0;
        long numInvertido = 0;
        
        //numero invertido
        while (num > 0){
          digito = (int) (num % 10);
          numInvertido = (numInvertido * 10) + digito;
          num /= 10;
        }
        //cojo digito a digito el numero invertido y lo pongo derecho sin los digitos de numBorra
        while(numInvertido > 0){
            digito = numInvertido%10;
            numInvertido = numInvertido/10;
          if(digito != numBorra){
                nuevoNum = nuevoNum * 10 + digito;
            }
        } 
        return nuevoNum;
    }
    
}
