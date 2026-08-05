class MultipleStatements
{
    public static void main(String[] args)
    {
        try
        {
            int a = 50;
            int b = 5;

            System.out.println(a / b);

            int numbers[] = {1,2,3};

            System.out.println(numbers[2]);
        }
        catch(Exception e)
        {
            System.out.println("Exception Occurred");
        }

        System.out.println("Execution Completed");
    }
}
