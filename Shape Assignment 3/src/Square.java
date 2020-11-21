import java .util.Scanner;
public class Square extends Rectangle 
{
	
	
	Square(double side)
	{
		super(side,side);
	}
	Square(double side,String color,boolean filled)
	{
		super(side,side,color,filled);
	}
	void setLength(double side)
	{
		super.setLength(side);
		
	}
	void setWidth(double side)
	{
		super.setWidth(side);
		
	}
	void SetSide(double side)
	{
		super.length=side;
		super.width=side;
	}
	double getSide()
	{
		double side;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the side of square");
		side=input.nextDouble();
		return side;
	}
	double getArea()
	{
		return super.length*super.width;
	}
	double getParimeter()
	{
		return 4*super.length;
	}
	public String toString()
	{
		return "A Square with side" +super.length+ " which is a subclass of rectangle" +super.toString()+ 
				" Area of square= "+getArea()+ " Parimeter of Square= " +getParimeter();
	}
}
