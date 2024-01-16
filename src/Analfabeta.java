import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Analfabeta {
    public static void main(String[] args) throws IOException {
        String filepath = new File("").getAbsolutePath();
        BufferedReader reader = new BufferedReader(new FileReader(filepath.concat("/src/illiterate.csv")));
        String linea;
        ArrayList<Member> personas = new ArrayList<>();
        String pais;
        int cantidad;
        reader.readLine();
        while ((linea = reader.readLine()) != null) {
            String[] cadena = linea.split(",");
            pais = cadena[5];
            cantidad = Integer.parseInt(cadena[8]);
            Member persona = new Member(pais,cantidad);
            personas.add(persona);
        }
        personas.stream().sorted().forEach(System.out::println);

    }
}
