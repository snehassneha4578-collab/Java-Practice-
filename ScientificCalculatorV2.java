import java.util.Scanner;

public class ScientificCalculatorV2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== SCIENTIFIC CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Square Root");
            System.out.println("7. Power");
            System.out.println("8. Factorial");
            System.out.println("9. Sine");
            System.out.println("10. Cosine");
            System.out.println("11. Tangent");
            System.out.println("12. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter first number: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double b = sc.nextDouble();
                    System.out.println("Answer = " + (a + b));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();
                    System.out.println("Answer = " + (a - b));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();
                    System.out.println("Answer = " + (a * b));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();

                    if (b != 0)
                        System.out.println("Answer = " + (a / b));
                    else
                        System.out.println("Division by zero is not allowed.");
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    double num = sc.nextDouble();
                    System.out.println("Answer = " + (num * num));
                    break;

                case 6:
                    System.out.print("Enter a number: ");
                    num = sc.nextDouble();

                    if (num >= 0)
                        System.out.println("Answer = " + Math.sqrt(num));
                    else
                        System.out.println("Invalid Input");
                    break;

                case 7:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exp = sc.nextDouble();
                    System.out.println("Answer = " + Math.pow(base, exp));
                    break;

                case 8:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();

                    long fact = 1;

                    for (int i = 1; i <= n; i++) {
                        fact = fact * i;
                    }

                    System.out.println("Factorial = " + fact);
                    break;

                case 9:
                    System.out.print("Enter angle in degrees: ");
                    double angle = sc.nextDouble();
                    System.out.println("Answer = " + Math.sin(Math.toRadians(angle)));
                    break;

                case 10:
                    System.out.print("Enter angle in degrees: ");
                    angle = sc.nextDouble();
                    System.out.println("Answer = " + Math.cos(Math.toRadians(angle)));
                    break;

                case 11:
                    System.out.print("Enter angle in degrees: ");
                    angle = sc.nextDouble();
                    System.out.println("Answer = " + Math.tan(Math.toRadians(angle)));
                    break;

                case 12:
                    System.out.println("Thank you for using Scientific Calculator.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 12);

        sc.close();
    }
}