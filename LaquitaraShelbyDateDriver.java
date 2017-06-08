/***************************************************************************************************
* LaquitaraShelbyDateDriver.java
* Shelby Laquitara
*
* This is a driver program that includes a loop.
***************************************************************************************************/


import java.util.*;
public class LaquitaraShelbyDateDriver{
public static void main(String[] args) //defines the main  method

{
String input;
Scanner in=new Scanner(System.in);
System.out.print("Enter a date in the form mm/dd (\"q\" to quit): "); // Ask the user to enter a date or "q" to quit.
input=in.nextLine();
while(input.charAt(0)!='q')// If the entry is not “q”, instantiate a Date object.
   {Date d=new Date(input);
       if(d.getError()==null) // If the error variable is null:
                 { d.printNumbers(); // Print the date using numeric format.
                   d.printWords(); // Print the date using alphabetic format.
                    }
        else
                   System.out.println(d.getError()); // Otherwise, print the value of the error variable.

       System.out.print("Enter a date in the form mm/dd (\"q\" to quit): "); // return: Ask the user to enter a date or "q" to quit.
      input=in.nextLine();
      }
   }
} //end class LaquitaraShelbyDateDriver