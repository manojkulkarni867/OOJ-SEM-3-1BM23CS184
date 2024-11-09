import java.util.Scanner;

class Quadi{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Roots are real and different.\nRoot 1: %.2f\nRoot 2: %.2f\n", r1, r2);
        } else if (discriminant == 0) {
            double r1 = -b / (2 * a);
            System.out.printf("Roots are equal.\nRoot: %.2f\n", r1);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("Roots are complex and different.\nRoot 1: %.2f + %.2fi\nRoot 2: %.2f - %.2fi\n",
                    realPart, imaginaryPart, realPart, imaginaryPart);
        }

        scanner.close();
    }
}
