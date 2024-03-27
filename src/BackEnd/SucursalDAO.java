package BackEnd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SucursalDAO {
    // Datos de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/aseguradora";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "toor";

    // Consultas SQL
    private static final String INSERT_QUERY = "INSERT INTO sucursales (nombre_sucursal, calle, numero, codigo_postal, colonia, ciudad, estado, pais, telefono) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_QUERY = "UPDATE sucursales SET nombre_sucursal=?, calle=?, numero=?, codigo_postal=?, colonia=?, ciudad=?, estado=?, pais=?, telefono=? WHERE id_sucursal=?";
    private static final String DELETE_QUERY = "DELETE FROM sucursales WHERE id_sucursal=?";
    private static final String SELECT_QUERY = "SELECT * FROM sucursales";
    private static final String SELECT_BY_ID_QUERY = "SELECT * FROM sucursales WHERE id_sucursal=?";

    // Método para establecer conexión con la base de datos
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // Método para insertar una nueva sucursal
    public void insertarSucursal(Sucursal sucursal) {
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(INSERT_QUERY)) {
            statement.setString(1, sucursal.getNombreSucursal());
            statement.setString(2, sucursal.getCalle());
            statement.setInt(3, sucursal.getNumero());
            statement.setInt(4, sucursal.getCodigoPostal());
            statement.setString(5, sucursal.getColonia());
            statement.setString(6, sucursal.getCiudad());
            statement.setString(7, sucursal.getEstado());
            statement.setString(8, sucursal.getPais());
            statement.setString(9, sucursal.getTelefono());

            statement.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
    }

    // Método para actualizar una sucursal existente
    public int actualizarSucursal(Sucursal sucursal, int idSucursal) {
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(UPDATE_QUERY)) {
            statement.setString(1, sucursal.getNombreSucursal());
            statement.setString(2, sucursal.getCalle());
            statement.setInt(3, sucursal.getNumero());
            statement.setInt(4, sucursal.getCodigoPostal());
            statement.setString(5, sucursal.getColonia());
            statement.setString(6, sucursal.getCiudad());
            statement.setString(7, sucursal.getEstado());
            statement.setString(8, sucursal.getPais());
            statement.setString(9, sucursal.getTelefono());
            statement.setInt(10, idSucursal);

            statement.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    // Método para eliminar una sucursal
    public int borrarSucursal(int idSucursal) {
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(DELETE_QUERY)) {
            statement.setInt(1, idSucursal);
            statement.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    // Método para obtener todas las sucursales
    public List<Sucursal> obtenerSucursales() {
        List<Sucursal> sucursales = new ArrayList<>();
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(SELECT_QUERY);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Sucursal sucursal = new Sucursal();
                sucursal.setIdSucursal(resultSet.getInt("id_sucursal"));
                sucursal.setNombreSucursal(resultSet.getString("nombre_sucursal"));
                sucursal.setCalle(resultSet.getString("calle"));
                sucursal.setNumero(resultSet.getInt("numero"));
                sucursal.setCodigoPostal(resultSet.getInt("codigo_postal"));
                sucursal.setColonia(resultSet.getString("colonia"));
                sucursal.setCiudad(resultSet.getString("ciudad"));
                sucursal.setEstado(resultSet.getString("estado"));
                sucursal.setPais(resultSet.getString("pais"));
                sucursal.setTelefono(resultSet.getString("telefono"));
                sucursales.add(sucursal);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sucursales;
    }

    // Método para obtener una sucursal por su ID
    public Sucursal obtenerSucursalPorId(int idSucursal) {
        Sucursal sucursal = null;
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(SELECT_BY_ID_QUERY)) {
            statement.setInt(1, idSucursal);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    sucursal = new Sucursal();
                    sucursal.setIdSucursal(resultSet.getInt("id_sucursal"));
                    sucursal.setNombreSucursal(resultSet.getString("nombre_sucursal"));
                    sucursal.setCalle(resultSet.getString("calle"));
                    sucursal.setNumero(resultSet.getInt("numero"));
                    sucursal.setCodigoPostal(resultSet.getInt("codigo_postal"));
                    sucursal.setColonia(resultSet.getString("colonia"));
                    sucursal.setCiudad(resultSet.getString("ciudad"));
                    sucursal.setEstado(resultSet.getString("estado"));
                    sucursal.setPais(resultSet.getString("pais"));
                    sucursal.setTelefono(resultSet.getString("telefono"));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sucursal;
    }
}

