package tp10;

import javax.swing.*;

public class Ejercicio1 extends JFrame {

    public Ejercicio1() {
        setTitle("Mi primera ventana");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        JLabel lblBienvenida = new JLabel("¡Bienvenido!");
        panel.add(lblBienvenida);

        JButton btnCerrar = new JButton("Cerrar");
        panel.add(btnCerrar);

        btnCerrar.addActionListener(e -> System.exit(0));

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ejercicio1().setVisible(true));
    }
}