/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacionjunio2015;

/**
 *
 * @author Mariló
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        
        Potencia p1 = new Potencia(5, 3);
        Potencia p2 = new Potencia(2, 0);
        Potencia p3 = new Potencia(5, 2);
        System.out.println(p1 + " " + p2 + " " + p3);
        System.out.println(p1.multiplicaPor(p2));
        System.out.println(p1.multiplicaPor(p3));
        System.out.println(p1.divideEntre(p3));
    }
    
}
