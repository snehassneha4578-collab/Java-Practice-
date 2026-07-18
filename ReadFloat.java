import java.util.Scanner;
class ReadFloat
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float percentage;

        System.out.print("Enter a float value: ");
        percentage = sc.nextFloat();

        System.out.println("Float Value = " + percentage);
    }
}