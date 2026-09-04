#include <iostream>
#include <string>

using namespace std;

int main() {

    int opcion;

    do {
        cout << "\n- - - - - CINE CAMPUS - - - - -" << endl;
        cout << "1. Comprar entradas" << endl;
        cout << "2. Consultar precios" << endl;
        cout << "3. Salir" << endl;
        cout << "Elija una opcion: ";
        cin >> opcion;

        switch (opcion) {

            case 1: {
                // Regla 1: formato y precio
                cout << "Formato (1=2D, 2=3D, 3=IMAX): ";

                int formato;
                cin >> formato;

                double precio = 0;

                switch (formato) {
                    case 1:
                        precio = 5.00;
                        break;

                    case 2:
                        precio = 7.50;
                        break;

                    case 3:
                        precio = 10.00;
                        break;

                    default:
                        cout << "Formato invalido." << endl;
                        break;
                }

                // Si el formato es invalido, vuelve al menu
                if (formato < 1 || formato > 3) {
                    break;
                }

                cout << "Cantidad de entradas: ";

                int cantidad;
                cin >> cantidad;

                if (cantidad <= 0) {
                    cout << "Cantidad invalida." << endl;
                    break;
                }

                // Regla 2: validar edad
                cout << "Edad: ";

                int edad;
                cin >> edad;

                if (edad < 0 || edad > 120) {
                    cout << "Edad fuera del rango (0 a 120)." << endl;
                    break;
                }

                cout << "Es estudiante (1=Si, 2=No): ";

                int est;
                cin >> est;

                cout << "Dia de la semana (1=Lunes ... 7=Domingo): ";

                int dia;
                cin >> dia;

                if (dia < 1 || dia > 7) {
                    cout << "Dia invalido." << endl;
                    break;
                }

                double subtotal = precio * cantidad;

                // Regla 3, 4, 5, 6 y 9:
                // Una sola promocion por prioridad
                double porcentaje = 0;
                string promo = "Ninguna";

                if (edad >= 65) {
                    porcentaje = 0.30;
                    promo = "30% por adulto mayor";
                }
                else if (edad <= 11) {
                    porcentaje = 0.20;
                    promo = "20% por niño";
                }
                else if (est == 1 && dia >= 1 && dia <= 5) {
                    porcentaje = 0.15;
                    promo = "15% estudiante entre semana";
                }
                else if (dia == 3) {
                    porcentaje = 0.10;
                    promo = "10% miercoles";
                }

                double descuento = subtotal * porcentaje;

                // Regla 7: recargo del 10% sobre subtotal
                double recargo = 0;

                if ((dia == 6 || dia == 7) && formato == 3) {
                    recargo = subtotal * 0.10;
                }

                double total = subtotal - descuento + recargo;

                // Regla 8: combo de cortesia
                string combo = "No";

                if (cantidad >= 4 && (est == 1 || edad <= 11)) {
                    combo = "Si";
                }

                // Factura
                cout << "\n----- Factura -----" << endl;
                cout << "Precio unitario: " << precio << endl;
                cout << "Subtotal: " << subtotal << endl;
                cout << "Promocion: " << promo << endl;
                cout << "Descuento: " << descuento << endl;
                cout << "Recargo: " << recargo << endl;
                cout << "Combo de cortesia: " << combo << endl;
                cout << "TOTAL A PAGAR: " << total << endl;

                break;
            }

            case 2:
                cout << "\nPRECIOS:" << endl;
                cout << "2D   = 5.00" << endl;
                cout << "3D   = 7.50" << endl;
                cout << "IMAX = 10.00" << endl;
                break;

            case 3:
                cout << "Gracias por su visita." << endl;
                break;

            default:
                cout << "Opcion invalida." << endl;
        }

    } while (opcion != 3);

    return 0;
}
