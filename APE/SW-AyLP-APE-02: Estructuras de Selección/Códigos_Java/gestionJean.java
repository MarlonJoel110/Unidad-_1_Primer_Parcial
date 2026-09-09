import java.util.Scanner;

public class gestionJean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String codigo = "";
        String color = "";
        String talla = "";
        boolean fueTenido = false;
        int numTenidos = 0;
        double precio = 0.0;
        int numBotones = 0;
        int humedad = 0;
        String estadoTela = "";
        int opcion = 0;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Registrar datos del jean");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Lavar jean");
            System.out.println("4. Secar jean");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese codigo: ");
                    codigo = scanner.nextLine();

                    System.out.print("Ingrese color: ");
                    color = scanner.nextLine();

                    System.out.print("Ingrese talla: ");
                    talla = scanner.nextLine();

                    System.out.print("¿Fue tenido? (true/false): ");
                    fueTenido = scanner.nextBoolean();

                    System.out.print("Número de tenidos: ");
                    numTenidos = scanner.nextInt();

                    System.out.print("Precio: ");
                    precio = scanner.nextDouble();

                    System.out.print("Numero de botones: ");
                    numBotones = scanner.nextInt();

                    System.out.print("Humedad (%): ");
                    humedad = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Estado de la tela: ");
                    estadoTela = scanner.nextLine();
                    break;

                case 2:
                    System.out.println("\n--- DATOS DEL JEAN ---");
                    System.out.println("Codigo: " + codigo);
                    System.out.println("Color: " + color);
                    System.out.println("Talla: " + talla);
                    System.out.println("Fue tenido: " + fueTenido);
                    System.out.println("Número de tenidos: " + numTenidos);
                    System.out.println("Precio: " + precio);
                    System.out.println("Numero de botones: " + numBotones);
                    System.out.println("Humedad: " + humedad + "%");
                    System.out.println("Estado de la tela: " + estadoTela);
                    break;

                case 3:
                    if (numTenidos > 0) {
                        numTenidos--;
                        System.out.println("El jean ha sido lavado. Tenidos restantes: " + numTenidos);
                    } else {
                        System.out.println("El jean no tiene tenidos que reducir.");
                    }
                    break;

                case 4:
                    if (humedad > 0) {
                        humedad -= 10;
                        if (humedad < 0) {
                            humedad = 0;
                        }
                        System.out.println("El jean ha sido secado. Humedad actual: " + humedad + "%");
                    } else {
                        System.out.println("El jean ya esta seco.");
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
