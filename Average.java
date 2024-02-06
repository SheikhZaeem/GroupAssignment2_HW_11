/*
 * Gives both average as well as average difference from the elements in
 * the array.
 */

public class Average {

    private int average;
    private int[] diffArray;    //not required but for different objects in future

    Average (int[] array) {
        this.average = 0;
        this.diffArray= new int[ array.length];
        //Calling our methods
        System.out.println("The average of the array is " + averageOfArray( array));
        averageDifference( array);
    }
    /**
     * @param err an array
     * @return the average of an array
     */
    public int averageOfArray(int[] err) {
        int sum = 0;

        for (int i = 0; i < err.length; i++) {
            sum += err[i];
        }
        this.average = sum / err.length;

        return this.average;
    }
    /**
     * Gives the an array whose each element is a difference of elements of err and average of err
     * @param err an array 
     */
    public void averageDifference(int[] err) {

        for (int i = 0; i < err.length; i++) { 
            int avgDifference = err[i] - this.average;
            diffArray[i] = avgDifference;
        }
    }
    /**
     * 
     * @return getter for returning array average
     */
    public int getAverage() {
        return average;
    }
    /**
     * 
     */
    public void displayDiffArray() {
        System.out.print("The difference from the average is : ");
        System.out.print("{");

        for (int i = 0; i < diffArray.length; i++) {
            System.out.print( diffArray[i]);

            if (i < diffArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}\n");
    } 


}