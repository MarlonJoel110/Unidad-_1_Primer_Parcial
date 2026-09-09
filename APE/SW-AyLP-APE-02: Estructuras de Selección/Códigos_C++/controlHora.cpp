# include <iostream>

using namespace std;

int main() {
    int hora, minuto, segundo;
    char respuesta;

    cout << "Ingrese la hora: ";
    cin >> hora;
    cout << "Ingrese los minutos: ";
    cin >> minuto;
    cout << "Ingrese los segundos: ";
    cin >> segundo;

    cout << "La hora registrada es: " << hora << ":" << minuto << ":" << segundo << endl;

    cout << "¿Desea cambiar la hora? (S/N): ";
    cin >> respuesta;

    while (respuesta == 'S' || respuesta == 's'){
        cout << "Ingrese la nueva hora: ";
        cin >> hora;
        cout << "Ingrese los nuevos minutos: ";
        cin >> minuto;
        cout << "Ingrese los nuevos segundos: ";
        cin >> segundo;

        cout << "La nueva hora registrada es: " << hora << ":" << minuto << ":" << segundo << endl;

        cout << "¿Desea cambiar la hora nuevamente? (S/N): ";
        cin >> respuesta;
    }

    cout << "Programa finalizado." << endl;
}