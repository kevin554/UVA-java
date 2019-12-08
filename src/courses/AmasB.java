package courses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * La idea es leer 2 numeros separados por un espacio en un archivo de texto,
 * y crear un archivo de texto con la suma de los 2 numeros 
 */
public class AmasB {

    public AmasB() {
        init();
    }
    
    private void init() {
        leerFichero();
    }
    
    public void leerFichero() {
        // Objeto para leer ficheros
        BufferedReader reader = null;

        try {
            String linea;
            // Un vector de numeros para guardar los 2 numeros que se encuentran
            // en el documento
            String[] numeros = new String[2];
            
            // Lee el archivo 'input.txt' (debe estar creado previamente)
            reader = new BufferedReader(new FileReader("input.txt"));
            // Leemos linea por linea
            while ((linea = reader.readLine()) != null) {
                // Agregamos a nuestro vector los 2 numeros que se encuentran 
                // en el documentos separados por un espacio
                numeros = linea.split(" ");
            }
            
            resolver(numeros[0], numeros[1]);
        } catch (IOException ex) {
            // Si el buffer fue creado
            if (reader != null)
                // Lo cerramos
                try { reader.close(); } catch (IOException e){ }
        }
    }
    
    private void resolver(String primerNumero, String segundoNumero) {
        // Convertimos los numeros que estan en cadena a entero y los sumamos
        escribirFichero(Integer.parseInt(primerNumero) + 
                Integer.parseInt(segundoNumero));
    }

    private void escribirFichero(int resultado) {
        // Objeto para leer ficheros
        BufferedWriter writer = null;
        
        try {
            // Creamos un archivo 'output.txt' (si existe, se sobreescribirá)
            File file = new File("output.txt");
            // Le mandamos el archivo al objeto para crear el archivo
            writer = new BufferedWriter(new FileWriter(file));
            // Escribimos en el archivo parametro recibido en el metodo, 
            // que es la suma de los 2 numeros recibidos
            writer.write(Integer.toString(resultado));
        } catch (IOException e) {
            /* TODO-CODE here */
        } finally {
            // Si existe el objeto
            if (writer != null) 
                // Lo cerramos
                try { writer.close(); } catch (IOException ex) { }
        }
    }
}