package org.example.modelo;

import org.example.persistencia.GrupoDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaGrupo implements TableModel {
    public static final int COLS = 7;
    private ArrayList<Grupo> datos;
    private GrupoDAO gpo;

    public ModeloTablaGrupo() {
        gpo = new GrupoDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaGrupo(ArrayList<Grupo> datos, GrupoDAO gpo) {
        this.datos = datos;
        gpo = new GrupoDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex) {
            case 0:
                return "id";
            case 1:
                return "Nombre";
            case 2:
                return "Empresa";
            case 3:
                return "Num. Integrantes";
            case 4:
                return "Años Actividad";
            case 5:
                return "Cancion";
            case 6:
                return "Foto (URL";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Integer.class;
            case 4:
                return Integer.class;
            case 5:
                return String.class;
            case 6:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columIndex) {
        Grupo tmp = datos.get(rowIndex);
        switch (columIndex) {
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getEmpresa();
            case 3:
                return tmp.getNumeroIntegrantes();
            case 4:
                return tmp.getTiempoActividad();
            case 5:
                return tmp.getCancion();
            case 6:
                return tmp.getUrllFoto();
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int colIndex) {
        switch (colIndex) {
            case 0:
                //datos.get(rowIndex).setId(0;
                break;
            case 1:
                datos.get(rowIndex).setNombre((String) o);
                break;
            case 2:
                datos.get(rowIndex).setEmpresa((String) o);
                break;
            case 3:
                datos.get(rowIndex).setNumeroIntegrantes((int) o);
                break;
            case 4:
                datos.get(rowIndex).setTiempoActividad((int) o);
                break;
            case 5:
                datos.get(rowIndex).setCancion((String) o);
                break;
            case 6:
                datos.get(rowIndex).setUrllFoto((String) o);
                break;
            default:
                System.out.println("No se modifica nada");
        }

    }

    @Override
    public void addTableModelListener(TableModelListener tableModelListener) {

    }

    @Override
    public void removeTableModelListener(TableModelListener tableModelListener) {

    }

    public void cargarDatos() {
        try {
            ArrayList<Grupo> tirar = gpo.obtenerTodo();
            System.out.println(tirar);
            datos = gpo.obtenerTodo();
        } catch (SQLException sqle) {
            System.out.println("Error");
        }
    }

    public boolean agregarGrupo(Grupo grupo) {
        boolean resultado = false;
        try {
            if (gpo.insertar(grupo)) {
                datos.add(grupo);
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public Grupo getGrupoAtIndex(int index) {
        return datos.get(index);
    }


    public boolean modificarGrupo(Grupo grupo) {
        boolean resultado = true;
        try {
            if (gpo.update(grupo)) {
                datos.add(grupo);
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
}