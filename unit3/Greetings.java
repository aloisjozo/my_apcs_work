public class Greetings
{
	
	public static String greetThisPerson(String n)
	{
	
		String s = "Hello, " + n + ", how are you?";
		return s;
	}
	
	public static void testgreetThisPerson(String n, String expected)
	{
		String s = greetThisPerson(n);
		
		System.out.print("Test: " + n + " Expected: " + expected + " ");
		
		if(s.equals(expected))
		{
			System.out.println("Expected");
		}
		else
		{
			System.out.println("Unexpected");
		}
		
	}
	
	public static void main(String[] args)
	{
		testgreetThisPerson("Alois", "Hello, Alois, how are you?");
		testgreetThisPerson("^_^", "Hello, ^_^, how are you?");
		testgreetThisPerson("Awesome Person", "Hello, Awesome Person, how are you?");
	}
}
