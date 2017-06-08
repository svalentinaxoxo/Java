/* LSUnit6Ch15.java
 * Shelby Laquitara
 *
 * This is the driver class for LSTime. 
 */
package lsunit6ch15;
import java.util.Scanner;

public class LSUnit6Ch15 
{
    public static void main(String[] args) 
    {
        Scanner stdIn = new Scanner(System.in);

        String entry; //created a string called entry 
        System.out.print("Enter time in the form mm:dd (\"q\" to quit): "); //prints the message
        entry = stdIn.nextLine(); //allows for user input
        while(!entry.equalsIgnoreCase("q")) // If enter is not "q"
        {
            try //
            {
                LSTime time = new LSTime(entry); //created an instance of LSTime object passing the entry as an arguement 
                time.print();
                
            }
            catch (Exception e) 
            {
               System.out.println(e.getMessage());
            }
            System.out.print("Enter time in the form mm:dd (\"q\" to quit): "); //prints the message
            entry = stdIn.nextLine(); //alows for user input 
        }
    }
    
} //end class LSUnit6Ch15
