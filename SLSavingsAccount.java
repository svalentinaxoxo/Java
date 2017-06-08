/***********************************************************************************************
* SLSavingsAccount.java
* Shelby Laquitara
*
*  This class creates decalres a class variable called annualInterestRate,
   and an instance constant called ACCOUNT_NUMBER and an instance variable called balance.
************************************************************************************************/

public class SLSavingsAccount
{

      int ACCOUNT_NUMBER;//instance variables
      float balance,annualInterestRate;


      public SLSavingsAccount(float bal,int accNumber)//constructor with two arguments
      {
         balance=bal;
         ACCOUNT_NUMBER=accNumber;
      }

      //*****************************************************************************************


      public void addMonthlyInterest()//method to calculate balance base on interest
      {
         balance=balance+(balance * annualInterestRate / 12);
      }

      //*******************************************************************************************


       public int getACCOUNT_NUMBER() {//accessor methods for all instance variables
       return ACCOUNT_NUMBER;
       }

       //*******************************************************************************************

      public void setACCOUNT_NUMBER(int ACCOUNT_NUMBER) { //creating ACCOUNT_NUMBER constant
      this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
      }

      //********************************************************************************************

      public float getAnnualInterestRate() { // getAnnualInterestRate
      return annualInterestRate;
      }

      //********************************************************************************************

      public void setAnnualInterestRate(float annualInterestRate) { //creating annual interest rate
      this.annualInterestRate = annualInterestRate;
      }

      //*********************************************************************************************

      public float getBalance() {
      return balance;
      }

      //*********************************************************************************************

      public void setBalance(float balance) { //creating balance variable
      this.balance = balance;
    }
}//end class SLSavingsAccount