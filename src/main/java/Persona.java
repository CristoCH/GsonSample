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

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre: ");
        String n = entrada.nextLine();
        System.out.println("Apellido: ");
        String a = entrada.nextLine();
        System.out.println("Edad");
        int e = entrada.nextInt();

        Persona p = new Persona(n,a,e);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(p);
        System.out.println(json);

    }
}
