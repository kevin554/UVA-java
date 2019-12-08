package courses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AmasBcuadrado {

    public AmasBcuadrado() {
        init();
    }

    private void init() {
        leerFichero();
    }

    private void resolver(String primerNumero, String segundoNumero) {
        escribirFichero(Long.parseLong(primerNumero) + 
                (Long.parseLong(segundoNumero) * Long.parseLong(segundoNumero)));
    }

    public void leerFichero() {
        BufferedReader reader = null;

        try {
            String linea;
            String[] numeros = new String[2];

            reader = new BufferedReader(new FileReader("input.txt"));
            while ((linea = reader.readLine()) != null) {
                numeros = linea.split(" ");
            }

            resolver(numeros[0], numeros[1]);
        } catch (IOException ex) {
            if (reader != null) {
                try { reader.close(); } catch (IOException e) { }
            }
        }
    }

    private void escribirFichero(long resultado) {
        BufferedWriter writer = null;

        try {
            File file = new File("output.txt");
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(Long.toString(resultado));
        } catch (IOException e) {
            /* TODO-CODE here */
        } finally {
            if (writer != null) {
                try { writer.close(); } catch (IOException ex) { }
            }
        }
    }
}
