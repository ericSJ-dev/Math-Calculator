package modelo;

//Esta clase contiene la logica de la aplicación 
public class Modelo {
    public int operacion;

    // Constructor de la clase Modelo
    public Modelo() {
    }

    // Método para realizar la suma de dos números
    public int suma(int numero1, int numero2) {
        operacion = numero1 + numero2;
        return operacion;
    }

    // Método para realizar la resta de dos números
    public int resta(int numero1, int numero2) {
        operacion = numero1 - numero2;
        return operacion;
    }

    // Método para realizar la multiplicación de dos números
    public int multiplicacion(int numero1, int numero2) {
        operacion = numero1 * numero2;
        return operacion;
    }

    // Método para realizar la división de dos números
    public int division(int numero1, int numero2) {
        operacion = numero1 / numero2;
        return operacion;
    }
}
