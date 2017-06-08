/*****************************************************************************************************************************************
* Payroll.java
* Shelby Laquitara
*
* This driver generates a paycheck report for 3 employees.
*****************************************************************************************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Payroll { //class containing main () method
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); // creating a list to store all the inputs and print them
        while (true) {
          System.out.println("\n\n");
          System.out.println("Press 1 to add employee");
          System.out.println("Press 2 to print PAYCHECK REPORT");
          System.out.println("Press 3 to exit");
          Scanner scanner = new Scanner(System.in);
          int choice = scanner.nextInt();
          if (choice == 3) {
              System.exit(1);

          } else {
              switch (choice) {
              case 1:// to add the employee
                  System.out
                         .println("type Hourly(1), Salaried (2), Salaried plus Commission (3)");
                  System.out.print("Enter 1, 2, or 3 ==>");
                  int input = scanner.nextInt(); // input from user and on basis of that hourly, salaried and commission type of classes are called.
                  Employee emp = new Employee();
                  emp.load(); //calling the load method in Employee class to enter employee details
                  if (input == 1) {
                      Hourly hour = new Hourly(); // if the choice 1 is made, load method of Hourly class is called.
                      hour.load();

                      list.add(emp.toString() + hour.toString()); // once all the details are populated in the object, the object is added into the list
                  } else if (input == 2) {
                      Salaried sal = new Salaried(); // if the choice made is 2, then object of Salaried class is made.
                      sal.load(); // method load is called and populated
                      list.add(emp.toString() + sal.toString()); // once all the details are populated in the object, the object is added into the list

                  } else if (input == 3) { // if choice 3 is made, then object of class SalariedPlusCommission is made and populated.
                      SalariedPlusCommission salaryPlusCommission = new SalariedPlusCommission();
                      Salaried sal = new Salaried();
                      sal.load();
                      salaryPlusCommission.load();
                      list.add(emp.toString() // once all the details are populated in the object, the object is added into the list
                              + salaryPlusCommission.toString());
                  } else {
                      System.out.println("Invalid choice made!!!");
                  }
                  break;

               case 2:
                  for (int i = 0; i < list.size(); i++) {
                      System.out.println(list.get(i).toString()); // printing the details stored in the list
                  }
               }
            }
        }
    } // end main
} // end class Payroll