import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Loteria1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        System.out.println("Indica cuantas cuidades hay, si no hay ningúna pon 0:");
        while (numero != 0) {
            numero = sc.nextInt();
            ArrayList<Localidad1> billetes = new ArrayList<>();
            for (int i = 0; i < numero; i++) {
                añadirinfo(billetes);
            }
            Comparator<Localidad1> comparator = Comparator
                    .comparing(Localidad1::getdineroInvertido)
                    .thenComparing(Localidad1::getPremio);

            boolean justo = false;
            for (int i = 1; i < billetes.size(); i++) {
                if (billetes.get(i).getPremio() > billetes.get(i - 1).getPremio()) {
                    justo = true;
                    break;
                }
            }
            if (justo) {
                System.out.println("Si");
            } else {
                System.out.println("No");
            }

        }
    }
    public static void añadirinfo(ArrayList<Localidad1> billetes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dinero invertido");
        int dineroInvertido = sc.nextInt();
        System.out.println("Dinero conseguido");
        int dineroConseguido = sc.nextInt();
        Localidad1 billete = new Localidad1(dineroInvertido,dineroConseguido);
        billetes.add(billete);
    }
}
