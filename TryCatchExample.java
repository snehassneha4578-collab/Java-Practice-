class TryCatchExample
{
    public static void main(String[] args)
    {
        int a = 20;
        int b = 0;

        try
        {
            System.out.println(a / b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("Program Continues...");
    }
}
