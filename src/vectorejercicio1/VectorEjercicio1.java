//Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100. 
//Realizar un programa que permita la carga por teclado de los 10 números solicitados.

package vectorejercicio1;
import java.util.Scanner;
public class VectorEjercicio1 {

    
    public static void main(String[] args) {
        //Declaración
        int [] vector = new int[10];
        
        //El valor inicial de i es 0
        int i = 0;   
        
        //Asignación (teclado)
        Scanner teclado = new Scanner(System.in);
//Mientras que i sea menor que el largo del vector
        while (i<vector.length) {
            //Mensaje para pedir el ingreso de un número
            System.out.print("Ingrese un numero entre el 1 y el 100: ");
            //El número será el ingresado por teclado
            int numero = teclado.nextInt();
            //Condición que impide ingresar un número mayor a 100 o menor a 1
            if (numero > 100 || numero < 1) {
              //Mensaje de error y pedido de ingreso de un nuevo numero
               System.out.println("El número ingresado esta fuera de rango.");
               System.out.println("-----------------");
               i=i--;
            } else {
                //Asociación del nuevo número ingresado a su posición
                vector[i] = numero;
                //Aumento de la posición anterior en uno
                i++;
            }
    }
    }
    
}
