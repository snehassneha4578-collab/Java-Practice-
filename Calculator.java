class Calculator
{
    public static void main(String[] args)
    {
        char operator = '*';
        int a = 12;
        int b = 4;

        switch(operator)
        {
            case '+':
                System.out.println("Sum = " + (a + b));
                break;

            case '-':
                System.out.println("Difference = " + (a - b));
                break;

            case '*':
                System.out.println("Product = " + (a * b));
                break;

            case '/':
                System.out.println("Quotient = " + (a / b));
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}