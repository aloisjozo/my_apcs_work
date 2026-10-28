public class NearHundred
{
	
	public static boolean nearHundred(int n) 
	{	
		return((90<= n && n<=110) || (190<=n && n<=210));
	}
	
	public static void testnearHundred(int n, boolean expected)
	{
		boolean result = nearHundred(n);
		
		System.out.print("Number: " + n + " Expected: " + expected + " ");
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
		testnearHundred(9, false);
		testnearHundred(99, true);
		testnearHundred(209, true);
	}
}


