import java.util.Scanner;
public class calculado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        int numero1;
        int numero2;
        int r;
        System.out.println("primer cambio conflicto" +);
        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.multiplicación");
        System.out.println("4.división");
        opcion = leer.nextInt();

        System.out.println("Escribe el primer número");
        numero1 = leer.nextInt();
        System.out.println("Escribe el segundo número");
        numero2 = leer.nextInt();
        switch (opcion) {
            case 1:
                r = numero1 + numero2;
                System.out.println("El resultado es" + r);
                break;
            case 2:
                r = numero1 - numero2;
                System.out.println("El resultado es" + r);
                break;
            case 3:
                r = numero1 * numero2;
                System.out.println("El resultado es" + r);
                break;
            case 4:
                r = numero1 / numero2;
                System.out.println("El resultado es" + r);
                break;
        }

    }
}
