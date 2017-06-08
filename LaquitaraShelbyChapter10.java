/******************************************************************************************************
* LaquitaraShelbyChapter10.java
* Shelby Laquitara
*
* This driver explains functionality of a program that simulates an address book.
********************************************************************************************************/

import java.io.IOException;

import java.util.ArrayList;

public class LaquitaraShelbyChapter10
// Replace LastFirst with your Last Name and First Name
{

    public static void main(String[] args) throws NumberFormatException, IOException
    {
      ArrayList<LiFiAddressBook> aBook = new ArrayList<LiFiAddressBook>();
      // Replace LiFi with Last Initial First Initial (for all instances)
      for (int count = 0; count < 1; count++) // change 1 to add more than 1
      {

      LiFiAddressBook newEntry=new LiFiAddressBook();

      aBook.add(newEntry);//Adding new entry into the array list

      LiFiAddressBook.addEntry(newEntry); //call addEntry

      System.out.println(); //print blank line

      }//end main
      //**************************************************************************************

      int foundIndex = LiFiAddressBook.search(aBook);
      System.out.println();
      if (foundIndex > -1)
                aBook.get(foundIndex).display();

      else

                System.out.println("No Entry Found");

     }//end  foundIndex
}//end class LaquitaraShelbyChapter10