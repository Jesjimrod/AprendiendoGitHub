import java.util.Scanner;

public class Saludo {
    public void saludo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = sc.nextLine();

        System.out.println("Hola " + nombre + ", hace mucho que no nos vemos");
        sc.close();
    }
    public void SaludarConEdad() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Dime tu edad");
        int edad = sc.nextInt();
        sc.nextLine();

        if (edad < 18) {
            System.out.println("Hola " + nombre + ", eres menor de edad");
        } else  {
            System.out.println("Hola " + nombre + ", es mayor de edad");
        }
        sc.close();
    }
}
