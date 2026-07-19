import java.util.Scanner;

class NextLineDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String fullName;

        System.out.print("Enter your full name: ");

        fullName = sc.nextLine();

        System.out.println("Full Name = " + fullName);
    }
}
