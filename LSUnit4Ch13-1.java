/*************************************************************************************************************
*LSUnit4Ch13Investor.java
*Shelby Laquitara
*
* This is the driver for the program LSUnit4Ch13Investor
*************************************************************************************************************/
package lsunit4ch13;

import java.util.Scanner;

public class LSUnit4Ch13
{
    public static void main(String[] args)
    {
    	Scanner stdIn = new Scanner(System.in);
        LSUnit4Ch13Investor investor1 = new LSUnit4Ch13Investor(1001, 2000);

        double interestRate;
        System.out.print("Please enter the Annual Interest Rate you hope to earn: ");//get input for interest rate
        interestRate = stdIn.nextDouble();
        investor1.setInterestRate(interestRate);
        System.out.println("Monthly balances for one year with " + interestRate + " annual interest: \n"); //header as sample showing interest rate
        System.out.printf("%-6s%-12s%-7s\n","Month", "Account #", "Balance");//formatting and printing the table
        System.out.printf("%-6s%-12s%-7s\n","-----", "---------", "-------");//printing the lines between the print statements

        for (int i=0; i<=12; i++)//using the for loop to display the current month and calling
        {
            if (i >= 1)
            {
                investor1.addInterest();
            }
            System.out.printf("%5d%10d%10.2f\n", i, 1001, investor1.getBalance());

        }

    }

}//end class LSUnit4Ch13
