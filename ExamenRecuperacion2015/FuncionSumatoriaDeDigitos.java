/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacionjunio2015;

import java.util.Scanner;

/**
 *
 * @author Mariló
 */
public class FuncionSumatoriaDeDigitos {
    public static void main(String[] args) {
        System.out.println("Suma los digitos de un numero");
        
        //numero por parámetro
        long numero = sumatorioDeDigitos(45879);
        System.out.println("suma: " + numero);
        
        //numero por teclado
        /*System.out.println("Introduce el numero para sumar los digitos: ");
        Scanner s = new Scanner (System.in);
        long numIntro = s.nextInt();
        System.out.println("La suma es: " + sumatorioDeDigitos(numIntro));*/
    }
    
    public static int sumatorioDeDigitos(long x){
        
        long num = x;
        long digito = 0;
        /*long numInvertido = 0;*/
        int sumaDigitos = 0;
        
        //cogemos digito a digito
        while(num > 0){
            digito = num%10;
            sumaDigitos += num%10;
            /*numInvertido = (num *10) + digito;*/
            num = num/10;
        }
        
        return sumaDigitos;
    }
}
