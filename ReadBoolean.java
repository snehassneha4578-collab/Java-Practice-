import java.util.Scanner;

class ReadBoolean
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        boolean result;

        System.out.print("Enter true or false: ");
        result = sc.nextBoolean();

        System.out.println("Boolean Value = " + result);
    }
}