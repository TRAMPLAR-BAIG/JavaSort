/*
You may modify or reproduce.
Time: 03:48:17pm Wednesday
Date: 05-09-2018
Email: mughalb9291@gmail.com
Bugs and Criticisms are warmly welcome :) 
(Improvements will be updated soon, like Generic Node )
*/

package sort;


public class SelectionSort {
    /* Mistake Messages */
    private final String OVER_FLOW =" Sorry, Overflow has been occured.";
    private final String UNDER_FLOW =" Sorry, Underflow has been occured.";
    public final int MAX_SIZE = 100; /* Maximum Size */
    private int[] array; // Array of Integer
    public SelectionSort(int[] iArray){
        sizeVerifier(iArray.length); // Verify size
        copyArray(iArray); // copy array from input 
    }
    // Ascending Order
    public void sortAscend(){
        int smallest   = 0;
        int dataHolder = 0;
        for(int current = 0; current < array.length; current++){
            smallest = current;// Suppose smallest is on Current Position 
           for(int walker = current + 1; walker < array.length; walker++)
                if(array[walker] < array[smallest])
                    smallest = walker; // Update Smaller
            // Swap smallest to sorted subarray
            dataHolder      = array[current];
            array[current]  = array[smallest];
            array[smallest] = dataHolder;
        }     
    } 
    // Sort descending order
    public void sortDescend(){
        int largest   = 0;
        int dataHolder = 0;
        for(int current = 0; current < array.length; current++){
            largest = current;// Suppose smallest is on Current
            for(int walker = current + 1; walker < array.length; walker++)
                if(array[walker] < array[largest])
                    largest = walker; // Update Smaller
            // Swap smallest to sorted subarray
            dataHolder      = array[current];
            array[current]  = array[largest];
            array[largest] = dataHolder;
        }     
    }
    // Copy array
    private void copyArray(int[] iArray){
        array = new int[iArray.length];
        for(int i = 0; i < array.length; i++)
            array[i] = iArray[i];
    }
    // Check Overflow / Underflow
    private void sizeVerifier(long iSize){
        if(iSize > MAX_SIZE)
            takeMeOut(OVER_FLOW);
        if(iSize == 0)
            takeMeOut(UNDER_FLOW);
    }
    // Leave a Mistake Message and Exit safely
    private void takeMeOut(String leaveMessage){
        System.err.println(leaveMessage);
        System.exit(0);
    }
}
