/*********************************************************************************************************************************
* Shelby Laquitara
* ShelbyLaquitaraChapter17.java
*
* This program tests the user’s ability to memorize a sequence of colors.
**********************************************************************************************************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ShelbyLaquitaraChapter17 extends JFrame {

    private JLabel jlbColorNumber = new JLabel("Enter Color Number 1:");
    private JTextField jtfColorName = new JTextField(12);

    private int ColorNumber = 0; //Color Number
    private final int NUMBEROFCOLORS = 5; ////Number of Colors in the array
    private String colors[] = {"red", "white", "yellow", "green", "blue"}; //array to hold the colors
    public ShelbyLaquitaraChapter17() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER)); //sets flowlayout to the frame
        this.add(jlbColorNumber);
        this.add(jtfColorName);
        jtfColorName.addActionListener(new TextFieldHandler());

        String st = "";
        for (int i = 0; i < NUMBEROFCOLORS; i++) {
            st += colors[i] + " ";
        }
        JOptionPane.showMessageDialog(this, "How good is your memory? \nTry to memorixe this color sequence: \n\n " + st, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    //*************************************************************************************************************************

    private class TextFieldHandler implements ActionListener{ //Inner Class for the TextField's ActionListener Event

        public void actionPerformed(ActionEvent ae) {

            String color = jtfColorName.getText(); //gets color from the textfield
            if (!color.isEmpty()) {

                if (color.equalsIgnoreCase(colors[ColorNumber])) { //compares with color in the aray
                    ColorNumber++;

                    if (ColorNumber < NUMBEROFCOLORS) {

                        jlbColorNumber.setText("Enter Color Number " + (ColorNumber+1) + ": "); //updates label text and clears textfield for next guess
                        jtfColorName.setText("");
                    }
                    else {
                            jtfColorName.setVisible(false); //if all gueses are correct
                            jlbColorNumber.setText("Congratulations - your memory is perfect");
                        }
                    }
                else {

                    jtfColorName.setVisible(false); //if any guess is wrong
                    jlbColorNumber.setText("Sorry - wrong color, Eat more antioxidents");
                }
            }
        }
    }

    //*****************************************************************************************************************

    public static void main(String args[]) { //main method
        JFrame frame = new ShelbyLaquitaraChapter17 ();
        frame.setSize(350, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
} //end class