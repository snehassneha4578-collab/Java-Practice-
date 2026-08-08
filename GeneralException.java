class GeneralException
{
    public static void main(String[] args)
    {
        try
        {
            int result = 20 / 0;

            System.out.println(result);
        }
        catch(Exception e)
        {
            System.out.println("An exception occurred.");
        }

        System.out.println("Program continues...");
    }
}
