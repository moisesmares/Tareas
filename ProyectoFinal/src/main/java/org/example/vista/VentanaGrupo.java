package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaGrupo extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblEmpresa;
    private JLabel lblNumeroIntegrantes;
    private JLabel lblTiempoActividad;
    private JLabel lblCancion;
    private JLabel lblUrl_Foto;
    private JLabel lblImagenGrupo;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtEmpresa;
    private JTextField txtNumeroIntegrantes;
    private JTextField txtTiempoActividad;
    private JTextField txtCancion;

    private JTextField txtUrl_Foto;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnDelete;
    private GridLayout layout;
    private JTable tabla;
    private JScrollPane scroll;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    public VentanaGrupo(String title) throws HeadlessException {
        super(title);
        this.setSize(1000,1000);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(255,0,255));
        lblId = new JLabel("ID");
        lblNombre = new JLabel("Nombre");
        lblEmpresa = new JLabel("Empresa de Origen");
        lblNumeroIntegrantes = new JLabel("Numero de Integrantes");
        lblTiempoActividad = new JLabel("Tiempo de Actividad");
        lblCancion = new JLabel("Nombre de alguna cancion");
        lblUrl_Foto = new JLabel("Foto en Url");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtNombre = new JTextField(10);
        txtEmpresa = new JTextField(10);
        txtNumeroIntegrantes = new JTextField(5);
        txtTiempoActividad = new JTextField(4);
        txtCancion = new JTextField(15);
        txtUrl_Foto = new JTextField(30);
        btnAgregar = new JButton("Agregar");
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblEmpresa);
        panel1.add(txtEmpresa);
        panel1.add(lblNumeroIntegrantes);
        panel1.add(txtNumeroIntegrantes);
        panel1.add(lblTiempoActividad);
        panel1.add(txtTiempoActividad);
        panel1.add(lblCancion);
        panel1.add(txtCancion);
        panel1.add(lblUrl_Foto);
        panel1.add(txtUrl_Foto);
        panel1.add(btnAgregar);


        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(0,0,0));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tabla = new JTable();
        scroll = new JScrollPane(tabla);
        panel2.add(scroll);


        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(0,0,0));
        lblImagenGrupo = new JLabel("....");

        this.panel3.add(lblImagenGrupo);
        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(255,0,255));




        this.getContentPane().add(panel1, 0);
        this.getContentPane().add(panel2, 1);
        this.getContentPane().add(panel3, 2);
        this.getContentPane().add(panel4, 3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblEmpresa() {
        return lblEmpresa;
    }

    public void setLblEmpresa(JLabel lblEmpresa) {
        this.lblEmpresa = lblEmpresa;
    }

    public JLabel getLblNumeroIntegrantes() {
        return lblNumeroIntegrantes;
    }

    public void setLblNumeroIntegrantes(JLabel lblNumeroIntegrantes) {
        this.lblNumeroIntegrantes = lblNumeroIntegrantes;
    }

    public JLabel getLblTiempoActividad() {
        return lblTiempoActividad;
    }

    public void setLblTiempoActividad(JLabel lblTiempoActividad) {
        this.lblTiempoActividad = lblTiempoActividad;
    }

    public JLabel getLblCancion() {
        return lblCancion;
    }

    public void setLblCancion(JLabel lblCancion) {
        this.lblCancion = lblCancion;
    }

    public JLabel getLblUrl_Foto() {
        return lblUrl_Foto;
    }

    public void setLblUrl_Foto(JLabel lblUrl_Foto) {
        this.lblUrl_Foto = lblUrl_Foto;
    }

    public JLabel getLblImagenGrupo() {
        return lblImagenGrupo;
    }

    public void setLblImagenGrupo(JLabel lblImagenGrupo) {
        this.lblImagenGrupo = lblImagenGrupo;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtEmpresa() {
        return txtEmpresa;
    }

    public void setTxtEmpresa(JTextField txtEmpresa) {
        this.txtEmpresa = txtEmpresa;
    }

    public JTextField getTxtNumeroIntegrantes() {
        return txtNumeroIntegrantes;
    }

    public void setTxtNumeroIntegrantes(JTextField txtNumeroIntegrantes) {
        this.txtNumeroIntegrantes = txtNumeroIntegrantes;
    }

    public JTextField getTxtTiempoActividad() {
        return txtTiempoActividad;
    }

    public void setTxtTiempoActividad(JTextField txtTiempoActividad) {
        this.txtTiempoActividad = txtTiempoActividad;
    }

    public JTextField getTxtCancion() {
        return txtCancion;
    }

    public void setTxtCancion(JTextField txtCancion) {
        this.txtCancion = txtCancion;
    }

    public JTextField getTxtUrl_Foto() {
        return txtUrl_Foto;
    }

    public void setTxtUrl_Foto(JTextField txtUrl_Foto) {
        this.txtUrl_Foto = txtUrl_Foto;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(JButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }
    public void limpiar(){
        txtNombre.setText("");
        txtEmpresa.setText("");
        txtNumeroIntegrantes.setText("");
        txtTiempoActividad.setText("");
        txtCancion.setText("");
        txtUrl_Foto.setText("");
    }
}
