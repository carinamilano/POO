package tp10;

import javax.swing.*;
import java.awt.*;

public class Ejercicio3 extends JFrame {

    private JTextField txtTemperatura;
    private JComboBox<String> cmbConversion;
    private JLabel lblResultado;

    public Ejercicio3(){
        setTitle("Conversor de Temperatura");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2,10, 20));

        add(new JLabel("Temperatura:"));
        txtTemperatura = new JTextField();
        add(txtTemperatura);

        add(new JLabel("Conversión:"));
        cmbConversion = new JComboBox<>(new String[]{
                "Celsius → Fahrenheit",
                "Fahrenheit → Celsius"
        });
        add(cmbConversion);

        JButton btnConvertir = new JButton("Convertir");
        add(btnConvertir);

        lblResultado = new JLabel("Resultado: ");
        add(lblResultado);

        btnConvertir.addActionListener(e -> convertir());
    }

    private void convertir() {
        try {
            double temp = Double.parseDouble(txtTemperatura.getText().trim());
            double resultado;
            String unidad;

            if (cmbConversion.getSelectedIndex() == 0) {
                // Celsius a Fahrenheit
                resultado = (temp * 9.0 / 5.0) + 32;
                unidad = "°F";
            } else {
                // Fahrenheit a Celsius
                resultado = (temp - 32) * 5.0 / 9.0;
                unidad = "°C";
            }

            lblResultado.setText(String.format("Resultado: %.2f %s", resultado, unidad));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Ingresá un número válido.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio3().setVisible(true);
        });
    }
}
