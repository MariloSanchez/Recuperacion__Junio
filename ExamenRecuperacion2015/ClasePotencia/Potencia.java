/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacionjunio2015;

import java.util.ArrayList;

/**
 *
 * @author Mariló
 */
public class Potencia {
    
    //atributos de clases
    private double base;
    private int exponente;
    
    //constructor
    public Potencia(double base, int exponente){   
        this.base = base;       
        this.exponente = exponente;
    }
    
    //metodos
    public Potencia multiplicaPor(Potencia p) {
        Potencia resultado;
        if(base == p.base){
            resultado = new Potencia(base, exponente + p.exponente);
        }else{
            System.out.println("Lo siento, no puedo multiplicar potencias de distinta base.");
            resultado = new Potencia(0, 0);
        }
        return resultado;
    }
    public Potencia divideEntre(Potencia p) {
        Potencia resultado;
        if(base == p.base){
            resultado = new Potencia(base, exponente - p.exponente);
        }else{
            System.out.println("Lo siento, no puedo dividir potencias de distinta base.");
            resultado = new Potencia(0, 0);
        }
        return resultado;
    }
    @Override
    public String toString() {
        return base + "^" + exponente;
    }
}
