import java.util.Scanner;

class NextMethodDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String name;

        System.out.print("Enter your name: ");

        name = sc.next();

        System.out.println("Name = " + name);
    }
}
