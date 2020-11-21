
public class TestClass {
	public static void main(String args[])
	{
		Shape S;
		double D;
		Rectangle R=new Rectangle();
		Circle C=new Circle();
		Square Sh=new Square(4);
		
		D=R.getLength();
		R.setLength(D);
		D=R.getWidth();
		R.setWidth(D);
		System.out.println(R.toString());
		System.out.print("Area of rectangle is= "+R.getArea());
		System.out.print("Area of rectangle is= "+R.getParimeter());
		System.out.println("\n");
		D=C.getRadius();
		C.setRadius(D);
		System.out.println(C.toString());
		D=Sh.getSide();
		Sh.setLength(D);
		Sh.setWidth(D);
		System.out.println(Sh.toString());
	}

}
