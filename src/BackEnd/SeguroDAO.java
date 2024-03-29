package BackEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SeguroDAO {
    // Cambia estos valores según tu configuración de base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/aseguradora";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "toor";

    // Consultas SQL
    private static final String INSERTAR_SEGURO = "INSERT INTO seguros (id_asegurado, cantidad_asegurada, folio, vigencia, fecha_recepcion, telefono, tipo_seguro) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECCIONAR_SEGURO_POR_ID = "SELECT * FROM seguros WHERE id_seguro = ?";
    private static final String SELECCIONAR_TODOS_SEGUROS = "SELECT * FROM seguros";
    private static final String ACTUALIZAR_SEGURO = "UPDATE seguros SET id_asegurado = ?, cantidad_asegurada = ?, folio = ?, vigencia = ?, fecha_recepcion = ?, telefono = ?, tipo_seguro = ? WHERE id_seguro = ?";
    private static final String ELIMINAR_SEGURO = "DELETE FROM seguros WHERE id_seguro = ?";

    public SeguroDAO() {
        
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }

    public int insertarSeguro(Seguro seguro) {
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(INSERTAR_SEGURO)) {
            statement.setInt(1, seguro.getIdAsegurado());
            statement.setDouble(2, seguro.getCantidadAsegurada());
            statement.setString(3, seguro.getFolio());
            statement.setString(4, seguro.getVigencia());
            statement.setString(5, seguro.getFechaRecepcion());
            statement.setString(6, seguro.getTelefono());
            statement.setString(7, seguro.getTipoSeguro());
            statement.executeUpdate();
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public Seguro obtenerSeguroPorId(int idSeguro) {
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(SELECCIONAR_SEGURO_POR_ID)) {
            statement.setInt(1, idSeguro);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    return mapearSeguro(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Seguro> obtenerSeguros() {
        List<Seguro> seguros = new ArrayList<>();
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(SELECCIONAR_TODOS_SEGUROS);
             ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                seguros.add(mapearSeguro(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return seguros;
    }

    public int actualizarSeguro(Seguro seguro, int idSeguro) {
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(ACTUALIZAR_SEGURO)) {
            statement.setInt(1, seguro.getIdAsegurado());
            statement.setDouble(2, seguro.getCantidadAsegurada());
            statement.setString(3, seguro.getFolio());
            statement.setString(4, seguro.getVigencia());
            statement.setString(5, seguro.getFechaRecepcion());
            statement.setString(6, seguro.getTelefono());
            statement.setString(7, seguro.getTipoSeguro());
            statement.setInt(8, idSeguro);
            statement.executeUpdate();
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void eliminarSeguro(int idSeguro) {
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(ELIMINAR_SEGURO)) {
            statement.setInt(1, idSeguro);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Seguro mapearSeguro(ResultSet rs) throws SQLException {
        Seguro seguro = new Seguro();
        seguro.setIdSeguro(rs.getInt("id_seguro"));
        seguro.setIdAsegurado(rs.getInt("id_asegurado"));
        seguro.setCantidadAsegurada(rs.getDouble("cantidad_asegurada"));
        seguro.setFolio(rs.getString("folio"));
        seguro.setVigencia(rs.getString("vigencia"));
        seguro.setFechaRecepcion(rs.getString("fecha_recepcion"));
        seguro.setTelefono(rs.getString("telefono"));
        seguro.setTipoSeguro(rs.getString("tipo_seguro"));
        return seguro;
    }
}
