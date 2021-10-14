import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}
