public class Prefix
{	
	public static String prefix(String str, int n)
	{	
		if(str.length()>= n)
		{
			return str.substring(0, n) + "!";
		}
		else 
		{
			return str + "!";
		}
	}
	
	public static void testPrefix(String str, int n, String expected)
	{
		String result = prefix(str, n);
		
		System.out.println("Test: " + str + " Result: " + result + " Expected: " + expected);
		if(result.equals(expected))
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
		testPrefix("Yippee", 2, "Yi!");
		testPrefix("Woohoo", 5, "Wooho!");
		testPrefix("Alois is da best", 10, "Alois is d!");
	}
}
