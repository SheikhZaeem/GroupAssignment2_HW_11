import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
    
        System.out.print("Enter the size of the array: ");
        int arraySize = scan.nextInt();

        int[] array = new int[arraySize];
        //Filling array with randomly generated values [0, 100]
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(101);
        }
        if (arraySize < 1) {
            System.out.println("Size of the array should be atleast one.");
        }
        else {
            boolean run = true;
            scan.nextLine();      //consuming the next line character

            while (run) {
                displayMenu();
                System.out.print("Option to choose: ");           
                String option = scan.next();

                switch (option) {
                    case "a":
                        //CALL MINIMUM CLASS/METHOD
                        break;
                    case "b":
                        //CALL MAXIMUM  CLASS/METHOD
                        break;
                    case "c":
                        //CALL AVERAGE CLASS/METHOD (ZAEEM)
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
        System.out.println("a. Find minimum of the array.\nb. Find maximum of the array.");
        System.out.println("c. Find the average of the array.\nd. Find sum of odd index.");
        System.out.println("e. Find sum of even index.\nf. Exit.");
    }
  
    /**
     * Displays an array
     * @param err takes an array
     */
    public static void displayArray(int[] err) {
        for (int i : err) {
            System.out.print(i + ", ");
        }
    }
}
