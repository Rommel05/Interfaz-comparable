import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        System.out.println("Indica cuantas cuidades hay, si no hay ningúna pon 0:");
        while (numero != 0) {
            numero = sc.nextInt();
            ArrayList<Localidad> billetes = new ArrayList<>();
            for (int i = 0; i < numero; i++) {
                añadirinfo(billetes);
            }
            Comparator<Localidad> comparator = Comparator
                    .comparing(Localidad::getdineroInvertido)
                    .thenComparing(Localidad::getPremio);
            Collections.sort(billetes,comparator);

            boolean justo = false;
            for (int i = 1; i < billetes.size(); i++) {
                if (billetes.get(i).getPremio() > billetes.get(i - 1).getPremio()) {
                    justo = true;
                }
            }
            if (justo) {
                System.out.println("Si");
            } else {
                System.out.println("No");
            }

        }
    }
    public static void añadirinfo(ArrayList<Localidad> billetes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dinero invertido");
        int dineroInvertido = sc.nextInt();
        System.out.println("Dinero conseguido");
        int dineroConseguido = sc.nextInt();
        Localidad billete = new Localidad(dineroInvertido,dineroConseguido);
        billetes.add(billete);
    }
}
