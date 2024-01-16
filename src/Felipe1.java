import java.util.ArrayList;
import java.util.Collections;

public class Felipe1 {
    public static void main(String[] args) {
        ArrayList<Tares> tareas = new ArrayList<>();
        tareas.add(new Tares(1,6));
        tareas.add(new Tares(2,4));
        tareas.add(new Tares(3,5));
        System.out.println(ordenar(tareas));
    }
    public static String ordenar(ArrayList<Tares> tareas) {
        String orden = "";
        Collections.sort(tareas);
        for (Tares t:tareas) {
            orden = orden + t + "\n";
        }
        return orden;
    }

}
