/************************************************************************************************************
* Data.java
* Shelby Laquitara
*
* This date class file stores date values and prints out the date in either a
pure numeric format or a name and number format.
*************************************************************************************************************/

public class Date
{private int month; // store the date in int instance variable month
private int day; //store the date in int instance variable day
private String input; //String instance variable, input
private String error; //String instance variable, error
public Date(String i) // 1-parameter Date constructor that receives a dateStr string parameter
    {error=null; //initialized with null.
     boolean good=true; //
     int daysInMonth[]={31,28,31,30,31,30,31,31,30,31,30,31};
     int n,j;
     String s;
     n=i.indexOf('/'); // To extract day and month numbers from the given date string
         if(n==-1)
              error="Invalid date format "+i;
          else
              {s=i.substring(0,n);
                 for(j=0;j<s.length();j++)
                      if(!Character.isDigit(s.charAt(j)))
                            {error="Invalid format - for input string: \""+s+"\"";
                             good=false;
                             }
                if(good)
                   {
                     month=Integer.parseInt(s);
                    if(month<1||month>12)
                        error="Invalid month –"+month;
                    else
                        {s=i.substring(n+1,i.length());
                          for(j=0;j<s.length();j++)
                        if(!Character.isDigit(s.charAt(j)))
                             {error="Invalid format - for input string: \""+s+"\"";
                               good=false;
                              }
                    if(good)
                             {day=Integer.parseInt(s);
                           if(day>daysInMonth[month-1])
                                  error="Invalid day – "+day;
                              }
                       }
                }
          }
    }

    //********************************************************************************************************************


    public void printNumbers() // method for printing the date with a numeric format.
       {System.out.printf("%02d/%02d\n",month,day); // zero-pad flag in a printf method call to get exactly two digits for each month and day.
       }
    public void printWords() // method for printing the date with an alphabetic format.
       {String m[]={"January ","February ","March ","April ","May ","June ","July ",
               "August ","September ","October ","November ","December "};
       System.out.println(m[month-1]+" "+day);
        }
    public String getError() // getError method which returns the value of the error instance variable.
    {return error;
  }
}//end