/******************************************************************************
*ShelbyLaquitaraChapter11.java
*Shelby Laquitara
*
*This is a driver class that instantiate the saver1 and saver2 objects.
*******************************************************************************/

import java.text.DecimalFormat;

public class ShelbyLaquitaraChapter13 {

   public static void main(String[] args) {
       KDSavingsAccount saver1 = new KDSavingsAccount(10002, 2000.0);
       KDSavingsAccount saver2 = new KDSavingsAccount(10003, 3000.0);

       saver1.setAnnualInterestRate(0.05);//setting interest rate as 0.05
       saver2.setAnnualInterestRate(0.05);

       double finalBalance = 0.0;
       System.out.println("MONTH\tACCOUNT1 BALANCE\tACCOUNT2 BALANCE");//printing balance
       for (int months = 0; months <= 12; months++) {
           if (months == 0) {
               System.out.println(months
                       + "\t"
                       + saver1.getACCOUNT_NUMBER()//calculating saver1
                       + "\t "
                       + (new DecimalFormat("##.00").format(saver1
                               .getBalance()))
                       + "\t"
                       + saver2.getACCOUNT_NUMBER()
                       + "\t "
                       + (new DecimalFormat("##.00").format(saver1
                               .getBalance())));
           } else {
               System.out.println(months
                       + "\t"
                       + saver1.getACCOUNT_NUMBER()
                       + "\t "
                       + (new DecimalFormat("##.00").format(saver1
                               .addMonthlyInterest()))
                       + "\t"
                       + saver2.getACCOUNT_NUMBER()
                       + "\t "
                       + (new DecimalFormat("##.00").format(saver2//calculating saver2
                               .addMonthlyInterest())));
           }

       }

       //***********************************************************************************************

       finalBalance = saver1.getBalance() + saver2.getBalance();
       System.out.println("Final balance of both accounts combined: " //printing balance of both accounts
               + new DecimalFormat("##.00").format(finalBalance));
   }

}//end class ShelbyLaquitaraChapter13