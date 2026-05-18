package tp10;

import javax.swing.*;

public class Ejercicio2 extends JFrame {

    private JTextField campoNum1, campoNum2;
    private JLabel resultado;

    public Ejercicio2() {
        setTitle("Calculadora básica");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Número 1:"));
        campoNum1 = new JTextField();
        panel.add(campoNum1);

        panel.add(new JLabel("Número 2:"));
        campoNum2 = new JTextField();
        panel.add(campoNum2);

        resultado = new JLabel("Resultado: ");
        panel.add(resultado);

        // los cuatro botones
        JButton btnSumar = new JButton("Sumar");
        JButton btnRestar = new JButton("Restar");
        JButton btnMultiplicar = new JButton("Multiplicar");
        JButton btnDividir = new JButton("Dividir");

        panel.add(btnSumar);
        panel.add(btnRestar);
        panel.add(btnMultiplicar);
        panel.add(btnDividir);

        // cada botón le pasa su operación al método operar()
        btnSumar.addActionListener(e -> operar('+'));
        btnRestar.addActionListener(e -> operar('-'));
        btnMultiplicar.addActionListener(e -> operar('*'));
        btnDividir.addActionListener(e -> operar('/'));
        // ────────────────────────────────────────────────────────

        add(panel);
    }

    // metodo operar() con validaciones
    private void operar(char operacion) {
        try {
            double num1 = Double.parseDouble(campoNum1.getText());
            double num2 = Double.parseDouble(campoNum2.getText());
            double res = 0;

            if (operacion == '/' && num2 == 0) {
                JOptionPane.showMessageDialog(this, "No se puede dividir por cero", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (operacion == '+') res = num1 + num2;
            if (operacion == '-') res = num1 - num2;
            if (operacion == '*') res = num1 * num2;
            if (operacion == '/') res = num1 / num2;

            resultado.setText("Resultado: " + res);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresá números válidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    // ────────────────────────────────────────────────────────────

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ejercicio2().setVisible(true));
    }
}