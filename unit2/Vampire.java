public class Vampire
{
	
	public static boolean isVampire(float hour, boolean awake)
	{
		return(awake && (hour>22 || hour<6));
	}
	
	public static void testisVampire(float hour, boolean awake, boolean expected)
	{
		boolean result = isVampire(hour, awake);
		
		System.out.print("Hour: " + hour + " Awake: " + awake + " Result: " + result + " Expected: " + expected + " ");
		
		if(result =s= expected)
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
		testisVampire(3, true, true);
		testisVampire(7, true, false);
		testisVampire(24, false, false);
	}
}
