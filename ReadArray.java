import java.util.Scanner;

class ReadArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Array Elements:");

        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
