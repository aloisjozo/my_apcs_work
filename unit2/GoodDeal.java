public class GoodDeal
{
	public static boolean goodDeal(int originalPrice, int salePrice)
	{
		return(salePrice <= originalPrice*3/4);
	}
	
	public static void testgoodDeal(int originalPrice, int salePrice, boolean expected)
	{
		boolean result = goodDeal(originalPrice, salePrice);
		
		System.out.print("Original Price: " + originalPrice + "Sale Price: " + salePrice + "Result: " + expected + " ");
		
		if(result == expected)
		{
			System.out.println(" Expected");
		}
		else
		{
			System.out.println(" Unexpected");
		}
	}
	public static void main(String[] args)
	{
		testgoodDeal(10, 7, true);
		testgoodDeal(20, 18, false);
		testgoodDeal(35, 3, true);
		
	}
}
