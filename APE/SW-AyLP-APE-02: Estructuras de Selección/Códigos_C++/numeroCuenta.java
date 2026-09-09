import java.util.Scanner;

public class numeroCuenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // En lugar de una clase/struct, usamos arreglos paralelos
        int[] numeroCuenta = new int[3];
        double[] saldo = new double[3];

        // Registro del cliente
        System.out.print("Ingrese DNI del cliente: ");
        String clienteDNI = scanner.next();

        // Inicializar hasta 3 cuentas (Índices 0, 1 y 2)
        for (int i = 0; i < 3; i++) {
            numeroCuenta[i] = i + 1; // Guarda el número de cuenta como 1, 2 y 3
            saldo[i] = 0.0;
        }

        int seleccionCuenta;
        int opcion = 0;
        double monto;

        // Menú principal
        do {
            System.out.print("\nSeleccione una cuenta (1-3): ");
            seleccionCuenta = scanner.nextInt();

            // Validar que la cuenta elegida sea correcta
            if (seleccionCuenta < 1 || seleccionCuenta > 3) {
                System.out.println("Cuenta no valida. Intente de nuevo.");
                continue;
            }

            // Convertimos la selección (1-3) al índice del arreglo (0-2)
            int index = seleccionCuenta - 1;

            System.out.println("Menu de opciones:");
            System.out.println("1. Ver atributos de la cuenta");
            System.out.println("2. Enviar dinero");
            System.out.println("3. Recibir dinero");
            System.out.println("4. Transferencia entre cuentas");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cuenta: " + numeroCuenta[index]);
                    System.out.println("Saldo: " + saldo[index]);
                    break;

                case 2:
                    System.out.print("Ingrese monto a enviar: ");
                    monto = scanner.nextDouble();
                    if (saldo[index] >= monto) {
                        saldo[index] -= monto;
                        System.out.println("Dinero enviado correctamente.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese monto a recibir: ");
                    monto = scanner.nextDouble();
                    saldo[index] += monto;
                    System.out.println("Dinero recibido correctamente.");
                    break;

                case 4:
                    System.out.print("Ingrese cuenta destino (1-3): ");
                    int destino = scanner.nextInt();

                    if (destino < 1 || destino > 3) {
                        System.out.println("Cuenta destino invalida.");
                        break;
                    }

                    int indexDestino = destino - 1;
                    System.out.print("Ingrese monto a transferir: ");
                    monto = scanner.nextDouble();

                    if (saldo[index] >= monto) {
                        saldo[index] -= monto;
                        saldo[indexDestino] += monto;
                        System.out.println("Transferencia realizada.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}