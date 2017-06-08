
/***********************************************************************************************
 * LSUnit2Ch10.java
 * Shelby Laquitara
 * 
 * This program gets, creates, sorts, prints, and searches an array of random numbers.
 ***********************************************************************************************/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
  
public class LSUnit2Ch10
{
  public static void main(String[] args) 
  {
        
    Scanner stdIn = new Scanner (System.in);
    Random rand = new Random(); //making a new random object, assigning it to rand
        
    //declares, creates, and assigns a 10-element array that stores unsorted arrays
    ArrayList<Integer> unsortedArray = new ArrayList<Integer> (10); //10 is the default size, the first array
        //push 11 value will have to copy over and resize 
    int search; //something the user enters
    
    //****************************************************************************************
        
    // Using a For loop to make a copy of the array to be sorted.
        
    for(int i=0; i<10; i++) //first loop zero, until it gets up to 9, and adds one to each loop 
    {
      unsortedArray.add(rand.nextInt(20)+1); // add function puts it at the end of the list
    }
        
    ArrayList<Integer> sortedArray = new ArrayList<Integer>(unsortedArray); //copy constructor, new object 
    //pass in another object, copy the object that is passed in and it will automatically size it and copy in the elements 
        
    //********************************************************************************************
         
    Collections.sort(sortedArray); //Using the collections method to sort the copy
        
    //*********************************************************************************************
        
    //Prints a table showing both the unsorted and sorted arrays with proper spacing
    System.out.printf("%-23s%s\n", "Unsorted Array", "Sorted Array");
    for (int i=0; i<unsortedArray.size(); i++) //unsortedArray.size self documenting 
    {
      System.out.printf("%-23d%d\n",unsortedArray.get(i), sortedArray.get(i));
    } //end for
        
    System.out.print("\nPlease enter number to search for: "); //prints out the statement 
    search = stdIn.nextInt(); //prompts user to Enter a number to search for
    System.out.println();
    //**********************************************************************************************
       
    boolean notFound = true; //adds a true or false argument if the value is not found
        
    //***********************************************************************************************
        
    // Searches for the string in both the sorted and unsorted and displays the output as shown in example   
    for (int i=0; i<unsortedArray.size(); i++)
    {
      int currentNumber = unsortedArray.get(i); //i is the key and currentNumber is the value-current(value pair)
      if (currentNumber == search)
      {
        notFound = false;
        System.out.println("Search Value: " + search + " found at location: " + (i+1) + " in the unsorted array");
      }
     } //end for
   
     for (int i=0; i<sortedArray.size(); i++) 
     {
       int currentNumber = sortedArray.get(i);
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
} //end class LSUnit1Ch9
