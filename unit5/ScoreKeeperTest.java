public class ScoreKeeperTest
{
	public static void main(String[] args)
	{
		ScoreKeeper worstScoreKeeperEvah = new ScoreKeeper();
		
		worstScoreKeeperEvah.scoreBonus();
		worstScoreKeeperEvah.scoreBonus();
		worstScoreKeeperEvah.scoreNormal();
		
		System.out.println("Darn it! I let the other team get " + worstScoreKeeperEvah.getScore() + " points...!");
		System.out.println("Oh gosh they're about to score again!");
		worstScoreKeeperEvah.scoreNormal();
		System.out.println("they have " + worstScoreKeeperEvah.getScore() + " points now...");
		
		
		
	}
}
