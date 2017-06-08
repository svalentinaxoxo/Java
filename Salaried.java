/****************************************************************************************************************
* Salaried.java
* Shelby Laquitara
*
* This class uses the variable weekly salary and uses the load and getEarnings method.
****************************************************************************************************************/

import java.util.Scanner;

public class Salaried extends Employee // A subclass of Employee
{

    protected static double weeklySalary; // variable declaration

    public void load() { // load method to prompt user for input and store into variables.
        System.out.print("Salary ==>");
        Scanner scanner = new Scanner(System.in);
        weeklySalary = scanner.nextDouble();

   } // end load

   @Override
   public double getEarnings() {
   return weeklySalary; // return the weekly salary

   } //end getEarnings

   @Override
   public String toString() { //to string method to print object in readable form

       return "\npaycheck: " + (getBonus() + getEarnings()) + "\n\n";

   } // end main
} // end class Salaried