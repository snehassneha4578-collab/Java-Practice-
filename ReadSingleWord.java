import java.util.Scanner;

class ReadSingleWord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String word;

        System.out.print("Enter a word: ");
        word = sc.next();

        System.out.println("Entered Word = " + word);
    }
}
