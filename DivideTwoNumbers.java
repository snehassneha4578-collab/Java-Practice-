import java.util.Scanner;

class DivideTwoNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b, quotient;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        quotient = a / b;

        System.out.println("Quotient = " + quotient);
    }
}
