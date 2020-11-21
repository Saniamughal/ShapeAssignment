import java.util .Scanner;
public class Circle extends Shape 
{
double radius;
Circle()
{
	radius=1.0;
}
Circle(double radius)
{
	this.radius=radius;
	}
 Circle( double radius, String color,boolean filled)
 {
	 super(color,filled);
	 this.radius=radius;
 }
 double getRadius()
 {
	 Scanner input=new Scanner(System.in);
	 System.out.println("enter th radius of circle");
	 radius=input.nextDouble();
	 return radius;
 }
 void setRadius(double radius)
 {
	 this.radius=radius;
 }
 double getArea()
 {
	 return 3.14*radius*radius;
 }
 double getParimeter()
 {
	 return (2*3.14*radius);
 }
 public String toString()
 { return " A Circle with radius =" +radius+ ", which is a subclass of Shape=" +super.toString()+
		 " parimter of cirlce= "+getParimeter()+ " Area of cirlce= "+getArea();
}
}
