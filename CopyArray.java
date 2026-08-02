class CopyArray
{
    public static void main(String[] args)
    {
        int source[] = {5, 10, 15, 20};
        int destination[] = new int[source.length];

        for(int i = 0; i < source.length; i++)
        {
            destination[i] = source[i];
        }

        System.out.println("Copied Array:");

        for(int value : destination)
        {
            System.out.println(value);
        }
    }
}
