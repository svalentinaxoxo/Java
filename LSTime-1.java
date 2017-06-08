/* LSTime.java
 * Shelby Laquitara
 *
 * This program stores the time in 2 integer instance variables, hour and minute, and includes 
 * a string variable to hold the error.
 */
package lsunit6ch15;
public class LSTime 
{
    private int hour;
    private int minute;
    private String error = null;

    public LSTime(String time) throws Exception//constructor, recieve time as a string
    {
        int colPos = time.indexOf(":");//using indexOf and error checking to include colon between digits
        if(colPos == -1) //if colon position is equal to -1
        {
            error = "Invalid separator entered: : ";//print invalid seperator error
            throw new Exception(error);
        }
        else
        {
            boolean isHrDigit = true;
            boolean isMnDigit = true;
            String hour = time.substring(0, colPos);
            String minute = time.substring(colPos + 1);
            try
            {
                this.hour = Integer.parseInt(hour);
            }
            catch(Exception e)
            {
                error = "Invalid hour entered: " + hour;
                throw new Exception(error);
            }
            try
            {
                this.minute = Integer.parseInt(minute);
            }
            catch(Exception e)
            {
                error = "Invalid minute entered: " + minute;
                throw new Exception(error);
            }
            if (this.hour<1 || this.hour>23)
            {
                error = "Invalid hour entered: " + hour;
                throw new Exception(error);
            }
            else if (this.minute<0 || this.minute>59)
            {
                error = "Invalid minute entered: " + minute;
                throw new Exception(error);
            }
        }
    }
    
    //**************************************************************************
    
    public void print()//seperate print method to output time
    {
        if (hour<12)
        {
            System.out.printf("%02d:%02d ", this.hour, this.minute);
            System.out.print("AM\n");//print AM if before noon
        }
        else if (hour>12 && hour <= 24)
        {
            hour -= 12;
            System.out.printf("%02d:%02d ", this.hour, this.minute);
            System.out.print("PM\n"); //print PM if after noon
        }
    }
    
    //**************************************************************************
    
    public String getError()//getError method that returns the error instance variable to the print method
    {
        return error;
    }
} //end class LSTime
