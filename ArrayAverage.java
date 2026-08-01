class ArrayAverage
{
    public static void main(String[] args)
    {
        int marks[] = {80, 90, 70, 60, 100};

        int sum = 0;

        for(int value : marks)
        {
            sum += value;
        }

        double average = (double)sum / marks.length;

        System.out.println("Average = " + average);
    }
}
