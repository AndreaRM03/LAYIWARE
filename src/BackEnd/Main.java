package BackEnd;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia del DAO de Sucursal
        
        Sucursal sucursal1 = new Sucursal("Sucursal 1", "Calle 1", 123, 12345, "centro", "Ciudad 1", "Estado 1", "Pais 1", "123456789");
        SucursalDAO sucursalDAO = new SucursalDAO();
        
        Empleado empleado1 = new Empleado(1,"Michi", "Jose", "Gomez", "mynbi@exampl.com1", "contrasena123", 1000.0, true, "123456789");
        Empleado empleado2 = new Empleado(1,"Michi", "Jose", "Gomez", "mynbi@exampl.com2", "contrasena123", 1000.0, true, "123456789");
        Empleado empleado3 = new Empleado(1,"Michi", "Jose", "Gomez", "mynbi@exampl.com3", "contrasena123", 1000.0, true, "123456789");
        Empleado empleado4 = new Empleado(1,"Michi", "Jose", "Gomez", "mynbi@exampl.com4", "contrasena123", 1000.0, true, "123456789");
        Empleado empleado5 = new Empleado(1,"Michi", "Jose", "Gomez", "mynbi@exampl.com5", "contrasena123", 1000.0, true, "123456789");
        
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        System.out.println(empleado1);
        

        try {
            // Ejemplo de inserción de una nueva sucursal
            
            //sucursalDAO.insertarSucursal(sucursal1);
            System.out.println("Sucursal insertada correctamente.");

            //empleadoDAO.insertarEmpleado(empleado1);
            //empleadoDAO.insertarEmpleado(empleado2);
            //empleadoDAO.insertarEmpleado(empleado3);
            //empleadoDAO.insertarEmpleado(empleado4);
            //empleadoDAO.insertarEmpleado(empleado5);
            
            //empleadoDAO.actualizarEmpleado(empleado1, 2);
            empleadoDAO.borrarEmpleado(6);
            empleadoDAO.borrarEmpleado(8);
            empleadoDAO.borrarEmpleado(9);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al interactuar con la base de datos: " + e.getMessage());
        }
    }
}

      
        
      
      
  