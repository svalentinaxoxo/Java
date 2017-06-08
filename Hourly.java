/**************************************************************************************************************************
* Hourly.java
* Shelby Laquitara
*
* This class uses the load method and the getEarnings method.
**************************************************************************************************************************/

import java.util.Scanner;

public class Hourly extends Employee { //a subclass of Employee.java
    private double hourlyPay; // variables declation
    private double hourWorkedPastWeek; // variables declation

    public void load() { // load method to prompt user for input and store into variables.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hourly pay ==>");
        hourlyPay = scanner.nextDouble();
        System.out.print("Hours worked this past week ==>");
        hourWorkedPastWeek = scanner.nextDouble();

    } // end load

    //**********************************************************************************************************************

    @Override
    public double getEarnings() { // getEarnings() method
        if (hourWorkedPastWeek < 40) { //if no of hours worked is less than 40
           return hourlyPay * hourWorkedPastWeek; //then earning is number of hours * hourly pay
        } else {
           return (hourlyPay * 40) // if it exceeds more than 40, then for first 40 hours, it ll be number of hours * hourly pay
                   + (1.5 * hourlyPay * (hourWorkedPastWeek - 40)); // and for hours more than 40, 1.5 * number of hours * hourly pay
        }
    } // end getEarnings

    //***********************************************************************************************************************

    @Override
    public String toString() { //to string method to print object in readable form
        return "\npaycheck: " + (getBonus() + getEarnings()) + "\n\n";

    } // end main

} // end class Hourly