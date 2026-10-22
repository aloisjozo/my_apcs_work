public class ParrotTrouble
{

	public static boolean parrotTrouble(boolean talking, int hour) 
	{
		
		return(talking && (hour>20 || hour<7));
	}
	
	
	public static void testparrotTrouble(boolean talking, int hour, boolean correct)
	{
		boolean result = parrotTrouble(talking, hour);

		System.out.print("talking:" + talking + " hour:" + hour + " result:" + correct + " ");

		if(result == correct)
		{
			System.out.println("Correct");
		}
		else 
		{
			System.out.println("Incorrect");
		}
	}

	public static void main(String[] args)
	{
		testparrotTrouble(true, 10, false);
		testparrotTrouble(true, 3, true);
		testparrotTrouble(false, 3, false);
		
	}
}

