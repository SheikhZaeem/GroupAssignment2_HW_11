import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the size of the array: ");

        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];               //creating array of user specified length
       
        for (int i = 0; i < arraySize; i++) {            //Filling array with randomly generated values [0, 100]
            array[i] = random.nextInt(101);
        }
        if (arraySize < 1) {
            System.out.println("Size of the array should be atleast one.");
        }
        else {
            boolean run = true;
            scan.nextLine();      //consuming the next line character
            displayArray(array);
    
            while (run) {
                displayMenu();
                System.out.print("Option to choose: ");           
                String option = scan.next();
                System.out.println();

                switch (option) {
                    case "a":
                        //CALL MINIMUM CLASS/METHOD
                        break;
                    case "b":
                        //CALL MAXIMUM  CLASS/METHOD
                        break;
                    case "c":
                        Average average = new Average(array);
                        average.displayDiffArray();
                        break;
                    case "d":
                        //CALL ODD INDEX SUM CLASS/METHOD
                        break;
                    case "e":
                        //CALL EVEN INDEX SUM CLASS/METHOD
                        break;
                    case "f":
                        System.out.print("Exiting the game!");
                        run = false;
                        break;
                    default:
                        System.out.println("Sorry, wrong input. Try again.");
                        
                        break;
                }
            }

        }
    }
    /**
     * Displays menu options to the user
     */
    public static void displayMenu() {
        System.out.println("\na. Find minimum of the array.\nb. Find maximum of the array.");
        System.out.println("c. Find the average of the array.\nd. Find sum of odd index.");
        System.out.println("e. Find sum of even index.\nf. Exit.");
    }
    /**
     * Displays an array
     * @param err takes an array
     */
    public static void displayArray(int[] err) {
        System.out.print("The randomly generated array of size " + err.length + " is:\n{" );

        for (int i = 0; i < err.length; i++) {
            System.out.print(err[i]);

            if (i < err.length - 1 ) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
