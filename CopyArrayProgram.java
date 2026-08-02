class CopyArrayProgram
{
    public static void main(String[] args)
    {
        int first[] = {2, 4, 6, 8};
        int second[] = new int[first.length];

        for(int i = 0; i < first.length; i++)
        {
            second[i] = first[i];
        }

        System.out.println("Copied Elements:");

        for(int value : second)
        {
            System.out.println(value);
        }
    }
}
