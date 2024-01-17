import java.util.ArrayList;
import java.util.Scanner;

public class RepartirRegalos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        System.out.println("Dime la cantidad de niños que tienen regalos, si no hay ninguno pon 0:");
        while (numero != 0) {
            numero = sc.nextInt();
            ArrayList<Regalos> regalo = new ArrayList<>();
            for (int i = 0; i < numero; i++) {
                añadirRegalos(regalo);
            }
            regalo.stream().sorted().forEach(System.out::println);
            if (numero != 0) {
                System.out.println("");
            }
        }
    }
    public static void añadirRegalos(ArrayList<Regalos> regalo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Comportamiento:");
        int comportamiento = sc.nextInt();
        System.out.println("Peso del regalo");
        int peso = sc.nextInt();
        Regalos regaloo = new Regalos(comportamiento,peso);
        regalo.add(regaloo);
    }
}
