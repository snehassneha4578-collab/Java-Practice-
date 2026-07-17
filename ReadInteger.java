import java.util.Scanner;

class ReadInteger
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter an integer: ");
        number = sc.nextInt();

        System.out.println("You entered: " + number);
    }
}
