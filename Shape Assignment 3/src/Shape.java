import javax .swing.JOptionPane;
import java.util.Scanner;
abstract public class Shape {
	String color;
	boolean filled;
	Shape()
	{
		color="green";
		filled=true;
	}
 Shape (String color,boolean filled)
{
	 this.color=color;
	 this.filled= filled;
 }
 String getColor()
 {
	 Scanner input=new Scanner(System.in);
	 System.out.println("Enter the color of shape");
	color=input.nextLine();
	 return color;
 }
 void setColor(String color)
 {
	 this.color=color;
 }
 boolean isFilled()
 {
	 Scanner input=new Scanner(System.in);
	 System.out.println("iS shape Filled?true/fasle");
	return  filled=input.nextBoolean();
	
 }
 void setFilled(boolean filled)
 {
	this.filled=filled;
 }
 public String toString()
 {
	 return " A Shape with color of= " +getColor()+ " and filled/Not filled( " +isFilled()+")";
 }
 abstract double getArea();
 abstract double getParimeter();

}

