package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import controlador.Controlador;

public class PanelDivision extends JPanel implements ActionListener {
    Controlador c = new Controlador();
    private JTextField numeroUno;
    private JTextField numeroDos;
    private JTextField resultado;
    private JButton division;

    // Constructor de la clase PanelDivision
    public PanelDivision() {
        setLayout(null);
        setBorder(BorderFactory.createTitledBorder("Division"));

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

        division = new JButton("Division");
        division.setBounds(520, 20, 150, 40);
        division.setActionCommand("Division");
        division.addActionListener(this);
        add(division);
    }

    // Manejo del evento de acción del boton
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(division.getActionCommand())) {
            try {
                int numero1 = Integer.parseInt(numeroUno.getText());
                int numero2 = Integer.parseInt(numeroDos.getText());
                if(numero2 == 0){
                    JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
                    return;
                }
                String result = Integer.toString(c.llamarDivision(numero1, numero2));
                resultado.setText(result);
            } catch (Exception f) {
                JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
            }
        }
    }
}
