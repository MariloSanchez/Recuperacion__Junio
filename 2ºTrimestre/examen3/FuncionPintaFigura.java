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
public class FuncionPintaFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce que figura desea mostrar: ");
        System.out.println("A)Piramide");
        System.out.println("B)PiramideInvertida");
        System.out.println("C)Cuadrado");
        Scanner s = new Scanner (System.in);
        String figura = s.next();
        System.out.println("Introduce la altura de la figura: ");
        int altura = s.nextInt();
        System.out.println("Indique si quiere que este rellena o no (si-no): ");
        String rellena = s.next();
        
        boolean esRelleno = false;
        if(rellena.equals("si")){
            esRelleno = true;
        }
        pintaFigura(figura, altura, esRelleno);
    }
    
    //FUNCIONES
    public static void pintaFigura(String nombreFigura, int n, boolean rellena){
        
        if( (nombreFigura.equals("Piramide"))&&(rellena) ){
            int ultimoPiso = n + n - 1;
            
            for (int i = 1; i <= n; i ++) {//i-Piso que vamos a dibujar
                int pintado = i+i-1;
                int blanco = ultimoPiso - pintado;
                blanco = blanco/2;//la mitad de blancos en cada lado
                for (int j = 1; j <= blanco + pintado; j++) {//j-Numero de caracteres del piso que vamos a dibujar
                    if (j <= blanco){
                        System.out.print (" ");
                    }else{
                        System.out.print ("*");
                    }
                }
                System.out.println();
            }
        }//cierre del if de piramide rellena
        
        if( (nombreFigura.equals("PiramideInvertida")) && (rellena)){
            int altura = 1;
            int espacios = 1;
            int relleno = n + (n -1);
            
            while (altura <= (n)) {  
                for (int i = 1; i < espacios; i++) {
                 System.out.print(" ");
                }
                for (int i = 1; i <= relleno; i++) {
                    System.out.print("*");
                }
                System.out.println();
                espacios++;
                altura++;
                relleno = relleno - 2;
            }          
        }//cierre del if de piramide invertida
        
        if ((nombreFigura.equals("Cuadrado")) && (rellena)){           
            int ancho = n;
            for (int i = 0; i < n; i++){ //se pone para ejecutar el for de dentro             
                for (int j = 0; j < ancho; j++){//ejecuta la primera linea
                  System.out.print("* ");//la pinta
                }
                System.out.println();//salto de linea y vuelve al primer for
           }           
        }//cierre if cuadrado relleno
        
        if( (nombreFigura.equals("Piramide")) && (!rellena)){
            int a, i, j;
            int espaciosDelanteros = n -1;
            int espaciosInternos = 1;
            for ( a = 0; a < n - 1; a++) {//Los espacios en blanco que hay
                if ( a == 0) {//la primera vez que entramos para pintarme la primera fila
                    for (i = 0; i < espaciosDelanteros; i++) {//pintar los espacios en blanco
                        System.out.print ( " ");//mostrarlos
                    }
                System.out.print ("*");//pinta el caracter
                espaciosDelanteros --;//decrementa espacios delanteros porque cada vez es uno menos
                }
                if ((a > 0) && (a < n)){//para pintar el cuerpo de la piramide
                    for (i =0; i < espaciosDelanteros; i++) {
                        System.out.print (" ");
                    }
                    espaciosDelanteros --;
                    System.out.print ("*");
                    for ( j = 0; j < espaciosInternos; j++) {
                        System.out.print (" ");
                    }
                    espaciosInternos += 2;
                    System.out.print ("*");
              
                }  
                System.out.println();
            }
            for ( a = 0; a < (n * 2) -1; a++) {//pinta la base
                System.out.print ("*");
            }
        }//cierre del if de la piramide hueca
        
        if( (nombreFigura.equals("PiramideInvertida")) && (!rellena)){
            int altura = 1;
            int espacios = 1;
            int i = 1;
            int relleno = n + (n -1);
            int hueco = relleno - 2;
            
            while (altura <= (n)) { //pinta la parte de arriba
                for (i = 1; i < espacios; i++) {
                    System.out.print(" ");//pinta los espacios de la izquierda
                }
                System.out.print("*");//pinta la primera linea diagonal izquierda
                for (int j=1; j <= hueco; j++) {
                    if (altura == 1) {
                        System.out.print("*");//pinta la base
                    } else {
                        System.out.print(" ");//pinta los espacios de dentro
                    }
                }
                if (altura < n) {
                    System.out.print("5");//pinta la la segunda diagonal derecha
                }
                System.out.println();
                espacios++;
                altura++;
                relleno = relleno - 2;
                hueco = hueco - 2;
            }           
        }//cierre if piramide invertida hueca
        
        if( (nombreFigura.equals("Cuadrado") && (!rellena))){
            int ancho = n;
            int i, j;
          
            for (i = 0; i < ancho; i++){//parte de arriba
		System.out.print("* ");
            }
            System.out.println();

            for(i = 1; i < n - 1; i++) {//lateral derecho
		System.out.print("* ");
		for(j = 1; j < ancho - 1; j++){//espacios de dentro
                    System.out.print("  ");//pinta espacios
                }
                System.out.println("*");//pinta lateral derecho
            }
            
            
            for (i = 0; i < ancho; i++){//la base
		System.out.print("* ");
            }
            System.out.println();
        }//cierre del if del cuadrado hueco
    }
}
    

