import java.util.Scanner;
class ReadIntAndDouble
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int age;
        double salary;

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();

        System.out.println("Age = " + age);
        System.out.println("Salary = " + salary);
    }
}
