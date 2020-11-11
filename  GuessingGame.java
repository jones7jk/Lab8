import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import java.util.Random;

public class GuessingGame implements ActionListener {
  JTextField fielduserGuess ; 
  JButton buttonGuess; 
  JButton buttonPlayAgain; 
  JLabel jlabGuess, jlabHighLow, jlabLastGuess; 
Random r = new Random();
 private int guess;

   GuessingGame() { 
    // random theNumber = new Random();
     int randomNum = r.nextInt(100)+1;
      // Create a new JFrame container. 
      JFrame frame = new JFrame("Use a Text Field"); 
      // Specify FlowLayout for the layout manager. 
      frame.setLayout(new FlowLayout()); 
      // Give the frame an initial size. 
      frame.setSize(240, 120); 
      // Create a text field. 
      fielduserGuess = new JTextField(10); 
      // Set the action commands for the text field. 
      field.setActionCommand("myTF"); 
      // Create the Reverse button. 
      buttonGuess = new JButton("Button");
      buttonPlayAgain = new JButton("Play Again"); 
      // Add action listeners. 
      field.addActionListener(this); 
      buttonGuess.addActionListener(this); 
     buttonPlayAgain.addActionListener(this); 
      // Create the labels. 
      jlabGuess = new JLabel("Enter Your Guess "); 
      jlabHighLow = new JLabel(""); 
      jlabLastGuess= new JLabel("");
      // Add the components to the content pane. 
      frame.add(jlabGuess); 
      frame.add(field); 
      frame.add(buttonGuess); 
      frame.add(jlabHighLow); 
      frame.add(jlabLastGuess); 
      frame.add(buttonPlayAgain); 
      
      // Display the frame. 
      frame.setVisible(true); 
  } 
   public void actionPerformed(ActionEvent ae) { 
    if(ae.getActionCommand().equals("button")) { 
      int guess = Integer.parseInt(fielduserGuess.getText());
     
      if(guess < theNumber)  {
        System.out.println("Guess higher!");
    }
      else if (guess<theNumber) {
        System.out.println("Guess lower!");
      }
      else (guess=theNumber){
      System.out.println("You got it!");
      }

      jlabLastGuess.setText("Last guess was " + 
        fielduserGuess.getText()); 

        } 
        else if(ae.getActionCommand().equals("Play Again"))) {
      //random theNumber = new Random();
         int randomNum = r.nextInt(100)+1;
          jlabGuess = new JLabel("Enter Your Guess "); 
         jlabHighLow = new JLabel(""); 
         jlabLastGuess= new JLabel("");
         fielduserGuess.setText(""); 
        }
        else{
           jlabHighLow.setText("You pressed Enter. Please press the Guess Button.")
        }



      
    }
  } 
 
 
