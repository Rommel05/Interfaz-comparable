import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        System.out.println("Introduce un las cuidades, si no hay ninguna pon 0:");
        while (true) {
            numero = sc.nextInt();
            if(numero == 0) {
                break;
            }
            ArrayList<Billete> billetes = new ArrayList<>();
            for (int i = 0; i < numero; i++) {
                añadirbilletes(billetes);
            }
            Comparator<Billete> comparator = Comparator
                    .comparing(Billete::getDineroInvertido)
                    .thenComparing(Billete::getPremio);
            Collections.sort(billetes, comparator);
            if (justo(billetes)) {
                System.out.println("Si");
            } else {
                System.out.println("No");
            }
        }
    }
    public static void añadirbilletes(ArrayList<Billete> billetes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dinero invertido");
        int dineroInvertido = sc.nextInt();
        System.out.println("Introduce el premio");
        int premio = sc.nextInt();
        Billete billete1 = new Billete(dineroInvertido, premio);
        billetes.add(billete1);
    }
    public static boolean justo(ArrayList<Billete> billetes) {
        for (int i = 1; i < billetes.size(); i++) {
            if (billetes.get(i).getPremio() <= billetes.get(i - 1).getPremio()) {
                return false;
            }
        }
        return true;
    }

}
