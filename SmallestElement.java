class SmallestElement
{
    public static void main(String[] args)
    {
        int numbers[] = {45, 12, 98, 67, 23};

        int smallest = numbers[0];

        for(int value : numbers)
        {
            if(value < smallest)
            {
                smallest = value;
            }
        }

        System.out.println("Smallest = " + smallest);
    }
}
