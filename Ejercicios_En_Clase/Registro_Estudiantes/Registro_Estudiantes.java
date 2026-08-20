package ape01;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class RegistroEstudiante {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                
        String nombre, EdadBin, EdadHexad;
        int edad;
        double n1, n2, n3;
        
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = scan.nextLine();
        
        System.out.print("Ingrese la edad del estudiante: ");
        edad = scan.nextInt();
        
        System.out.println("==== Ingreso de notas ====");
        System.out.print("Nota 1: ");
        n1 = scan.nextDouble();
        System.out.print("Nota 2: ");
        n2 = scan.nextDouble();
        System.out.print("Nota 3: ");
        n3 = scan.nextDouble();
        
        double prom = (n1+n2+n3)/3;
        
        EdadBin = Integer.toBinaryString(edad);
        EdadHexad = Integer.toHexString(edad).toUpperCase();
        
        int codigoUnicode = nombre.codePointAt(0);
        String primeraLetra = nombre.substring(0, 1);
        String unicodeBinario = Integer.toBinaryString(codigoUnicode);
        String unicodeHexad = Integer.toHexString(codigoUnicode).toUpperCase();
        
        System.out.println("\n====== Resultados ======");
        System.out.println("Estudiante: "+nombre);
        System.out.printf("Promedio: %.2f%n",prom);
        System.out.println("Edad en decimal: "+edad);
        System.out.println("Edad en binario: "+EdadBin);
        System.out.println("Edad en hexadecimal: "+EdadHexad);
        System.out.println("\n--- Unicode de la primera letra ('" + primeraLetra + "') ---");
        System.out.println("Decimal: " + codigoUnicode);
        System.out.println("Binario: " + unicodeBinario);
        System.out.println("Hexadecimal: " + unicodeHexad);
        
    }
    
}
