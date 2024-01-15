import java.util.ArrayList;

public class Humans {
    public static void main(String[] args) {
        ArrayList<Human> Humans = new ArrayList<>();
        Humans.add(new Human("Andrés",1000));
        Humans.add(new Human("Jaime",2000));
        Humans.add(new Human("Maria",3000));
        Humans.stream().forEach(System.out::println);
    }
}
