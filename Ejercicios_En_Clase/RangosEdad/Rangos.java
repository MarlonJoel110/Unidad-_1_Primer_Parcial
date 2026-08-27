/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rangos;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Rangos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in); 

        int edad; 

        System.out.print("Ingrese su edad: "); 
        edad = scan.nextInt(); 

        if (edad<18){ 
            System.out.println("Categoria Joven"); 
        }else if(edad>=18 && edad<=64){ 
            System.out.println("Categoria Adulto"); 
        }else{ 
            System.out.println("Categoria Tercera edad");
        }
    }
}
