package BackEnd;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia del DAO de Sucursal
        
        Sucursal sucursal1 = new Sucursal("Sucursal 1", "Calle 1", 123, 12345, "centro", "Ciudad 1", "Estado 1", "Pais 1", "123456789");
        SucursalDAO sucursalDAO = new SucursalDAO();
        

        try {
            // Ejemplo de inserción de una nueva sucursal
            
            sucursalDAO.insertarSucursal(sucursal1);
            System.out.println("Sucursal insertada correctamente.");

            

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al interactuar con la base de datos: " + e.getMessage());
        }
    }
}

      
        
      
      
  