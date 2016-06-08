/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author Mariló
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        System.out.println("GENERADOR DE MELODIAS");
        System.out.println("---------------------");
        
        int numCompases = (int)(Math.random() * 7);
        String notaInicial = "";
        String notaFina = "";
        
        for(int c = 0; c < numCompases; c++){//For para crear numero aleatorio de compases
            
            for(int i = 0; i < 4; i++){//for para pintar las notas de los compases
                
                int notas = (int)(Math.random()* 7);//el random empieza de 0 e iria de 0 a 6 por eso el switch para que lo coja
                //bien empieza el caso por 0
                String nota= "";
                
                switch (notas){
                    case 0:
                        nota = "si";
                        break;
                    case 1:
                        nota = "do";
                        break;
                    case 2:
                        nota = "re";
                        break;
                    case 3:
                        nota = "mi";
                        break;
                    case 4:
                        nota = "fa";
                        break;
                    case 5:
                        nota = "sol";
                        break;
                    case 6:
                        nota = "la";
                        break;

                }
                //La i y la c hacen referencia a los bucles a la primera nota que sale y la guarda
                if (i == 0 && c == 0){//guardo la nota inicial
                    notaInicial = nota;
                }
                //La i y la c hacen referencia a los bucles a la ultima nota que sale y la sobreescribe
                if (i == 3 && c == numCompases - 1){//sobreescribo la ultima nota y la machaca
                    nota = notaInicial;
                }
                System.out.print(nota + " ");
            }//for notas
            System.out.print("|");//pinto una barra entre compas y compas fuera del bucle de pintar notas
        }//for compases
        System.out.print("|");//pinto la doble barra fuera del bucle de crear compases random, ya hay una por 
        //terminar el compas
        
        
    }
}
