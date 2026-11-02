public class CoinFlip
{
	public static void main(String[] args)
	{
		for(int i=0; i<20; i++)
		{
			int value = (int)(Math.random() * 2);
			if(value == 1)
			{
				System.out.println("tails");
			}
			else if(value == 0)
			{
				System.out.println("heads");
			}
		}
	}
}
