import java.util.Scanner;

public class Saludo {
    public void saludo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = sc.nextLine();

        System.out.println("Hola " +nombre);
        sc.close();
    }
}
