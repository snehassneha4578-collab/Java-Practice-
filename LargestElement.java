class LargestElement
{
    public static void main(String[] args)
    {
        int numbers[] = {45, 12, 98, 67, 23};

        int largest = numbers[0];

        for(int value : numbers)
        {
            if(value > largest)
            {
                largest = value;
            }
        }

        System.out.println("Largest = " + largest);
    }
}
