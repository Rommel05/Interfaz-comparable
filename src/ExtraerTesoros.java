import java.util.ArrayList;
import java.util.Scanner;

public class ExtraerTesoros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de objetos, si no hay pon 0:");
        int numero = 1;
        while (numero != 0) {
            numero = sc.nextInt();
            ArrayList<Tesoro> tesoros = new ArrayList<>();
            for (int i = 0; i < numero; i++) {
                añadirTesoro(tesoros);
            }
            tesoros.stream().sorted().forEach(p -> System.out.print(p + " "));
            if (numero != 0) {
                System.out.println("");
            }
        }
    }
    public static void añadirTesoro(ArrayList<Tesoro> tesoros) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        String tesoro = sc.next();
        System.out.println("Introduce el valor");
        int valor = sc.nextInt();
        System.out.println("Introduce el peso");
        int peso = sc.nextInt();
        Tesoro tesoroo = new Tesoro(tesoro, valor, peso);
        tesoros.add(tesoroo);
    }
}
