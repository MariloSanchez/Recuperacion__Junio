/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author Mariló
 */
public class Ejercicio3 {
    public static void main (String [] args) {
        String figura1 = "";
        String figura2 = "";
        String figura3 = "";
		
	for (int i = 0; i < 1; i++) {
            switch((int)(Math.random()*5)) {
		case 0: figura1 = "Corazón"; break;
		case 1: figura1 = "Diamante"; break;
		case 2: figura1 = "Herradura"; break;
		case 3: figura1 = "Campana"; break;
		case 4: figura1 = "Limón"; break;
            }	
            switch((int)(Math.random()*5)) {
		case 0: figura2 = "Corazón"; break;
		case 1: figura2 = "Diamante"; break;
		case 2: figura2 = "Herradura"; break;
		case 3: figura2 = "Campana"; break;
		case 4: figura2 = "Limón"; break;
            }
            switch((int)(Math.random()*5)) {
		case 0: figura3 = "Corazón"; break;
		case 1: figura3 = "Diamante"; break;
		case 2: figura3 = "Herradura"; break;
		case 3: figura3 = "Campana"; break;
		case 4: figura3 = "Limón"; break;
            }
            System.out.print (figura1 + " " + figura2 + " " + figura3+"\n");
            
        }
        if ((!figura1.equals(figura2)) && (!figura2.equals(figura3))){
            System.out.println("Lo siento, ha perdido");
        }
        if ((figura1.equals(figura2)) || (figura1.equals(figura3)) || (figura2.equals(figura3))){
            System.out.println("Bien, ha recuperado su moneda");
        }
        if ((figura1.equals(figura2) && (figura2.equals(figura3)))){
            System.out.println("Enhorabuena! Has ganado 10 monedas");
        }
    }
}
