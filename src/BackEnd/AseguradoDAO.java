package BackEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AseguradoDAO {
    // Datos de conexión a la base de datos (actualízalos según tu configuración)
    private final String URL = "jdbc:mysql://localhost:3306/aseguradora";
    private final String USUARIO = "root";
    private final String CONTRASENA = "toor";

    // Sentencias SQL
    private final String INSERTAR_ASEGURADO = "INSERT INTO asegurados (id_sucursal, nombre, apellido_paterno, apellido_materno, rfc, curp, telefono) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private final String ACTUALIZAR_ASEGURADO = "UPDATE asegurados SET id_sucursal=?, nombre=?, apellido_paterno=?, apellido_materno=?, rfc=?, curp=?, telefono=? WHERE id_asegurado=?";
    private final String ELIMINAR_ASEGURADO = "DELETE FROM asegurados WHERE id_asegurado=?";
    private final String OBTENER_ASEGURADO_POR_ID = "SELECT * FROM asegurados WHERE id_asegurado=?";
    private final String OBTENER_TODOS_ASEGURADOS = "SELECT * FROM asegurados";

    // Método para obtener una conexión a la base de datos
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }

    // Método para insertar un nuevo asegurado
    public int insertarAsegurado(Asegurado asegurado) {
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(INSERTAR_ASEGURADO)) {
            statement.setInt(1, asegurado.getIdSucursal());
            statement.setString(2, asegurado.getNombre());
            statement.setString(3, asegurado.getApellidoPaterno());
            statement.setString(4, asegurado.getApellidoMaterno());
            statement.setString(5, asegurado.getRFC());
            statement.setString(6, asegurado.getCURP());
            statement.setString(7, asegurado.getTelefono());
            statement.executeUpdate();
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Método para actualizar un asegurado existente
    public int actualizarAsegurado(Asegurado asegurado, int idAsegurado) {
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(ACTUALIZAR_ASEGURADO)) {
            statement.setInt(1, asegurado.getIdSucursal());
            statement.setString(2, asegurado.getNombre());
            statement.setString(3, asegurado.getApellidoPaterno());
            statement.setString(4, asegurado.getApellidoMaterno());
            statement.setString(5, asegurado.getRFC());
            statement.setString(6, asegurado.getCURP());
            statement.setString(7, asegurado.getTelefono());
            statement.setInt(8, idAsegurado);
            statement.executeUpdate();
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Método para eliminar un asegurado existente
    public int borrarAsegurado(int idAsegurado) {
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(ELIMINAR_ASEGURADO)) {
            statement.setInt(1, idAsegurado);
            statement.executeUpdate();
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Método para obtener un asegurado por su ID
    public Asegurado obtenerAseguradoPorId(int idAsegurado) {
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(OBTENER_ASEGURADO_POR_ID)) {
            statement.setInt(1, idAsegurado);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return mapearAsegurado(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Método para obtener todos los asegurados
    public List<Asegurado> obtenerTodosAsegurados() {
        List<Asegurado> asegurados = new ArrayList<>();
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(OBTENER_TODOS_ASEGURADOS);
             ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                asegurados.add(mapearAsegurado(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return asegurados;
    }

    // Método auxiliar para mapear un ResultSet a un objeto Asegurado
    private Asegurado mapearAsegurado(ResultSet rs) throws SQLException {
        Asegurado asegurado = new Asegurado();
        asegurado.setIdAsegurado(rs.getInt("id_asegurado"));
        asegurado.setIdSucursal(rs.getInt("id_sucursal"));
        asegurado.setNombre(rs.getString("nombre"));
        asegurado.setApellidoPaterno(rs.getString("apellido_paterno"));
        asegurado.setApellidoMaterno(rs.getString("apellido_materno"));
        asegurado.setRFC(rs.getString("rfc"));
        asegurado.setCURP(rs.getString("curp"));
        asegurado.setTelefono(rs.getString("telefono"));
        return asegurado;
    }
}
