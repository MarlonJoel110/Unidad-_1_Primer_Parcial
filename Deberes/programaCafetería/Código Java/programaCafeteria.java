import java.util.Scanner;

public class programaCafeteria{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        String nombre, producto;
        int cantidad;
        double precioUnitario, subtotal, descuento, total, dineroEntregado, cambio;

        System.out.print("Ingrese su nombre: ");
        nombre = scan.nextLine();

        System.out.print("Ingrese el nombre del producto que desea comprar: ");
        producto = scan.nextLine();

        System.out.print("Ingrese la cantidad que va a comprar del producto: ");
        cantidad = scan.nextInt();

        System.out.print("Ingrese el precio del producto: ");
        precioUnitario = scan.nextDouble();

        subtotal = cantidad * precioUnitario;
        descuento = subtotal * 0.10;
        total = subtotal - descuento;

        System.out.print("\nIngrese su dinero de entrada: ");
        dineroEntregado = scan.nextDouble();

        if (dineroEntregado >= total) {
            cambio = dineroEntregado - total;
            System.out.println("\n======== Cafeteria UTA ========");
            System.out.println("******** Pago aceptado ********");
            System.out.println("Nombre: " + nombre);
            System.out.println("Producto: " + producto);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Precio del producto: " + precioUnitario);
            System.out.println("Su cambio es de: " + cambio);
        } else {
            System.out.println("\nEL DINERO NO ES SUFICIENTE PARA CUBRIR EL PAGO");
        }
    }
}