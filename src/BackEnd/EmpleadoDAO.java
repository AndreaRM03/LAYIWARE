package BackEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {
    // Datos de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/aseguradora";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "toor";

    // Consultas SQL
    private static final String INSERT_QUERY = "INSERT INTO empleados (id_sucursal, nombre, apellido_paterno, apellido_materno, email, contrasena, salario, activo, telefono) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_QUERY = "UPDATE empleados SET id_sucursal=?, nombre=?, apellido_paterno=?, apellido_materno=?, email=?, contrasena=?, salario=?, activo=?, telefono=? WHERE id_empleado=?";
    private static final String DELETE_QUERY = "DELETE FROM empleados WHERE id_empleado=?";
    private static final String SELECT_QUERY = "SELECT * FROM empleados";
    private static final String SELECT_BY_ID_QUERY = "SELECT * FROM empleados WHERE id_empleado=?";

    // Método para establecer conexión con la base de datos
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // Método para insertar un nuevo empleado
    public int insertarEmpleado(Empleado empleado) {
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(INSERT_QUERY)) {
            statement.setInt(1, empleado.getIdSucursal());
            statement.setString(2, empleado.getNombre());
            statement.setString(3, empleado.getApellidoPaterno());
            statement.setString(4, empleado.getApellidoMaterno());
            statement.setString(5, empleado.getEmail());
            statement.setString(6, empleado.getContrasena());
            statement.setDouble(7, empleado.getSalario());
            statement.setBoolean(8, empleado.isActivo());
            statement.setString(9, empleado.getTelefono());

            statement.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    // Método para actualizar un empleado existente
    public int actualizarEmpleado(Empleado empleado, int idEmpleado) {
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(UPDATE_QUERY)) {
            statement.setInt(1, empleado.getIdSucursal());
            statement.setString(2, empleado.getNombre());
            statement.setString(3, empleado.getApellidoPaterno());
            statement.setString(4, empleado.getApellidoMaterno());
            statement.setString(5, empleado.getEmail());
            statement.setString(6, empleado.getContrasena());
            statement.setDouble(7, empleado.getSalario());
            statement.setBoolean(8, empleado.isActivo());
            statement.setString(9, empleado.getTelefono());
            statement.setInt(10, idEmpleado);

            statement.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    // Método para eliminar un empleado
    public int borrarEmpleado(int idEmpleado) {
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(DELETE_QUERY)) {
            statement.setInt(1, idEmpleado);
            statement.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }

    // Método para obtener todos los empleados
    public List<Empleado> obtenerEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(SELECT_QUERY);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Empleado empleado = new Empleado();
                empleado.setIdEmpleado(resultSet.getInt("id_empleado"));
                empleado.setIdSucursal(resultSet.getInt("id_sucursal"));
                empleado.setNombre(resultSet.getString("nombre"));
                empleado.setApellidoPaterno(resultSet.getString("apellido_paterno"));
                empleado.setApellidoMaterno(resultSet.getString("apellido_materno"));
                empleado.setEmail(resultSet.getString("email"));
                empleado.setContrasena(resultSet.getString("contrasena"));
                empleado.setSalario(resultSet.getDouble("salario"));
                empleado.setActivo(resultSet.getBoolean("activo"));
                empleado.setTelefono(resultSet.getString("telefono"));
                empleados.add(empleado);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return empleados;
    }

    // Método para obtener un empleado por su ID
    public Empleado obtenerEmpleado(int idEmpleado) {
        Empleado empleado = null;
        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(SELECT_BY_ID_QUERY)) {
            statement.setInt(1, idEmpleado);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    empleado = new Empleado();
                    empleado.setIdEmpleado(resultSet.getInt("id_empleado"));
                    empleado.setIdSucursal(resultSet.getInt("id_sucursal"));
                    empleado.setNombre(resultSet.getString("nombre"));
                    empleado.setApellidoPaterno(resultSet.getString("apellido_paterno"));
                    empleado.setApellidoMaterno(resultSet.getString("apellido_materno"));
                    empleado.setEmail(resultSet.getString("email"));
                    empleado.setContrasena(resultSet.getString("contrasena"));
                    empleado.setSalario(resultSet.getDouble("salario"));
                    empleado.setActivo(resultSet.getBoolean("activo"));
                    empleado.setTelefono(resultSet.getString("telefono"));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return empleado;
    }
}
