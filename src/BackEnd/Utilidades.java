package BackEnd;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.security.SecureRandom;

public class Utilidades {

    // Caracteres permitidos para el valor alfanumérico
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    // Longitud del valor alfanumérico
    private static final int LONGITUD = 10;

    // Generador seguro de números aleatorios
    private static final SecureRandom random = new SecureRandom();

    public static String generarFolio() {
        StringBuilder sb = new StringBuilder(LONGITUD);
        for (int i = 0; i < LONGITUD; i++) {
            // Generar un índice aleatorio dentro del rango de caracteres permitidos
            int indice = random.nextInt(CARACTERES.length());
            // Agregar el carácter correspondiente al valor alfanumérico
            sb.append(CARACTERES.charAt(indice));
        }
        return sb.toString().toUpperCase();
    }

    
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
