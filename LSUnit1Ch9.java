/***********************************************************************************************
 * LSUnit1Ch9.java
 * Shelby Laquitara
 * 
 * This program gets, creates, sorts, prints, and searches an array of random numbers.
 ***********************************************************************************************/

package lsunit1ch9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LSUnit1Ch9 
{
    public static void main(String[] args) 
    {
        Scanner stdIn = new Scanner (System.in);
        Random rand = new Random(); //making a new random object, assigning it to rand
        
        //declares, creates, and assigns a 10-element array that stores unsorted arrays
        int[] unsortedArray = new int[10]; 
        
        int search; //something the user enters 
        
        //****************************************************************************************
        
        // Using a For loop to make a copy of the array to be sorted.
        
        for(int i=0; i<10; i++) //first loop zero, until it gets up to 9, and adds one to each loop 
        {
        unsortedArray[i] = rand.nextInt(20)+1; // pulls a new random int from the random object from 0 to 19
        }
        
        int[] sortedArray = new int[unsortedArray.length]; //a new array with a copy of it to be sorted
        
        for (int i=0; i<10; i++)
        {
        sortedArray[i] = unsortedArray[i];
        }
        
        //********************************************************************************************
         
        Arrays.sort(sortedArray); //Using the java API to sort the copy
        
        //*********************************************************************************************
        
        //Prints a table showing both the unsorted and sorted arrays with proper spacing
        
        System.out.printf("%-23s%s\n", "Unsorted Array", "Sorted Array");
        for (int i=0; i<10; i++) 
        {
            System.out.printf("%-23d%d\n",unsortedArray[i], sortedArray[i]);
        } //end for
        
        System.out.print("Please enter number to search for: "); //prints out the statement 
        search = stdIn.nextInt(); //prompts user to Enter a number to search for
        System.out.println();
        //**********************************************************************************************
       
        boolean notFound = true; //adds a true or false argument if the value is not found
        
        //***********************************************************************************************
        
        // Searches for the string in both the sorted and unsorted and displays the output as shown in example
   
        for (int i=0; i<unsortedArray.length; i++)
        {
            int currentNumber = unsortedArray[i]; //i is the key and currentNumber is the value-current(value pair)
            if (currentNumber == search)
            {
                notFound = false;
                System.out.println("Search Value: " + search + " found at location: " + (i+1) + " in the unsorted array");
            }
        } //end for
        
        for (int i=0; i<sortedArray.length; i++) 
        {
            int currentNumber = sortedArray[i];
            if (currentNumber == search)
            {
                notFound = false;
                System.out.println("Search Value: " + search + " found at location: " + (i+1) + " in the sorted array");
            }
        } //end for
        if (notFound == true)
        {
            System.out.println("Search Value: " + search + " was not found"); 
            // if search value is not found print output is "was not found" 
        }  
    }    
}//end LSUnit1Ch9
