package org.example.vista;

import org.example.modelo.Grupo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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
    private JButton btnActualizar;
    private GridLayout layout;
    private JTable tabla;
    private JScrollPane scroll;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel lblNombre1;
    private JLabel lblEmpresa1;
    private JLabel lblNumeroIntegrantes1;
    private JLabel lblTiempoActividad1;
    private JLabel lblCancion1;
    private JLabel lblUrl_Foto1;
    private JLabel lblImagenGrupo1;
    private JTextField txtId1;
    private JTextField txtNombre1;
    private JTextField txtEmpresa1;
    private JTextField txtNumeroIntegrantes1;
    private JTextField txtTiempoActividad1;
    private JTextField txtCancion1;

    private JTextField txtUrl_Foto1;

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
        btnActualizar = new JButton("Actualizar");
        btnDelete = new JButton("Eliminar");
        lblNombre1 = new JLabel("Nombre");
        lblEmpresa1 = new JLabel("Empresa de Origen");
        lblNumeroIntegrantes1 = new JLabel("Numero de Integrantes");
        lblTiempoActividad1 = new JLabel("Tiempo de Actividad");
        lblCancion1 = new JLabel("Nombre de alguna cancion");
        lblUrl_Foto1 = new JLabel("Foto en Url");
        txtNombre1 = new JTextField(10);
        txtEmpresa1 = new JTextField(10);
        txtNumeroIntegrantes1 = new JTextField(5);
        txtTiempoActividad1 = new JTextField(4);
        txtCancion1 = new JTextField(15);
        txtUrl_Foto1 = new JTextField(30);
        panel4.add(lblNombre1);
        panel4.add(txtNombre1);
        panel4.add(lblEmpresa1);
        panel4.add(txtEmpresa1);
        panel4.add(lblNumeroIntegrantes1);
        panel4.add(txtNumeroIntegrantes1);
        panel4.add(lblTiempoActividad1);
        panel4.add(txtTiempoActividad1);
        panel4.add(lblCancion1);
        panel4.add(txtCancion1);
        panel4.add(lblUrl_Foto1);
        panel4.add(txtUrl_Foto1);
        panel4.add(btnActualizar);
        panel4.add(btnDelete);




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

    public JLabel getLblNombre1() {
        return lblNombre1;
    }

    public void setLblNombre1(JLabel lblNombre1) {
        this.lblNombre1 = lblNombre1;
    }

    public JLabel getLblEmpresa1() {
        return lblEmpresa1;
    }

    public void setLblEmpresa1(JLabel lblEmpresa1) {
        this.lblEmpresa1 = lblEmpresa1;
    }

    public JLabel getLblNumeroIntegrantes1() {
        return lblNumeroIntegrantes1;
    }

    public void setLblNumeroIntegrantes1(JLabel lblNumeroIntegrantes1) {
        this.lblNumeroIntegrantes1 = lblNumeroIntegrantes1;
    }

    public JLabel getLblTiempoActividad1() {
        return lblTiempoActividad1;
    }

    public void setLblTiempoActividad1(JLabel lblTiempoActividad1) {
        this.lblTiempoActividad1 = lblTiempoActividad1;
    }

    public JLabel getLblCancion1() {
        return lblCancion1;
    }

    public void setLblCancion1(JLabel lblCancion1) {
        this.lblCancion1 = lblCancion1;
    }

    public JLabel getLblUrl_Foto1() {
        return lblUrl_Foto1;
    }

    public void setLblUrl_Foto1(JLabel lblUrl_Foto1) {
        this.lblUrl_Foto1 = lblUrl_Foto1;
    }

    public JLabel getLblImagenGrupo1() {
        return lblImagenGrupo1;
    }

    public void setLblImagenGrupo1(JLabel lblImagenGrupo1) {
        this.lblImagenGrupo1 = lblImagenGrupo1;
    }

    public JTextField getTxtId1() {
        return txtId1;
    }

    public void setTxtId1(JTextField txtId1) {
        this.txtId1 = txtId1;
    }

    public JTextField getTxtNombre1() {
        return txtNombre1;
    }

    public void setTxtNombre1(JTextField txtNombre1) {
        this.txtNombre1 = txtNombre1;
    }

    public JTextField getTxtEmpresa1() {
        return txtEmpresa1;
    }

    public void setTxtEmpresa1(JTextField txtEmpresa1) {
        this.txtEmpresa1 = txtEmpresa1;
    }

    public JTextField getTxtNumeroIntegrantes1() {
        return txtNumeroIntegrantes1;
    }

    public void setTxtNumeroIntegrantes1(JTextField txtNumeroIntegrantes1) {
        this.txtNumeroIntegrantes1 = txtNumeroIntegrantes1;
    }

    public JTextField getTxtTiempoActividad1() {
        return txtTiempoActividad1;
    }

    public void setTxtTiempoActividad1(JTextField txtTiempoActividad1) {
        this.txtTiempoActividad1 = txtTiempoActividad1;
    }

    public JTextField getTxtCancion1() {
        return txtCancion1;
    }

    public void setTxtCancion1(JTextField txtCancion1) {
        this.txtCancion1 = txtCancion1;
    }

    public JTextField getTxtUrl_Foto1() {
        return txtUrl_Foto1;
    }

    public void setTxtUrl_Foto1(JTextField txtUrl_Foto1) {
        this.txtUrl_Foto1 = txtUrl_Foto1;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public void limpiar(){
        txtNombre.setText("");
        txtEmpresa.setText("");
        txtNumeroIntegrantes.setText("");
        txtTiempoActividad.setText("");
        txtCancion.setText("");
        txtUrl_Foto.setText("");
    }
    public void actualizarFilaSeleccionada(int filaSeleccionada, Grupo grupo) {
        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

        // Actualizar los datos de la fila seleccionada
        modelo.setValueAt(grupo.getNombre(), filaSeleccionada, 1);
        modelo.setValueAt(grupo.getEmpresa(), filaSeleccionada, 2);
        modelo.setValueAt(grupo.getNumeroIntegrantes(), filaSeleccionada, 3);
        modelo.setValueAt(grupo.getTiempoActividad(), filaSeleccionada, 4);
        modelo.setValueAt(grupo.getCancion(), filaSeleccionada, 5);
        modelo.setValueAt(grupo.getUrllFoto(), filaSeleccionada,6);
    }
}