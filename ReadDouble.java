import java.util.Scanner;

class ReadDouble
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double number;

        System.out.print("Enter a double value: ");
        number = sc.nextDouble();

        System.out.println("Double Value = " + number);
    }
}