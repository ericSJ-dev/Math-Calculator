package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import controlador.Controlador;

public class PanelResta extends JPanel implements ActionListener {
    Controlador c = new Controlador();
    private JTextField numeroUno;
    private JTextField numeroDos;
    private JTextField resultado;
    private JButton restar;

    // Constructor de la clase PanelResta
    public PanelResta() {
        setLayout(null);
        setBorder(BorderFactory.createTitledBorder("Resta"));

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

        restar = new JButton("Resta");
        restar.setBounds(520, 20, 150, 40);
        restar.setActionCommand("Resta");
        restar.addActionListener(this);
        add(restar);
    }

    // Manejo del evento de acción del boton
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(restar.getActionCommand())) {
            try {
                int numero1 = Integer.parseInt(numeroUno.getText());
                int numero2 = Integer.parseInt(numeroDos.getText());
                String result = Integer.toString(c.llamarResta(numero1, numero2));
                resultado.setText(result);
            } catch (Exception f) {
                JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
            }
        }
    }
}
