/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trimestre1;

/**
 *
 * @author Mariló
 */
public class MultiplodeDe5Y7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int array [] = new int [20];
        
        System.out.println("ARRAY ORIGINAL\n***************");
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 401);
            System.out.print(array[i] + "|");
        }
        System.out.println();
        
        System.out.println("MULTIPLOS DE 5\n*****************");
        for(int i = 0; i < array.length; i++){
            if((array[i]%5)==0){
                System.out.print("[" + array[i] + "]|");
            }else{
                System.out.print(array[i] + "|");
            }
        }
        System.out.println();
        
        System.out.println("MULTIPLOS DE 7\n*****************");
        for(int i = 0; i < array.length; i++){
            if((array[i]%7)==0){
                System.out.print("(" + array[i] + ")|");
            }else{
                System.out.print(array[i] + "|");
            }
        }
        
    }
    
}
