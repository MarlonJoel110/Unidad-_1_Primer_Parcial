#include <iostream>
#include <string>

using namespace std;

// Representación del 'Registro' de PSeInt en C++
struct Cuenta {
    int numeroCuenta;
    double saldo;
};

int main() {
    string clienteDNI;
    
    // Crear un arreglo para guardar 3 estructuras de tipo Cuenta
    Cuenta cuentas[3];

    // Registro del cliente
    cout << "Ingrese DNI del cliente: ";
    cin >> clienteDNI;

    // Crear e inicializar hasta 3 cuentas (Índices 0, 1 y 2)
    for (int i = 0; i < 3; i++) {
        cuentas[i].numeroCuenta = i + 1; // Guarda el número de cuenta como 1, 2 y 3
        cuentas[i].saldo = 0.0;
    }

    int seleccionCuenta;
    int opcion;
    double monto;
    int destino;
    int indexDestino;

    // Menú principal
    do {
        cout << "\nSeleccione una cuenta (1-3): ";
        cin >> seleccionCuenta;

        // Validar que la cuenta elegida sea correcta antes de continuar
        if (seleccionCuenta < 1 || seleccionCuenta > 3) {
            cout << "Cuenta no valida. Intente de nuevo." << endl;
            continue;
        }

        // Convertimos la selección (1-3) al índice del arreglo (0-2)
        int index = seleccionCuenta - 1;

        cout << "Menu de opciones:" << endl;
        cout << "1. Ver atributos de la cuenta" << endl;
        cout << "2. Enviar dinero" << endl;
        cout << "3. Recibir dinero" << endl;
        cout << "4. Transferencia entre cuentas" << endl;
        cout << "5. Salir" << endl;
        cout << "Elija una opcion: ";
        cin >> opcion;

        switch (opcion) {
            case 1:
                cout << "Cuenta: " << cuentas[index].numeroCuenta << endl;
                cout << "Saldo: " << cuentas[index].saldo << endl;
                break;

            case 2:
                cout << "Ingrese monto a enviar: ";
                cin >> monto;
                if (cuentas[index].saldo >= monto) {
                    cuentas[index].saldo -= monto;
                    cout << "Dinero enviado correctamente." << endl;
                } else {
                    cout << "Saldo insuficiente." << endl;
                }
                break;

            case 3:
                cout << "Ingrese monto a recibir: ";
                cin >> monto;
                cuentas[index].saldo += monto;
                cout << "Dinero recibido correctamente." << endl;
                break;

            case 4:
                cout << "Ingrese cuenta destino (1-3): ";
                destino;
                cin >> destino;

                if (destino < 1 || destino > 3) {
                    cout << "Cuenta destino invalida." << endl;
                    break;
                }

                indexDestino = destino - 1;
                cout << "Ingrese monto a transferir: ";
                cin >> monto;

                if (cuentas[index].saldo >= monto) {
                    cuentas[index].saldo -= monto;
                    cuentas[indexDestino].saldo += monto;
                    cout << "Transferencia realizada." << endl;
                } else {
                    cout << "Saldo insuficiente." << endl;
                }
                break;

            case 5:
                cout << "Saliendo del sistema..." << endl;
                break;

            default:
                cout << "Opcion invalida." << endl;
                break;
        }
    } while (opcion != 5);

    return 0;
}
