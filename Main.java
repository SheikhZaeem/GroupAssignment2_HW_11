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
                        int min = minimumOfArray(array);
                        System.out.println("Minimum value of the array is " + min);
                        break;
                    case "b":
                        int max = maximumOfArray(array);
                        System.out.println("Maximum value of the array is " + max);
                        break;
                    case "c":
                        Average average = new Average(array);
                        average.displayDiffArray();
                        break;
                    case "d":
                        int oddSum = sumOfOddIndexes(array);
                        System.out.println("Sum of odd indexed numbers is " + oddSum);
                        break;
                    case "e":
                        int evenSum = sumOfEvenIndexes(array);
                        System.out.println("Sum of even indexed numbers is " + evenSum);
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

    public static int maximumOfArray(int [] input)
    {
        int j = Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++)
        {
            if (input[i] > j)
            {
                j = input[i];
            }
        }
        return j;
    }

    public static int minimumOfArray(int [] input)
    {
        int j = Integer.MAX_VALUE;
        for (int i = 0; i < input.length; i++)
        {
            if (input[i] < j)
            {
                j = input[i];
            }
        }
        return j;
    }

    private static int everyOtherIndex(int [] input, int index)
    {
        int sum = 0;
        for(int i = index; i < input.length; i = i + 2)
        {
            sum += input[i];
        }
        return sum;
    }

    public static int sumOfOddIndexes(int [] input)
    {
        int index = 1;
        return everyOtherIndex(input, index);   
    }

    public static int sumOfEvenIndexes(int [] input)
    {
        int index = 0;
        return everyOtherIndex(input, index);
    }
}
