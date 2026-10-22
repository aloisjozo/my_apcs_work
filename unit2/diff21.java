public class Diff21
{
	
	public static int diff21(int n) 
	
	{
		if (n>21)
		{
	return -2*(21-n);
		}
	else
	return 21-n;
	}
	
	public static void testdiff21(int n, int expected)
	{
	
		int result = diff21(n);

		
		System.out.print("Input: " + n + " Result: " + result + " Expected:" + expected + " ");
	if(result == expected)
		{
			System.out.println("Expected");
		}
		else 
		{
			System.out.println("Not expected");
		}
	}
	public static void main(String[] args)
	{
		testdiff21(4, 17);
		testdiff21(6, 15);
		testdiff21(8, 13);
	}
}


