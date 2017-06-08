/**********************************************************************************
*ShelbyLaquitaraChapter12.java
*Shelby Laquitara
*
*This program performs a simple substitution cipher.
**********************************************************************************/

import java.util.*;
import java.lang.*;

public class ShelbyLaquitaraChapter12
{
  public static void main(String[] args)
  {String message,newmessage="";
       char a;
       int shift;                                             //holds shift value used to produce encrypted or plain text
       Scanner in=new Scanner(System.in);

       System.out.println("Please enter text to encrypt");   //gets user to enter text for encryption
       message=in.nextLine();

       System.out.println("Please enter shift value");      //gets user to enter value to shift entered text to produce encryption
       shift=in.nextInt();                                  // output the entered value from user
       in.nextLine();                                      //clear input buffer
       message=message.toUpperCase();                      //convert to upper case
       newmessage=encrypt(message,shift);                  //convert and output
       System.out.println(newmessage);

       System.out.println("Please enter text to decrypt"); //do same for decryption
       message=in.nextLine();                              //output the entered value from user

       System.out.println("Please enter shift value");      //gets user to enter value to shift entered text to produce encryption
       shift=in.nextInt();                                 //output the entered value from user
       message=message.toUpperCase();                      //convert to upper case
       newmessage=decrypt(message,shift);                  //convert and output
       System.out.println(newmessage);
       }

       //**********************************************************************************************************

      public static String decrypt(String message, int shift)         //shift and manipulate characters decryption
      {int b;
      String newmessage="";
      for(int i=0;i<message.length();i++)             //for each character
      {if(Character.isUpperCase(message.charAt(i)))   //if it's a letter
      { b=(int)message.charAt(i)+shift;               //shift
        if(b<'A')                                     //and wrap if necessary
            b+=26;
       newmessage+=(char)b;
       }
 }//end decrypt

        //**********************************************************************************************************

       return newmessage;
        }

         public static String encrypt(String message, int shift) //encryption
          {int b;
          String newmessage="";
          for(int i=0;i<message.length();i++)
           {if(Character.isUpperCase(message.charAt(i)))
              { b=(int)message.charAt(i)+shift;
              if(b>'Z')
              b-=26;
              newmessage+=(char)b;
        }
}//end encrypt

         //************************************************************************************************************

          return newmessage;
        }//end main
}//end ShelbyLaquitaraChapter12