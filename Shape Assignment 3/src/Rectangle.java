import java.util.Scanner;
public class Rectangle extends Shape {
double width,length;

Rectangle()
{
	width=1.0;
	length=1.0;
}
Rectangle(double width,double length)
{
	this.width=width;
	this.length=length;
	}
Rectangle(double width,double length,String color,boolean filled)

{
	super(color,filled);
	this.width=width;
	this.length=length;
}
 double getWidth()
 {
	 Scanner input=new Scanner(System.in);
	 System.out.println("enter Width of rectangle: ");
	return  width=input.nextDouble();
	 
 }
 void setWidth(double width ) 
 {
	 this.width=width;
 }
void setLength(double length ) 
 {
	 this.length=length;
 }
 double getLength()
 {
	 
	 Scanner input=new Scanner(System.in);
	 System.out.println("enter Length of rectangle : ");
	return  length=input.nextDouble();
	 
 }
	double getArea()
	{
		
		
		return length*width;
	}


	double getParimeter()
	{
		return 2*(length+width);
		
	}
	public String toString()
	{
		return " A Rectangle with width= " +width+ " and length= "+length+  
				 " which is a subclass of Shape, " +super.toString();
	}
	
	
	
		
	}


