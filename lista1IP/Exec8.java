import java.util.Scanner;

public class Exec8b {
	public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

            System.out.print("Insira o coeficiente a: ");
            double a = input.nextDouble();
            System.out.print("Insira o coeficiente b: ");
            double b = input.nextDouble();
            System.out.print("Insira o coeficiente c: ");
            double c = input.nextDouble();

            double disc = b * b - 4.0 * a * c;

            if (disc > 0.0) {
                double r1 = (-b + Math.sqrt(disc)) / (2.0 * a);
                double r2 = (-b - Math.sqrt(disc)) / (2.0 * a);
                System.out.println("As raízes são " + r1 + " e " + r2 + ".");
            } else if (disc == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("A raíz é " + r1 + ".");
            } else {
                System.out.println("A equação não tem raízes reais.");
            }

    }
}

