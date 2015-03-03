/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.practicos;

import java.util.Scanner;


   
public class EjemplosPracticos {

    static boolean comprobacion(int n){
        if (n%2==0) {
            return true;
        }
        else
            return false;
                  
          
    }
    
       public static void main(String[] args) {
     
       int n;
        Scanner teclado = new Scanner(System.in);
                System.out.println("Intorduzca un valor");
                n= teclado.nextInt();
               if (comprobacion (n)== true) {
                   System.out.println("es par");
                   
               }
               else System.out.println("es impar"); 
               
    }
    
}
