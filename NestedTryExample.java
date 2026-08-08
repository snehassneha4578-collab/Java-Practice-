class NestedTryExample
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Outer try started.");

            try
            {
                int result = 10 / 0;
                System.out.println(result);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Cannot divide by zero.");
            }

            System.out.println("Outer try continues.");
        }
        catch(Exception e)
        {
            System.out.println("Outer exception handled.");
        }

        System.out.println("Program ended.");
    }
}

