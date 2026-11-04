public class SumOfSquares
{
	public static int SumOfSquares(int n)
	{
		int total = 0;
		
		for(int i = 1; i <=n; i++)
		{
			total += i*i;
		}
		return total;
	} 
	
	public static void testSumOfSquares(int n, int expected)
	{
		int result = SumOfSquares(n);
		
		System.out.println("Test: " + n + " Expected: " + expected);
	
		
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
		testSumOfSquares(3, 14);
		testSumOfSquares(2, 5);
		testSumOfSquares(1, 1);
		
	}
}
