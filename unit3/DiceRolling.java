public class DieRolling
{
	public static void main(String[] args)
	{
		for(int i = 0; i<20; i++)
		{
			int value = (int)(Math.random() * 6);
			System.out.println(value);
		}
	}
}
