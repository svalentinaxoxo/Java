/*******************************************************************************
* LSUnit3Ch12.java
* Shelby Laquitara
*
* This program gets input for a string, then outputs the string
* character by character showing the upper case, lower case, initial case,
* binary, and hex values of each character.
*******************************************************************************/
package shelby;
import java.util.Scanner;
public class LSUnit3Ch12
{
  public static void main(String[] args)
  {
    Scanner stdIn= new Scanner(System.in); //user input
    String userInput; //created a String called userInput

    System.out.print("Please enter a string of any length: "); //prints literal
    userInput = stdIn.nextLine(); //creates a prompt to let the user type in input

//**************************************************************************

//formatting and printing specific spaces between the words
    System.out.printf("\n%-8s%-8s%-8s%-8s%-16s%s\n", "Lower", "Upper", "Inital",
        "ASCII", "Binary", "Hex");
    for(int i=0; i<userInput.length(); i++)
    {
      char x = userInput.charAt(i); // x is single character from the string
      System.out.printf("%-8c%-8c%-8c%-8d%-16s%S\n",Character.toLowerCase(x), //output character by character
          Character.toUpperCase(x), x,(byte)x, LSUnit3Ch12.padd(Integer.toString(x, 2)),Integer.toString(x, 16));
    } //end for
  } //end main method
  
//****************************************************************************

//Created a new method to pad with 0
  public static String padd(String strNumber)
  {
    String result = "";
    if(strNumber.length() < 8)
    {
      while(strNumber.length() < 8)
      {
        strNumber = "0" + strNumber;
      }
    } 
    for(int i=0; i<8; i++)
    {
      result += strNumber.charAt(i); //each character in the string number variable will be concatenated to the result
      if(i == 3) //
      {
        result += " ";
      }
    } //end for 
    return result;
  } //end padd method 
} //end class LSUnit3Ch12
