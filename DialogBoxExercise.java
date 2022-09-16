//Name:Ahmet Yesilbas
//Project Name:Dialog Box exercise
//Date:10/15/2021
//Project Description: Using dialog and input boxes to find the area and circumference of a circle.
 
import javax.swing.JOptionPane;
 
 
public class Main {
 
  public static void main(String[] args) {
 		
 	String input;
 	double radius;
 	double area;
 	double pi = 3.14;
 	double circumference;
 	JOptionPane.showMessageDialog(null, "Hello let's find the area and circumference of the circle.");
 
 
    
 	input = JOptionPane.showInputDialog("What is the radius of the circle? ");
 	radius = Integer.parseInt(input);
 	
    
 	area = pi*(radius*radius);
 	circumference = 2*pi*radius;
 	
 	JOptionPane.showMessageDialog(null, "Area: " +area + " \nCircumference: " +circumference);
 	
   }
  
}
