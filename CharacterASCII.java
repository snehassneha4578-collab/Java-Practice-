import java.util.Scanner;

class CharacterASCII
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char ch;
        int ascii;

        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);

        ascii = (int) ch;

        System.out.println("Character = " + ch);
        System.out.println("ASCII Value = " + ascii);
    }
}
