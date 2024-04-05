package BackEnd;

import javax.swing.*;
import java.awt.*;
import java.security.SecureRandom;
import javax.swing.text.*;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

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
    
    public static void limitarCaracteres(JTextField textField, int limite, String tipo) {
        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (validarCadena(fb.getDocument().getText(0, fb.getDocument().getLength()) + string, tipo, limite)) {
                    super.insertString(fb, offset, string, attr);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (validarCadena(fb.getDocument().getText(0, fb.getDocument().getLength()) + text, tipo, limite)) {
                    super.replace(fb, offset, length, text, attrs);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });
    }

    private static boolean validarCadena(String cadena, String tipo, int limite) {
        if (tipo.equals("letras")) {
            return cadena.matches("[a-zA-ZñÑ ]*") && cadena.length() <= limite;
        } else if (tipo.equals("numeros")) {
            return cadena.matches("\\d*") && cadena.length() <= limite;
        } else if (tipo.equals("alfanumerico")) {
            return cadena.matches("[a-zA-ZñÑ0-9]*") && cadena.length() <= limite;
        } else if (tipo.equals("fecha")) {
            // Permitir entrada de texto mientras se ingresa una fecha válida parcialmente
            if (cadena.length() > 10) {
                return false;
            }

            
            try {
                if (cadena.length() >= 5) { // Año completo ingresado
                    Integer.parseInt(cadena.substring(0, 4));
                }
                if (cadena.length() >= 8) { // Mes completo ingresado
                    Integer.parseInt(cadena.substring(5, 7));
                }
                if (cadena.length() == 10) { // Día completo ingresado
                    LocalDate.parse(cadena);
                }
                return true;
            } catch (DateTimeParseException | NumberFormatException e) {
                return false;
            }
        } else {
            return false;
        }
    }
    
}
