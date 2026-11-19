public class MagicEightBall
{

		private String s1 = "it is certain";
		private String s2 = "it is decidedly so";
		private String s3 = "without a doubt";
		private String s4 = "yes";
		private String s5 = "definitely";
		private String s6 = "you may rely on it";
		private String s7 = "as I see it, yes";
		private String s8 = "most likely";
		private String s9 = "outlook good";
		private String s10 = "signs point to yes";
		private String s11 = "reply hazy, try again";
		private String s12 = "ask again later";
		private String s13 = "better not tell you now";
		private String s14 = "cannot predict now";
		private String s15 = "concentrate and ask again";
		private String s16 = "don't count on it";
		private String s17 = "my reply is no";
		private String s18 = "my sources say no";
		private String s19 = "outlook not so good";
		private String s20 = "very doubtful";

	public String ask(String input)
	{
			int value = (int)(Math.random() * 20);
			if(value == 0)
			{
				return s1;
			}
			else if(value == 1)
			{
				return s2;
			}
			else if(value == 2)
			{
				return s3;
			}
			else if(value == 3)
			{
				return s4;
			}
			else if(value == 4)
			{
				return s5;
			}
			else if(value == 5)
			{
				return s6;
			}
			else if(value == 6)
			{
				return s7;
			}
			else if(value == 7)
			{
				return s8;
			}
			else if(value == 8)
			{
				return s9;
			}
			else if(value == 9)
			{
				return s10;
			}
			else if(value == 10)
			{
				return s11;
			}
			else if(value == 11)
			{
				return s12;
			}
			else if(value == 12)
			{
				return s13;
			}
			else if(value == 13)
			{
				return s14;			
			}
			else if(value == 14)
			{
				return s15;
			}
			else if(value == 15)
			{
				return s16;
			}
			else if(value == 16)
			{
				return s17;
			}
			else if(value == 17)
			{
				return s18;
			}
			else if(value == 18)
			{
				return s19;
			}
			else if(value == 19)
			{
				return s20;
			}
			return "";
		}		
}
