/*******************************************************************************************************************
* SalariedPlusCommission.java
* Shelby Laquitara
*
* This class extends Salaried using the Sales during the past week and comission rate.
*******************************************************************************************************************/

import java.util.Scanner;

public class SalariedPlusCommission extends Salaried { // A subclass of Salaried.java
    private double salesDuringPastWeek;
    private double commissionRate;

    public void load() //load method to prompt user and store the input
    {
        System.out.print("Sales for this past week ==>");
        Scanner scanner = new Scanner(System.in);
        salesDuringPastWeek = scanner.nextDouble(); //using salesDuringPastWeek
        System.out.print("Sales commission rate (fraction paid to employee) ==>"); //prints out commission rate
        commissionRate = scanner.nextDouble();

    } // end load

    //**************************************************************************************************************

    @Override
    public double getEarnings() { // earning is computed on the salary + weekly sales and a part of commission of weekly salary
        double percentageOfSales = salesDuringPastWeek * commissionRate;

        return percentageOfSales + weeklySalary;

    } // end getEarnings

    //**************************************************************************************************************


    @Override
    public String toString() { //to string method to print object in readable form
        return "\npaycheck: " + (getBonus() + getEarnings()) + "\n\n";

    } // end main
} //end class SalariedPlusCommission

