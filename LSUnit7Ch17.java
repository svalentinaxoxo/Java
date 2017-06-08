/* LSUnit7Ch17.java
 * Shelby Laquitara
 * 
 * This program displays a dialog box show message and a randomly chosen color. 
 */
package lsunit7ch17;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class LSUnit7Ch17 
{
    public static void main(String[] args) 
    {
        Random rand = new Random(); //setting Random rand to new Random
        JFrame name = new JFrame(); //setting JFram name to new JFrame
        JLabel prompt = new JLabel("What is your name: "); //a label promt to allow user to enter name
        JTextField box = new JTextField(15); //setting JTextField box to new JTextField
        String msg = "The following window color will be randomly chose from \nRed, White, Yellow, Green, Blue\n\n"; //the message that appears
        Color[] colors = new Color[5]; //creating an array of the colors used
        colors[0] = Color.RED;
        colors[1] = Color.WHITE;
        colors[2] = Color.YELLOW;
        colors[3] = Color.GREEN;
        colors[4] = Color.BLUE;
        String[] strColors = {"red", "white", "yellow", "green", "blue"};
        int index = rand.nextInt(colors.length); //index will pick a random color
        String color = strColors[index];
        Color cColor = colors[index];
        String msg2 = "Your color will be: " + color.toUpperCase(); //the message that will appear 
        JOptionPane.showMessageDialog(name, msg + msg2);
        
        name.setTitle("Color Changing Frame"); //changing the title of the screen
        name.setSize(500, 250); // setting the size of the box 
        name.setLayout(new FlowLayout()); 
        name.add(prompt);
        name.add(box);
        name.getContentPane().setBackground(cColor);
        if (cColor == Color.GREEN) //the following code will change the color of the labels depending on the color of the window
        {
            prompt.setForeground(Color.BLUE); //If window is Green, label color will be blue
        }
        else if (cColor == Color.RED) //If window is Red, then the label color will be white
        {
            prompt.setForeground(Color.WHITE);
        }
        else if (cColor == Color.BLUE) //If window color is White, then the label color will be blue
        {
            prompt.setForeground(Color.WHITE);
        }
        else 
        {
            prompt.setForeground(Color.BLACK); //else use black for the label color which will pair with the yellow window
        }
        name.setVisible(true);    
        
        class Listener implements ActionListener //using an inner class for the listener
        {
            public void actionPerformed(ActionEvent e)
            {
                String strName = box.getText();
                box.setVisible(false);
                prompt.setText("Thanks for playing " + strName); //message will appear
            }
        }
        
        Listener listener = new Listener(); 
        
        box.addActionListener(listener);
    }    
} //end class LSUnit7Ch17
