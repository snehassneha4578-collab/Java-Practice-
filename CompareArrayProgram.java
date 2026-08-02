class CompareArrayProgram
{
    public static void main(String[] args)
    {
        int a[] = {5, 10, 15};
        int b[] = {5, 10, 15};

        boolean same = true;

        if(a.length != b.length)
        {
            same = false;
        }
        else
        {
            for(int i = 0; i < a.length; i++)
            {
                if(a[i] != b[i])
                {
                    same = false;
                    break;
                }
            }
        }

        if(same)
        {
            System.out.println("Arrays are Equal");
        }
        else
        {
            System.out.println("Arrays are Not Equal");
        }
    }
}
