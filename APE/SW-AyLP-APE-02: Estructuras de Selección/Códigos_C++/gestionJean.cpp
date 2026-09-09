#include <iostream>
#include <string>

using namespace std;

int main() {
    // Variables independientes para reemplazar el Registro
    string codigo = "";
    string color = "";
    string talla = "";
    bool fueTenido = false;
    int numTenidos = 0;
    double precio = 0.0;
    int numBotones = 0;
    int humedad = 0;
    string estadoTela = "";

    int opcion = 0;
    char respuestaTenido; // Para capturar V/F del usuario

    do {
        cout << "\n--- MENÚ PRINCIPAL ---" << endl;
        cout << "1. Registrar datos del jean" << endl;
        cout << "2. Mostrar datos" << endl;
        cout << "3. Lavar jean" << endl;
        cout << "4. Secar jean" << endl;
        cout << "5. Salir" << endl;
        cout << "Elija una opción: ";
        cin >> opcion;

        switch (opcion) {
            case 1:
                cout << "Ingrese código: ";
                cin >> codigo;

                cout << "Ingrese color: ";
                cin >> color;

                cout << "Ingrese talla: ";
                cin >> talla;

                cout << "¿Fue teñido? (V/F): ";
                cin >> respuestaTenido;
                fueTenido = (respuestaTenido == 'V' || respuestaTenido == 'v');

                cout << "Número de teñidos: ";
                cin >> numTenidos;

                cout << "Precio: ";
                cin >> precio;

                cout << "Número de botones: ";
                cin >> numBotones;

                cout << "Humedad (%): ";
                cin >> humedad;

                cout << "Estado de la tela: ";
                cin >> estadoTela;
                break;

            case 2:
                cout << "\n--- DATOS DEL JEAN ---" << endl;
                cout << "Código: " << codigo << endl;
                cout << "Color: " << color << endl;
                cout << "Talla: " << talla << endl;
                cout << "Fue teñido: " << (fueTenido ? "Sí" : "No") << endl;
                cout << "Número de teñidos: " << numTenidos << endl;
                cout << "Precio: " << precio << endl;
                cout << "Número de botones: " << numBotones << endl;
                cout << "Humedad: " << humedad << "%" << endl;
                cout << "Estado de la tela: " << estadoTela << endl;
                break;

            case 3:
                if (numTenidos > 0) {
                    numTenidos--;
                    cout << "El jean ha sido lavado. Teñidos restantes: " << numTenidos << endl;
                } else {
                    cout << "El jean no tiene teñidos que reducir." << endl;
                }
                break;

            case 4:
                if (humedad > 0) {
                    humedad -= 10;
                    if (humedad < 0) {
                        humedad = 0;
                    }
                    cout << "El jean ha sido secado. Humedad actual: " << humedad << "%" << endl;
                } else {
                    cout << "El jean ya está seco." << endl;
                }
                break;

            case 5:
                cout << "Saliendo del sistema..." << endl;
                break;

            default:
                cout << "Opción inválida." << endl;
                break;
        }
    } while (opcion != 5);

    return 0;
}