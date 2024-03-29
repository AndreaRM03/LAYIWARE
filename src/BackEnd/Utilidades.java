package BackEnd;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Utilidades {

    public static void cargarLogo(JFrame frame, String nombreImagen) {
        // Obtener la URL de la imagen
        URL url = Utilidades.class.getResource("/Imagenes/" + nombreImagen);

        // Verificar si la URL no es nula
        if (url != null) {
            // Crear un ImageIcon con la URL
            ImageIcon icono = new ImageIcon(url);

            // Convertir el ImageIcon en Image
            Image image = icono.getImage();

            // Establecer la imagen del ícono de la ventana
            frame.setIconImage(image);
        } else {
            System.err.println("No se pudo cargar la imagen.");
        }
    }
}
