/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menucafeteriauniversidad;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class MenuCafeteriaUniversidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int opcion, cantidad;
        double precio = 0, total;

        System.out.println("===== Menu Cafeteria Universitaria ====");
        System.out.println("1.- Cafe    $3.50");
        System.out.println("2.- Pan     $0.25");
        System.out.println("3.- Te      $0.30");

        System.out.print("\nSeleccione el producto que desea comprar: ");
        opcion = scan.nextInt();

        System.out.print("Ingrese la cantidad del producto que desea comprar: ");
        cantidad = scan.nextInt();

        if (opcion == 1){
            precio = 3.50;
        } else if (opcion == 2) {
            precio = 0.25;
        } else if (opcion == 3) {
            precio = 0.30;
        }

        total = cantidad * precio;

        if (total >= 10) {
            total = total * 0.90;
            System.out.println("Se aplico un descuento del 10%");
        }

        System.out.println("SU TOTAL A PAGAR ES DE: $" + total);
        
    }
    
}
