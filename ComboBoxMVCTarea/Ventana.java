import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ventana extends JFrame{
    private JLabel lblNombre;
    private JTextField txtxNombre;
    private JButton boton;
    private JComboBox combito;
    private NombreModeloCombo modelo;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 400);
        setLayout(new FlowLayout());
        lblNombre = new JLabel("Ingresa un nombre: ");
        this.getContentPane().add(lblNombre);
        txtxNombre = new JTextField(30);
        this.getContentPane().add(txtxNombre);
        boton = new JButton("Agregar");
        this.getContentPane().add(boton);
        //Configurar el modelo
        modelo = new NombreModeloCombo();
        modelo.agregarNombre("Diana");
        modelo.agregarNombre("Diego");
        modelo.agregarNombre("Susana");
        combito = new JComboBox(modelo);
        this.getContentPane().add(combito);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nuevo = txtxNombre.getText();
                modelo.agregarNombre(nuevo);
                txtxNombre.setText("");
            }
        });
        combito.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(combito.getSelectedIndex());
                System.out.println(combito.getSelectedItem());
                JOptionPane.showMessageDialog(null, "Hola "+ combito.getSelectedItem());
            }
        });
    }
}
