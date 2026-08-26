/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menucafeteria;

import java.util.Scanner;

/**
 *
 * @author FISEI-LB2
 */
public class MenuCafeteria {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        
        int cantidad, opcion;
        double saldo, total, descuentoT;
        
        System.out.println("===== Menu Cafeteria Universitaria ====");
        System.out.println("1.- Cafe   $3.50");
        System.out.println("2.- Pan    $0.25");
        System.out.println("3.- Te     $0.30");
        
        System.out.print("\nSeleccione el poducto que desea comprar: ");
        opcion = scan.nextInt();
        
        if(opcion == 1){
            System.out.print("\nIngrese la cantidad del producto que desea comprar: ");
            cantidad = scan.nextInt();
            
            System.out.print("Ingese su saldo disponible: ");
            saldo = scan.nextDouble();
            
            total = cantidad * saldo;
            
            if(total<10){
                descuentoT = total *0.90;
                System.out.println("Descuento del 10%");
                System.out.println("\nSU TOTAL ES: "+descuentoT);
            }       
        System.out.println("\nSU TOTAL ES: "+total);        
        }
        
        if(opcion == 2){
            System.out.print("\nIngrese la cantidad del producto que desea comprar: ");
            cantidad = scan.nextInt();
            
            System.out.print("Ingese su saldo disponible: ");
            saldo = scan.nextDouble();
            
            total = cantidad * saldo;
            
            if(total<10){
                descuentoT = total *0.90;
                System.out.println("Descuento del 10%");
                System.out.println("\nSU TOTAL ES: "+descuentoT);
            }       
        System.out.println("\nSU TOTAL ES: "+total);        
        }
        
        if(opcion == 3){
            System.out.print("\nIngrese la cantidad del producto que desea comprar: ");
            cantidad = scan.nextInt();
            
            System.out.print("Ingese su saldo disponible: ");
            saldo = scan.nextDouble();
            
            total = cantidad * saldo;
            
            if(total<10){
                descuentoT = total *0.90;
                System.out.println("Descuento del 10%");
                System.out.println("\nSU TOTAL ES: "+descuentoT);
            }       
        System.out.println("\nSU TOTAL ES: "+total);        
        }
        
        if(opcion == 1){
            System.out.print("\nIngrese la cantidad del producto que desea comprar: ");
            cantidad = scan.nextInt();
            
            System.out.print("Ingese su saldo disponible: ");
            saldo = scan.nextDouble();
            
            total = cantidad * saldo;
            
            if(total<10){
                descuentoT = total *0.90;
                System.out.println("Descuento del 10%");
                System.out.println("\nSU TOTAL ES: "+descuentoT);
            }       
        System.out.println("\nSU TOTAL ES: "+total);        
        }
    }
}
