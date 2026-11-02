public class Attention
{

	public static boolean Attention(String str) 
	{
  
		int n = str.length();
  
		if(n>=9)
		{
			return(str.substring(0, 9).equals("Hey, you!"));
		}
		return false;	
}

public static void testAttention(String str, boolean expected)
{
	boolean result = Attention(str);
	
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
		testAttention("Hey, you! Whats up?", true);
		testAttention("H", false);
		testAttention("Hey, man!", false);
	}
	

}
