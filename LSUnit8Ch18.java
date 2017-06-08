/* LSUnit8Ch18.java
 * Shelby Laquitara 
 * 
 * This program displays a JFrame window with 5 buttons. The buttons will be used to control the background color.
 */
package lsunit8ch18;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class LSUnit8Ch18 extends JFrame implements ActionListener
{
    public static void main(String[] args) 
    {
        LSUnit8Ch18 light=new LSUnit8Ch18();
        light.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        private final JButton b1,b2,b3,b4,b5; 
        private JTextField display;
        private final ButtonGroup buttons;
        private final Container con;
        
        //**********************************************************************

    public LSUnit8Ch18() //class method
    {
        Color[] JButton = new Color[5];
        setLayout(new FlowLayout());//setting the layout
        con = getContentPane();
        display = new JTextField(10);
        Random rand = new Random();
        int index = rand.nextInt(JButton.length); //index will pick a random color
        b1 = new JButton("GREEN");//constructors
        b2 = new JButton("RED");
        b3 = new JButton("WHITE");
        b4 = new JButton("BLUE");
        b5 = new JButton("YELLOW");
        buttons = new ButtonGroup();
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        setSize(500,250);//configuing the size of the textbox
        setVisible(true);
        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        buttons.add(b4);
        buttons.add(b5);
        con.add(b1);//adding the labels
        con.add(b2);
        con.add(b3);
        con.add(b4);
        con.add(b5);
   }
        //**********************************************************************
   
   public void actionPerformed(ActionEvent ie) //action method.
   {
       String msg =" ";
       msg = ie.getActionCommand();
       if (msg.equals("GREEN"))//if button is red then background will change to green
       {
           con.setBackground(Color.GREEN);//setting the background to green 
       }
       else if (msg.equals("RED"))//if button is red then background will change to red
       {
           con.setBackground(Color.RED);//setting the background to red 
       }
       else if (msg.equals("WHITE"))//if button is red then background will change to white
       {
           con.setBackground(Color.WHITE);//setting the background to white
       }
       else if (msg.equals("BLUE"))//if button is red then background will change to blue
       {
           con.setBackground(Color.BLUE);//setting the background to blue 
       }
       else if (msg.equals("YELLOW"))//if button is red then background will change to yellow
       {
           con.setBackground(Color.YELLOW);//setting the background to yellow 
       }
   }
} //end class LSUnit8Ch18