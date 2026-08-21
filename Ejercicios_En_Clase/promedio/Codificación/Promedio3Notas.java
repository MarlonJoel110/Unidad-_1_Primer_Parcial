package promedio3notas;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Promedio3Notas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double n1, n2, n3, promedio;
        
        System.out.print("Ingrese la Nota 1: ");
        n1 = scan.nextDouble();    
        System.out.print("Ingrese la Nota 2: ");
        n2 = scan.nextDouble();
        System.out.print("Ingrese la Nota 3: ");
        n3 = scan.nextDouble();
        
        promedio = (n1+n2+n3)/3;
        
        System.out.println("\n====== Notas Ingresadas ======");
        System.out.println("Nota1: "+n1);
        System.out.println("Nota2: "+n2);
        System.out.println("Nota3: "+n3);
        System.out.println("Su promedio es: "+promedio);
    }
    
}
