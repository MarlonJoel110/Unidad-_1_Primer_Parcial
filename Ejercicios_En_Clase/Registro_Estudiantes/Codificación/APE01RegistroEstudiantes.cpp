#include <iostream>
#include <string>
#include <iomanip>
#include <bitset>

int main() {
    std::string nombre;
    int edad;
    double nota1, nota2, nota3;

    // Entrada de datos
    std::cout << "Ingrese el nombre del estudiante: ";
    std::getline(std::cin, nombre);

    std::cout << "Ingrese la edad del estudiante: ";
    std::cin >> edad;

    std::cout << "==== Ingreso de notas ====\n";
    std::cout << "Nota 1: ";
    std::cin >> nota1;
    std::cout << "Nota 2: ";
    std::cin >> nota2;
    std::cout << "Nota 3: ";
    std::cin >> nota3;

    // Cálculo del promedio
    double promedio = (nota1 + nota2 + nota3) / 3.0;

    // Primera letra del nombre
    char primeraLetra = nombre[0];
    int codigoUnicode = static_cast<unsigned char>(primeraLetra);

    // Conversiones a binario (sin ceros a la izquierda innecesarios)
    std::string edadBin = std::bitset<16>(edad).to_string();
    edadBin.erase(0, edadBin.find_first_not_of('0'));

    std::string unicodeBin = std::bitset<16>(codigoUnicode).to_string();
    unicodeBin.erase(0, unicodeBin.find_first_not_of('0'));

    // Despliegue de resultados
    std::cout << "\n====== Resultados ======\n";
    std::cout << "Estudiante: " << nombre << "\n";
    
    // Formato de promedio a 2 decimales
    std::cout << std::fixed << std::setprecision(2);
    std::cout << "Promedio: " << promedio << "\n";

    // Edad en distintas bases
    std::cout << std::dec;
    std::cout << "Edad en decimal: " << edad << "\n";
    std::cout << "Edad en binario: " << edadBin << "\n";
    std::cout << "Edad en hexadecimal: " << std::hex << std::uppercase << edad << "\n";

    // Unicode de la primera letra
    std::cout << "\n--- Unicode de la primera letra ('" << primeraLetra << "') ---\n";
    std::cout << std::dec;
    std::cout << "Decimal: " << codigoUnicode << "\n";
    std::cout << "Binario: " << unicodeBin << "\n";
    std::cout << "Hexadecimal: " << std::hex << std::uppercase << codigoUnicode << "\n";

    return 0;
}