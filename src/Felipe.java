import java.util.ArrayList;
import java.util.Scanner;

public class Felipe {
    public static void main(String[] args) {
     int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas tareas va ha realizar");
        ArrayList<Tares> tareas = new ArrayList<>();
        while (true) {
         numero = sc.nextInt();
         for (int i = 0; i < numero; i++) {
             añadirTareas(tareas);
         }
         if (numero == 0) {
             break;
         }
     }
        tareas.stream().sorted().forEach(System.out::println);
    }
    public static void añadirTareas (ArrayList<Tares> tareas) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el tiempo");
        int tiempo = sc.nextInt();
        System.out.println("Pon la prioridad");
        int prioridad = sc.nextInt();
        Tares tarea = new Tares(tiempo,prioridad);
        tareas.add(tarea);
    }
}
