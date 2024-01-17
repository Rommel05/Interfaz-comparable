import java.util.ArrayList;
import java.util.Collections;

public class felipe1 {
    public static void main(String[] args) {
        ArrayList<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea(1,6));
        tareas.add(new Tarea(2,4));
        tareas.add(new Tarea(3,5));
        System.out.println(ordenar(tareas));
    }
    public static String ordenar(ArrayList<Tarea> tareas) {
        String orden = "";
        Collections.sort(tareas);
        for (Tarea t:tareas) {
            orden = orden + t + "\n";
        }
        return orden;
    }

}
