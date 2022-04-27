import javax.swing.*;

public class Main
{

    public static void main(String[] args)
    {
	 ///Every dialog (asking user for input)
        //is provided by JOptionPane class
       int response = 0;
        do {
        response = JOptionPane.showConfirmDialog(null, "Are you 21 years of age or older?", "Age verification", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        //Make a decision on the response

            switch (response) {
                case JOptionPane.YES_OPTION:
                    //Display "Proceed on Adult"
                    JOptionPane.showMessageDialog(null, "Proceed on Adult", "You are an adult", JOptionPane.INFORMATION_MESSAGE);
                    //response = 0;
                    break;

                case JOptionPane.NO_OPTION:
                    //Display "You shall not pass!"
                    JOptionPane.showMessageDialog(null, " You shall not pass", "Not allowed", JOptionPane.WARNING_MESSAGE);
                    break;
                case JOptionPane.CLOSED_OPTION:
                    //Display "Aversion detected"
                    JOptionPane.showMessageDialog(null, "Aversion detected", "Error", JOptionPane.ERROR_MESSAGE);
                    break;


            }
        }while(response == JOptionPane.CLOSED_OPTION);
    }
}
