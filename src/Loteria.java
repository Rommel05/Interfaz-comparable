import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        System.out.println("Introduce un las cuidades, si no hay ninguna pon 0:");
        while (numero != 0) {
            numero = sc.nextInt();
            ArrayList<Billete> billetes = new ArrayList<>();
            for (int i = 0; i < numero; i++) {
                añadirbilletes(billetes);
            }
            Comparator<Billete> comparator = Comparator
                    .comparing(Billete::getDineroInvertido)
                    .thenComparing(Billete::getPremio);
            Collections.sort(billetes, comparator);

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
    public static void añadirbilletes(ArrayList<Billete> billetes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dinero invertido");
        int dineroInvertido = sc.nextInt();
        System.out.println("Introduce el premio");
        int premio = sc.nextInt();
        Billete billetee = new Billete(dineroInvertido, premio);
        billetes.add(billetee);
    }

}
