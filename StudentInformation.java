
import java.util.Scanner;

class StudentInformation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        double percentage;
        char grade;

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();

        System.out.print("Enter Percentage: ");
        percentage = sc.nextDouble();

        System.out.print("Enter Grade: ");
        grade = sc.next().charAt(0);

        System.out.println("\n----- Student Information -----");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Percentage : " + percentage);
        System.out.println("Grade      : " + grade);
    }
}

