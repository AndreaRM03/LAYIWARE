package BackEnd;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia del DAO de Sucursal
        
        Sucursal sucursal1 = new Sucursal("Sucursal 1", "Calle 1", 123, 12345, "centro", "Ciudad 1", "Estado 1", "Pais 1", "123456789");

        Empleado empleado1 = new Empleado(1,"Michi1", "Jose", "Gomez", "mynbi@exampl.com1", "contrasena123", 1000.0, true, "123456789");
        Empleado empleado2 = new Empleado(1,"Michi2", "Jose", "Gomez", "mynbi@exampl.com2", "contrasena123", 1000.0, true, "123456789");
        Empleado empleado3 = new Empleado(1,"Michi3", "Jose", "Gomez", "mynbi@exampl.com3", "contrasena123", 1000.0, true, "123456789");
        Empleado empleado4 = new Empleado(1,"Michi4", "Jose", "Gomez", "mynbi@exampl.com4", "contrasena123", 1000.0, true, "123456789");
        Empleado empleado5 = new Empleado(1,"Michi5", "Jose", "Gomez", "mynbi@exampl.com5", "contrasena123", 1000.0, true, "123456789");
        
        Asegurado asegurado1 = new Asegurado(1, "Michicito1", "Gomez", "Magdaleno", "A12345678912", "B1234567890", "3312345678");
        Asegurado asegurado2 = new Asegurado(1, "Michicito2", "Gomez", "Magdaleno", "A12345678912", "B1234567890", "3312345678");
        Asegurado asegurado3 = new Asegurado(1, "Michicito3", "Gomez", "Magdaleno", "A12345678912", "B1234567890", "3312345678");
        Asegurado asegurado4 = new Asegurado(1, "Michicito4", "Gomez", "Magdaleno", "A12345678912", "B1234567890", "3312345678");
        
        Seguro seguro1 = new Seguro(1, 1000, "F123456789", "2024-03-31", "2024-03-01", "3311254521", "vida");
        Seguro seguro2 = new Seguro(1, 2000, "F123456790", "2024-03-31", "2024-03-01", "3311254521", "vida");
        Seguro seguro3 = new Seguro(1, 3000, "F123456791", "2024-03-31", "2024-03-01", "3311254521", "vida");
        Seguro seguro4 = new Seguro(1, 4000, "F123456792", "2024-03-31", "2024-03-01", "3311254521", "vida");
        Seguro seguro5 = new Seguro(1, 5000, "F123456793", "2024-03-31", "2024-03-01", "3311254521", "vida");
        
        
        SucursalDAO sucursalDAO = new SucursalDAO();
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        AseguradoDAO aseguradoDAO = new AseguradoDAO();
        SeguroDAO seguroDAO = new SeguroDAO();
        

        try {
            // Ejemplo de inserción de una nueva sucursal
            /*
            
            sucursalDAO.insertarSucursal(sucursal1);
            
            empleadoDAO.insertarEmpleado(empleado1);
            empleadoDAO.insertarEmpleado(empleado2);
            empleadoDAO.insertarEmpleado(empleado3);
            empleadoDAO.insertarEmpleado(empleado4);
            empleadoDAO.insertarEmpleado(empleado5);
            
            aseguradoDAO.insertarAsegurado(asegurado1);
            aseguradoDAO.insertarAsegurado(asegurado2);
            aseguradoDAO.insertarAsegurado(asegurado3);
            aseguradoDAO.insertarAsegurado(asegurado4);
            
            */
            
            //empleadoDAO.actualizarEmpleado(empleado1, 2);
            //empleadoDAO.borrarEmpleado(6);
            //empleadoDAO.borrarEmpleado(8);
            //empleadoDAO.borrarEmpleado(9);
            
            
            //Asegurado asegurado5 = new Asegurado(1, "Michicito5", "Gomez", "Magdaleno", "A12345678912", "B1234567890", "3312345678");
            //aseguradoDAO.actualizarAsegurado(asegurado5, 2);
            
            //aseguradoDAO.borrarAsegurado(4);
            
            //seguroDAO.insertarSeguro(seguro1);
            //seguroDAO.insertarSeguro(seguro2);
            //seguroDAO.insertarSeguro(seguro3);
            //seguroDAO.insertarSeguro(seguro4);
            //seguroDAO.insertarSeguro(seguro5);
            
            //Seguro seguro6 = new Seguro(1, 5000, "F123456793", "2024-03-31", "2024-03-01", "3311254521", "vida");
            //seguroDAO.actualizarSeguro(seguro6, 2);
            
            //seguroDAO.eliminarSeguro(4);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al interactuar con la base de datos: " + e.getMessage());
        }
    }
}

      
        
      
      
  