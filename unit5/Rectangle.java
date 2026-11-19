public class Rectangle
{
	public Rectangle(double heightIn, double widthIn)
	{
		height = heightIn;
		width = widthIn;
	}
	private double height;
	private double width;
	public double area()
	{
		return width*height;
	}
	public double perimeter()
	{
		return width*2+height*2;
	}
	public double diagonal()
	{
		return Math.sqrt(width*width+height*height);
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getWidth()
	{
		return width;
	}
}
