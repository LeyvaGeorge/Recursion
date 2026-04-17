import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

class Recursion {
    public int recursive(int iterations, Scanner scnr) {
        if (iterations == 0) {  //Base case: if iterations is 0
            return 1;
        }else{                  
            //Recursive case: prompt user for input and multiply it with the result of the next recursive call
            System.out.println("Enter a number: ");
            int input = scnr.nextInt();
            iterations--;
            return input * recursive(iterations, scnr);
        }
    }

    public static void main(String[] args) {
        int iterations = 5;
        int results = 0; 
        JFrame frame = null; //Frame for the GUI
        JLabel label = null;    //Label to display the prompt for user input
        JLabel resultLabel = null; //Label to display the result of the recursion
        JTextField numbRecursion = null; //Text field for user to enter the number of recursions
        JTextField resultField = null; //Text field to display the result of the recursion
        GridBagConstraints layoutConst = null; //Layout constraints for the GUI components

        //Set Labels
        label = new JLabel("Number of Recursions:");
        resultLabel = new JLabel("Result: ");

        //Set Text Fields
        numbRecursion = new JTextField(10);
        numbRecursion.setEditable(false);
        numbRecursion.setText(Integer.toString(iterations));
        
        resultField = new JTextField(10);
        resultField.setEditable(false);
        resultField.setText(Integer.toString(results));
        
        //Creating frame
        frame = new JFrame("Recursion");
        
        //Using a GridBagLayout
        frame.setLayout(new GridBagLayout());

        //Creating GridBagConstraints
        layoutConst = new GridBagConstraints();

        //Specify component's grid location
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;

        // 10 pixels of padding around component
        layoutConst.insets = new Insets(10, 10, 10, 10);

        //Add component using the specified constraints
        frame.add(label, layoutConst);  //first label on top left

        layoutConst = new GridBagConstraints(); //Second Text field on top right
        layoutConst.gridx = 1;
        layoutConst.gridy = 0;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        frame.add(numbRecursion, layoutConst);

        layoutConst = new GridBagConstraints(); //Third label on bottom left
        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        frame.add(resultLabel, layoutConst);

        layoutConst = new GridBagConstraints(); //Fourth Text field on bottom right
        layoutConst.gridx = 1;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        frame.add(resultField, layoutConst);


        //Terminate program whe window closes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Resize the frame to fit the components
        frame.pack();

        //Display window
        frame.setVisible(true);
        //Create an instance of the Recursion class
        Recursion rec = new Recursion();
        //Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        int result = rec.recursive(iterations, input);  //Recursion is used to find the product
        System.out.println("Product: " + result);   

        input.close();
    }
}