import shapes.Rectangle;
import shapes.Square;
import utils.Math;
public class Driver 
{
	public static void main(String[] args)
	{
		double a=15.6;
		Square sqr1= new Square(100);
		Rectangle rec1=new Rectangle(80,50);
		System.out.println(sqr1.getArea());
		System.out.println(rec1.getArea());
		System.out.println(Math.factorial((int)a));
		System.out.println(Math.factorialLoop((int)a));
		
	}
}