import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JLabel firstLabel;
  JTextField firstInput;
  JButton helloButton;
  

  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Hello");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
    //initialize the mainJPanel
    mainPanel = new JPanel();
    //disable any layout helpers
    mainPanel.setLayout(null);
    
    
    //create the label that says hello to user
    firstLabel = new JLabel();
    //layout the label by setting its cordinate and size
    firstLabel.setBounds(230,200,100,20);
   
    //initialize the input text field
    firstInput = new JTextField();
    //layout the textfield by setting its cordinate and size
    firstInput.setBounds(230,100,200,30);
    
    //initialize the input button
    helloButton = new JButton("Say Hello");
    //layout the buttton by setting its cordinate and size
    helloButton.setBounds(250,300,150,20);
    //add an action listener to the buttons
    helloButton.addActionListener(this);
    
    //add labels,text fields, and buttons into main panel
    mainPanel.add(firstLabel);
    mainPanel.add(firstInput);
    mainPanel.add(helloButton);
    //add the panel to the window
    frame.add(mainPanel);
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();
    if(command.equals("Say Hello")){
      //get text from input box
      String firstText = firstInput.getText();
      //say hello to user
      System.out.println(firstLabel + firstText);
      //print the users name to the screen
      firstLabel.setText("Hello " + firstText);
    }
  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
