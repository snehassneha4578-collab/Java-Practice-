import java.util.Scanner;

class ProductTwoNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b, product;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        product = a * b;

        System.out.println("Product = " + product);
    }
}
