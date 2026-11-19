public class RectangleTest
{
	public static void main(String[] args)
	{
		Rectangle coolRectangle = new Rectangle(3,4);
		System.out.println(coolRectangle.getHeight());
		System.out.println(coolRectangle.getWidth());
		System.out.println(coolRectangle.perimeter());
		System.out.println(coolRectangle.diagonal());
	}
}
