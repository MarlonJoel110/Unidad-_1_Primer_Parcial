#include <iostream>

using namespace std;

int main() {
    double n1, n2, n3, promedio;

    cout << "Ingrese la Nota 1: ";
    cin >> n1;
    
    cout << "Ingrese la Nota 2: ";
    cin >> n2;
    
    cout << "Ingrese la Nota 3: ";
    cin >> n3;

    promedio = (n1 + n2 + n3) / 3.0;

    cout << "Primera nota ingresada: " << n1 << endl;
    cout << "Segunda nota ingresada: " << n2 << endl;
    cout << "Tercera nota ingresada: " << n3 << endl;
    cout << "Su promedio es: " << promedio << endl;

    return 0;
}