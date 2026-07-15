import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScientificCalculatorGUI extends JFrame implements ActionListener
{
    JTextField display;

    JButton[] buttons;

    String[] buttonNames =
    {
        "7","8","9","/",
        "4","5","6","*",
        "1","2","3","-",
        "0",".","=","+",
        "C","DEL","sin","cos",
        "tan","log","ln","√",
        "x²","xʸ","π","e",
        "!","%","REC","("
    };


    String operator = "";
    double firstNumber = 0;


    public ScientificCalculatorGUI()
    {
        setTitle("Scientific Calculator Version 2");
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        // Display

        display = new JTextField();

        display.setFont(new Font("Arial",Font.BOLD,30));
        display.setHorizontalAlignment(JTextField.RIGHT);

        add(display,BorderLayout.NORTH);



        // Button Panel

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(8,4,5,5));


        buttons = new JButton[buttonNames.length];


        for(int i=0;i<buttonNames.length;i++)
        {
            buttons[i] = new JButton(buttonNames[i]);

            buttons[i].setFont(
            new Font("Arial",Font.BOLD,18));

            buttons[i].addActionListener(this);

            panel.add(buttons[i]);
        }


        add(panel,BorderLayout.CENTER);


        setVisible(true);
    }



    // Button Actions

    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();


        if(command.charAt(0)>='0' &&
           command.charAt(0)<='9'
           || command.equals("."))
        {
            display.setText(
            display.getText()+command);
        }


        else if(command.equals("C"))
        {
            display.setText("");
        }


        else if(command.equals("DEL"))
        {
            String text = display.getText();

            if(text.length()>0)
            {
                display.setText(
                text.substring(0,text.length()-1));
            }
        }


        else if(command.equals("+") ||
                command.equals("-") ||
                command.equals("*") ||
                command.equals("/"))
        {
            firstNumber =
            Double.parseDouble(display.getText());

            operator = command;

            display.setText("");
        }


        else if(command.equals("="))
        {
            double secondNumber =
            Double.parseDouble(display.getText());

            double result = 0;


            switch(operator)
            {
                case "+":
                    result = firstNumber + secondNumber;
                    break;

                case "-":
                    result = firstNumber - secondNumber;
                    break;

                case "*":
                    result = firstNumber * secondNumber;
                    break;

                case "/":
                    result = firstNumber / secondNumber;
                    break;
            }


            display.setText(
            String.valueOf(result));
        }


        else if(command.equals("xʸ"))
{
    powerOperation();
}

else if(command.equals("xʸ"))
{
    powerOperation();
}

else if(command.equals("xʸ"))
{
    powerOperation();
}

else if(command.equals("1/x"))
{
    double value = Double.parseDouble(display.getText());
    display.setText(String.valueOf(1 / value));
}
else if(command.equals("1/x"))
{
    double value = Double.parseDouble(display.getText());

    double result = 1 / value;

    display.setText(String.valueOf(result));
}

else
{
    scientificOperation(command);
}

}
private void scientificOperation(String operation)
{
    try
    {
        double value = 0;

        if(!display.getText().equals(""))
        {
            value = Double.parseDouble(display.getText());
        }

        double result = 0;

        switch(operation)
        {
            case "sin":
                result = Math.sin(Math.toRadians(value));
                break;

            case "cos":
                result = Math.cos(Math.toRadians(value));
                break;

            case "tan":
                result = Math.tan(Math.toRadians(value));
                break;

            case "log":
               result = Math.log10(value);
               break;

            case "ln":
            result = Math.log(value);
            break;

            case "√":
                result = Math.sqrt(value);
                break;

            case "x²":
                result = value * value;
                break;

            case "REC":
            result = 1 / value;
            break;
            case "%":
                result = value / 100;
                break;

            case "!":
                result = factorial((int)value);
                break;

            case "π":
                result = Math.PI;
                break;

            case "e":
                result = Math.E;
                break;
        }

        display.setText(String.valueOf(result));

    }
    catch(Exception e)
    {
        display.setText("Error");
    }
}


// ================= FACTORIAL FUNCTION =================

private long factorial(int n)
{
    if(n < 0)
        return 0;

    long fact = 1;

    for(int i = 1; i <= n; i++)
    {
        fact = fact * i;
    }

    return fact;
}


// ================= POWER FUNCTION =================

private void powerOperation()
{
    try
    {
        double base = Double.parseDouble(display.getText());

        String input = javax.swing.JOptionPane.showInputDialog(
                "Enter Power Value");

        double exponent = Double.parseDouble(input);

        double result = Math.pow(base, exponent);

        display.setText(String.valueOf(result));
    }
    catch(Exception e)
    {
        display.setText("Error");
    }
}
public static void main(String[] args)
{
    SwingUtilities.invokeLater(new Runnable()
    {
        public void run()
        {
            new ScientificCalculatorGUI();
        }
    });
}
}