import java.util.Scanner;

class ReadAgeAndName
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int age;
        String name;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter your full name: ");
        name = sc.nextLine();

        System.out.println("Age = " + age);
        System.out.println("Full Name = " + name);
    }
}
