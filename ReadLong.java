import java.util.Scanner;

class ReadLong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        long population;

        System.out.print("Enter a long value: ");
        population = sc.nextLong();

        System.out.println("Long Value = " + population);
    }
}