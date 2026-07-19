import java.util.Scanner;

class ReadCity
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String city;

        System.out.print("Enter city name: ");
        city = sc.next();

        System.out.println("City = " + city);
    }
}
