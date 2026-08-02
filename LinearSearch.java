class LinearSearch
{
    public static void main(String[] args)
    {
        int numbers[] = {10, 25, 30, 45, 60};
        int key = 45;
        boolean found = false;

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] == key)
            {
                System.out.println("Element Found at Index " + i);
                found = true;
                break;
            }
        }

        if(found == false)
        {
            System.out.println("Element Not Found");
        }
    }
}
