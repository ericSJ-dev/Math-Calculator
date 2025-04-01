package controlador;

import modelo.Modelo;

//Esta clase sirve para comunicar la logica del modelo con la vista

public class Controlador {
    Modelo m = new Modelo();

    // Constructor de la clase Controlador
    public Controlador() {
    }

    // Método para llamar a la función suma del modelo
    public int llamarSuma(int numero1, int numero2) {
        return m.suma(numero1, numero2);
    }

    // Método para llamar a la función resta del modelo
    public int llamarResta(int numero1, int numero2) {
        return m.resta(numero1, numero2);
    }

    // Método para llamar a la función multiplicación del modelo
    public int llamarMultiplicacion(int numero1, int numero2) {
        return m.multiplicacion(numero1, numero2);
    }

    // Método para llamar a la función división del modelo
    public int llamarDivision(int numero1, int numero2) {
        return m.division(numero1, numero2);
    }
}
