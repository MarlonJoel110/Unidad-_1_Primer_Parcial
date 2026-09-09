import java.util.Scanner;

public class controlHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora, minuto, segundo;
        char respuesta;

        System.out.print("Ingrese la hora: ");
        hora = sc.nextInt();
        System.out.print("Ingrese la minuto: ");
        minuto = sc.nextInt();
        System.out.print("Ingrese la segundos: ");
        segundo = sc.nextInt();

        System.out.println("La hora registrada es: " + hora + ":" + minuto + ":" + segundo);

        System.out.println("¿Desea cambiar la hora? (S/N): ");
        respuesta = sc.next().charAt(0);

        while ((respuesta == 'S')|| respuesta == 's') {
            System.out.print("Ingrese la nueva hora: ");
            hora = sc.nextInt();
            System.out.print("Ingrese los nuevos minutos: ");
            minuto = sc.nextInt();
            System.out.print("Ingrese los nuevos segundos: ");
            segundo = sc.nextInt();

            System.out.println("La nueva hora registrada es: " + hora + ":" + minuto + ":" + segundo);

            System.out.println("¿Desea cambiar la hora nuevamente? (S/N): ");
            respuesta = sc.next().charAt(0);
        }

        System.out.println("Programa Finalizado");
    }
}
