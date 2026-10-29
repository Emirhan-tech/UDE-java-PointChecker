
import java.util.Scanner;

public class PointChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("x-Koordinate eingeben: ");
        x = sc.nextDouble();

        System.out.print("y-Koordinate eingeben: ");
        y = sc.nextDouble();

        boolean aufGerade = (y == 2 * x - 2);
        boolean aufKreis = (x * x + y * y == 8);

        if (aufGerade && aufKreis) {
            System.out.println("Der Punkt liegt auf der Gerade und auf dem Kreis.");
        } else if (aufGerade) {
            System.out.println("Der Punkt liegt auf der Gerade.");
        } else if (aufKreis) {
            System.out.println("Der Punkt liegt auf dem Kreis.");
        } else {
            System.out.println("Der Punkt liegt weder auf der Gerade noch auf dem Kreis.");
        }

        sc.close();
    }
}
