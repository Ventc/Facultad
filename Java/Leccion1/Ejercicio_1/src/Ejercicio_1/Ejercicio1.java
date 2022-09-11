
package Ejercicio_1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        var entrada =  new Scanner(System.in);
        System.out.println("Digite el nombre del libro: ");
        String nombre = entrada.nextLine();
        System.out.println("Digite el ID del libro: ");
        int id = entrada.nextInt();
        System.out.println("Digite el precio del libro: ");
        double precio = entrada.nextDouble();
        System.out.println("Indique si el envio es gratuito (true/false): ");
        boolean envio = entrada.nextBoolean();
        System.out.println("****************");
        System.out.println("Nombre: "+nombre);
        System.out.println("ID: "+ id);
        System.out.println("Precio: "+precio);
        if (envio) {
            System.out.println("Envio: Gratuito");
        }else {
            System.out.println("Envio: No posee Envio Gratuito");
        }
    }
}