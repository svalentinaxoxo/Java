/***********************************************************************
*ShelbyLaquitaraChapter18.java
*Purpose: This program utilizes the naming convention above that
implements a window with three buttons – left, blue, and reset.
*Students Name: Shelby Laquitara
*CS 219 Programming Fundamentals
*Term: Spring 2 2015
*Instructor: Ken Dewey
***********************************************************************/

import javax.swing.*; //for JFrame & JButton
import java.awt.*; // for Flowlayout, Color, & Container
import java.awt.event.*; //for ActionListener & ActionEvent

public class ShelbyLaquitaraChapter18 extends JFrame //Class Name Declaration
{

    private static final long serialVersionUID = 1L; //Control Definitions
    JButton resetButton; //Declare variable reset
    JButton leftButton;  //Declare variable left
    JButton colorButton; //Declare variable color
    JPanel buttonPanel;
    eventHandle evt; // Layout Definition
    FlowLayout flt;
    Point point; //to Hold Previous Window Position
    Color color; //to Hold Previous Color
	private static ShelbyLaquitaraChapter18 btnwindow;

    public ShelbyLaquitaraChapter18() //Constructor
    {
        super("Buttons Window");
        flt = new FlowLayout();//inialize the Flow Layout
        buttonPanel = new JPanel(flt);//Initialize the button Panel With Flow Layout
        resetButton = new JButton("Reset"); // initialize buttons
        leftButton = new JButton("Left");
        colorButton = new JButton("Blue");
        evt = new eventHandle(); //initiate the eventhandle class
        buttonPanel.add(leftButton); //add leftButton
        buttonPanel.add(colorButton);//add colorButton
        buttonPanel.add(resetButton);//add colorButton
        getContentPane().add(buttonPanel);//buttonPanel

        leftButton.addActionListener(evt); //add actionlistners leftButton
        colorButton.addActionListener(evt); //add actionlisteners colorButton
        resetButton.addActionListener(evt); //add actionlisteners resetButton
        setBounds(20, 120, 250, 70);

        point=new Point((Toolkit.getDefaultToolkit().getScreenSize().width- //following Initiate the point with Center of Screen
        getWidth())/2, (Toolkit.getDefaultToolkit().
                     getScreenSize().height-getHeight())/2);

        setLocation(point); //locates the window in center


        color = buttonPanel.getBackground();//stores the initial color
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    //***********************************************************************************************************************

    private class eventHandle implements ActionListener { //Event Handler

        public void actionPerformed(ActionEvent e) {
            {
                if (e.getSource() == leftButton) ///if it’s from left Button
                {
                    setLocation( (point.x +150), point.y);//shift the window 150 pixels left

                } else if (e.getSource() == colorButton) {
                    buttonPanel.setBackground(Color.BLUE); //sets the background to Blue


                } else {

                    setLocation(point);  //sets the location to previous location
                    buttonPanel.setBackground(color); //sets the background to previous color
                }

            }
        }
    }

    //************************************************************************************************************************

    public static void main(String[] args) { // main function
        setBtnwindow(new ShelbyLaquitaraChapter18());

    }

	public static ShelbyLaquitaraChapter18 getBtnwindow() {
		return btnwindow;
	}

	public static void setBtnwindow(ShelbyLaquitaraChapter18 btnwindow) {
		ShelbyLaquitaraChapter18.btnwindow = btnwindow;
	}
} // end class ShelbyLaquitaraChapter18