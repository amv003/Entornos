/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package azar;

/**
 *
 * @author developer
 */
import java.util.Scanner;
public class JuegoAdivinaElNumero {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        Azar a = new Azar();
        int num2;
        int intentos = 0;
        do{
            System.out.println("dime un numero entre el 1 y el 100: ");
            num2 = teclado.nextInt();
            intentos++;
            if(a.mayor(num2))
            {
                System.out.println("es mayor");
            }
            else if (a.menor(num2)){
            System.out.println("es menor");
            }
            else
                System.out.println("Has adivinado el numero"); 
            
      
        }
        while(!a.igual(num2));
        System.out.println("el numero de intentos es: "+ intentos);
        
           
    }

 
    
}
