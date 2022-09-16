 
//Name:Ahmet Yesilbas
//Project Name:Dialog Box exercise Q3
//Date:10/18/2021
//Project Description: Using dialog and input boxes to find the percentage of favorite sports among students.
 
import javax.swing.JOptionPane;
 
 
public class DialogBoxExercise3 {
 
  public static void main(String[] args) {
    
 	String input;
 	double stndtAmnt;
 	double basketball;
 	double tennis;
 	double football;
    double volleyball;
    double soccer;
 	JOptionPane.showMessageDialog(null, "Hi, let's find the percentage of favorite sports among students.");
    
 	input = JOptionPane.showInputDialog("How many students voted for basketball? ");
 	basketball = Double.parseDouble(input);
    input = JOptionPane.showInputDialog("How many students voted for tennis? ");
 	tennis = Double.parseDouble(input);
    input = JOptionPane.showInputDialog("How many students voted for football? ");
 	football = Double.parseDouble(input);
    input = JOptionPane.showInputDialog("How many students voted for volleyball? ");
 	volleyball = Double.parseDouble(input);
    input = JOptionPane.showInputDialog("How many students voted for soccer? ");
 	soccer = Double.parseDouble(input);
 	
    stndtAmnt = basketball+tennis+football+volleyball+soccer;
    double basketballP = (basketball/10)*(50);
    double tennisP = (tennis/10)*(50);
    double footballP = (football/10)*(50);
    double volleyballP = (volleyball/10)*(50);
    double soccerP = (soccer/10)*(50);
 
 	JOptionPane.showMessageDialog(null, "Hi, here are the percentages of the sports are:\nBasketball - %"+basketballP+"\nTennis - %"+tennisP+"\nFootball - %"+footballP+"\nVolleyball - %"+volleyballP+"\nSoccer - %"+soccerP);
 	
   }
  
}
