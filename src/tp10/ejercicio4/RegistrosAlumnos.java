package tp10.ejercicio4;

import javax.swing.*;
import java.awt.*;

public class RegistrosAlumnos extends JFrame {

    private JTextField txtLegajo;
    private JTextField txtNombre;
    private JComboBox<String> cmbCarrera;

    public RegistrosAlumnos() {
        setTitle("Registro de Alumnos");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Legajo:"));
        txtLegajo = new JTextField();
        add(txtLegajo);

        add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("Carrera:"));
        cmbCarrera = new JComboBox<>(new String[]{   // antes: txtCarrera = new JTextField();
                "Ingeniería en Sistemas",
                "Ingeniería Industrial",
                "Administración de Empresas"
        });
        add(cmbCarrera);

        add(new JLabel());
        JButton btnRegistrar = new JButton("Registrar");
        add(btnRegistrar);

        btnRegistrar.addActionListener(e -> registrar());
    }

    private void registrar() {
        String legajoTexto = txtLegajo.getText().trim();
        String nombre      = txtNombre.getText().trim();
        String carrera = (String) cmbCarrera.getSelectedItem();

        if (legajoTexto.isEmpty() || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Todos los campos son obligatorios.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int legajo;
        try {
            legajo = Integer.parseInt(legajoTexto);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "El legajo debe ser un número entero.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            txtLegajo.setBackground(new Color(255, 200, 200));
            txtLegajo.setText("");
            txtLegajo.requestFocus();
            return;
        }

        txtLegajo.setBackground(Color.WHITE);
        Alumno alumno = new Alumno(legajo, nombre, carrera);

        JOptionPane.showMessageDialog(this,
                "Alumno registrado exitosamente:\n" + alumno,
                "Confirmación", JOptionPane.INFORMATION_MESSAGE);

        limpiarCampos();
    }

    private void limpiarCampos() {
        txtLegajo.setText("");
        txtNombre.setText("");
        cmbCarrera.setSelectedIndex(0);
        txtLegajo.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
                new RegistrosAlumnos().setVisible(true));
    }
}