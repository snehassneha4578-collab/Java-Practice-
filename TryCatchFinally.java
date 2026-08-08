
class TryCatchFinally
{
    public static void main(String[] args)
    {
        try
        {
            int a = 20;
            int b = 0;

            System.out.println(a / b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero is not allowed.");
        }
        finally
        {
            System.out.println("Execution completed.");
        }
    }
}
