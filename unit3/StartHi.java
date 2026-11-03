public class StartHi
{

	public static boolean StartHi(String str) 
	{
  
		int n = str.length();
  
		if(n>=2)
		{
			return(str.substring(0, 2).equals("Hi"));
		}
		return false;	
}

public static void testStartHi(String str, boolean expected)
{
	boolean result = StartHi(str);
	
	System.out.print("String: " + str + " Expected: " + expected + " ");
	
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
		testStartHi("Hi", true);
		testStartHi("H", false);
		testStartHi("Hello!", false);
	}
}
