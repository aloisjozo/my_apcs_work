public class Reverse
{
	public static String reverse(String s)
	{
		String result = "";
		
		for(int i = s.length()-1; i>=0; i--)
		{
			result += s.charAt(i);
		}
		return result;
	}
	
	public static void testReverse(String s, String expected)
	{
		String result = reverse(s);
		
		System.out.println("Test: " + s + " Result: " + result + " Expected: " + expected);
		
		if(result.equals(expected))
		{
			System.out.println("Expected");
		}
		else
		{
			System.out.println("u freaking suck boi");
		}
	}
	
	public static void main(String[] args)
	{
		testReverse("Hello", "olleH");
		testReverse("Yay", "yaY");
		testReverse("woohoo", "oohoow");
	}
}
