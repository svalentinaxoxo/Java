/***********************************************************************************
* Employee.java
* Shelby Laquitara
*
* This class uses instance variables and uses teh load, toString, getBonus, and getEarnings methods.
************************************************************************************/

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.Scanner;


public class Employee
{
    private String name; // variables

    private String socialSecurityNumber; // variables

    private static int birthdayMonth; // variables

    private static int birthdayWeek; // variables

    //******************************************************************************

    public void load() //load method which will be used to prompt, take and store input
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name ==>");

        name = scanner.nextLine();

        System.out.print("Social security number ==>");

        socialSecurityNumber = scanner.next();

        System.out.print("Birthday month (1-12)");

        birthdayMonth = scanner.nextInt();

        System.out.print("Birthday bonus week (1-4)");

        birthdayWeek = scanner.nextInt();

     } // end load

     //*****************************************************************************

     public double getBonus() { // if this month is the employee's birthday, a bonus of $100.00 to it.


        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd"); //Date

        Date date = new Date();

        int week = 0;

        int monthInteger = 0;

        String dateFormatted = dateFormat.format(date); //Storing the date into Strings

        String day = dateFormatted.substring(dateFormatted.length() - 2, // extracting the day part from the String

                     dateFormatted.length());

        int dayInteger = Integer.parseInt(day); // converting the day from string to int

        if (dayInteger >= 1 && dayInteger <= 7) { // alot the days from 1 to 7 to week 1

            week = 1;

        } else if (dayInteger >= 8 && dayInteger <= 14) { // 8 to 14 it is week 2

            week = 2;

        } else if (dayInteger >= 15 && dayInteger <= 21) { // from 15 to 21 is week 3

            week = 3;

        } else { // from 22 onwards it is week 4

            week = 4;

        } // end getBonus

        //***************************************************************************


        String month = dateFormatted.substring(5, 7); // extracting the month part from date

        monthInteger = Integer.parseInt(month);


        if (week == birthdayWeek && monthInteger == birthdayMonth) { // if the birthday of employee is same as system date, return 100 dollars.

            return 100; //return 100

        } else {

            return 0; // else return 0

        }
    }

    //*******************************************************************************

    public double getEarnings()
    {
        return 0;
    } // end getEarnings

     //******************************************************************************


    @Override
    public String toString() // toString() method to print object into readable form.
    {
        return "\n\nemployee: " + name + "\nsocial security number: "
                + socialSecurityNumber;

    } // end toString

} //end class Employee