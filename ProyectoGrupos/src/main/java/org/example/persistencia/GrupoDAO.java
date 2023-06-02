package org.example.persistencia;

import org.example.modelo.Grupo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GrupoDAO implements InterfazDAO {
    public GrupoDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO grupos(nombre, empresa, numerointegrantes, tiempoactividad, cancion, url) VALUES (?, ?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Grupos.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((Grupo)obj).getNombre());
        pstm.setString(2, ((Grupo)obj).getEmpresa());
        pstm.setInt(3, ((Grupo)obj).getNumeroIntegrantes());
        pstm.setInt(4, ((Grupo)obj).getTiempoActividad());
        pstm.setString(5, ((Grupo)obj).getCancion());
        pstm.setString(6, ((Grupo)obj).getUrllFoto());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }



    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE grupos SET nombre = ?, empresa = ?, numerointegrantes = ?, tiempoactividad = ?, cancion = ?, url = ? WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Grupos.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((Grupo)obj).getNombre());
        pstm.setString(2, ((Grupo)obj).getEmpresa());
        pstm.setInt(3, ((Grupo)obj).getNumeroIntegrantes());
        pstm.setInt(4, ((Grupo)obj).getTiempoActividad());
        pstm.setString(5, ((Grupo)obj).getCancion());
        pstm.setString(6, ((Grupo)obj).getUrllFoto());
        pstm.setInt(7, ((Grupo)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;

    }

    @Override
    public boolean delete(String id) throws SQLException {
        String dqlDelete = "DELETE FROM grupos WHERE id = ?";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Grupos.db").getConnection().prepareStatement(dqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM grupos";
        ArrayList<Grupo> resultado = new ArrayList<>();

        Statement stm = ConexionSingleton.getInstance("Grupos.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Grupo(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getInt(4),rst.getInt(5),rst.getString(6),rst.getString(7)));

        }
        return resultado;
    }

    @Override
    public Grupo buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM grupos WHERE id = ?;";
        Grupo grupo = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("Grupos.db").getConnection().prepareStatement(sql);
        ResultSet rst = pstm.executeQuery();
        if (rst.next()){
            grupo = new Grupo(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getInt(4),rst.getInt(5),rst.getString(6),rst.getString(7));
            return grupo;
        }
        return null;
    }

}
