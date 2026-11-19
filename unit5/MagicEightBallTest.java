public class MagicEightBallTest
{
	public static void main(String[] args)
	{
		MagicEightBall aloissQuestion = new MagicEightBall();
		String s = "Should Vivi play rivals with me at school tmrw";
		
		System.out.println("Question: " + s);
		System.out.println(aloissQuestion.ask(s));
	}
}
