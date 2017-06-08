/*************************************************************************************************************
*LSUnit4Ch13Investor.java
*Shelby Laquitara
*
* This program tracks an investment for 1 person based on the input of an interest rate.
*************************************************************************************************************/
package lsunit4ch13;

public class LSUnit4Ch13Investor
{
	private static double interestRate;
    public final double ACCOUNT_NUMBER;
    private  double balance;
 	static void setInterestRate(double interestRate)//local variable
  	{
    LSUnit4Ch13Investor.interestRate = interestRate; //setting class variable equal to local, mutator method
  	}
    public LSUnit4Ch13Investor(double accountNumber, double balance)
  	{
   	ACCOUNT_NUMBER = accountNumber;
   	this.balance = balance;//this is special keyword for instance variable
  	}
  	public void addInterest()
  	{
  		balance += (balance * interestRate/12); //add interest
  	}

  	public double getBalance()
 	{
      return balance;
  	}
}//end class LSUnit4Ch13Investor

