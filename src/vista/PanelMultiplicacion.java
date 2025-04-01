package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import controlador.Controlador;

public class PanelMultiplicacion extends JPanel implements ActionListener {
    Controlador c = new Controlador();
    private JTextField numeroUno;
    private JTextField numeroDos;
    private JTextField resultado;
    private JButton multiplicacion;

    // Constructor de la clase PanelMultiplicacion
    public PanelMultiplicacion() {
        setLayout(null);
        setBorder(BorderFactory.createTitledBorder("Multiplicacion"));

        // Creación y configuración de los campos de texto y botón
        numeroUno = new JTextField();
        numeroUno.setBounds(10, 20, 150, 40);
        add(numeroUno);

        numeroDos = new JTextField();
        numeroDos.setBounds(180, 20, 150, 40);
        add(numeroDos);

        resultado = new JTextField();
        resultado.setBounds(350, 20, 150, 40);
        resultado.setEnabled(false);
        add(resultado);

        multiplicacion = new JButton("Multiplicacion");
        multiplicacion.setBounds(520, 20, 150, 40);
        multiplicacion.setActionCommand("Multiplicacion");
        multiplicacion.addActionListener(this);
        add(multiplicacion);
    }

    // Manejo del evento de acción del boton
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(multiplicacion.getActionCommand())) {
            try {
                int numero1 = Integer.parseInt(numeroUno.getText());
                int numero2 = Integer.parseInt(numeroDos.getText());
                String result = Integer.toString(c.llamarMultiplicacion(numero1, numero2));
                resultado.setText(result);
            } catch (Exception f) {
                JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
            }
        }
    }
}
