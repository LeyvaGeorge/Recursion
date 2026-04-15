import java.util.Scanner;
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
        //Create an instance of the Recursion class
        Recursion rec = new Recursion();
        //Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        int iterations = 5; 
        int result = rec.recursive(iterations, input);  //Recursion is used to find the product
        System.out.println("Product: " + result);   

        input.close();
    }

}