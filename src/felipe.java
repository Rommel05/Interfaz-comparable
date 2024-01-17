import java.util.ArrayList;
import java.util.Scanner;

public class felipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        System.out.println("Intorduce las tareas en caso de que no haya ninguna introduce un 0");
        while (numero!=0) {
            numero = sc.nextInt();
            ArrayList<Tarea> tareas = new ArrayList<>();
            for(int i = 0; i < numero; i++) {
                añadirTareas(tareas);
            }
            tareas.stream().sorted().forEach(System.out::println);
            if (numero != 0) {
                System.out.println("---");
            }
        }
    }
    public static void añadirTareas (ArrayList<Tarea> tareas) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prioridad:");
        int prioridad = sc.nextInt();
        System.out.println("Tiempo:");
        int tiempo = sc.nextInt();
        Tarea tarea = new Tarea(prioridad,tiempo);
        tareas.add(tarea);
    }
}