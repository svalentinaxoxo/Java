/******************************************************************************************************
* LiFiAddressBook.java
* Shelby Laquitara
*
* This program simulates an address book.
********************************************************************************************************/

import java.io.*;
import java.util.ArrayList;
public class LiFiAddressBook
{

String FirstName;

String LastName;

String StreetAddress;

String CityState;

String ZipCode;

public static void addEntry(LiFiAddressBook entry) throws IOException

{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

//Get the first name as a input and store it in the entry object

System.out.print("Please Enter First Name: ");

entry.FirstName=br.readLine();

//Get the last name as a input and store it in the entry object

System.out.print("Please Enter Last Name: ");

entry.LastName=br.readLine();

//Get the address as a input and store it in the entry object

System.out.print("Please Enter Street Address:");

entry.StreetAddress=br.readLine();

//Get the city,state as a input and store it in the entry object

System.out.print("Please Enter City, State: ");

entry.CityState=br.readLine();

//Get the zip code as a input and store it in the entry object

System.out.print("Please Enter Zip Code: ");

entry.ZipCode=br.readLine();

}







public static int search(ArrayList<LiFiAddressBook> aBook) throws NumberFormatException, IOException

{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("1. First Name");

System.out.println("2. Last Name");

System.out.println("3. Street Address");

System.out.println("4. City, State");

System.out.println("5. Zip Code");

System.out.print("\n\nPlease Enter Field to Search: ");

int choice=Integer.parseInt(br.readLine());

System.out.print("\n\nPlease enter value to search for: ");

String value=br.readLine();

//The array list is iterated through to search if the given value matches the field of any of the entries in the list

for(LiFiAddressBook e:aBook)

{

switch(choice){

case 1://Indicates the first case

if(value.equalsIgnoreCase(e.FirstName))

return aBook.indexOf(e);

break;

case 2: //Indicates the second case

if(value.equalsIgnoreCase(e.LastName))

return aBook.indexOf(e);

break;

case 3: //Indicates the third case

if(value.equalsIgnoreCase(e.StreetAddress))

return aBook.indexOf(e);

break;

case 4: //Indicates the forth case

if(value.equalsIgnoreCase(e.CityState))

return aBook.indexOf(e);

break;

case 5: //Indicates the fifth case

if(value.equalsIgnoreCase(e.ZipCode))

return aBook.indexOf(e);

break;

}

}

return -1;

}

public void display()

{

System.out.println("First Name: "+this.FirstName); //returns the person's first name

System.out.println("Last Name: "+this.LastName); // returns the person's last name

System.out.println("Street Address: "+this.StreetAddress); // returns the person's street Address

System.out.println("City, State: "+this.CityState); // returns the person's City and State

System.out.println("Zip Code: "+this.ZipCode); //returns the person's ZipCode

}//end display

}// end class LifiAddressBook

