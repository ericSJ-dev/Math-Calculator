package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;

//este programa usa una interfaz visual para presentar una calculadora con las 4 operaciones básicas
//En esta clase se arranca la ventana principal de la calculadora, la cual tiene 4 paneles, uno para cada operación

public class Vista extends JFrame {
    private JPanel panelUno;
    private JPanel panelDos;
    private JPanel panelTres;
    private JPanel panelCuatro;

    public static void main(String args[]) {
        Vista v = new Vista();
        v.setVisible(true);
    }

    // Constructor de la clase Vista
    public Vista() {
        // Configuración básica de la ventana
        setSize(800, 600);
        setTitle("Calculadora");
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Creación y configuración del panel de suma
        panelUno = new PanelSuma();
        panelUno.setBounds(30, 20, 700, 100);
        add(panelUno);

        // Creación y configuración del panel de resta
        panelDos = new PanelResta();
        panelDos.setBounds(30, 150, 700, 100);
        add(panelDos);

        // Creación y configuración del panel de multiplicación
        panelTres = new PanelMultiplicacion();
        panelTres.setBounds(30, 280, 700, 100);
        add(panelTres);

        // Creación y configuración del panel de división
        panelCuatro = new PanelDivision();
        panelCuatro.setBounds(30, 410, 700, 100);
        add(panelCuatro);
    }
}
