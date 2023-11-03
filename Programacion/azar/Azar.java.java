// Crea un programa donde la maquina elija un numero al azar y tu tengas que adivinar el numero.


package azar;
import java.util.Random;
/**
 *
 * @author developer
 */
public class Azar {

    /**
     * @param args the command line arguments
     */
        private int valor;
        public Azar(){
            //generar un numero aleatorio entre 1 y 100
            Random num = new Random();
            int numero = num.nextInt(100)+1;
         
            //cargar ese numero aleatorio en el atributo valor
            this.valor=numero;
    }
    public boolean mayor(int numero){
        if (this.valor > numero)
        return true;
        else
            return false;
    }


    public boolean menor(int numero){
       if (this.valor < numero) 
           return true;
       else
           return false;
    }


    public boolean igual(int numero){
       if (this.valor == numero)
           return true;
       else
           return false;
    }
    










}
