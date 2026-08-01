class ArraySum
{
    public static void main(String[] args)
    {
        int numbers[] = {5, 10, 15, 20, 25};

        int sum = 0;

        for(int value : numbers)
        {
            sum = sum + value;
        }

        System.out.println("Sum = " + sum);
    }
}
