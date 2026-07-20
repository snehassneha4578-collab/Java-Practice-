import java.util.Scanner;

class EmployeeDetails
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        char grade;
        double salary;

        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Grade: ");
        grade = sc.next().charAt(0);

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();

        System.out.println("\n----- Employee Details -----");
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Grade  : " + grade);
        System.out.println("Salary : " + salary);
    }
}
