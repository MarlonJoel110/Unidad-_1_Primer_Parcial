#include <iostream>
#include <string>

using namespace std;

int main() {
    string nombre, producto;
    int cantidad;
    double precioUnitario, subtotal, descuento, total, dineroEntregado, cambio;

    cout << "Ingrese su nombre: ";
    getline(cin, nombre);

    cout << "Ingrese el nombre del producto que desea comprar: ";
    getline(cin, producto);

    cout << "Ingrese la cantidad que va a comprar del producto: ";
    cin >> cantidad;

    cout << "Ingrese el precio del producto: ";
    cin >> precioUnitario;

    subtotal = cantidad * precioUnitario;
    descuento = subtotal * 0.10;
    total = subtotal - descuento;

    cout << "\nIngrese su dinero de entrada: ";
    cin >> dineroEntregado;

    if (dineroEntregado >= total) {
        cambio = dineroEntregado - total;
        cout << "\n======== Cafeteria UTA ========" << endl;
        cout << "******** Pago aceptado ********" << endl;
        cout << "Nombre: " << nombre << endl;
        cout << "Producto: " << producto << endl;
        cout << "Cantidad: " << cantidad << endl;
        cout << "Precio del producto: " << precioUnitario << endl;
        cout << "Su cambio es de: " << cambio << endl;
    } else {
        cout << "\nEL DINERO NO ES SUFICIENTE PARA CUBRIR EL PAGO" << endl;
    }
}