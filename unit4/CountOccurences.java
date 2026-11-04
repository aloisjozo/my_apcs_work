public class CountOccurences
{
	
	public static int countOccurences(String n, String s)
	{
		int total = 0;
		
		for(int i= 0; i<=n.length()-s.length(); i++)
		{
				String sub = n.substring(i, i+s.length());
				if (sub.equals(s))
				{
					total += 1;
				}
		}
		return total;
	}
	
	public static void testcountOccurences(String n, String s, int expected)
	{
		int result = countOccurences(n, s);
		
		System.out.println("Test: " + n + " Counting: " + s + " Result: " + result + " Expected: " + expected);
		
		if(result == expected)
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
		testcountOccurences("Mississippi","iss", 2);
		testcountOccurences("tootoo","too", 2);
		testcountOccurences("Super man","m", 1);
	}
}
