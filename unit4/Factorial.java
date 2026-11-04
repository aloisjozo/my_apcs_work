public class Factorial
{
	
public static int factorial(int n)
	{
		int total = 1;
		
		for(int i = 1; i <=n; i++)
		{
			total *= i;
		}
		return total;
	} 
	
	public static void testFactorial(int n, int expected)
	{
		int result = factorial(n);
		
		System.out.println("Test: " + n + " Result: " + result + " Expected: " + expected);
	
		
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
		testFactorial(3, 6);
		testFactorial(2, 2);
		testFactorial(4, 24);
		
	}
}
