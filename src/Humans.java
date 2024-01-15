import java.util.ArrayList;

public class Humans {
    public static void main(String[] args) {
        ArrayList<Human> Personas = new ArrayList<>();
        Human persona = new Human("Andrés",1000);
        Personas.add(persona);
        Human persona1 = new Human("Jaime",2000);
        Personas.add(persona1);
        Human persona2 = new Human("Andrés",3000);
        Personas.add(persona2);
        Personas.stream().sorted().forEach(System.out::println);
    }
}
